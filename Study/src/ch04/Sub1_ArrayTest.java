package ch04;

/*
 * ��¥ : 2022/01/04
 * �̸� : ����
 * ���� : �ڹ� �迭 �ǽ��ϱ� ���� p108
 * 
 * �迭(Array)
 *  - �����͸� �Ϸķ� �����ؼ� �����ϴ� �ڷᱸ��
 *  - ���̽� List �ڷᱸ���� ���
 */
public class Sub1_ArrayTest {

	public static void main(String[] args) {

		// �迭(Array)
		int nums[] = {1, 2, 3, 4, 5}; // [] -> �迭��ȣ
		String cities[] = {"����", "����", "�뱸", "�λ�", "����"};
		char alphas[] = {'a', 'b', 'c', 'd', 'e'};
		
		// �迭 ����(������ ����)
		System.out.println("�迭 nums ���� : "+nums.length);
		System.out.println("�迭 cities ���� : "+cities.length);
		System.out.println("�迭 alphas ���� : "+alphas.length);
		
		// �迭 ���� ���
		System.out.println("nums[0] : "+nums[0]);
		System.out.println("nums[2] : "+nums[2]);
		System.out.println("nums[4] : "+nums[4]);
		System.out.println("cities[3] : "+cities[3]);
		System.out.println("cities[4] : "+cities[4]);
		System.out.println("alphas[1] : "+alphas[1]);
		
		// �迭 �ݺ���
		for(int num : nums) {
			System.out.println("num : "+num);
		}
		
		for(String city : cities) {
			System.out.println("city : "+city);
		}
		
	}

}
