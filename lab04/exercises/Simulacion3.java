import java.util.*;

public class Simulacion3{

  public static void main(String args[]){
    
    ArrayList<Contar3> contadores = new ArrayList<Contar3>();
    
    Contar3 c01 = new Contar3("Aldo", 10);    
    System.out.println((c01.isAlive())?"VIVO":"NO_VIVO");    
    Contar3 c02 = new Contar3("Maria", 9);
    Contar3 c03 = new Contar3("Lucia", 8);
    Contar3 c04 = new Contar3("Diego", 7);

    contadores.add(c01);
    contadores.add(c02);
    contadores.add(c03);
    contadores.add(c04);
    
    for(Contar3 c : contadores){
      c.start();
    }

    System.out.println((c01.isAlive())?"VIVO":"NO_VIVO");

    int cantidad = 0;
    while(true){
    cantidad = 0;  
    for(Contar3 c : contadores){
      if(c.isAlive()==false){cantidad++;}
    }

      if(cantidad==contadores.size()){break;}

    }
    System.out.println("FIN");

  }
}
