package treinos;
import java.util.Scanner;

import static treinos.Ipvalidation.isValidIP;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a ip adress");
        String ip2 = scanner.nextLine();

        if (isValidIP(ip2)){
            System.out.println("valid IP");
        } else {
            System.out.println("ip not valid");
        }
       scanner.close();





    }
}