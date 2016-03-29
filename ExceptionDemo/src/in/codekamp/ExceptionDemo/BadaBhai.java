package in.codekamp.ExceptionDemo;

/**
 * Created by cerebro on 29/03/16.
 */
public class BadaBhai {
    public String makeSandwich() throws Exception {

        ChottaBhai chottaBhai = new ChottaBhai();

        String bread = null;

        try {
            bread = chottaBhai.bringBread();

            System.out.println("abb aaram se bread khao");
        } catch (Exception e) {

            throw new Exception("Bread nahi mili because " + e.getMessage() + ". isliye sandwich nahi ban sakte");
        } finally {
        }

        System.out.println("try catch khatam");

        return "tasty tasty sandwich";
    }
}
