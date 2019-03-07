import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String prime = JOptionPane.showInputDialog(null, "Give me any number");

		int num = Integer.parseInt(prime);
 
		for (int i = 2; i < num; i++) {
			if (num % i == 2) {
JOptionPane.showMessageDialog(null, "Your number tis composite!!!");
			System.exit(0);
			}
		}
JOptionPane.showMessageDialog(null,"Your number tis Prime!!!");
	}

}       
