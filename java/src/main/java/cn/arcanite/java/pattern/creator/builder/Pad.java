package cn.arcanite.java.pattern.creator.builder;

import java.math.BigDecimal;

/**
 * 建造者模式
 * 定义：将一个复杂对象的构建与其表示分离，使得同样的构建过程可以创建不同的表示
 * 使用场景：当一个类的构造函数参数数量多，且这些参数中有些可选参数，直接写构造函数的话数量会非常多，这时可以考虑使用构造者模式。
 * 备注：这里演示的是简化后的建造者模式，传统的建造者模式中Builder为抽象类/接口，不同的表现有不同的具体Builder类
 *
 * @author Jim
 * @date 2021/05/05
 */
public class Pad {
    private final String title;
    private BigDecimal price;
    private final boolean enable;

    private Pad(Builder builder) {
        if (builder.price > 0) {
            this.price = new BigDecimal(builder.price);
            this.enable = true;
        } else {
            this.enable = false;
        }

        StringBuilder stringBuilder = new StringBuilder(builder.brand == null ? "" : builder.brand);
        switch (builder.size) {
            case LARGE:
                stringBuilder.append("大号");
                break;

            case SMALL:
                stringBuilder.append("迷你");
                break;
        }
        stringBuilder.append("超强平板");
        this.title = stringBuilder.toString();
    }

    public String getTitle() {
        return title;
    }

    public static class Builder {
        private Size size = Size.UNKNOWN;
        private String brand;
        private float price;

        public enum Size {
            SMALL, MEDIUM, LARGE, UNKNOWN
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder setSize(float in) {
            if (in <= 7.9) {
                this.size = Size.SMALL;
            } else if (in >= 11) {
                this.size = Size.LARGE;
            } else {
                this.size = Size.MEDIUM;
            }
            return this;
        }

        public Builder setPrice(float price) {
            this.price = price;
            return this;
        }

        public Pad build() {
            return new Pad(this);
        }
    }
}
