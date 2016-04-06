import java.sql.*;

/**
 * Created by cerebro on 02/04/16.
 */

public class Demo implements Runnable {

    private boolean result = false;

    public static void main(String[] args) {

        http://localhost/phpmyadmin

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Mysql JDBC not present. Need to download it.");
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codekamp", "prashant", "mypass");
            Statement stmt = connection.createStatement();

            ResultSet resultSet = stmt.executeQuery("SELECT * from students");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                int id = resultSet.getInt("id");


                System.out.println("Id: " + id + ", name: " + name + ", email: " + email);
            }

            stmt = connection.createStatement();

            stmt.execute("INSERT INTO students (name, email) VALUES ('Bansi Lal', 'bansi@codekamp.in')");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        Demo demo1 = new Demo();
        Thread thread1 = new Thread(demo1, "Rajnikant");
        thread1.start();

        Thread thread2 = new Thread(demo1, "Dare Devil");
        thread2.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.longLoop();

    }

    private void longLoop() {
        int i;
        for (i=0; i<100; i++){
            if(Thread.currentThread().getName().equals("Rajnikant") && i == 40) {
                this.result = true;
            }
            if(this.result) {
                break;
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(Thread.currentThread().getName().equals("Dare Devil")) {
            System.out.println(i);
        }
    }
}
