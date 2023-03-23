package cogent_batch65;

public class Array_e9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		
		//Sum0-14
		int sum=0;
		for(int i=0; i<15; i++) {sum += A[i];}
		
		System.out.println("Sum "+sum);
		A[15]=sum;
		
		//Ave
		double ave= sum/15;
		
		A[16]= (int) ave;
		
		//Smallest
		int min =A[0];
		for(int i=0; i<15; i++) {if(A[i]<min) {min=A[i];}}
		
		A[17]=min;
		
		 for (int number: A) {
		      System.out.println(number);
		    }
	}

}
