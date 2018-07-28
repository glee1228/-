package algorithm;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int num1;
		int[] arr1 = new int[10];
		int arrlength = 0;
		int menu = 0;
		int apple = 0, grape = 0, melon = 0, orange = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("문제 번호를 입력하세요(1~3번)");
		menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("숫자를 입력하세요");
			num1 = sc.nextInt();
			System.out.println(sumofdigits(num1));
			break;
		case 2:
			System.out.println("배열의 크기를 입력하세요");
			arrlength = sc.nextInt();
			System.out.println("배열을 입력 입력하세요");
			for (int i = 0; i < arrlength; i++) {
				arr1[i] = sc2.nextInt();
			}
			System.out.println(DuplicateInspection(arr1, arrlength));
			break;
		case 3:

			while (!name.equals("q")) {
				System.out.println("과일 이름을 입력하세요");
				name = sc3.nextLine();
				switch (name) {
				case "사과":
					System.out.println("과일 개수를 입력하세요");
					apple = sc2.nextInt();
					break;
				case "포도":
					System.out.println("과일 개수를 입력하세요");
					grape = sc2.nextInt();
					break;
				case "배":
					System.out.println("과일 개수를 입력하세요");
					melon = sc2.nextInt();
					break;
				case "귤":
					System.out.println("과일 개수를 입력하세요");
					orange = sc2.nextInt();
					break;
				default:
					break;
				}
				System.out.println("계속 하시겠습니까? 계산하시려면 q를 입력하세요");
				name = sc3.nextLine();
			}

			System.out.println("사과는"+apple+"개, 포도는"+grape+"개, 배는 "+melon+"개, 귤은"+orange+"개 이고, 총 금액은" + calculator(apple, grape, melon, orange)+"입니다");

			break;

		// System.out.println(num);

		}
	}

	public static int sumofdigits(int num) {
		int temp = num;
		int sum = 0;
		int i = 0;
		while (temp > 0) {
			sum += temp % 10;
			temp = temp / 10;
		}
		return sum;

	}

	public static boolean DuplicateInspection(int[] arr1, int arrlength) {
		int inspector = 1;
		int flag = 0;
		boolean check = false;
		for (int j = 0; j < arrlength; j++) {
			for (int i = 0; i < arrlength; i++) {
				if (arr1[i] == inspector) {
					flag++;
					check = true;
				}
				
			}
			if (check == true) {
				inspector++;
				check = false;
			} else {
				System.out.println(flag);
				return false;
			}
		}
		System.out.println(flag);
		if (flag == arrlength) {
			return true;
		} else
			return false;
	}

	public static int calculator(int apple, int grape, int melon, int orange) {
		int result = 0;
		if (grape >= 3) {
			result = apple * 1000 + grape * 3000 + melon * 2000;
			if (orange >= 10 && orange % 10 == 0 && orange % 10 == 1 && orange % 10 == 2) {
				result += (orange - (orange % 10)) * 500;
				return result;
			}
		}
		result = apple * 1000 + grape * 3000 + melon * 2000 + orange * 500;
		return result;

	}

}
