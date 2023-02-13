import java.util.Scanner;

class student{
    String name;
    int roll_no;
}

class Triangle{
    int a,b,c;
    public double getArea(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double getPerimeter(){
        double s = (a+b+c)/2.0;
        return s;
    }
}

class Area{
    int length , breadth;
    public Area(int l, int b){
        length = l;
        breadth = b;
    }

    public int getArea(){
        return length*breadth;
    }
}

class Complex{
    int real;
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}

class Employee{
    String name;
    int yoj;
    int salary;
    String address;
}

public class intro_to_oops {
    //que1
    student s1 = new student();
    s1.name = "Khushi";
    s1.roll_no = 23;
        System.out.println("Name = "+s1.name+"\nRoll no = "+s1.roll_no);

    //que2
    Triangle t1 = new Triangle();
    t1.a = 2;
    t1.b = 5;
    t1.c = 6;

        System.out.println("Area = "+t1.getArea());
        System.out.println("Perimeter = "+t1.getPerimeter());

    //que3
    Scanner s = new Scanner(System.in);
    int l,b;
        System.out.println("Enter length of rectengle");
    l = s.nextInt();
        System.out.println("Enter breadth of rectengle");
    b = s.nextInt();

    Area r1 = new Area(l,b);
        System.out.println("area = "+r1.getArea());

    //que4
    Scanner scn = new Scanner(System.in);
System.out.println(“Enter real part of complex number 1: ”);
    int real1 = scn.nextInt();
System.out.println(“Enter complex part of complex number 1 without iota sign: ”);
    int comp1 = scn.nextInt();
System.out.println(“Enter real part of complex number 2: ”);
    int real2 = scn.nextInt();
System.out.println(“Enter complex part of complex number 2 without iota sign: ”);
    int comp2 = scn.nextInt();
    Complex c = new Complex(real1, comp1);
    Complex d = new Complex(real2, comp2);
    Complex e = Complex.add(c,d);
    Complex f = Complex.diff(c,d);
    Complex g = Complex.product(c,d);
e.printComplex();
f.printComplex();
g.printComplex();
    //que5
    Employee a = new Employee();
    a.name = "Robert";
    a.yoj = 1994;
    a.address = "64C- WallsStreet";
    Employee b = new Employee();
    b.name = "Sam";
    b.yoj = 2000;
    b.address = "64D- WallsStreet";
    Employee c = new Employee();
    c.name = "John";
    c.yoj = 1999;
    c.address = "26B- WallsStreet";
System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Address");
System.out.println(a.name + "\t" + a.yoj + "\t" + a.address);
System.out.println(b.name + "\t" + b.yoj + "\t" + b.address);
System.out.println(c.name + "\t" + c.yoj + "\t" + c.address);
}
