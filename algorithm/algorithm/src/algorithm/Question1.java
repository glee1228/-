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
		System.out.println("���� ��ȣ�� �Է��ϼ���(1~3��)");
		menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("���ڸ� �Է��ϼ���");
			num1 = sc.nextInt();
			System.out.println(sumofdigits(num1));
			break;
		case 2:
			System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
			arrlength = sc.nextInt();
			System.out.println("�迭�� �Է� �Է��ϼ���");
			for (int i = 0; i < arrlength; i++) {
				arr1[i] = sc2.nextInt();
			}
			System.out.println(DuplicateInspection(arr1, arrlength));
			break;
		case 3:

			while (!name.equals("q")) {
				System.out.println("���� �̸��� �Է��ϼ���");
				name = sc3.nextLine();
				switch (name) {
				case "���":
					System.out.println("���� ������ �Է��ϼ���");
					apple = sc2.nextInt();
					break;
				case "����":
					System.out.println("���� ������ �Է��ϼ���");
					grape = sc2.nextInt();
					break;
				case "��":
					System.out.println("���� ������ �Է��ϼ���");
					melon = sc2.nextInt();
					break;
				case "��":
					System.out.println("���� ������ �Է��ϼ���");
					orange = sc2.nextInt();
					break;
				default:
					break;
				}
				System.out.println("��� �Ͻðڽ��ϱ�? ����Ͻ÷��� q�� �Է��ϼ���");
				name = sc3.nextLine();
			}

			System.out.println("�����"+apple+"��, ������"+grape+"��, ��� "+melon+"��, ����"+orange+"�� �̰�, �� �ݾ���" + calculator(apple, grape, melon, orange)+"�Դϴ�");

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
