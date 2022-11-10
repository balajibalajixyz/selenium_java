

public class Arrays_Equals {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5};
int b[]= {1,2,3,4,5};
		boolean equals = Arrays.equals(a, b);
		
		if (equals==true) {
			System.out.println("Arrays are aqual");
		}
		else {
			System.out.println("arrays are not equal");
		}
		
	}

}
