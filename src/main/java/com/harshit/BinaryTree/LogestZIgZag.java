package com.harshit.BinaryTree;

public class LogestZIgZag {
    static class node {
        int root;
        node left;
        node right;

        node(int data) {
            this.root = data;
        }
    }

    int max = 0;

        public int longestZigZag(node root) {
            if (root == null) {
                return 0;
            }

            zig(root.left, 0, 1);
            zig(root.right, 1, 1);

            return max;
        }

        private void zig(node root, int direction, int count) {

            if (root == null) {
                return;
            }

            // Update longest ZigZag found so far
            max = Math.max(max, count);

            if (direction == 0) {

                // Previous move was LEFT,
                // so next move must be RIGHT
                zig(root.right, 1, count + 1);

                // Same direction again → start a new ZigZag
                zig(root.left, 0, 1);

            } else {

                // Previous move was RIGHT,
                // so next move must be LEFT
                zig(root.left, 0, count + 1);

                // Same direction again → start a new ZigZag
                zig(root.right, 1, 1);
            }
        }
    }
//  static   int ans=0;
//    public static int dfa(node root,int left,int right)
//    {
//        if(root==null)
//            return ans;
//        ans=Math.max(ans,Math.max(left,right));
//        dfa(root.left,right+1,0);
//        dfa(root.right,0,left+1);
//        return ans;
//    }
//
//}
//You are given the root of a binary tree.
//
//A ZigZag path for a binary tree is defined as follow:
//
//Choose any node in the binary tree and a direction (right or left).
//If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
//Change the direction from right to left or from left to right.
//Repeat the second and third steps until you can't move in the tree.
//Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).
//
//Return the longest ZigZag path contained in that tree.
//
//
//
//        Example 1:
//
//
//Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
//Output: 3
//Explanation: Longest ZigZag path in blue nodes (right -> left -> right).
//Example 2:
//
//
//Input: root = [1,1,1,null,1,null,null,1,1,null,1]
//Output: 4
//Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).
//Example 3:
//
//Input: root = [1]
//Output: 0
//
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 5