package middle_test.test04;

public class ShapePrinterDriver {

	public static void main(String[] args) {
		ShapePrinter printer = new ShapePrinter();

		// 테스트
		printer.printPyramid(3);
		System.out.println("----------");
		printer.printPyramid(5);
		System.out.println("----------");
		printer.printPyramid(10);
	}

}
