/*
Author : Koshynskyi Stanislav
File: Task1.java
Task:�������� 1.  ����'������ ��������������� ������� �� ������������

�������� �� �������� ����� Գ������ � �������� ���������� �� ����� � ����:
0 - 0
1 - 1
2 - 1
3 - 2
� ��� ���
ʳ������ ����� Գ������, �� ��������� ������� ������� ����������.

�������� 2.  ����'������ ��������������� ������� �� ������������

�������� �� �������� n! ����� n ������� ����������.
�������� 3.
�������� ��������� ���������� ������� (�� �� ����� ������� ����) ���������� ���� ������������ �����. �� ��������������� ������, ���� ���������� ��������.

 

�� ������� ����� ���� ��������� � ������ ����.




 */



import acm.program.ConsoleProgram;

public class Task1 extends ConsoleProgram {
	public void run() {
		int n;
		while(readInt("1-Continue")==1){
			n=readInt("��������");
			while (n<0)n=readInt("������ ���� ����� >=0");
			println("����������� ���������");
			fibonachi(n);
			println("����������� ���������");
			rFibonachi(n);
		}
		while(readInt("1-Continue")==1){
			n=readInt("��������");
			while (n<0)n=readInt("������ ���� ����� >=0");
			println("����������� ���������");
			println(factorialCount(n));
			println("����������� ���������");
			println(rFactorial(n));
		}
		while(readInt("1-Continue")==1){
			n=readInt("�����");
			while (n<=0)n=readInt("������ ���� ����� >0");;
			println(countDigit(n));
		}
	}

	private int countDigit(int n) {//��������� ������� ����
		
		int ans =1;
		while (n>=10){
			n=n/10;
			ans++;
		}
		return ans;
	}

	private int rFactorial(int n) {//����������� ��������

		if (n<=1)return 1;
		return n*rFactorial(n-1);
		
	}

	private int factorialCount(int n) {//����������� ��������

		int factorial=1;
		for (int i=1;i<=n;i++)factorial=factorial*i;
		return(factorial);
		
		
		
		
	}

	private void rFibonachi(int n) {//���� ������ ����� �������� � ������ ������������ ��� ������ n
		
		for (int i = 0; i <= Math.min(2,n); i++) {
			if (i == 0)
				println("0 - 0");
			else
				println(i + " - 1");
		}
		rFibonachiHelp(n, true);

	}

	private void fibonachi(int n) {//���������� ��������

		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 0; i <= n; i++) {
			println(i + " - " + a);
			c = a + b;
			b = a;
			a = c;
		}
	}

	private int rFibonachiHelp(int n, boolean ifNeed) {//���������� ��������
		int x;
		if (n <= 2)return 1;
		if (ifNeed) {
			x = rFibonachiHelp(n - 1, true) + rFibonachiHelp(n - 2, false);
			println(n + " - " + x);
			return x;
		} else {

			return (rFibonachiHelp(n - 1, false) + rFibonachiHelp(n - 2, false));
		}
	}
}
