import java.util.*;
public class Demogen {
    public static void main(String args[]){
        List<String> list=new ArrayList<>();
        list.add("Meow");
        list.add("Bark");
        List anotherlist=new ArrayList();
        anotherlist.add("Cat");
        anotherlist.add(123);
        anotherlist.add(20.0);

        System.out.println(list);
        System.out.println(anotherlist);

    }
}
