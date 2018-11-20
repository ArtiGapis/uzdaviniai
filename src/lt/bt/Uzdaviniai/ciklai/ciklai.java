package lt.bt.Uzdaviniai.ciklai;

import java.io.*;

public class ciklai {
    public static void main(String[] args)throws IOException {

        System.out.println("Pradzia");
        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\bandomasis.txt";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
            System.out.println(st.length());
        }
        br.close();

        String fileName = "src\\lt\\bt\\Uzdaviniai\\txt\\bandomasis1.txt";
        String content = "9878";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        System.out.println("Done");
        bw.close();
        fw.close();


    }
}

