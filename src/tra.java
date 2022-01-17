
class tra{
    public static void main(String[] args) {
        int index=2;
        int value=23;
        int arr[]={10,20,30,40,50,60};
        for(int i= arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}