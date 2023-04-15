import javax.swing.JOptionPane;
public class Ex09NumeroInteiroEnquanto {
    public static void main (String[] args) throws Exception{

int numero=2;
int resultado;
int i=0;

while (i<=10){ 
    resultado=numero*i;
    i=i+1;//incrementando
    System.out.println(resultado);
}
System.out.println("----------------");

int numero2=Integer.parseInt( JOptionPane.showInputDialog("Digite numero"));
int resultado2;
int i2=0;

while (i2<=10){ 
    resultado2=numero2*i2;
    i2=i2+1;
    System.out.println(resultado2);
}

}

}

