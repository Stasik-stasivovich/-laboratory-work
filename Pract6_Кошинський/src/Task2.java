
/*
 File Task2.java
 Author Koshynskyi Stanislav
 Task 
 2. ����'���� ������� �� ������� �� ����� ���������.

y=x4
y=ax2+bx+c
y=ax+c
�������� a, b, c, � ��������� � ��������� �� ���������������� ��� ��� ��� 3 �������, �������� � - ����-���.

______________________

����������:.
�� ���� �������� ��� ������, �� ��������� �����/�����, �� �������� �� ����������  ���������.
��� ����'���� �������, ����� ����������� �� ������ ������� ��������.
�������� ������, ���� ����� ���� ���������� (���������, ���������� ���� while �� ���������: "����������? �������� 1 ��� ����������� ��� 0 ��� ������: ")
 
 
 
 */




import acm.program.ConsoleProgram;


public class Task2 extends ConsoleProgram{
	public void run(){
		double a,b,c,y;
		int choise;
        while (readInt("1-continue 0-stop ")==1){
        	choise = readInt("������� ��� ������� ���������(1,2,3) \n1 y=x^4\n2 y=ax^2+bx+c\n3 y=ax+c\n");
        	if (choise==1){
        		y = readDouble("y = ");
                solve1stExpression(y);
            }
            else if (choise==2){
            	a = readDouble("a = ");
            	b = readDouble("b = ");
            	c = readDouble("c = ");
            	y = readDouble("y = ");
            	solve2ndExpression(y, a, b, c);
            }
            else if(choise==3){
            	a = readDouble("a = ");
            	c = readDouble("c = ");
            	y = readDouble("y = ");
            	solve3rdExpression(y, a, c);
            }
        }
	}
// solve y=ax+c
	private void solve3rdExpression(double y,double a,double c) {
		if (a==0){
			if (y==c) println("Anyone");
			else println("No Answer");
		}
		else{
			println("Answer - "+((y-c)/a));
		}
		
	}
// solve y=ax^2+bx+c
	private void solve2ndExpression(double y,double a,double b, double c) {
		double sqrtOfD,d,x1,x2;
		c=c-y;
		d=Math.pow(b, 2)-4*a*c;
		if (a==0)solve3rdExpression(0, b, c);
		else if(d<0)println("No Answer");
		else{
			sqrtOfD = Math.pow(d,0.5);
			if (d==0)println("One Answer - "+(-b/(2*a)));
			else {
				x1=((-b+sqrtOfD)/(2*a));
				x2=((-b-sqrtOfD)/(2*a));
				println("Two Anwer x1- "+x1+"; x2- "+x2);
			}
		}
	}
//solve y=x^4
	private void solve1stExpression(double y) {
		if (y<0) println("No Answer");
		else if (y==0) println("Ansver- 0");
		else println("Ansver-  +-"+Math.pow(y,0.25));
		
	}
}
