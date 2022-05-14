public class javametodoOverloading{
     public static void main(String[] args) {
        int numero1=divide(8, 2);
        double numero2=divide(10.5, 5.5);
        System.out.println("divicion "+numero1);
        System.out.println("divicion "+numero2);
    }
    static int divide(int a, int b){
        return a/b;
    }
    static double divide(double a, double b){
        return a/b;
    }
}