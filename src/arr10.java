import java.util.Scanner;

public class arr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        int ch ;
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();

        }
        ch=sc.nextInt();
        int found=0;
        for (int i = 0; i < 10; i++) {
            if (arr[i]==ch){
                found=1;
            }
        }
        if(found==1){
            System.out.println("Present");

        }
        else{
            System.out.println("not present");
        }
    }
}
