package java_lab.feb11;

import java.util.Scanner;

public class UniquePathsII {

	public int uniquePathsWithObstacles(int[][] og) {
        int[][] mem=new int[og.length][og[0].length];
        if(og[0][0]==1 || og[og.length-1][og[0].length-1]==1)
            return 0;
        mem[0][0]=1;
        for(int j=1;j<og[0].length;j++)
        {
            if(og[0][j]==1)
                break;
            mem[0][j]=1;
            
        }
        for(int i=1;i<og.length;i++)
        {
            if(og[i][0]==1)
                break;
            mem[i][0]=1;
            
        }
        for(int i=1;i<og.length;i++)
        {
            for(int j=1;j<og[0].length;j++)
            {
                if(og[i][j]!=1)
                    mem[i][j]=mem[i-1][j]+mem[i][j-1];
            }
        }
        return mem[og.length-1][og[0].length-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] og=new int[n][m];
		for(int i=0;i<n;i++)
		{for(int j=0;j<m;j++)
			{
			og[i][j]=sc.nextInt();
			}}
		
		UniquePathsII obj=new UniquePathsII();
		System.out.println(obj.uniquePathsWithObstacles(og));

	}

}
