/*
Author : Koshynskyi Stanislav
File: Task1.java
Task:Завдання 1.  Обов'язково використовувати рекурсію та рекурентність

Програма має рахувати числа Фібоначі і виводити результати на екран у формі:
0 - 0
1 - 1
2 - 1
3 - 2
і так далі
Кількість чисел Фібоначі, що необхідно вивести вводить користувач.

Завдання 2.  Обов'язково використовувати рекурсію та рекурентність

Програма має рахувати n! Число n вводить користувач.
Завдання 3.
Написати программу обчислення кількості (ми не знаємо кількість цифр) десяткових цифр натурального числа. Не використовувати стрічки, суто математичні операції.

 

Усі завданні мають бути реалізовані в одному класі.




 */



import acm.program.ConsoleProgram;

public class Task1 extends ConsoleProgram {
	public void run() {
		int n;
		while(readInt("1-Continue")==1){
			n=readInt("фібоначі");
			while (n<0)n=readInt("Введіть ціле число >=0");
			println("рекурентний результат");
			fibonachi(n);
			println("рекурсивний результат");
			rFibonachi(n);
		}
		while(readInt("1-Continue")==1){
			n=readInt("факторіал");
			while (n<0)n=readInt("Введіть ціле число >=0");
			println("рекурентний результат");
			println(factorialCount(n));
			println("рекурсивний результат");
			println(rFactorial(n));
		}
		while(readInt("1-Continue")==1){
			n=readInt("цифри");
			while (n<=0)n=readInt("Введіть ціле число >0");;
			println(countDigit(n));
		}
	}

	private int countDigit(int n) {//підрахунок кількості цифр
		
		int ans =1;
		while (n>=10){
			n=n/10;
			ans++;
		}
		return ans;
	}

	private int rFactorial(int n) {//рекурсивний факторіал

		if (n<=1)return 1;
		return n*rFactorial(n-1);
		
	}

	private int factorialCount(int n) {//рекурентний факторіал

		int factorial=1;
		for (int i=1;i<=n;i++)factorial=factorial*i;
		return(factorial);
		
		
		
		
	}

	private void rFibonachi(int n) {//вивід перших чисел фібоначі і виклик рекурсивного для більших n
		
		for (int i = 0; i <= Math.min(2,n); i++) {
			if (i == 0)
				println("0 - 0");
			else
				println(i + " - 1");
		}
		rFibonachiHelp(n, true);

	}

	private void fibonachi(int n) {//рекурентне фібоначі

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

	private int rFibonachiHelp(int n, boolean ifNeed) {//рекурсивне фібоначі
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
