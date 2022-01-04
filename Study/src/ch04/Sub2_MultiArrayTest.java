package ch04;

/*
 * ��¥ : 2022/01/04
 * �̸� : ����
 * ���� : �ڹ� ������ �迭 �ǽ��ϱ� ���� p118
 */
public class Sub2_MultiArrayTest {

	public static void main(String[] args) {

		// 1���� �迭
		int arr1d[] = {10, 20, 30, 40, 50};
		
		int total = 0;
		
		for(int n : arr1d) {
			total += n;
			
		}
		
		System.out.println("arr1d �迭�� �� : "+total);
		
		// 2���� �迭
		int arr2d[][] = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9,10,11,12}}; //[��][��]
		
		System.out.println("arr2d[0][0] : "+arr2d[0][0]);
		System.out.println("arr2d[0][2] : "+arr2d[0][2]);
		System.out.println("arr2d[1][2] : "+arr2d[1][2]);
		System.out.println("arr2d[2][1] : "+arr2d[2][1]);
		
		// 3���� �迭
		int arr3d[][][] = {{{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}}, 
						   {{10,11,12},
							{13,14,45},
							{16,17,18}},
						   {{19,20,21},
							{22,23,24},
							{25,26,27}}};
		
		System.out.println("arr3d[0][0][2] : "+arr3d[0][0][2]);
		System.out.println("arr3d[0][1][1] : "+arr3d[0][1][1]);
		System.out.println("arr3d[1][0][1] : "+arr3d[1][0][1]);
		System.out.println("arr3d[1][2][1] : "+arr3d[1][2][1]);
		System.out.println("arr3d[2][0][2] : "+arr3d[2][0][2]);
		System.out.println("arr3d[2][2][0] : "+arr3d[2][2][0]);
	}

}
