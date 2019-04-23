
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> innerResult;
        if (root == null) {
        return  result;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
        int sizeOfQueue = nodeQueue.size();

        innerResult = new ArrayList<>();
        for (int x = 0; x<sizeOfQueue; x++) {
        TreeNode latestNode = nodeQueue.poll();
        innerResult.add(latestNode.val);
        if (latestNode.left != null)  nodeQueue.add(latestNode.left);
        if (latestNode.right != null)  nodeQueue.add(latestNode.right);
        }

        result.add(innerResult);
        }

        return result;
        }