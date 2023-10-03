import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Iterator;

class Test2_PTrapecio {
    public static double fun(double x){
        return x * x + 2;
    }
   
    public static double trapecio(double a, double b){
        return ((fun(a) + fun(b)) / 2) * (b -a);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int numDecimales = 4;
        double b = sc.nextDouble();
        double delta;
        double t;
        double nroTrapecios = 8;
        double total = 0;
        double temp = 0;

        //ArrayList de Arrays?//
         ArrayList <ArrayList<Double>> listaArr = new ArrayList<>();
        //

        for(int i=1;; i++){
            delta=(b-a)/i;
            ArrayList <Double> subAreas = new  ArrayList<>();
            for(double j=1; j <= i; j++){
                //t= trapecio(a + delta*(j-1),a + delta*j);//
                PTrapecio tp = new PTrapecio(a + delta*(j-1),a + delta*j);
                tp.start();
                t = tp.getArea();
                subAreas.add(t);
                total = total + t;
                System.out.println("Area t " + j +" =" + t + "\n");
            }
            listaArr.add(subAreas);

            //System.out.println("Area total = " + total + "\n");
            //System.out.println("temp = " + temp + "\n");
            //System.out.println("total = " + temp + "\n");
            //System.out.println("resta = " + (temp - total) + "\n");
           
            double potencia = 1/ Math.pow(10,numDecimales);
            System.out.println("dec = " + potencia + "\n");

            if(i==3){
                break;
            }
            
            temp = total;
            total = 0;
        }

        for (int i=0; i < listaArr.size(); i++){
            double totalF = 0;
            Iterator<Double> it= listaArr.get(i).iterator();
            while(it.hasNext()) {
            double par = it.next();
            System.out.println("Bucle While: " + par);
            }
           System.out.println("Area total: " + totalF);
        }
    }
}
