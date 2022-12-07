import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


String teamName = "Teplodar";
int ax = 10;
int bx = 18;
int cx = 25;
int dx = 38;
int ex = 43;
double result1 = ( double ) ( ( ax+ bx + cx + dx + ex) /5) ;
System.out.println("The first team" + "-" + teamName + " receives an average score" + " - " + result1);
String teamName2 = "Odesa";
int ay = 12;
int by = 17;
int cy = 25;
int dy = 40;
int ey = 46;
double result2 = (double) ( ( ay + by + cy + dy + ey) /5) ;
System.out.println("The second team" + "-" + teamName2 + " receives an average score" + " - " + result2);


if (result1 > result2)
{
    System.out.println("The first team- winner");
}
if (result1 < result2)
{
    System.out.println("The second team- winner");
}
        System.out.println("The second team- " +teamName2 + " won " + "with result" + " - " + result2);

    }
}