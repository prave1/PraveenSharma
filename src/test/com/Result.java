package test.com;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Result {

static int B;
static int H;
static boolean flag=false;
static
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Numbers");
    B=sc.nextInt();
    H=sc.nextInt();
    flag=false;
    
    if(H<=0||B<=0)
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    else
    {
        flag=true;
    }
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print("Result="+area);
		}
		
	}

}
