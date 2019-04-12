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

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(i);
				System.out.println(j);

			}
		}
		for (int row = 1; row < 9; row += 3) {
			for (int num = row; num < row + 3; num++) {
				System.out.print(num);

			}
			System.out.println();
		}

		for (int row = 1; row < 100; row += 10) {
			for (int num = row; num < row + 10; num++) {
				System.out.print(num);

			}
			System.out.println();
		}

		for (int row = 1; row < 10; row += 1) {
			for (int colum = 0; colum < row; colum += 1) {
				System.out.print("*" + "");
			}
			System.out.println();
		}

	}

}
