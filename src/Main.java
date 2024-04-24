//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyArrayList arrayList = new MyArrayList();
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.remove(2);
        System.out.println(arrayList.getLast());
    }
}
