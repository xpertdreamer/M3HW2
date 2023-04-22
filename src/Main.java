import CustomLinkedList.CustomLinkedListMono;

public class Main {
    public static void main(String[] args) {
        CustomLinkedListMono<Integer> list = new CustomLinkedListMono<>();
        list.addFirst(1);
        list.addFirst(2);
        list.add(1, 7);
        list.add(1, 8);
        list.add(5);
        list.displayList();

        System.out.println();

        list.remove(2);
        list.displayList();

        System.out.println(list.get(2));

        System.out.println();

        list.removeFirst();
        list.displayList();

    }
}