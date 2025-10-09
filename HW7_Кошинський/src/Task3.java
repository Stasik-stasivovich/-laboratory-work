/*
 Author Stanislav Koshynskyi
 File Task3.java
 Task:���������� �������� � ������ �������� ���. � ��������� ��������� ����� ����� �� ������ ����� � ����� �� ��� ��������� ��������� �����. ���� �������� �� ������� �� ����� ����������� �� ��� ����������� �����. �� ������� �����.
 */

import acm.program.ConsoleProgram;


public class Task3 extends ConsoleProgram{
	public void run(){
		int number = readInt("������ ����� �� ������ �����?");
		while (number<=0)number = readInt("ʳ������ ����� �� ���� �����������");
		int s3 = readInt("�� ��� ����� �����������?");
		while (s3!=2&&s3!=3)s3 = readInt("��� 2 ��� 3");
		int s1=1;
		int s2=5-s3;
		hanoi(number,s1,s2,s3);
	}

	private void hanoi(int n, int s1,int s2,int s3){   //������� ����� ,����� ������,���������,���� ������ 
		if (n==1)println(s1+" - "+s3);				   //����: ����������� �� ��� ������ �� �������� �����,������� ������ �� ������� �����,����������� ����� �� ������� �����,���� ���� 1 ���� ������ ����������� �� ������� �����
		else{
			hanoi(n-1,s1,s3,s2);
			println(s1+" - "+s3);
			hanoi(n-1,s2,s1,s3);
		}
		
		
	}

}
