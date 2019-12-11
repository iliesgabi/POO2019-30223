
public class TestIntegerMatrix {
	 public static void main(String[] args) {
		 Double[][] m1 = new Double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {1.0, 1.0, 1.0}};
		 Double[][] m2 = new Double[][]{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {0.0, 0.0, 0.0}};

		 DoubleMatrix integerMatrix = new  DoubleMatrix();
		 System.out.println("\nm1 + m2 is ");
		 GenericMatrix.printResult(
		 m1, m2, integerMatrix.addMatrix(m1, m2), '+');
		 System.out.println("\nm1 * m2 is ");
		 GenericMatrix.printResult(
		 m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
	 }
}

