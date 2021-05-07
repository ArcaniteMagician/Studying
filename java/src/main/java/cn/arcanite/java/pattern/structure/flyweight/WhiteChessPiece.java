package cn.arcanite.java.pattern.structure.flyweight;

/**
 * 具体享元角色
 * 实现抽象享元角色中所规定的接口
 *
 * @author Jim
 * @date 2021/05/07
 */
public class WhiteChessPiece implements ChessPiece {

    protected WhiteChessPiece() {
        System.out.println("新建白棋对象");
    }

    @Override
    public boolean setDown(int x, int y) {
        System.out.println("落下白子，x = " + x + ", y = " + y);
        return true;
    }

    @Override
    public boolean isExist() {
        return false;
    }

    @Override
    public void show() {

    }

    @Override
    public void findWinner() {

    }
}
