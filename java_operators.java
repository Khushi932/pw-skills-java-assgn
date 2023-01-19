import java.util.Scanner;

public class java_operators {
    public static void main(String[] args) {
        //operators

        //que 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();
        System.out.println((((x+8)/3)%5)*5);
        //que 2
        int a= 5,b =10;
        System.out.println("Before Swapping a = "+a+" and b = "+b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = "+a+" and b = "+b);
        //que 3
        int p = sc.nextInt();
        int ans = 0;
        while(p>0){
            ans += p % 10;
            p /= 10;
        }
        System.out.println(ans);
        //que 4
        int m = 55, n= 70;
        System.out.println(m < 50 && m < n);
        System.out.println(m < 50 || m < n);
        //que 5
        //brian karnighan algorithm
        System.out.println("Enter the number to check total number of bits to be flipped to convert the numbers");
        System.out.println("number 1");
        int g = sc.nextInt();
        System.out.println("number 2");
        int h = sc.nextInt();
        int s = g ^ h;
        int count = 0 ;
        while(s!=0){
            s = s & (s-1);
            count++;
        }
        System.out.print(count);
    }
}
