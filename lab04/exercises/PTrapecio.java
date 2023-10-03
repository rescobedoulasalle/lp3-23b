public class PTrapecio extends Thread{
    double a;
    double b;
    double h;
    double A;

    public PTrapecio(double a, double b){
        this.a = a;
        this.b = b;
        this.h = b-a;
        this.A = 0;
    }

    public static double fun(double x){
        return x * x + 2;
    }

    public double getArea(){
        return A;
    }


    public void run(){
        A = ((fun(b) + fun(a)) / 2) * h;
        System.out.println("Area Thread: "+A);
    }
}
