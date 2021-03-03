import javax.swing.JOptionPane;

public class calculate {

	public static void main(String[] args) {
		String strNum1,strNum2;
		strNum1= JOptionPane.showInputDialog(null,"PLEASE INPUT THE FIRST NUMBER: ","INPUT THE FIRST NUMBER",JOptionPane.INFORMATION_MESSAGE);
				double num1 = Double.parseDouble(strNum1);
				strNum2= JOptionPane.showInputDialog(null,"please input the second number: ","INPUT the second number",JOptionPane.INFORMATION_MESSAGE);				
				double num2 = Double.parseDouble(strNum2);
				 JOptionPane.showMessageDialog(null,String.valueOf(num1+num2),"SUM OF TWO NUMBER IS :",JOptionPane.INFORMATION_MESSAGE);
				 JOptionPane.showMessageDialog(null,String.valueOf(num1-num2),"DIFFERENCE OF TWO NUMBER IS :",JOptionPane.INFORMATION_MESSAGE);
				 JOptionPane.showMessageDialog(null,String.valueOf(num1*num2),"PRODUCT OF TWO NUMBER IS :",JOptionPane.INFORMATION_MESSAGE);
				 if(num2 == 0) {
						JOptionPane.showMessageDialog(null,"Math error","Quotient",JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null,String.valueOf(num1/num2),"QUOTIENT OF TWO DOUBLE NUMBER IS :",JOptionPane.INFORMATION_MESSAGE);
					}
	}

}
