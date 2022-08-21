package inheritance;


public class My_Calculation extends Calculation{
// subclass is a supClass
    //supClass has a subClass
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }

    public static void main(String[] args) {
        int a = 10, b=20;
        My_Calculation calculation = (My_Calculation) new Calculation();
        calculation.multiplication(a,b);
    }
}
