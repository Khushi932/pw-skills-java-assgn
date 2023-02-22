import java.util.Scanner;
public class java_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find average:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(Average(a,b,c));

        System.out.println("Enter lowercase string to find number of vowels in it");
        String s = sc.nextLine();
        System.out.println("number of vowels in string = "+s+" are"+count_vowel(s));

        System.out.println("Enter string to find middle characters ");
        String s1 = sc.nextLine();
        System.out.print(middle(s1));

        System.out.println("Enter year to find whether it is lea year or not");
        int y = sc.nextInt();
        System.out.println(is_leap_year(y));

        System.out.println("Enter 3 numbers to find the smallest of all");
        int x = sc.nextInt(), y = sc.nextInt(), z=sc.nextInt();
        System.out.println(Smallest(x,y,z));
    }
    public static int Smallest(int p,int q,int r){
        return Math.min(p,Math.min(q,r));
    }
    public static boolean is_leap_year(int y){
        boolean leap = (y%4)==0;
        return leap;
    }
    public static String middle(String s1){
        if(s1.length() % 2 ==0){
            return s1.substring(s1.length()/2, s1.length()/2 +2);
        }
        else{
            return s1.substring(s1.length()/2, s1.length()/2 +2);
        }
    }
    public static int count_vowel(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static int Average(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
}
