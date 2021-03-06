bool isSubPath(ListNode* head, TreeNode* root) {
        if(head == NULL) return true;
        if(root == NULL) return false;
        return dfs(head, root) || isSubPath(head, root->left) || isSubPath(head, root->right);
    }
    
    bool dfs(ListNode* cur, TreeNode* root) {
        if(cur == NULL) return true;
        if(root == NULL) return false;
        if(cur->val != root->val) return false;
        return dfs(cur->next, root->left) || dfs(cur->next, root->right);
    }