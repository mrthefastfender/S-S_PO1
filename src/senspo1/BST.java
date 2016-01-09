/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senspo1;

/**
 *
 * @author Sven
 */
import java.util.ArrayList;
import java.util.List;

public class BST<Key extends Comparable<Key>, Value> {

    private Node root; // root of BST

    private class Node {
        
        // Students mark
        private Key key; // key
        //Students LDAP
        private Value value;
        // Left and Right nodes
        private Node left, right;
        //Amount of nodes
        private int N;
        
        //List for Values that accure multiple times.
        private List<Value> doubleValues;
        
        
        public Node(Key key, Value val, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
            this.doubleValues = new ArrayList<>();
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.N;
        }
    }

    public List<Value> get(Key key) {
        List<Value> values = new ArrayList<>();
        Node temp;
        temp = get(root, key);
        
        if(temp.doubleValues.size() == 0) {
            values.add(temp.value);
        } else {
            values.add(temp.value);
            
            for (Value value : temp.doubleValues) {
                values.add(value);
            }
        }
        return values;
    }

    private Node get(Node x, Key key) { 
        Node temp = null;
        
        if (x == null) {
            temp = null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            temp =  get(x.left, key);
        } else if (cmp > 0) {
            temp = get(x.right, key);
        } else {
            temp = x;
        }
        return temp;
    }

    public void put(Key key, Value val) { // Search for key. Update value if found; grow table if new.
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
// Change key’s value to val if key in subtree rooted at x.
// Otherwise, add new node to subtree associating key with val.
        if (x == null) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else {
            x.doubleValues.add(val);
        }
        x.N = size(x.left) + size(x.right) + 1 + x.doubleValues.size();
        
        return x;
    }
    
    public int rank (Key key) {
        return rank(key, root);
    }
    
    private int rank(Key key, Node node){
        if (node == null) {
            return 0;
        }
        if (key.compareTo(node.key) < 0) {
            return rank(key, node.left);
        } else if (key.compareTo(node.key) > 0) {
            return 1 + size(node.left) + rank(key, node.right)
                    + node.doubleValues.size();
        } else {
            return size(node.left);
        }
    }

}
