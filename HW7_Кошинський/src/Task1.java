/*
 Author - Koshynskyi Stanislav
 File Task1.java
 Task:Програма має рахувати числа Фібоначі і виводити результати на екран у формі:

0 - 0
1 - 1
2 - 1
3 - 2
і так далі
Користувач вводить число яке обмежує значення максимального числа Фібоначі, що має бути обраховане. Тобто вивід триває поки значення наступного числа фібоначі не перевищує введене користувачем число.
 */




import acm.program.ConsoleProgram;


public class Task1 extends ConsoleProgram {
	public void run(){
		int n= readInt("Покажемо останнє число ряду фібоначі що менше за дане\nВведіть число - ");
		fibonachi(n);
	}
	private void fibonachi(int n) {//рекурентне фібоначі , яке працює доти остання число не більше за дане
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
