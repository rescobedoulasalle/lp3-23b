public class Contar2{
  String name; 
  int temp;

  public Contar2 (String a, int arg){
    this.name = a;
    this.temp = arg;

    for(int i=1;i<=this.temp;i=i+1){

      System.out.println(this.name + " : " + i);

    }

  }
}
