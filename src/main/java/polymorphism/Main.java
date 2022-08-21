package polymorphism;

public class Main {

    public static void main(String[] args) {
        Deer deer = new Deer();
        Deer d = deer;//heap
        System.out.println(d);
        System.out.println(deer);
        Animal a = deer;
        Vegetarian v = deer;
        Object o = deer;

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
