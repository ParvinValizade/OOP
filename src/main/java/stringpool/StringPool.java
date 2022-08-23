package stringpool;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Salam";
        String s2 = "Salam";

        System.err.println(s1==s2); //True
        System.err.println(s1.equals(s2)); //True


        System.err.println("-----------------------------");

        String first = "Salam";
        first = first.intern();
        String second = new String("Salam");
        System.err.println(first==second);

        String first1 = "Salam";
        String second2 = new String("Salam");
        second2 = second2.intern();
        System.err.println(first1==second2);

    }
}
