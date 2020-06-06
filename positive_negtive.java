//WAJP to read array of integer number and display 
// 1.no of +ve integer
// 2.no of -ve integer
// 3.no of '0'

import java.io.*;
class positive_negtive{
public static void main(String args[])
{
Console c= System.console();
int positive=0,negative=0,zero=0;
int n= Integer.parseInt(c.readLine("Enter number of element"));
int data[]= new int[n];
for (int i=0;i<data.length;i++)
	data[i]=Integer.parseInt(c.readLine("Enter element"));

for(int m:data)
{
	if(m>0)
	{ positive++;}
	else if(m<0)
	{negative++;}
	else { zero++;}
}

System.out.println("\npositive    :"+positive+"\n negative   :"+negative+"\nzeros    :"+zero);
}
}