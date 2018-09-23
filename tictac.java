import java.util.*;
import java.lang.*;
import java.io.*;


class Tic_tac

{
 public static void main (String[] args) throws java.lang.Exception	
 {
  Scanner sc=new Scanner(System.in);
  int i,j,k=1,m,n;
  char[][] a=new char[3][3];
  for(char[] it:a)
  Arrays.fill(it,'?');
  boolean flag=false;
  while(!flag&&k<10)
	{
	   if(k%2!=0)
                     {
	        System.out.println("enter position for o\n");
		   i=sc.nextInt();
	        j=sc.nextInt(); 
             if(a[i][j]== '?')
             a[i][j]='o';
             else
              {
             System.out.println("position already filled. Reenter  position for o\n");     
              continue;
             }
}
        else
	    {
	      System.out.println("enter position for *\n");
		 i=sc.nextInt();
		 j=sc.nextInt();
	       if(a[i][j]== '?')
             a[i][j]='*';
             else
           {
      System.out.println("position already filled. Reenter position for *"); 
    continue;
}
          }
for(m=0;m<3;m++)
 {
  for(n=0;n<3;n++)
 System.out.print(a[m][n]+" ");
System.out.println();
}
            k++;
	       if(k>4)
	       flag=check(a,i,j);   
	}
if(flag==false)
  System.out.println("draw");
}

	static boolean check(char arr[][],int i,int j)
	{
	    if(arr[i][0]==arr[i][1]&&arr[i][0]==arr[i][2])
	    {
	        System.out.println(arr[i][0]+" wins");
	        return true;
	    }
	   else if(arr[0][j]==arr[1][j]&&arr[0][j]==arr[2][j])
	    {
	        System.out.println(arr[0][j]+" wins");
	        return true;
	    }
	    else if(arr[0][0]==arr[1][1]&&arr[0][0]==arr[2][2]&&arr[0][0]!='?')
	       {
	            System.out.println(arr[0][0]+" wins");
	        return true;
	       }
	    else if(arr[0][2]==arr[1][1]&&arr[0][2]==arr[2][0]&&arr[0][2]!='?')
	       {
	            System.out.println(arr[0][2]+" wins");
	        return true;
	       }
	    else
	    return false;
	}
}

