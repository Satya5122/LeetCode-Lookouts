package java_lab.feb11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParanthesis {
	

		void backtrack(List<String> result, StringBuilder sb, int left, int right) {
			StringBuilder temp = new StringBuilder();
			temp.append(sb.toString());
			if (left == 0) {

				for (int i = 0; i < right; i++) {
					temp.append(')');
				}
				result.add(temp.toString());
				return;
			}
			// add left
			temp.append('(');
			backtrack(result, temp, left - 1, right);
			temp.deleteCharAt(temp.length() - 1);
			// add right
			if (right > left) {
				temp.append(')');
				backtrack(result, temp, left, right - 1);
			}

		}

		public List<String> generateParenthesis(int n) {
			StringBuilder sb = new StringBuilder();
			List<String> result = new ArrayList<String>();
			backtrack(result, sb, n, n);
			return result;
		}
	
//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		GenerateParanthesis obj=new GenerateParanthesis();
		List<String> result=obj.generateParenthesis(n);
		for(String s:result)
		{
			System.out.println(s);
		}

	}

}
