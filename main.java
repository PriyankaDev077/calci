class main {
    public static void main(String[] args){
        int a=10;
        int b=5;
        int sum=a+b;
        int subtract=a-b;
        int multiply=a*b;
        int divide=a/b;
        int modulus=a%b;
        System.out.println("addition of a & b"+sum);
        System.out.println("subtraction of a & b"+subtract);
        System.out.println("multiplication of a & b" +multiply);
        System.out.println("division of a & b" +divide);
        System.out.println("modulus of a & b" +modulus);
        int c=20;
        int d=30;
        System.out.println("unary operator" + (c++));
        System.out.println("unary operator" + (++c));
        System.out.println("unary operator" + (++d));
        System.out.println("unary operator" + (d++));
        System.out.println(c);
        System.out.println(d);
    }
}