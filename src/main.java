import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * �������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N.
		 * ������� N �� ������� �� ���������.
		 */
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Insert Num:");
		  
		  int endNum = sc.nextInt(); for (int i = 1; i <= endNum; i++) {
		  System.out.println(i);
		  
		  }
		  
		  
		 // �������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N,
		 //����� �� �� ����� �� 3 � 7. ������� N �� ������� �� ���������.
		  
		  
		  System.out.println("Insert Num:"); 
		  Scanner sc1 = new  Scanner(System.in); 
		  int num = sc1.nextInt();
		  for (int i = 1; i <= num; i++) { if (i % 3 == 0 || i % 7 == 0) {
		  
		 } else { System.out.println(i); }
		  
		  // �������� ��������, ����� ���� �� ��������� ��������
		  // �� ����  ����� // (�������� 5 �����) � ��������� ���-������� � 
		  //���-�������� �� ���. 
		 
		 System.out.println("Insert count of Number:");
		  
		  int numberCount = sc1.nextInt();
		  System.out.println("Insert first Number:");
		  int biggest =  sc1.nextInt();
		  System.out.println("Insert next Number:");
		  int smallest =  sc1.nextInt();
		  while (numberCount - 2 > 0) {
		  System.out.println("Insert next Number:");
		  int newNum =  sc1.nextInt();
		  if (newNum < smallest) { smallest = newNum; } 
		  if  (newNum > biggest) { biggest = newNum; } numberCount--;
		  
		  } System.out.println("Biggest Number: " + biggest);
		  System.out.println("Smallest Number: " + smallest);
		  
		  // �������� ��������, ����� �������� N!/K! �� ������ N � K (1<K<N).
		  System.out.println("Insert K "); int k = sc.nextInt();
		  System.out.println("Insert N ");
		  
		  int n = sc.nextInt(); int fakN = 1; int fakK = 1;
		  
		  for (int z = 1; z <= k; z++)
		  
		  { fakN *= z;
		  
		  } for (int j = 1; j <= n; j++)
		  
		  { fakK *= j;
		  
		  }
		  
		  System.out.print("Factorial N!/K! e: ");
		  System.out.println(fakN/fakK);
		 
		// �������� ��������, ����� �������� N!*K!/(N-K)! �� ������ N � K.
		System.out.println("Insert K ");
		int k1 = sc.nextInt();
		System.out.println("Insert N ");

		int n1 = sc.nextInt();
		int fakN1 = 1;
		int fakK1 = 1;
		int fakKN = 1;

		for (int s = 1; s <= k1; s++)

		{
			fakN1 *= s;

		}
		for (int j = 1; j <= n1; j++)

		{
			fakK1 *= j;

		}
		for (int j = 1; j <= n1 - k1; j++)

		{
			fakKN *= j;

		}
		System.out.print("N!*K!/(N-K)! e: ");
		System.out.println((fakN * fakK) / fakKN);
		}
	}
}
