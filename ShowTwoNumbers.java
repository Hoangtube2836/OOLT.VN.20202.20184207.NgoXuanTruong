import javax.swing.JOptionPane;

public class ShowTwoNumbers {

	public static void main(String[] args) {
		String strNum1,strNum2;
		String strNotification ="Yoou've just entered: ";
		strNum1= JOptionPane.showInputDialog(null,
				"PLEASE INPUT THE FIRST NUMBER: ","INPUT THE FIRST NUMBER",
				JOptionPane.INFORMATION_MESSAGE);
				strNotification += strNum1 + " and ";
				
				strNum2= JOptionPane.showInputDialog(null,"please input the second number: ","INPUT the second number",
						JOptionPane.INFORMATION_MESSAGE);
				strNotification+=strNum2;
				
				JOptionPane.showMessageDialog(null,strNotification,
						"Show twon NUMBERS",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);

	}

}
