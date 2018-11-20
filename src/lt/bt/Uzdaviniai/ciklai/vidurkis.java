package lt.bt.Uzdaviniai.ciklai;

import java.io.*;

public class vidurkis {
    public static void main(String[] args)throws IOException {
        String filePath1 = "src\\lt\\bt\\Uzdaviniai\\txt\\bandomasis1.txt";
        File file1 = new File(filePath1);
        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        String st1 =  br1.readLine();

        int suma=0;
        for (int i=0; i < st1.length(); i++)  {
            suma += Integer.parseInt(String.valueOf(st1.charAt(i)));
        }

        System.out.println("skaiciu suma: " + suma);
        double vid=suma/st1.length();
        System.out.println("skaiciu vidurkis: " + vid);

        String fileName = "src\\lt\\bt\\Uzdaviniai\\txt\\vidurkis.txt";
        String content = "skaiciu vidurkis: " + vid + "\r\n";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(vid + "\r\n"));
        System.out.println("Done");
        bw.close();
        fw.close();
        br1.close();
    }
}
