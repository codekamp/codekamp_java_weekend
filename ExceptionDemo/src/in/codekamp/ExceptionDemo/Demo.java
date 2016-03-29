package in.codekamp.ExceptionDemo;

/**
 * Created by cerebro on 29/03/16.
 */
public class Demo {
    public static void main(String[] args) {

        BadaBhai badaBhai = new BadaBhai();

        String tastyDish = null;
        try {
            tastyDish = badaBhai.makeSandwich();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(tastyDish);

    }
}
