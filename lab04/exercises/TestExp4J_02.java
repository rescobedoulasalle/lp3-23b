import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class TestExp4J_02
{

  public static void main(String[] args) {

    Expression expression = new ExpressionBuilder("3+2").build();
    double result = expression.evaluate();
    //Assertions.assertEquals(5, result);
    System.out.println(result);
  }


}
