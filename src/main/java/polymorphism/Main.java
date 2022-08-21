package polymorphism;

public class Main {

    public static void main(String[] args) {
        Deer deer = new Deer();
        Deer d = new Deer();
        Animal a = d;
        Vegetarian v = d;
        Object o = d;

       if (deer instanceof Animal){
           System.out.println("A Deer IS-A Animal");
       }
       if (deer instanceof Vegetarian){
           System.out.println("A Deer IS-A Vegetarian");
       }
       if (deer instanceof Deer){
           System.out.println("A Deer IS-A Deer");
       }
       if (deer instanceof Object){
           System.out.println("A Deer IS-A Object");
       }
    }
}
