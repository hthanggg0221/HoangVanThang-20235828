import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String args[]){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, 
        "Please input the first number: ", "Input the first number",
        JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, 
        "Please input the second number: ", "Input the second number",
        JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 + num2;
        double product = num1 * num2;
        JOptionPane.showMessageDialog(null, 
        "Sum of 2 double numbers: " + sum, "Result" ,
        JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, 
        "Different of 2 double numbers: " + difference, "Result" ,
        JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, 
        "Product of 2 double numbers: " + product, "Result" ,
        JOptionPane.INFORMATION_MESSAGE);
        if (num2 != 0){
            double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, 
            "Quotient of 2 double numbers: " + quotient + "\n", "Division Result", 
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
            "Cannot perform division by zero", "Error", 
            JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
