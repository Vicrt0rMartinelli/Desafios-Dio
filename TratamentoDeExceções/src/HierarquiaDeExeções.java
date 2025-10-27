import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaDeExeções {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75");
       // System.out.println(valor);

       Number valor;

        try {
        valor = NumberFormat.getInstance().parse("1.75");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
