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

        // TODO-Java源码中的享元模式：Integer和String
    }
}
