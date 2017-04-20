package lab14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Work on 20.04.2017.
 */
public class Lab14 {
    private static ArrayList<String> list = new ArrayList<String>();
    static void readFile(){
        String FILENAME = "E:\\Java\\JavaPractice\\src\\lab14\\input.txt";
        BufferedReader br = null;
        FileReader fr = null;
        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String sCurrentLine;
            br = new BufferedReader(new FileReader(FILENAME));
            while ((sCurrentLine = br.readLine()) != null) {
                list.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        readFile();
        for (String s : list){
            System.out.println("Рядок: "+s);
            System.out.println("   Cкладається з: ");
            StringTokenizer tokenizer = new StringTokenizer(s);
            String str;
            while (tokenizer.hasMoreTokens()){
                str = tokenizer.nextToken();
                try{
                    Double d = Double.parseDouble(str);
                    System.out.println("      "+str+ "Число " +d);
                }catch (Exception e){
                    System.out.println("      Не число - "+str);
                }
            }
        }
    }
}
