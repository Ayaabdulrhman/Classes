public class printElementsInReverse {
    public static void main(String[] args) {
        DoublyLinkedList<String >list= new DoublyLinkedList<>();
        list.addLast("AAA");
        list.addLast("BBB");
        list.addLast("CCC");
        //اولا: اطبع عناصر القائمة بالترتيب بحيث تبدأ بطباعة اول عنصر الى ان تصل الى اخر عنصر
        //المتوقع ان يكون المخرج
        //AAA BBB CCC
        //ثانيا: اطبع عناصر القائمة بالمعكوس بحيث تبدأ بطباعة أخر عنصر الى ان تصل الى اول عنصر
        //المتوقع ان يكون المخرج
        //CCC BBB AAA
//        System.out.println(list.first());
//        list.removeFirst();
//        System.out.println(list.first());
//        list.removeFirst();
//        System.out.println(list.first());
//        list.removeLast();
//        System.out.println("/////////////////////////////");
//        list.addLast("AAA");
//        list.addLast("BBB");
//      list.addLast("CCC");
//        list.last();
//        System.out.println(list.last());
//        list.removeLast();
//        System.out.println(list.last());
//        list.removeLast();
//        System.out.println(list.last());

//        for (int i = 0; i <= list.size(); i++) {
//            System.out.println(list.first());
//            list.removeFirst();
//
//        }
//        for (int i = 0; i <= list.size(); i++) {
//            System.out.println(list.last());
//            list.removeLast();
//
//        }
//        while (!list.isEmpty()){
//            System.out.println(list.first());
//            list.removeFirst();
//        }
        while (!list.isEmpty()){
            System.out.println(list.last());
            list.removeLast();
        }



    }
}
