package middle_test.test06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_test {

	public static void main(String[] args) {
		System.out.println("나이가 어떻게 되시나요??");
		try {
			Scanner sc = new Scanner(System.in);

			int age = sc.nextInt();
			System.out.println("나이는 : " + age);

			System.out.println("이름이 어떻게 되시나요??");
			String name = sc.next();
			System.out.println(name + " 님의 나이는 " + age);
		} catch (InputMismatchException e) {
			System.out.println("잘못입력하셨습니다.");
			e.printStackTrace();
		}

	}

}
