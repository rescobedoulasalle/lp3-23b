public class Simulacion2{

  public static void main(String args[]){
    
    Contar3 c01 = new Contar3("Aldo", 10);
    
    System.out.println((c01.isAlive())?"VIVO":"NO_VIVO");
    
    Contar3 c02 = new Contar3("Maria", 9);
    Contar3 c03 = new Contar3("Lucia", 8);
    Contar3 c04 = new Contar3("Diego", 7);
    
    c01.start();c02.start();c03.start();c04.start();

    System.out.println((c01.isAlive())?"VIVO":"NO_VIVO");
  }
}
