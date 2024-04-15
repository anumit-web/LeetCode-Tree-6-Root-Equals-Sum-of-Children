/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Root Equals Sum of Children");

        Solution solution = new Solution();

        BuildTree1 tree1 = new BuildTree1();

        TreeNode root1 = tree1.getTree();

        boolean return_value = solution.checkTree(root1);
        
        System.out.println("Output = (Root Equals Sum of Children) = " + return_value); // how to print tree

    }

}
