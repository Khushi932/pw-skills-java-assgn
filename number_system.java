import java.util.Scanner;

public class number_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //que 1
        {
            System.out.println("Enter decimal number to convert into binary");
            int decimal = sc.nextInt();

            int ans = 0 ;
            int pw = 1; // power of 10

            while(decimal >0){
                int parity = decimal%2;
                ans += (parity *pw);
                pw *= 10;
                decimal /= 2;
            }
            System.out.println(ans);
        }
        //que 2
        {
            System.out.println("Enter binary number to convert to decimal");
            int binary = sc.nextInt();
            int ans = 0 ; //converted decimal number
            int pw = 1; // 2^0 = 1

            while(binary >0){
                int unit_digit = binary % 10;
                ans += (unit_digit * pw);
                binary /= 10;
                pw *= 2;
            }

            System.out.println(ans);
        }
        //que 3
        {
            System.out.println("Ener decimal number");
            int m = sc.nextInt();
            System.out.println("Enter binary number");
            int n = sc.nextInt();

            int decimal_num = 0;
            int pw = 1;

            //convert binary to decimal then add to decimal_num

            while (n != 0){
                int rem = n%10;
                decimal_num += (rem * pw);
                pw *= 2;
                n /= 10;
            }
            System.out.println(m+decimal_num);
        }
        //que 4
        {
            System.out.println("Ener decimal number");
            int m = sc.nextInt();
            System.out.println("Enter binary number");
            int n = sc.nextInt();

            int decimal_num = 0;
            int pw = 1;

            //convert binary to decimal then add to decimal_num

            while (n != 0){
                int rem = n%10;
                decimal_num += (rem * pw);
                pw *= 2;
                n /= 10;
            }
            System.out.println(m*decimal_num);
        }
        //que 5
        {
            System.out.println(“Enter the decimal double number: ”);
            double n = sc.nextDouble();
            System.out.println(“Enter the number of precision digits: ”);
            int k = sc.nextInt();
            int decimal_n = (int)n; // separate the integer and fractional part of the double
            double fractional_n = n - decimal_n;
            int decimal_binary = 0;
            int power = 1;
            while(decimal_n != 0) { // convert integer to binary
                int rem = decimal_n % 2;
                decimal_binary += rem * power;
                power *= 10;
                decimal_n /= 2;
            }
            String s = Integer.toString(decimal_binary) + ".";
            while(k > 0 && fractional_n != 0){ // digits of fractional part to be multiplied by 2
                fractional_n *= 2;
                int digit = (int)fractional_n; // the integer part of this becomes digits of fractional part of the number
                s += digit;
                fractional_n = fractional_n - digit; // update fractional part to leftover part after removing integer
                k--; // do this until k digits have been obtained for the fractional part
            }
            System.out.print(s);
        }
    }
}
