import java.util.*;

public class Complex {

    private double real;
    private double imaginary;

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex() {
        this.setReal(0);
        this.setImaginary(0);
    }

    public Complex(double real, double imaginary) {
        this.setReal(real);
        this.setImaginary(imaginary);
    }

    public void setRealAndImaginary(double real, double imaginary) {
        this.setReal(real);
        this.setImaginary(imaginary);
    }


    public Complex addition(Complex temp) {
        Complex result = new Complex();
        result.real = this.getReal() + temp.getReal();
        result.imaginary = this.getImaginary() + temp.getImaginary();
        return result;
    }

    public Complex subtraction(Complex temp) {
        Complex result = new Complex();
        result.real = this.getReal() - temp.getReal();
        result.imaginary = this.getImaginary() - temp.getImaginary();
        return result;
    }

    public Complex multiplication(Complex temp) {
        Complex result = new Complex();
        result.real = (this.getReal() * temp.getReal()) - (this.getImaginary() * temp.getImaginary());
        result.imaginary = (this.getReal() * temp.getImaginary()) + (this.getImaginary() * temp.getReal());
        return result;
    }

    public Complex division(Complex temp) {
        Complex result = new Complex();
        result.real = (((this.getReal() * temp.getReal()) + (this.getImaginary() * temp.getImaginary())) / (Math.pow(temp.getReal(), 2) + Math.pow(temp.getImaginary(), 2)));
        result.imaginary = (((this.getReal() * temp.getImaginary()) - (this.getImaginary() * temp.getReal())) / (Math.pow(temp.getReal(), 2) + Math.pow(temp.getImaginary(), 2)));
        return result;
    }

    public String displayValue(){
        return "(" + this.getReal() + ") + (" + this.getImaginary() + ") i";
    }

    public static Complex getValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        int real = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        int imag = sc.nextInt();
        Complex complex = new Complex(real, imag);
        System.out.println("\nNumber:  " + complex.displayValue());
        return complex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            if(choice == 0){
                return;
            }
            System.out.println();
            switch(choice){
                case 1: System.out.println("Enter First Number");
                        Complex complex1 = getValue();
                        System.out.println("\nEnter Second Number");
                        Complex complex2 = getValue();
                        System.out.println("\nSum: " + complex1.addition(complex2).displayValue());
                        break;
                case 2: System.out.println("Enter First Number");
                        Complex complex3 = getValue();
                        System.out.println("\nEnter Second Number");
                        Complex complex4 = getValue();
                        System.out.println("\nDifference: " + complex3.subtraction(complex4).displayValue());
                        break;
                case 3: System.out.println("Enter First Number");
                        Complex complex5 = getValue();
                        System.out.println("\nEnter Second Number");
                        Complex complex6 = getValue();
                        System.out.println("\nProduct: " + complex5.multiplication(complex6).displayValue());
                        break;
                case 4: System.out.println("Enter First Number");
                        Complex complex7 = getValue();
                        System.out.println("\nEnter Second Number");
                        Complex complex8 = getValue();
                        System.out.println("\nDivision: " + complex7.division(complex8).displayValue());
                        break;
                default: System.out.println("Invalid Choice");
            }
            System.out.println();
        }
    }

}