package java3_30_1;

class Node{
    public char val;
    public Node left;
    public Node rigth;

    public Node(char val) {
        this.val = val;
    }
}
public class TestTree {
    //手动构造一个二叉树
    public static Node bulid(){
        Node a=new Node('A');
        Node b=new Node('B');
        Node c=new Node('C');
        Node d=new Node('D');
        Node e=new Node('E');
        Node f=new Node('F');
        Node g=new Node('G');
        Node h=new Node('H');
        a.left=b;
        a.rigth=c;
        b.left=d;
        b.rigth=e;
        e.left=g;
        g.rigth=h;
        c.rigth=f;

        return a;
    }
    //前序遍历
    public static void preOrder(Node root){
    if(root==null){
        return ;
    }
        System.out.print(root.val+" ");
    preOrder(root.left);
    preOrder(root.rigth);

    }
    //中序遍历
    public static void inOrder(Node root){
    if(root==null){
        return ;
    }
    inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.rigth);
    }
    //后序遍历
    public static void postOrder(Node root){
    if(root==null){
        return ;
    }
    postOrder(root.left);
    postOrder(root.rigth);
        System.out.print(root.val+" ");
    }
    //获取二叉树的节点个数
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return 1+size(root.rigth)+size(root.left);
    }
    //求二叉树的子叶个数;
    public static int leafSize(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.rigth==null){
            return 1;
        }
      //递归遍历
        return  leafSize(root.rigth)+leafSize(root.left);
    }
    //求二叉树的k层节点的个数
    public static int kLevelSize(Node root, int k){
        if(k<1||root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return kLevelSize(root.left,k-1)+kLevelSize(root.rigth,k-1);
    }
    //在二叉树中查找指定元素
    public static Node find(Node root,char key){
        if(root==null){
            return null;
        }
        if(root.val==key){
            return root;
        }
        Node result=find(root.left,key);
        if(result!=null){
            return result;
        }
        return find(root.rigth,key);
    }
    public static void main(String[] args) {
        Node node=bulid();
        System.out.println("前序");
       preOrder(bulid());
        System.out.println();
       System.out.println("中序");
        inOrder(bulid());
        System.out.println();
        System.out.println("后续");
        postOrder(bulid());
        System.out.println();
        System.out.println("节点的个数");
        System.out.println(size(node));
        System.out.println("叶子的个数");
        System.out.println(leafSize(node));
        System.out.println("第k层的节点个数");
        System.out.println(kLevelSize(node,3));
        System.out.println("查找指定元素");
        System.out.println(find(node,'F'));
    }
}
