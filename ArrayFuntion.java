import java.util.Arrays;
public class ArrayFuntion {

public class ArrayFunction {

	public void display(int[] a, int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}

	public void sort(int[] a, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
				
	}
	
	Arrays.sort(a);
	
}

public int max(int[] a) {
	return Arrays.stream(a).max().getAsInt();
}

public int min(int[] a) {
	return Arrays.stream(a).min().getAsInt();
	
}

public boolean search(int[] a,int n,int data) {
	long cnt = Arrays.stream(a).filter(x-> x==data).count();
	return cnt>0;
	
	}
}	


}
