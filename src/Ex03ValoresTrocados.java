import javax.swing.JOptionPane;
public class Ex03ValoresTrocados {
    public static void main(String[] args) throws Exception {
        String palavra1=JOptionPane.showInputDialog("Digite primeira palavra");
        String palavra2=JOptionPane.showInputDialog("Digite segunda palavra");
       String palavra3="";
     

       palavra3 = palavra1;
       palavra1=palavra2;
       palavra2=palavra3;

        System.out.println("primeirapalavra:"+palavra1);
        System.out.println("segundapalavra:"+palavra2);
    } 
}