public class Main {
    public static void main(String[] args) {
        MyLinkList myLinkList=new MyLinkList();
        myLinkList.addfirst(1);
        myLinkList.addfirst(3);
        myLinkList.addfirst(3);
        myLinkList.show();
        System.out.println();
        myLinkList.addlast(3);
        myLinkList.addlast(5);
        myLinkList.addlast(6);
        myLinkList.show();
        System.out.println();
        System.out.println(myLinkList.search(6));
        myLinkList.remove(100);
        myLinkList.show();
        System.out.println();
        myLinkList.cutsame(3);
        myLinkList.show();
        System.out.println();
        myLinkList.reverse();
        myLinkList.show();
        System.out.println();
        System.out.println(myLinkList.midNode().data);
    }
}
