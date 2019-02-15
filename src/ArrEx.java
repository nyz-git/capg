import java.util.Arrays;

public class ArrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long cust1[] = new long[4];
		cust1[0] = 2;
		cust1[1] = 3;
		cust1[2] = 5;
		cust1[3] = 7;

		long cust2[] = new long[4];
		cust2[0] = 12;
		cust2[1] = 13;
		cust2[2] = 15;
		cust2[3] = 17;

long cust2[] = new long[4];
		cust2[0] = 12;
		cust2[1] = 13;
		cust2[2] = 15;
		cust2[3] = 17;



		long kotak[][] = new long[2][];
		kotak[0] = cust1;
		kotak[1] = cust2;
		
		for (int i = 0; i < kotak.length; i++) {
			for (int j = 0; j < kotak[i].length; j++) {
				System.out.print(kotak[i][j]+" ");
			}
			System.out.println();
		}

	}

}
