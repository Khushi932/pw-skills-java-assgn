import java.util.Scanner;

public class que_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = sc.nextInt();
        System.out.print("Enter "+n+" elements");
        int arr[] = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[] = new int[n];
        int idx = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[idx]=arr[i];
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[idx]=arr[i];
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+ans[i]);
        }
    }
}
