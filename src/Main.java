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

        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.lastIndexOf(7));
        System.out.println(arrayList.size());
        arrayList.printArr();
        arrayList.sort();
        System.out.println();
        arrayList.printArr();
    }
}
