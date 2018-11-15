package lt.bt.Uzdaviniai;

import java.io.*;

public class ciklai {
    public static void main(String[] args)throws IOException {
        System.out.println("Pradzia");
        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        String filePath = "src\\lt\\bt\\Uzdaviniai\\bandomasis.txt";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            System.out.println(st.length());
        }
        br.close();

        String fileName = "src\\lt\\bt\\Uzdaviniai\\bandomasis1.txt";
        String content = "9878";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        System.out.println("Done");
        bw.close();
        fw.close();

        String filePath1 = "src\\lt\\bt\\Uzdaviniai\\bandomasis1.txt";
        File file1 = new File(filePath1);
        BufferedReader br1 = new BufferedReader(new FileReader(file1));

        String st1 =  br1.readLine();
        System.out.println(st1);
        //System.out.println(st1.length());
        //System.out.println(st1.charAt(1));
        for (int i=0; i < st1.length(); i++) {
            System.out.println(st1.charAt(i));
        } System.out.println(st1.length());
    }
}

