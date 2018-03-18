/*
// Before: create a variable named 'counter' that counts calls to insert. Initialize 'counter' to 0.

createBST(int[] keys) {
    set the value of counter to 0

    for each (key in keys) {
        if (tree has a root node) {
            insert(root, key)
        }
        else {
            create a new node with value 'key' as the root node of tree
        }

        print the value of 'counter' on a new line
    }
}

insert(root, key) {
    increment the value of counter by 1

    if (key is less than the value of root node) {
        if (root node has no left child) {
            create a new node with value 'key' as the left child of root node
        }
        else {
            insert(left child of root node, key)
        }
    }
    else {
        if (root node has no right child) {
            create a new node with value 'key' as the right child of root node
        }
        else {
            insert(right child of root node, key)
        }
    }
}
 */
package Visa;

import java.util.Scanner;

public class CreateBinaryTree {

    static int counter = 0;
    static Node root = null;

    public static void createBST(int[] keys) {
        counter = 0;

        for (int i = 0; i < keys.length; i++) {
            if (root != null) {
                insert(root, keys[i]);
            } else {
                root = new Node(keys[i]);
            }

            System.out.println(counter);
        }
    }

    public static void insert(Node root, int key) {
        counter++;

        if (key < root.key) {
            if (root.left == null) {
                root.left = new Node(key);
            } else {
                insert(root.left, key);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(key);
            } else {
                insert(root.right, key);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int keys_size;
        keys_size = Integer.parseInt(in.nextLine().trim());

        int[] keys = new int[keys_size];
        for (int i = 0; i < keys_size; i++) {
            int keys_item;
            keys_item = Integer.parseInt(in.nextLine().trim());
            keys[i] = keys_item;
        }

        createBST(keys);

    }

    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
}
