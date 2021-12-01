//this isn't mine. sorted it into IDE so I can observe

public class BinarySortTree {

    public static class TreeNode {

        int node;
        TreeNode left;
        TreeNode right;

        TreeNode(int node) {
            this.node = node;
        }
    }

    private static TreeNode root;

    public static void treeInsert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            return;
        }
        TreeNode runner;
        runner = root;
        while (true) {
            if (value < runner.node) {
                if (runner.left == null) {
                    runner.left = new TreeNode(value);
                    return;
                } else {
                    runner = runner.left;
                }
            } else {
                if (runner.right == null) {
                    runner.right = new TreeNode(value);
                    return;
                } else {
                    runner = runner.right;
                }
            }
        }
    }

    public static int nodeCounter(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftCounter = nodeCounter(node.left);
            int rightCounter = nodeCounter(node.right);
            return 1 + leftCounter + rightCounter;
        }
    }
    static int sum = 0;

    public static int leavesCounter(TreeNode node) {
        if (node.left == null && node.right == null) {
            sum += 1;
        }
        if (node.left != null) {
            leavesCounter(node.left);
        }
        if (node.right != null) {
            leavesCounter(node.right);
        }
        return sum;
    }

    public static int sumOfDepth(TreeNode node, int depth) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return depth;
        }
        return sumOfDepth(node.left, depth + 1) + sumOfDepth(node.right, depth + 1);
    }

    public static int maxDepth(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            return depth;
        }
        int maxDepth = depth;
        if (node.left != null) {
            if (maxDepth < maxDepth(node.left, depth + 1)) {
                maxDepth = maxDepth(node.left, depth + 1);
            }
        }
        if (node.right != null) {
            if (maxDepth < maxDepth(node.right, depth + 1)) {
                maxDepth = maxDepth(node.right, depth + 1);
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        //filling the tree with 1,023 nodes using the insert method
        for (int i = 1; i <= 1023; i++) {
            treeInsert((int) (Math.random() * Integer.MAX_VALUE));
        }
        //results
        int leavesTotal = leavesCounter(root);
        int leavesDepthSum = sumOfDepth(root, 0);
        int leavesDepthMax = maxDepth(root, 0);
        System.out.println("node counter: " + nodeCounter(root));
        System.out.println("leaves counter: " + leavesTotal);
        System.out.println("sum of depths of all leaves: " + leavesDepthSum);
        System.out.println("max depth of leaves: " + leavesDepthMax);
        System.out.println("average depth of leaves: " + leavesDepthSum / leavesTotal);
    }

}
