package cn.arcanite.java.pattern.structure.flyweight;

import java.util.HashMap;

/**
 * 享元工厂角色
 * 负责创建和管理享元角色
 *
 * @author Jim
 * @date 2021/05/07
 */
public class ChessPieceFactory {
    public static final String TYPE_WHITE = "white";
    public static final String TYPE_BLACK = "black";
    private HashMap<String, ChessPiece> chessPieces = new HashMap<>();

    public ChessPieceFactory() {

    }

    public ChessPiece getChessPiece(String type) {
        if (chessPieces.get(type) == null) {
            if (TYPE_BLACK.equals(type)) {
                chessPieces.put(TYPE_BLACK, new BlackChessPiece());
            } else if (TYPE_WHITE.equals(type)) {
                chessPieces.put(TYPE_WHITE, new WhiteChessPiece());
            } else {
                return null;
            }
        }
        return chessPieces.get(type);
    }
}
