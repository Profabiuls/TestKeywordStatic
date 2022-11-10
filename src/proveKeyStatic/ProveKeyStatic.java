
package proveKeyStatic;

import javax.swing.*;

public class ProveKeyStatic {

    public static void main(String[] args) {
        Test select = new Test();
        Test select2 = new Test();
        Test.numeroStatico = 6;
        System.out.println("numero normale " + select.numero + "numero statico " + Test.numeroStatico);
        System.out.println("numero normale " + select2.numero + "numero statico " + Test.numeroStatico);


        //Prove sulla classe JOptionPane
        JOptionPane.showMessageDialog(null, "ciao a tutti");
        Object[] possibleValues = {"First", "Second", "Third"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Choose one", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
    }

}
