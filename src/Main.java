import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person p1=new Person("Shabnam Begum");
        p1.displaydetail();
        Employee e1=new Employee("Meow Meow");
        e1.setinfo(20,'F');
        System.out.println("wage is "+ e1.wage(2));
        Circle c1=new Circle(0);
        c1.displaycolor();
        c1.displaynoofsides();
        c1.red();
        c1.blue();
       // Animal a1=new Animal() ;
        Scanner sc=new Scanner(System.in);

      System.out.println("enter a color for cat");
        String color= sc.nextLine();

        Cat cat1=new Cat(color);
        cat1.eyes();
        cat1.legs();
        cat1.displaycolor();
        Box box=new Box("Wow");
      //  box.container="RED";
       // System.out.println(box.container);
        System.out.println( box.getValue());
        System.out.println("Another case");
        Box number=new Box(123);
        System.out.println(number.getValue());
        Exgen<Integer> ex1=new Exgen<>(2345);
        System.out.println(ex1.getval());
        ex1.container=1234;

    }


}