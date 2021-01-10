public class Main {
    public static void main(String[] args) {
        doubleLinklist cur=new doubleLinklist();
         cur.addFirst(2);
         cur.addFirst(3);
         cur.addFirst(2);
         cur.addFirst(4);
       cur.display();
         cur.addLast(5);
         cur.addLast(6);
         cur.addLast(7);
         cur.display();
         cur.sizeOf();
        System.out.println(cur.contains(5));
        cur.addIndex(0,8);
        cur.display();
        cur.remove(7);
        cur.display();
        cur.removeAllKey(2);
        cur.display();
    }
}
