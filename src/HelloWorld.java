import java.util.LinkedHashSet;
import java.util.Set;

public class HelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.printf("TAX ");
    }

    public static void main(String[] args) {

//        Set s = new LinkedHashSet();
//        s.add("1");
//        s.add(1);
//        s.add(3);
//        s.add(2);
//        System.out.println(s);

//        HelloWorld h = new HelloWorld();
//        Thread thread = new Thread(h);
//        thread.start();
//        thread.start();
//        System.out.println(thread.getState());
        foo(null);

    }
    public static void foo(Object o){
        System.out.println("Object");
    }

    public static void foo(String o){
        System.out.println("String");
    }
}
