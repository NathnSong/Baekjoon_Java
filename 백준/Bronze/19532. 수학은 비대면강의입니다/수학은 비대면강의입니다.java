/*
a, b, c, d, e, f 를 입력받아서
ax + by = c
dx + ey = f
를 만족하는 x와 y를 구해라.
이때 a,b,c,d,e,f 와 x,y는 정수임이 보장된다.
*/
import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a, b, c, d, e ,f;
        a = in.nextInt(); b = in.nextInt(); c = in.nextInt();
        d = in.nextInt(); e = in.nextInt(); f = in.nextInt();
        int x, y;
        /*
        x = (c-by) / a;
        x = (f-ey) / d;
        y = (c-ax) / b;
        y = (f-dx) / e;
        
        cd - bdy = af - aey;
        (ae - bd)y = af - cd
        y = (af - cd) / (ae - bd)
        x = (bf - ce) / (bd - ae)
        
        */
        x = (b*f - c*e) / (b*d - a*e);
        y = (a*f - c*d) / (a*e - b*d);
        
        System.out.println(x + " " + y);
	}
}