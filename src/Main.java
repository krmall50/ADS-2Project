//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyArrayList arrayList = new MyArrayList(); // [5, 9, 4, 7, 3, 7]
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(7);

        arrayList.add(2, 4);

        System.out.println("First element of an array is: " + arrayList.getFirst());
        System.out.println("Third index element of an array is: " + arrayList.get(3));
        System.out.println("Index of element 7 is : " + arrayList.lastIndexOf(7));
        System.out.println("Size of an array is: " + arrayList.size());
        System.out.print("Array is: ");
        arrayList.printArr();
        arrayList.sort();
        System.out.println();
        System.out.print("Sorted Array is: ");
        arrayList.printArr();
        System.out.println();
        System.out.println();
        System.out.println("-----------------------LinkedList----------------------------");
        System.out.println();
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.print("All elements of Linked list: ");
        linkedList.printArr();
        System.out.println();
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Forth index element: " + linkedList.get(4));
        linkedList.add(3, 8);
        linkedList.add(4, 6);
        linkedList.add(0, 7);
        System.out.print("All elements of Linked list: ");
        linkedList.printArr();
    }
}
