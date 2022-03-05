public class BinarySearchTree {
    
    private TreeNode root;
    public BinarySearchTree(){
        root = null;
    }

    private static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode insertValue(TreeNode root,int data){
        if(root==null){
            root = new TreeNode(data);
            return root;
        }
        if(data<root.data){
            root.left = insertValue(root.left, data);
        }else{
            root.right = insertValue(root.right,data);
        }
        return root;
    }

    public void inOrderTraverse(TreeNode root){
        if(root==null){
            return ;
        }
        inOrderTraverse(root.left);
        System.out.print(root.data+" ");
        inOrderTraverse(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree obj = new BinarySearchTree();
        obj.root = obj.insertValue(obj.root, 3);
        obj.root = obj.insertValue(obj.root, 1);
        obj.root = obj.insertValue(obj.root, 5);
        obj.root = obj.insertValue(obj.root, 2);
        obj.root = obj.insertValue(obj.root, 10);
        obj.root = obj.insertValue(obj.root, 1);
        obj.inOrderTraverse(obj.root);
        System.out.println();
        System.out.println("");
    }
}
