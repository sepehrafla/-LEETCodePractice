public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }
    
    private void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(",");
            return;
        }
        sb.append(root.val);
        sb.append(",");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    private int k;
    public TreeNode deserialize(String data) {
        k = 0;
        String[] nums = data.split(",");
        return deserialize(nums);
    }
    private TreeNode deserialize(String[] nums) {
        if (k >= nums.length || nums[k].isEmpty()) {  
            k++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nums[k++]));
        root.left = deserialize(nums);
        root.right = deserialize(nums);
        return root;
    }
}