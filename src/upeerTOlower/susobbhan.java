package upeerTOlower;

public class susobbhan {
	public static void main(String args[]) {
		String s = "SysysIO";
		int n = s.length();
		int arr[] = new int[90];
		int j =0;
		String sum = " ";
		
		int word = arr[0];
		for(int i =0;i<n;i++) {
			arr[j] = s.charAt(i);
			j++;
			
		}
		
		//System.out.print(arr[0]);
		
		for(int i =0;i<n;i++) {
			if(arr[i]>=97 && arr[i]<=122) {
			 word = arr[i]-32;
			}
			else if(arr[i]>=65 && arr[i]<=90) {
				word = arr[i]+32;
				
			}
			sum+=(char)word;
		}
		
		System.out.print(sum+ " ");
		
		
		
	}

}
