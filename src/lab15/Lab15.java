package lab15;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Alise on 26.04.2017.
 */
public class Lab15 {

    public static void main(String[] args) {
        System.out.print("Введіть повну назву файлу: ");
        Scanner in = new Scanner(System.in);
        String fileName = in.next();
        String path = "E:\\Java\\JavaPractice\\src\\lab15\\directory";
        File fileDir = new File(path);
        if (fileDir.isDirectory()){
            File[] files = fileDir.listFiles();
            if (files == null){
                System.out.println("Папка порожня!");
            }
            else {
                for (File f : files){
                    if (f.getName().compareTo(fileName) == 0){
                        f.delete();
                        System.out.println("Файл "+fileName+" видалений успішно!");
                        break;
                    }
                    else
                        System.out.println("Файл не знайдений!");
                }
            }
        }
        else {
            System.out.println("Папки не знайдено!");
        }
    }

}
