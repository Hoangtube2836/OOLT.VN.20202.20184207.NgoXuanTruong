import javax.swing.JOptionPane;
public class Solse {
	public static void main(String[] args) {
		String MENU;
		
		MENU = JOptionPane.showInputDialog(null,"1. ax + b = 0\n"
				+ "2. a0x + a1y = a2 and b0x + b1y = b2\n"
				+ "3. a0x^2 + a1x + a2 = 0","MENU",
				JOptionPane.INFORMATION_MESSAGE);
		int choise = Integer.parseInt(MENU);
		switch (choise) {
		case 1:
			String strNum1, strNum2;
			
			strNum1 = JOptionPane.showInputDialog(null,"Nhap a =","ax + b = 0",JOptionPane.INFORMATION_MESSAGE);
			double num1 = Double.parseDouble(strNum1);
			strNum2 = JOptionPane.showInputDialog(null,"Nhap b =","ax + b = 0",JOptionPane.INFORMATION_MESSAGE);
			double num2 = Double.parseDouble(strNum2);
			
			if (num1 == 0) {
				if (num2 == 0) {
					JOptionPane.showMessageDialog(null,"Phuong trinh vo so nghiem");
				} else {
					JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem");
				}
			} else {
				JOptionPane.showMessageDialog(null,String.valueOf(-num2/num1),"Nghiem cua phuong trinh" + num1 +"x+" + num2 + " la",JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case 2:
			String[] str1 = new String[3];
			String[] str2 = new String[3];
			double[] a = new double[3];
			double[] b = new double[3];
			for (int i = 0; i < 3; i++) {
				str1[i] = JOptionPane.showInputDialog(null,"Nhap a" + i +" = ",
						"a0x + a1y = a2 and b0x + b1y = b2"
						,JOptionPane.INFORMATION_MESSAGE);
				a[i] = Double.parseDouble(str1[i]);
			}
			for (int i = 0; i < 3; i++) {
				str2[i] = JOptionPane.showInputDialog(null,"Nhap b" + i +" = ",
						"a0x + a1y = a2 and b0x + b1y = b2"
						,JOptionPane.INFORMATION_MESSAGE);
				b[i] = Double.parseDouble(str2[i]);
			}
			double D,D1,D2;
			D=a[0]*b[1]-a[1]*b[0];
			D1=a[2]*b[1]-a[1]*b[2];
			D2=a[0]*b[2]-a[2]*b[0];
			if(D==0) {
				if( D1 == D2 && D2==0) {
					JOptionPane.showMessageDialog(null,"He phuong trinh vo so nghiem");}
			else JOptionPane.showMessageDialog(null,"He phuong trinh vo nghiem");
		} else JOptionPane.showMessageDialog(null,"x =" + String.valueOf(D1/D)  +"Va y = " + String.valueOf(D2/D) ,"Nghiem duy nhat la ",JOptionPane.INFORMATION_MESSAGE);
			
			break;
		case 3:
			String[] c = new String[3];
			double[] d = new double[3];
			double x1,x2;
			for (int i = 0; i < 3; i++) {
				c[i] = JOptionPane.showInputDialog(null,"Nhap a" + i +" = ",
						"a0x^2+a1x+a2=0"
						,JOptionPane.INFORMATION_MESSAGE);
				d[i] = Double.parseDouble(c[i]);
			}
			double delta=d[1]*d[1] -4*d[0]*d[2];	
			if(delta < 0) {
				JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem");
			}else if(delta == 0) {
				JOptionPane.showMessageDialog(null,"x1 = x2 = " + String.valueOf(-d[2]/(2*d[0])),
						"Phuong trinh co nghiem kep",
						JOptionPane.INFORMATION_MESSAGE);
			}else if(delta > 0) {
				x1 = ((-d[1] - Math.sqrt(delta)) / (2*d[0]));
				x2 = ((-d[1] + Math.sqrt(delta)) / (2*d[0]));
				JOptionPane.showMessageDialog(null,"x1 = "+String.valueOf(x1)+" ; "+"x2 = "+String.valueOf(x2),
						"Phuong trinh co 2 nghiem phan biet",
						JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		default:
			JOptionPane.showMessageDialog(null,"Try again");
		}
	}
}



