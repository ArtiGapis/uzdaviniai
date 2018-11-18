package lt.bt.Uzdaviniai;

import java.io.*;


public class lyginiaiNElyginiai {

    public static void main(String[] args) throws IOException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\bandomasis1.txt";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        int a;

        for (int i=0; i < line.length(); i++) {
            a=Integer.parseInt(String.valueOf(line.charAt(i)));
            if((a%2)==0) {
                System.out.println(line.charAt(i)+" - lyginis");
            }
            else {
                System.out.println(line.charAt(i)+" - nelyginis");
            }
        }
    }
}