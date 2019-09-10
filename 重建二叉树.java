package ��ָ��Ǯ;

public class �ؽ������� {

	public static void main(String[] args) {
		
		// ����������������
        int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
        // ����������������
        int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
        
        TreeNode root = reConstructBinaryTree(pre, in);
        //�����ӡ
        printAfter(root);
        

	}
		/*
		 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
		 * ���������ǰ���������������Ľ���ж������ظ������֡�
		 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
		 * 
		    ˼·��
		       ��������ص㣺��һ��ֵ�Ǹ��ڵ�
		       ��������ص㣺���ڵ���߶������������ұ߶���������
	    	���ȸ��ݸ��ڵ�1�������������Ϊ�����֣����Ϊ���������ұ�Ϊ������
	    	���������и������������ص�ݹ飬�ó�������
	    	���������и������������ص�ݹ飬�ó�������
	    	(����ȷ�ϸ�,����ȷ��������)
    		���ϳ�һ���� :
	 * 						1
	 * 					2		3
	 * 				4		  5    6
	 * 				   7         8
	 */
	 public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		 if (pre == null || in == null || pre.length == 0 || in.length == 0 || pre.length != in.length) {
	            return null;
	        }
		 
		 //�������ĸ��ڵ�
		 TreeNode root = new TreeNode(pre[0]);
		 root.left=null;
		 root.right=null;
		 
		 //�������ĸ���
		 int leftNum=0;
		 for (int i = 0; i < in.length; i++) {
			if(root.val==in[i]) {
				break;
			}
			leftNum++;
		}
		 //�������ĸ���
		 int rightNum = in.length - 1 - leftNum;
		 
		 //�ؽ�������
		 if(leftNum>0) {
			 //��������������
			 int[] leftPre = new int[leftNum];
			 //����������������
			 int[] leftIn= new int[leftNum];
			 for (int i = 0; i < leftNum; i++) {
				leftPre[i]=pre[i+1];
				leftIn[i]=in[i];
			}
			 TreeNode leftRoot = reConstructBinaryTree(leftPre, leftIn);//�ݹ��ع�������
			 root.left=leftRoot;//����
		 }
		 
		 //�ؽ�������
		 if(rightNum>0) {
			 //��������������
			 int[] rightPre = new int[rightNum];
			 //����������������
			 int[] rightIn= new int[rightNum];
			 for (int i = 0; i < rightNum; i++) {
				rightPre[i]=pre[1+leftNum+i];
				rightIn[i]=in[leftNum+1+i];
			}
			 TreeNode rightRoot = reConstructBinaryTree(rightPre, rightIn);//�ݹ��ع�������
			 root.right=rightRoot;
		 }
		 
		return root;
	        
	    }
	 
	 public static void printAfter(TreeNode root) {
		 if(root!=null) {
			 printAfter(root.left);
			 printAfter(root.right);
			 System.out.print(root.val+" ");
		 }
	 }

}

//Definition for binary tree.
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
