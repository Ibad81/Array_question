import java.util.Locale;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int sum=0;
        String na;
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        na=sc.nextLine();
        na=na.toLowerCase();
        for (int i=0;i<na.length();i++){
            System.out.println(na.charAt(i));

            if (na.charAt(i)=='a' || na.charAt(i)== 'e' || na.charAt(i)=='i'||na.charAt(i)=='o'||na.charAt(i)=='u'){
                sum++;
            }

        }
        System.out.println(sum);

    }
}
