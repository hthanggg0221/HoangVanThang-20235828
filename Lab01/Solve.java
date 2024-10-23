import javax.swing.JOptionPane;
class firstDegreeEquation1 {
    public static void main(String args[])
    {
        String strNuma, strNumb;

        strNuma = JOptionPane.showInputDialog(null, 
            "Please input the coefficient a: ", "Input the coefficient a: ",
            JOptionPane.INFORMATION_MESSAGE);
        strNumb = JOptionPane.showInputDialog(null, 
            "Please input the coefficient b: ", "Input the coefficient b: ", 
            JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strNuma);
        double b = Double.parseDouble(strNumb);
        if (a == 0){
            if (b == 0){
                JOptionPane.showMessageDialog(null, 
                "The equation has infinitely many solutions", "Result", 
                JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, 
                "The equation has no solution", "Result", 
                JOptionPane.ERROR_MESSAGE);
            }
        } else {
            double x = (-b) / a;
            JOptionPane.showMessageDialog(null, 
            "The equation has a unique solution x = " + x, "Result", 
            JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}

class firstDegreeEquation2 {
    public static void main(String args[]){
        String strNuma11, strNuma12, strNuma21, strNuma22, strNumb1, strNumb2;

        strNuma11 = JOptionPane.showInputDialog(null, 
        "Please input the coefficient a11: ", "Input the cofficient a11", 
        JOptionPane.INFORMATION_MESSAGE);
        strNuma12 = JOptionPane.showInputDialog(null, 
        "Please input the coefficient a12: ", "Input the cofficient a12", 
        JOptionPane.INFORMATION_MESSAGE);
        strNuma21 = JOptionPane.showInputDialog(null, 
        "Please input the coefficient a21: ", "Input the cofficient a21", 
        JOptionPane.INFORMATION_MESSAGE);
        strNuma22 = JOptionPane.showInputDialog(null, 
        "Please input the coefficient a22: ", "Input the cofficient a22", 
        JOptionPane.INFORMATION_MESSAGE);
        strNumb1 = JOptionPane.showInputDialog(null, 
        "Please input the number b1: ", "Input the number b1", 
        JOptionPane.INFORMATION_MESSAGE);
        strNumb2 = JOptionPane.showInputDialog(null, 
        "Please input the number b2: ", "Input the number b2", 
        JOptionPane.INFORMATION_MESSAGE);

        double a11 = Double.parseDouble(strNuma11);
        double a12 = Double.parseDouble(strNuma12);
        double a21 = Double.parseDouble(strNuma21);
        double a22 = Double.parseDouble(strNuma22);
        double b1 = Double.parseDouble(strNumb1);
        double b2 = Double.parseDouble(strNumb2);

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, 
            "The system of equations has a unique solution:\n" + "x1 = " + x1 + "\n" + "x2 = " + x2, "Result", 
            JOptionPane.INFORMATION_MESSAGE);
        } else if (D == 0 && D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, 
            "The system of equations has infinitely many solutions", "Result", 
            JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
            "The system of equations has no solution", "Result", 
            JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}

class secondDegreeEquation {
    public static void main(String args[]){
        String strNuma, strNumb, strNumc;

        strNuma = JOptionPane.showInputDialog(null, 
        "Please input the coefficient a: ", "Input the cofficient a", 
        JOptionPane.INFORMATION_MESSAGE);
        strNumb = JOptionPane.showInputDialog(null, 
        "Please input the coefficient b: ", "Input the cofficient b", 
        JOptionPane.INFORMATION_MESSAGE);
        strNumc = JOptionPane.showInputDialog(null, 
        "Please input the coefficient c: ", "Input the cofficient c", 
        JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strNuma);
        double b = Double.parseDouble(strNumb);
        double c = Double.parseDouble(strNumc);

        if (a == 0) {
            if (b == 0){
                if (c == 0){
                    JOptionPane.showMessageDialog(null, 
                        "The equation has infinitely many solutions", "Result", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "The equation has no solution", "Result", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                double x = (-c) / b;
                JOptionPane.showMessageDialog(null, 
                    "The equation has a unique solution x = " + x, "Result", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, 
                    "The equation has no real roots", "Result", 
                    JOptionPane.ERROR_MESSAGE);
            } else if (delta == 0) {
                double x = (-b)/(2*a);
                JOptionPane.showMessageDialog(null, 
                "The equation has a single real double root:\n" + "x = " + x, "Result", 
                JOptionPane.INFORMATION_MESSAGE);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, 
                "The equation has two distinct double roots:\n" + "x1 = " + x1 + "\n" + "x2 = " + x2, "Result", 
                JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}