public class  javaRecursion {
    public static void main(String[] args) {
      int num=factorial(5);
      System.out.println("factorial de 10 es: "+num);  
    }
    static int factorial(int a){
        if(a<=1)
        return 1;
        return a*factorial(a-1);

    }
}
