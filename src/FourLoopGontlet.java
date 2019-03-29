import javax.swing.JOptionPane;

public class FourLoopGontlet {

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}

		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}

		for (int i = 2; i < 101; i += 2) {
			System.out.println(i);
		}
		for (int i = 1; i < 101; i += 2) {
			System.out.println(i);
		}

		for (int i = 1; i < 501; i++) {

			if (i % 2 == 0) {
				System.out.println(i + " Is Even");
			}
			if (i % 2 == 1) {
				System.out.println(i + "Is 0dd");
			}
		}
		
		
			for (int i = 7; i < 777; i += 7) {
				System.out.println(i);
			}
		
			for (int i = 0; i < 2; i++) {
				System.out.println(i);

				
				for (int j = 0; j < 9; j++) {
					System.out.println(i);

				}
			}
			
			
	}

}
