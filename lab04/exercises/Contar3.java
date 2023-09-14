public class Contar3 extends Thread{
  String name; 
  int temp;

  public Contar3 (String a, int arg){
    this.name = a;
    this.temp = arg;
  }
    

    public void run(){

      for(int i=1;i<=this.temp;i=i+1){

        System.out.println(this.getName()+"-"+this.name + " : " + i);
      }
      
    System.out.println(this.getName() + " "+((this.isAlive())?"VIVO":"NO_VIVO"));
    }

  
}
