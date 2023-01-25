import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // loops
        //que 1
        {
            System.out.println("Enter number till which you want to show fibbonacci series:");
            int n = sc.nextInt();
            int a = 1, b = 1;
            for (int i = 1; i<=n;i++){
                System.out.print(a+" ");
                int sum = a+b;
                a=b;
                b= sum;
            }
        }
        //que 2
        {
            System.out.println("Enter number till which you want to add");
            int ans = 0 ;
            while(sc.hasNextLine())//checks if input exist or not
                {int num = sc.nextInt();
                    if(num>=0){
                        ans += num;
                    }
                    else{
                        ans = -1;
                        break;
                    }
            }
            System.out.println("Sum = "+ans);
        }
        //que 3
        {
            System.out.println("Enter the number to find factorial ");
            int n = sc.nextInt();
            int fact=1;
            for(int i = 2;i<=n;i++){
                fact *= i;
            }
            System.out.println("Factorial = "+fact);
        }
        //que 4
        {
            System.out.println("Enter number till which you watn to find armstrong number:");
            int n = sc.nextInt();
            int num = 1;//variable to check from 1 to n
            while(num<=n){
                int count = 0;
                int i = num;
                while(i>0){
                    count++;
                    i /= 10;
                }
                int val = num;//store the value of current num in temporary variable to caluculate sum of its digit
                int sum =0;
                while(val>0)//break the number digit by digit until it reaches 0
                {
                    int digit = val % 10 ;
                    sum += Math.pow(digit,count);//add cube of digit of number
                    val /= 10;
                    if (sum > val) { // if sum has exceed current number it will not be the armstrong number
                        continue;
                    }
                }
                if(sum == num){ // this is an armstrong number
                    System.out.println(num);
                }
                num++;
            }
        }
        //que 5
        {
            int size = 5;
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if ((i==j) || (i+j == size-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        //que 6
        {
            int size = 5; //length of pattern is 5 only, the below part is the upside down
          //  version of top part with 5th line in the middle, with total of (2n-1) lines
            int alpha = 65; //ASCII code for first capital letter
            int num = 0; //will increment alpha as char progresses
            for (int i = 1; i <= size; i++) {
                for (int j = size; j > i; j--) {
                    System.out.print(" "); //top half until the spaces need to be printed
                }
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print((char)(alpha+num++));//top half until the char need to
                    //be printed, next char can be achieved by incrementing the ASCII code by 1
                }
                num = 0;
                System.out.println();
            }
            for (int i = 1; i <= size - 1; i++) {
                for (int j = 0; j < i; j++) { //bottom half
                    System.out.print(" ");
                }
                for (int k = (size - i) * 2 - 1; k > 0; k--) {
                    System.out.print((char)(alpha+num++));
                }
                num = 0;
                System.out.println();
            }
        }
        //que 7
        {
            int size = 5;
            for(int i =0;i<size;i++){//column
                for(int j = 0; j<size;j++){//rows
                    if(i == size/2){//middle column
                        System.out.print("*");
                    }
                    else{
                        if(j==size/2){//middle row
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
        //que 8
        {
            int x1;
            int x2;
            int x3;
            int number=3;
            int banner=0;
            x1 = sc.nextInt(); //denoting length of pattern
            int d= x1; //number of spaces at each line, equal to line number
            for(x2=1;x2<= x1; x2++){
                for(int e=1;e<=d;e++){
                    System.out.print(" ");
                }
                if(x2==1){//1st line
                    System.out.print("2");
                }
                else{//other lines
                    for(x3=0; x3!= x2;){
                        banner=0;
                        for (int k=2;k<number;k++){ //check if prime or not
                            if((number%k)==0)
                                banner=1; //not prime
                        }
                        if(banner==0){ //prime
                            x3++;
                            System.out.print(number + " ");
                        }
                        number++;
                    }
                }
                System.out.println(); //move to next line
                d--;
            }
        }
        //que 9

            int n = sc.nextInt();
            if (isprime(n) && isprime(n :n - 2)){
            System.out.print(true);
        }
            else{
            System.out.print(false);
        }

        //que 10
        {
            int n = sc.nextInt();
            for(int i=1;i*i <=n;i++){
                System.out.println(i*i +" ");
            }
        }
    }
    //que9
    public static boolean isprime(n){
        if(n<=1){
            return false;
        }
        for (int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
