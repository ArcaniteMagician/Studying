package cn.arcanite.java.pattern.structure.flyweight;

/**
 * 享元模式
 * 定义：运用共享技术来有效地支持大量细粒度对象的复用
 * 使用场景：面向对象程序设计过程中，有时会面临要创建大量相同或相似对象实例的问题。创建那么多的对象将会耗费很多的系统资源，它是系统性能提高的一个瓶颈。
 * 作用：降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力，减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率
 *
 * @author Jim
 * @date 2021/05/07
 */
public class FlyweightExample {

    public static void test() {
        // 下面看似新建了5个对象，其实就只有两个
        ChessPieceFactory chessPieceFactory = new ChessPieceFactory();
        ChessPiece whiteChessPiece1 = chessPieceFactory.getChessPiece(ChessPieceFactory.TYPE_WHITE);
        whiteChessPiece1.setDown(1,1);
        ChessPiece blackChessPiece1 = chessPieceFactory.getChessPiece(ChessPieceFactory.TYPE_BLACK);
        blackChessPiece1.setDown(2, 1);
        ChessPiece whiteChessPiece2 = chessPieceFactory.getChessPiece(ChessPieceFactory.TYPE_WHITE);
        whiteChessPiece2.setDown(1,2);
        ChessPiece blackChessPiece2 = chessPieceFactory.getChessPiece(ChessPieceFactory.TYPE_BLACK);
        blackChessPiece2.setDown(2, 2);
        ChessPiece whiteChessPiece3 = chessPieceFactory.getChessPiece(ChessPieceFactory.TYPE_WHITE);
        whiteChessPiece3.setDown(1,3);

        // Java源码中的享元模式：Integer和String
        // "=="比较的是两个对象引用的内存地址是否相同，equals()比较的是两字符串的Unicode序列是否相当
        // 常量池(constant pool)指的是在编译期被确定，并被保存在已编译的.class文件中的一些数据。
        // Integer
        Integer i1 = new Integer(50);
        Integer i2 = new Integer(50);
        System.out.println(i1 == i2);

        Integer i3 = new Integer(500);
        Integer i4 = new Integer(500);
        System.out.println(i3 == i4);

        // 需要注意下面这种方式存在隐式装箱
        Integer i5 = 50;
        Integer i6 = 50;
        System.out.println(i5 == i6);

        Integer i7 = 500;
        Integer i8 = 500;
        System.out.println(i7 == i8);
        // 结果为F、F、T、F，原因可以通过查看Integer类的源码，如果数字在[-128, 127]之间，Integer会直接返回常量池中的对象，也就是享元对象


        // String
        String s0 = "AndroidStudio";
        String s1 = "AndroidStudio";
        String s2 = "Android" + "Studio";
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);
        // T、T，因为Java会确保一个字符串常量只有一个拷贝，而这个拷贝存在于常量池，编译期间能确定的字符串常量都会指向常量池中的同一地址
        String s3 = new String("AndroidStudio");
        System.out.println(s0 == s3);
        // F，因为s3的值是以新建对象的形式得到的，无法在编译期确定
        // intern()方法就是扩充常量池的一个方法，当一个String实例str调用intern()方法时，
        // Java查找常量池中是否有相同Unicode的字符串常量，如果有，则返回其的引用；如果没有，则在常量池中增加一个Unicode等于str的字符串并返回它的引用。
        s3.intern();
        System.out.println(s0 == s3);
        // F，因为s3本身地址的引用并没有发生改变
        System.out.println(s0 == s3.intern());
        // T，因为后者返回的就是s0的值在常量池内的地址
        s3 = s3.intern();
        System.out.println(s0 == s3);
        // T，因为s3本身地址引用被改成了常量池内的地址

        // 使用StringBuffer的必要性：如过在程序运行期间，使用“+”号来拼接字符串（如：s4 = "姓名：" + name + "，编号" + number + ……），会导致拼接过程中产生很多多余的只是临时用到的字符串常量
    }
}
