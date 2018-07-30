//Inorder Traversal

public class TreeNode{
  TreeNode left;
  TreeNode right;
  int val;
  public TreeNode(int val){
    this.val = val;
  }
}

//Inorder
//Recursive
public void traversal(TreeNode root) {
  if (root != null) {
    traversal(root.left);
    System.out.println(root.val);
    traversal(root.right);
  }
}

//Iterative
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode p = root;
    while(!stack.isEmpty() || p != null) {
        if(p != null) {
            stack.push(p);
            p = p.left;
        } else {
            TreeNode node = stack.pop();
            result.add(node.val);  // Add after all left children
            p = node.right;
        }
    }
    return result;
}

//PreOrder
//Recursive
public void traversal(TreeNode root) {
  if (root != null) {
    System.out.println(root.val);
    traversal(root.left);
    traversal(root.right);
  }
}

//Iterative
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode p = root;
    while(!stack.isEmpty() || p != null) {
        if(p != null) {
            stack.push(p);
            result.add(p.val);  // Add before going to children
            p = p.left;
        } else {
            TreeNode node = stack.pop();
            p = node.right;
        }
    }
    return result;
}


//PostOrder
//Recursive
public void traversal(TreeNode root) {
  if (root != null) {
    traversal(root.left);
    traversal(root.right);
    System.out.println(root.val);
  }
}

//Iterative
public List<Integer> postorderTraversal(TreeNode root) {
    LinkedList<Integer> result = new LinkedList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode p = root;
    while(!stack.isEmpty() || p != null) {
        if(p != null) {
            stack.push(p);
            result.addFirst(p.val);  // Reverse the process of preorder
            p = p.right;             // Reverse the process of preorder
        } else {
            TreeNode node = stack.pop();
            p = node.left;           // Reverse the process of preorder
        }
    }
    return result;
}
