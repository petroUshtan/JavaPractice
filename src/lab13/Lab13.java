package lab13;
import java.util.*;
import java.io.*;

public class Lab13 {

    public static void main(String arg[]) {
        String[] args = new String[2];
        args[0]="E:\\Java\\JavaPractice\\src\\lab13\\file.txt";
        args[1]="petro";
        if( args.length < 2 ) {
            System.out.println("Введіть параметри виклику: назва файлу, рядок");
            return;
        }
        String thisLine;
        ArrayList list = new ArrayList();
        BufferedReader fin = null;

        try {
            fin = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
            while ((thisLine = fin.readLine()) != null) {
                System.out.println("Введений рядок:"+thisLine);
                list.add(thisLine);
            }
            Collections.sort(list);
            System.out.println("Відсортований список рядків:");
            Iterator iter = list.iterator();
            while( iter.hasNext() ) {
                String str = (String)iter.next();
                System.out.println(str);
            }

            iter = list.iterator();
            while( iter.hasNext() ) {
                String str = (String)iter.next();
                if (str.equals(args[1]))
                    System.out.println("Знайдено елемент: " + str);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдений: " + args[0]);
            System.out.println("Помилка: " + e);
        } catch (IOException e) {
            System.out.println("Помилка вводу/виводу. Файл " + args[0]);
            System.out.println("Помилка: " + e);
        }  finally {
            if ( fin != null )
                try {
                    fin.close();
                } catch ( IOException ex ) {
                    System.out.println("Помилка закриття файлу " + args[0]);
                    System.out.println("Помилка: " + ex);
                }
            fin = null;
        }
    }
}
