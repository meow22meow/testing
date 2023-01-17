public class Person {
    String name;
    int age;
    int gen;
    Person(String name)
    {

        this.name=name;
    }
    public void setinfo(int age,char gen )
    {
        this.age=age;
        this.gen=gen;
    }
    public void displaydetail()
    {
        System.out.println("Name is "+this.name);
        System.out.println("Age is "+this.age);
        System.out.println("Gender is "+this.gen);
    }

}
