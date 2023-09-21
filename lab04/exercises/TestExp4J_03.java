import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class TestExp4J_03
{

  public static void main(String[] args) {
    Expression a = new ExpressionBuilder("x*x")
		        .variables("x")
		        .build()
		        .setVariable("x", 5);
		System.out.println(a.evaluate());
  }


}
