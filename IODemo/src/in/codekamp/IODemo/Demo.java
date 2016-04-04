package in.codekamp.IODemo;

import javax.sound.midi.Soundbank;
import java.io.*;

/**
 * Created by cerebro on 03/04/16.
 */
public class Demo {
    public static void main(String[] args) {

        Demo.playWithRandomAccessFile();
    }

    private static void readWithInputStream() {
        System.out.println("reading with the help of InputStream");
        try {
            FileInputStream inputStream = new FileInputStream("/Users/cerebro/Desktop/codekamp.txt");

            int input = inputStream.read();

            while (input >= 0) {
                System.out.println((char)input);
                input = inputStream.read();
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWithReader() {
        System.out.println("reading with the help of Reader");
        FileReader reader = null;
        try {
            reader = new FileReader("/Users/cerebro/Desktop/codekamp.txt");

            int input = reader.read();

            while (input >= 0) {
                System.out.println((char)input);
                input = reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeWithOutputStream() {
        System.out.println("writing with the help of OutputStream");
        try {
            FileOutputStream outputStream = new FileOutputStream("/Users/cerebro/Desktop/codekamp.txt");
            byte[] data = {'i', 'l', 'e', ' ', 'H', 'a', 'n'};

            outputStream.write((int)'F');
            outputStream.write(data);
            outputStream.write((int)'d');
            String name = "Bansi Lal";
            outputStream.write(name.getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeWithWriter() {
        System.out.println("writing with the help of Writer");
        try {
            FileWriter writer = new FileWriter("/Users/cerebro/Desktop/codekamp.txt");
            char[] data = {'i', 'l', 'e', ' ', 'H', 'a', 'n'};

            writer.write((int)'Z');
            writer.write(data);
            writer.write((int)'d');
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWithBufferedInputStream() {
        System.out.println("reading with the help of InputStream");
        try {
            FileInputStream inputStream = new FileInputStream("/Users/cerebro/Desktop/codekamp.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] inputBytes = new byte[10];
            int input = inputStream.read(inputBytes);

            while (input >= 0) {
                System.out.println((char)input);
                input = inputStream.read();
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readWithBufferedReader() {
        System.out.println("reading with the help of BufferedReader");
        FileReader reader = null;
        try {
            reader = new FileReader("/Users/cerebro/Desktop/codekamp.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String input = bufferedReader.readLine();
            while (input != null) {
                System.out.println(input);
                input = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void infoWithFile() {
        File file1 = new File("/Users/cerebro/Desktop/codekamp.txt");
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isHidden());
        System.out.println(file1.exists());
        System.out.println(file1.lastModified());
        System.out.println(file1.length());

        File desktopDirectory = new File("/Users/cerebro/Desktop");
        System.out.println(desktopDirectory.isFile());
        System.out.println(desktopDirectory.isDirectory());

        File[] allFiles = desktopDirectory.listFiles();

        for (int i = 0; i < allFiles.length; i++) {
            System.out.println(allFiles[i].getName());
        }
    }

    private static void playWithRandomAccessFile() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/cerebro/Desktop/codekamp.txt", "rw");
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.writeChars("\n\nThis is awesome!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
