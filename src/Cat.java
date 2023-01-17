public class Cat extends Animal{
    String color;
    int a;
    Integer b;
    Cat(String color){
        this.color=color;
    }

    public void displaycolor()
    {
        System.out.println("color of cat is "+this.color);
    }
}
