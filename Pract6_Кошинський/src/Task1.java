/*
File Tasl1.java
Author Stanislav Koshynskyi
Task:1. Обчисліть значення функції та виведіть його на екран.

у=МАХ(a, b, c, d)
y=x4
y=ax2+bx+c
Значення a, b, c, d та х задаються з клавіатури та використовуються для для всіх 3 підзадач





 */



import acm.program.ConsoleProgram;

public class Task1 extends ConsoleProgram {
    public void run() {
        double x,a,b,c,d,choise;
        while (readInt("1-continue 0-stop ")==1){
            choise = readInt("Виберіть який вираз обчислювати(1,2,3)\n1 МАХ(a, b, c, d)\n2 x^4\n3 ax^2+bx+c\n");
            if (choise==1){
                a=readDouble("a = ");
                b=readDouble("b = ");
                c=readDouble("c = ");
                d=readDouble("d = ");
                println(maxFrom4Num(a, b, c, d));
            }
            else if (choise==2){
            	x=readDouble("x = ");
            	println(toThe4thDegree(x));
            }
            else if(choise==3){
                x=readDouble("x = ");
                a=readDouble("a = ");
                b=readDouble("b = ");
                c=readDouble("c = ");
                println(expression(x, a, b, c));
            }


        }
    }

    //шукаємо максимальне серед 4 чисел
    private static double maxFrom4Num(double a,double b,double c,double d){
        if (a>b^a>c^a>d)return a;
        if (b>c^b>d)return b;
        if (c>d)return c;
        return d;
    }
    //підносимо до 4 степеня
    private static double toThe4thDegree(double x){
        return (x*x*x*x);
    }
    //рахуємо вираз
    private static double expression (double x,double a,double b,double c){
        return (a*x*x+b*x+c);
    }
}

