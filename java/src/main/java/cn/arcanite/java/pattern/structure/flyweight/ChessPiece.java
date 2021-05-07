package cn.arcanite.java.pattern.structure.flyweight;

/**
 * 抽象享元角色
 * 父接口，规定出所有具体享元角色需要实现的方法
 *
 * @author Jim
 * @date 2021/05/07
 */
public interface ChessPiece {

    boolean setDown(int x, int y);

    // TODO- 这个不应该放在棋子里面，因为黑白棋都有，具体实现还是等哪天心血来潮再继续往下写吧，不然今晚没的睡了。这个最好改成抽象类，因为仍然有很多实现相同的方法
    boolean isExist();

    void show();

    void findWinner();
}
