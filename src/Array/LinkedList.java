package Array;

public class LinkedList {
    public static void main(String args[])
    {
        java.util.LinkedList<String> ll = new java.util.LinkedList<>();
        ll.add("A");
        ll.add("C");
        ll.add(1, "B");

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
        ll.set(2, "D");
        // Using the for each loop
        for (String str : ll)
            System.out.print(str + " ");
    }
}
