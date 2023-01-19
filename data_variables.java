
public class data_variables {
    public static void main(String[] args) {
        //que 1
        int x=4, y=2;
        System.out.println(x*y);
        //que 2
        char a = 'U';
        int asciivalue = a;
        System.out.println(asciivalue);
        //que 3
        int length = 7, breadth = 4;
        int area = length * breadth;
        System.out.println("Area of rectangle is "+area);
        //que 4
        int size=4;
        int cube = size*size*size;
        System.out.println("Cube is "+cube);
        //que 5
        int p=2,q=3;
        int temp;
        System.out.println("Before swapping p = "+p+" and q = "+q);
        temp=p;
        p=q;
        q=temp;
        System.out.println("After swapping p = "+p+" and q = "+q);
    }
}
