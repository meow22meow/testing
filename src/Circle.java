public class Circle implements Shape,Color{
    int n;
    Circle(int n)
    {
        this.n=n;
    }
    @Override
    public void displaycolor() {
        System.out.println("Color is red");
    }

    @Override
    public void displaynoofsides() {
        System.out.println("No of sides is "+n);

    }

    @Override
    public void red() {
        System.out.println("red");
    }

    @Override
    public void green() {
        System.out.println("green");
    }

    @Override
    public void blue() {
        //System.out.println("blue");
    }
}
