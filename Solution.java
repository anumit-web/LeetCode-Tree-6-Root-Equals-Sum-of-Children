/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public boolean checkTree(TreeNode root) {

        if ((root.left.val + root.right.val) == root.val) {
            return true;
        } else {
            return false;
        }
    }

}
