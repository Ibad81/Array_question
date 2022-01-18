import java.util.Scanner;

public class Hackerrank_week2_1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc=new Scanner(System.in);
        int i,k,j;
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (k = 0; k < arr.length ; k++) {
            count=0;

        }
        for (j = 0; j < arr.length; j++) {
            if(arr[i]<arr[j]){
                count++;
            }
            if (count== arr.length-(k+1)){
            System.out.println(arr[k]+" ");
        }
        }
        
    }

}
