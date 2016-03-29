package in.codekamp.ExceptionDemo;

/**
 * Created by cerebro on 29/03/16.
 */
public class ChottaBhai {

    public boolean shopOpen = false;
    public boolean breadAvailable = true;

    public String bringBread() throws DukkanBandException, BreakKhatamException {

        if(!this.shopOpen) {
            throw new DukkanBandException();
        }

        if(!this.breadAvailable) {
            throw new BreakKhatamException();
        }

        return "britannnia bread";
    }
}
