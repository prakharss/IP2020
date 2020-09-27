int mx;

void leftFirstNode(Node *root, int h) {
	
	if(root==null)
		return ;

	if(h>mx) {
		res=root.val;  //when h is max, res = leftmost node of last level
		mx=h;
	}

	leftFirstNode(root.left,h+1);
	leftFirstNode(root.right,h+1);
}

ipsvm() {
	leftFirstNode(root,0);
}

//O(numberOfNodes)   S(heightOfTree)