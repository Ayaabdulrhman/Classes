public class ReverseListUsingStack {
    public static void main(String[] args) {
        SinglyLinkedList<Character>list= new SinglyLinkedList<>();
        list.addLast('A');
        list.addLast('B');
        list.addLast('C');
       //أولا: استخدم مكدس لعكس عناصر هذه القائمة
        //ثانيا: قم بطباعة عناصر القائمة بعد عكس عناصرها
        //المتوقع ان يكون المحرج من هذا البرنامج هو
        //C B A
        LinkedStack <Character> newlist= new LinkedStack<>();
//        for (int i = 0; i < list.size() ; i++) {
//            newlist.push( list.removeFirst());
//        }
//        newlist.push( list.removeFirst());
//        newlist.push( list.removeFirst());
//        newlist.push( list.removeFirst());
//
//        System.out.println(newlist.top());
//        newlist.pop();
//        System.out.println(newlist.top());
//        newlist.pop();
//        System.out.println(newlist.top());

    }

}
