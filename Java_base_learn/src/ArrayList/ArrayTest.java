package ArrayList;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        if (list.isEmpty())
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("list is not empty");
        }
        list.add("hello");
        list.add("world");

        if (list.isEmpty())
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("list is not empty");
            int len = list.size();
            System.out.println("list size is " + len);
        }

    }
}
