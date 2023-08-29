import java.util.*;

class BiTree {
    int data;
    BiTree left, right;
    public BiTree(int data) {
        this.data = data;
    }
}

    static void preorder(BiTree ptr) {
        if(ptr != null) {
            System.out.print(ptr.data + " ");
            preorder(ptr.left);
            preorder(ptr.right);
        }
    }

    static void inorder(BiTree ptr) {
        if(ptr != null) {
            inorder(ptr.left);
            System.out.print(ptr.data + " ");
            inorder(ptr.right);
        }
    }

    static void postorder(BiTree ptr) {
        if(ptr != null) {
            postorder(ptr.left);
            postorder(ptr.right);
            System.out.print(ptr.data + " ");
        }
    }

}

