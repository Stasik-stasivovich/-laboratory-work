/*
 Author Stanislav Koshynskyi
 File Task3.java
 Task:Реалізувати програму з лекції Ханойські вежі. З клавіатури вводиться число дисків на першій голці і голка на яку необхідно перенести диски. Ваша програма має вивести на екран послідовність дій для перенесення дисків. Та кількість кроків.
 */

import acm.program.ConsoleProgram;


public class Task3 extends ConsoleProgram{
	public void run(){
		int number = readInt("Скільки дисків на першій голці?");
		while (number<=0)number = readInt("Кількість дисків має бути натуральною");
		int s3 = readInt("На яку голку перекладаємо?");
		while (s3!=2&&s3!=3)s3 = readInt("Або 2 або 3");
		int s1=1;
		int s2=5-s3;
		hanoi(number,s1,s2,s3);
	}

	private void hanoi(int n, int s1,int s2,int s3){   //кількість дисків ,звідки беерем,допоміжний,куди кладем 
		if (n==1)println(s1+" - "+s3);				   //ідея: перекладаємо всі крім одного на допоміжну голку,останній кладем на потрібну голку,перекладаємо решту на потрібну голку,якщо маємо 1 диск просто перекладаємо на потрібну голку
		else{
			hanoi(n-1,s1,s3,s2);
			println(s1+" - "+s3);
			hanoi(n-1,s2,s1,s3);
		}
		
		
	}

}
