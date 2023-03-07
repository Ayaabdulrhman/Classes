public class HotPotatoWinner {
    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");
        queue.enqueue("F");
        queue.enqueue("G");
        queue.enqueue("H");
        queue.enqueue("I");
        queue.enqueue("J");

        //استكمل كتابة الكود بحيث يتم حذف العنصر الخامس في الطابور في كل مرة الى ان يتبقى عنصر واحد في الطابور
        //قم بطباعة العنصر المتبقي في الطابور على انه الفائز
        //المفترض ان يكون العنصر الفائز في هذا المثال هو C
    while (queue.size()==4){
        queue.dequeue();

    }



    }
}
