
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        boolean status=true;
        Scanner sc =new Scanner(System.in);
        String Str1= sc.nextLine();
        String Str2= sc.nextLine();
        if (Str1.length()!=Str2.length()){
            status=false;
        }
        else{
            char[] s1=Str1.toLowerCase().toCharArray();
            char[] s2=Str2.toLowerCase().toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            System.out.println(s2);
            status = Arrays.equals(s1,s2);
        }
        if (status==true){
            System.out.println("Yes it is a anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }


}
