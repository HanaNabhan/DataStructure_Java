package tree;

public class Member {
   int data;
   Member leftchild;
   Member rightchild;
   public Member(int data) {
       this.data = data;
       this.leftchild = null;
       this.rightchild = null;
   }
}
