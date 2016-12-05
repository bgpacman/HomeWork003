import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Напишете програма, която отпечатва на конзолата числата от 1 до N.
		 * Числото N се въвежда от конзолата.
		 */
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Insert Num:");
		  
		  int endNum = sc.nextInt(); for (int i = 1; i <= endNum; i++) {
		  System.out.println(i);
		  
		  }
		  
		  
		 // Напишете програма, която отпечатва на конзолата числата от 1 до N,
		 //които не се делят на 3 и 7. Числото N се въвежда от конзолата.
		  
		  
		  System.out.println("Insert Num:"); 
		  Scanner sc1 = new  Scanner(System.in); 
		  int num = sc1.nextInt();
		  for (int i = 1; i <= num; i++) { if (i % 3 == 0 || i % 7 == 0) {
		  
		 } else { System.out.println(i); }
		  
		  // Напишете програма, която чете от конзолата поредица
		  // от цели  числа // (примерно 5 числа) и отпечатва най-малкото и 
		  //най-голямото от тях. 
		 
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
		  
		  // Напишете програма, която пресмята N!/K! за дадени N и K (1<K<N).
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
		 
		// Напишете програма, която пресмята N!*K!/(N-K)! за дадени N и K.
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
