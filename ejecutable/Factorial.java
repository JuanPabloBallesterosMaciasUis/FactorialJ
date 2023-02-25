package ejecutable;

import javax.swing.JOptionPane;
import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;

public class Factorial {

    public static void main(String[] args) {
        

        int n,nfa;

        nfa = 1;

        n = Integer.parseInt(JOptionPane.showInputDialog("Dijite un número entero positivo: "));

        if (n > 0){

            for (int i = 1 ; i < n+1 ; i ++ ){

                nfa = nfa * i;

            }

            JOptionPane.showMessageDialog(null, "El factorial de "+ n +" es: "+nfa);

        }

        else {

            JOptionPane.showMessageDialog(null, "El número dijitado no es un entero positivo");

        }

    }

}