import org.w3c.dom.Node;

public class Main {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    public static void main(String[] args) {
    RedBlackTree rbTree = new RedBlackTree();
    rbTree.insert(24);
    rbTree.insert(44);
    rbTree.insert(14);
    rbTree.insert(4);
    rbTree.insert(8);
    rbTree.insert(9);
//    rbTree.insert(10); // открыть для проверки балансировки сначала эту строку
//    rbTree.insert(12); // потом эту
    rbTree.printTree();
    }
}