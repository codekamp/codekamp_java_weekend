package in.codekamp.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by cerebro on 06/04/16.
 */
public class Demo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();


        names.add("Suresh");
        names.add("Ramesh");
        names.add("Bansi Lal");

        System.out.println(names.size());
        System.out.println(names.isEmpty());

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        Collections.shuffle(names);
//        Collections.swap(names, 0, 1);


        System.out.println("\n\n\n");
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        names.get(names.size() - 1);

    }
}
