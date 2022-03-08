package binary_search_tree_for_beginners;
import java.io.*;
import java.util.*;

public class Bst_constractor {
  public static class Node {
    int data;
    Node left;
    Node right;
  }
  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static Node construct(int[] sarr, int lo, int hi) {
      if(lo > hi) {
          return null;
      }
      int mid = (lo + hi)  / 2;

      Node node = new Node();
      node.data = sarr[mid];
      node.left = construct(sarr, lo, mid - 1);
      node.right = construct(sarr, mid + 1, hi);
      return node;
  }
  public static void main(String[] args) throws Exception {

     int [] arr = {12, 25, 37, 50, 62, 75, 87};

    Node root = construct(arr, 0, arr.length - 1);
    display(root);

  }

}
/* 
output-
25 <- 50 -> 75
12 <- 25 -> 37
. <- 12 -> .
. <- 37 -> .
62 <- 75 -> 87
. <- 62 -> .
. <- 87 -> .
*/