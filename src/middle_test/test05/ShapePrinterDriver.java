package middle_test.test05;

public class ShapePrinterDriver {

	public static void main(String[] args) {
		ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15);

	}

}
