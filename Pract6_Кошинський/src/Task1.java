/*
File Tasl1.java
Author Stanislav Koshynskyi
Task:1. �������� �������� ������� �� ������� ���� �� �����.

�=���(a, b, c, d)
y=x4
y=ax2+bx+c
�������� a, b, c, d �� � ��������� � ��������� �� ���������������� ��� ��� ��� 3 �������





 */



import acm.program.ConsoleProgram;

public class Task1 extends ConsoleProgram {
    public void run() {
        double x,a,b,c,d,choise;
        while (readInt("1-continue 0-stop ")==1){
            choise = readInt("������� ���� ����� �����������(1,2,3)\n1 ���(a, b, c, d)\n2 x^4\n3 ax^2+bx+c\n");
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

    //������ ����������� ����� 4 �����
    private static double maxFrom4Num(double a,double b,double c,double d){
        if (a>b^a>c^a>d)return a;
        if (b>c^b>d)return b;
        if (c>d)return c;
        return d;
    }
    //�������� �� 4 �������
    private static double toThe4thDegree(double x){
        return (x*x*x*x);
    }
    //������ �����
    private static double expression (double x,double a,double b,double c){
        return (a*x*x+b*x+c);
    }
}

