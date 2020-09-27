
unsorted_map<TreeNode,int> mp;
int res=INT_MIN;

//O(1)
int utilGCS(TreeNode *node) {
	
}

//O(1)
int utilCS(TreeNode *node) {
	
}

//O(n)
void maxSum(TreeNode *root) {
	if(root->left==NULL && root->right==NULL) {
		mp[root]=root->val;
		return ;
	}

	maxSum(root->left);
	maxSum(root->right);

	int grandChildrenSum=utilGCS();
	int	childSum=utilCS();

	mp[root]=max(root->val+grandChildrenSum,childSum)
	return ;
}

ans=mp[root];