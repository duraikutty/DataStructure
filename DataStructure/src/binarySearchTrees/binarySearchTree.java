package binarySearchTrees;

class Node {
	int key;
	Node left, right;

	public Node(int key) {
		this.key = key;
		right = left = null;
	}
}

class binarySearchTree {
	Node root;

	binarySearchTree(int key) {
		root = new Node(key);
	}

	binarySearchTree() {
		root = null;
	}

	void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}

	void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.key);
		preOrder(root.left);
		preOrder(root.right);
	}

	void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.key);

	}

	int heightForLevelOrder(Node root) {
		if (root == null) {
			return 0;
		} else {
			int rHeight = heightForLevelOrder(root.right);
			int lHeight = heightForLevelOrder(root.left);
			if (rHeight > lHeight)
				return rHeight + 1;
			return lHeight + 1;
		}
	}

	void printLevelOrder(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.key + " - ");
		else if (level > 1) {
			printLevelOrder(root.left, level - 1);
			printLevelOrder(root.right, level - 1);
		}
	}

	void levelOrder(Node root) {
		int height = heightForLevelOrder(root);
		System.out.println("Height : " + height);
		for (int i = 1; i <= height; i++)
			printLevelOrder(root, i);
	}

	Node Search(Node root, int key) {
		if (root == null || root.key == key) {
			return root;
		}
		if (root.key > key) {
			return Search(root.left, key);
		}
		return Search(root.right, key);

	}

	void insertNode(Node root, int key) {
		root = insert(root, key);
	}

	Node insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
		}
		if (root.key > key) {
			root.left = insert(root.left, key);
		} else if (root.key < key) {
			root.right = insert(root.right, key);
		}
		return root;
	}

	void deleteKey(int key) {
		root = deleteRec(key, root);
	}

	Node deleteRec(int key, Node root) {
		if (root == null) {
			return root;
		}
		if (root.key < key) {
			root.left = deleteRec(key, root.left);
		} else if (root.key > key) {
			root.right = deleteRec(key, root.right);
		} else {
			if (root.right == null) {
				return root.left;
			} else if (root.left == null) {
				return root.right;
			}
			root.key = minValue(root.right);
			root.right = deleteRec(root.key, root.right);
		}
		return root;
	}

	int minValue(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root.key;
	}

	public static void main(String[] args) {
		binarySearchTree binarySearchTree = new binarySearchTree();
		binarySearchTree.root = new Node(1);
		binarySearchTree.root.left = new Node(2);
		binarySearchTree.root.right = new Node(3);
		binarySearchTree.root.left.left = new Node(4);
		binarySearchTree.root.left.right = new Node(5);
		// binarySearchTree.root.left.left.left = new Node(6);
		// System.out.println(binarySearchTree.Search(binarySearchTree.root, 11));
		binarySearchTree.inorder(binarySearchTree.root);
		// binarySearchTree.insertNode(binarySearchTree.root, 7);
		// System.out.println("After insert");
		// binarySearchTree.inorder(binarySearchTree.root);
		// System.out.println("Pre order");
		// binarySearchTree.preOrder(binarySearchTree.root);
		// System.out.println("Post order");
		// binarySearchTree.postOrder(binarySearchTree.root);
		System.out.println("Level order Travalsal");
		binarySearchTree.levelOrder(binarySearchTree.root);

		binarySearchTree.deleteKey(2);
		System.out.println("****");
		binarySearchTree.levelOrder(binarySearchTree.root);

	}

}
