package cn.arcanite.java;

import org.junit.Test;

import cn.arcanite.java.model.Person;
import cn.arcanite.java.model.Teacher;
import cn.arcanite.java.pattern.create.builder.Pad;
import cn.arcanite.java.pattern.structure.decorator.DecoratorExample;
import cn.arcanite.java.pattern.structure.proxy.ProxyExample;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
//        Person anna = new Teacher("Anna", 23);
        // 父类的引用指向子类对象
//        anna.showMyJob();

//        VolatileExample.test();

//        Pad pad = new Pad.Builder()
//                .setBrand("小米")
//                .setSize(10)
//                .setPrice(1999)
//                .build();

//        System.out.println(pad.getTitle());

//        ProxyExample.test();

        DecoratorExample.test();
    }
}