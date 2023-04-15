import javax.swing.JOptionPane;
public class ExLer3valoresEexibir {

    public static void main(String[] args){

    int numeroUm=Integer.parseInt( JOptionPane.showInputDialog("Digite numeroUm"));
    int numeroDois=Integer.parseInt( JOptionPane.showInputDialog("Digite numeroDois"));
    int numeroTres=Integer.parseInt( JOptionPane.showInputDialog("Digite numeroTres"));

  

    System.out.println("num 1 = "+ numeroUm);
    System.out.println("num 2 = "+ numeroDois);
    System.out.println("num 3 = "+ numeroTres);
}

}
