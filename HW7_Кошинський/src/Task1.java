/*
 Author - Koshynskyi Stanislav
 File Task1.java
 Task:�������� �� �������� ����� Գ������ � �������� ���������� �� ����� � ����:

0 - 0
1 - 1
2 - 1
3 - 2
� ��� ���
���������� ������� ����� ��� ������ �������� ������������� ����� Գ������, �� �� ���� ����������. ����� ���� ����� ���� �������� ���������� ����� �������� �� �������� ������� ������������ �����.
 */




import acm.program.ConsoleProgram;


public class Task1 extends ConsoleProgram {
	public void run(){
		int n= readInt("�������� ������ ����� ���� �������� �� ����� �� ����\n������ ����� - ");
		fibonachi(n);
	}
	private void fibonachi(int n) {//���������� �������� , ��� ������ ���� ������� ����� �� ����� �� ����
		int a = 1;
		int b = 0;
		int c;
		int i=0;
		while (a<=n) {	
			c = a + b;
			println (i+" - "+b);
			b = a;
			a = c;
			i++;
		}
		println (i+" - "+b);
	}
}
