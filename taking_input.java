import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //que 1
        String first_name = sc.next();
        String last_name = sc.next();
        int r = sc.nextInt();
        String c = sc.next();
        System.out.println("Name : "+first_name+ " "+last_name);
        System.out.println("Roll number:"+r);
        System.out.println("Field of Interest: "+c);
        //que 2
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1+str2);
        //que 3
        System.out.println("enter marks of Robert in 3 subjects out of 100");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int total = sub1 + sub2 + sub3;
        System.out.println(total);
        int percentage = (total/3);
        System.out.println(percentage+"%");
        //que 4
        System.out.println("enter number of testcases");
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        //que 5
        while (sc.hasNextLine()){
            String a = sc.next();
            String b = sc.next();
            System.out.println(a+b);
        }
    }
}
