package advance.dev;

import java.util.Scanner;

public class MainApp {
	static void checkAge(int a) throws AgeException {
		if (a <= 0) throw new  AgeException("Tuoi nhap vao khong hop le!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tuoi:");
		int age = sc.nextInt();
		try {
			checkAge(age);
			System.out.println("Tuoi nhap vao hop le");
		} catch (AgeException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

	}

}
