package lt.bt.Uzdaviniai.papildomi.PlanasC;


import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    Calendar now = Calendar.getInstance();
//    System.out.println("Data : " + now.get(Calendar.YEAR) + "-" +(now.get(Calendar.MONTH) + 1) + "-"
//            + now.get(Calendar.DATE) );
//
//    now = Calendar.getInstance();
//    now.add(Calendar.YEAR, -100);
//    System.out.println("date before 100 years : " + (now.get(Calendar.MONTH) + 1) + "-"
//            + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));


        read();
    }

    private static void read() throws FileNotFoundException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\planasC.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        scanner.nextLine();

        List<Person> info = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            Person personInfo = new Person();
            personInfo.setName(scanner.next());
            personInfo.setLastName(scanner.next());
            personInfo.setBirthYears(scanner.nextInt());
            personInfo.setBirthMonth(scanner.nextInt());
            personInfo.setBirthDay(scanner.nextInt());

            Calendar now = Calendar.getInstance();
            now.add(Calendar.YEAR, - personInfo.getBirthYears());
            now.add(Calendar.MONTH,-personInfo.getBirthMonth());
            now.add(Calendar.DATE, - personInfo.getBirthDay());

            System.out.println(personInfo);
            System.out.println("Jam yra : " + now.get(Calendar.YEAR)+" m.");
            System.out.println("Jam iki gimtadienio liko : " + now.get(Calendar.MONTH)+" men. "+now.get(Calendar.DATE)+" d. "+ "\r\n");

        }
    }
}
