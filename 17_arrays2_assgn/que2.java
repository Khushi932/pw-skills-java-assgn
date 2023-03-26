import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of elements in array 1 and array 2 such that a1<a2");
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.println("Enter array 1 of "+n+" element");
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter array 2 of "+m+" element");
        int b[]= new int[m];

        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
            boolean check = false;
            for(int j=0;j<n;j++){
                if(b[i] == a[j]){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println(b[i]);
            }
        }
    }
}
