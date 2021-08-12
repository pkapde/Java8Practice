package Array;
public class ArrayList {
    public static void main(String args[])
    {
        java.util.ArrayList<String> al = new java.util.ArrayList<>();

        al.add("A");
        al.add("B");
        al.add(1, "C");

        System.out.println(
                "Initial ArrayList " + al);

        al.remove(1);

        System.out.println(
                "After the Index Removal " + al);

        al.remove("B");

        System.out.println(
                "After the Object Removal " + al);
    }
}
