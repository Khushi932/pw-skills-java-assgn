import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        //conditions
        Scanner sc = new Scanner(System.in);
        //que 1
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth");
        int b = sc.nextInt();
        if(l==b){
            System.out.println("It is squqre");
        }
        else{
            System.out.println("It is rectangle");
        }
        //que 2
        System.out.println("Enter number to find absolute");
        int n = sc.nextInt();
        System.out.println(Math.abs(n));
            /*
                if(n<0){
                    n = n * -1;
                }
                 System.out.println(n);
             */
        //que 3
        System.out.println("Enter cost price:");
        int cp = sc.nextInt();
        System.out.println("Enter selling price");
        int sp = sc.nextInt();
        if(cp>sp){
            int loss = cp - sp;
            System.out.println("Loss = "+loss);
        }
        else if (sp>cp){
            int profit = sp - cp;
            System.out.println("Profit = "+profit);
        }
        else{
            System.out.println("No profit no loss");
        }
        //que 4
        System.out.println("Enter an integer");
        int i = sc.nextInt();
        if(i>=0){
            System.out.println("The number is possitive");
        }
        else{
            System.out.println("The number is negative and skipped");
        }
        //que 5
        System.out.println("Enter an operator (+ , - , * , / ) : ");
        char op = sc.next().charAt(0);
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();
        int ans ;
        switch(op){
            case '+' : ans = num1 + num2;
                System.out.println(num1+" + "+num2+" = "+ans);
                break;
            case '-' : ans = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+ans);
                break;
            case '*' : ans = num1 * num2;
                System.out.println(num1+" * "+num2+" = "+ans);
                break;
            case '/' : ans = num1 / num2;
                System.out.println(num1+" / "+num2+" = "+ans);
                break;
            default:
                System.out.println("Enter valid operator");
                break;
        }
        //que 6
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if (marks >= 90){
            System.out.println("Your grade is A+");
        }
        else if (marks >= 80){
            System.out.println("Your grade is A");
        }
        else if (marks >= 70){
            System.out.println("Your grade is B+");
        }
        else if (marks >= 60){
            System.out.println("Your grade is B");
        }
        else if (marks >= 50){
            System.out.println("Your grade is C");
        }
        else if (marks >= 40){
            System.out.println("Your grade is D");
        }
        else if (marks >= 30){
            System.out.println("Your grade is E");
        }
        else if (marks < 30){
            System.out.println("Your grade is F");
        }
            /*if((marks > 90) && (marks < 100)){
                System.out.println("Your grade is A+");
            }
            else if((marks > 80) && (marks < 90)){
                System.out.println("Your grade is A");
            }
            else if((marks > 70) && (marks < 80)){
                System.out.println("Your grade is B+");
            }
            else if((marks > 60) && (marks < 70)){
                System.out.println("Your grade is B");
            }
            else if((marks > 50) && (marks < 60)){
                System.out.println("Your grade is C");
            }
            else if((marks > 40) && (marks < 50)){
                System.out.println("Your grade is D");
            }
            else if((marks > 30) && (marks < 40)){
                System.out.println("Your grade is E");
            }
            else if(marks<30){
                System.out.println("Your grade is F");
            }*/
    }
}
