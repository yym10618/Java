package ch02;

/*
 * ��¥ : 2022/01/03
 * �̸� : ����
 * ���� : �ڹ� ������ �ǽ��ϱ� ���� p52
 */

public class Sub3_Operator {

	public static void main(String[] args) {

		// ���������
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num2 * num3;
		int rs4 = num4 / num3;
		int rs5 = num4 % num3; // ������������
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
		
		// ����, ���ҿ�����
		int num = 0;
		
		num++;
		++num;
		
		System.out.println("num : "+num);
		
		num--;
		--num;
		
		System.out.println("num : "+num);
		
		// ���մ��Կ�����
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		n1 += 1; // n1 = n1 + 1
		n2 -= 2; // n2 = n2 - 2
		n3 *= 3; // n3 = n3 * 3
		n4 /= 4; // n4 = n4 / 4
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("n3 : "+n3);
		System.out.println("n4 : "+n4);
		
		// �񱳿�����
		int var1 = 1;
		int var2 = 2;
		
		boolean r1 = var1 > var2; // var1�� var2���� ũ��.
		boolean r2 = var1 < var2; // var1�� var2���� �۴�.
		boolean r3 = var1 >= var2; // var1�� var2���� ũ�ų� ����.
		boolean r4 = var1 <= var2; // var1�� var2���� �۰ų� ����.
		boolean r5 = var1 == var2; // var1�� var2���� ���� ����.
		boolean r6 = var1 != var2; // var1�� var2���� ���� �ٸ���.
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		System.out.println("r5 : "+r5);
		System.out.println("r6 : "+r6);
		
		// ��������
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = var3 > 2 && var4 > 3; // var3�� 2���� ũ��(��) �׸��� var4�� 3���� ũ��(��) -> ��
		boolean res2 = var3 > 2 && var4 > 4; // var3�� 2���� ũ��(��) �׸��� var4�� 4���� ũ��(����) ->����
		boolean res3 = var3 > 2 || var4 > 4; // var3�� 2���� ũ��(��) �Ǵ� var4�� 4���� ũ��(����) -> ��
		boolean res4 = var3 > 4 || var4 > 5; // var3�� 4���� ũ��(����) �Ǵ� var4�� 5���� ũ��(����) -> ����
		boolean res5 = !(var3 > var4); // var3�� var4���� ũ�� �ʴ� -> ��
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
	}

}
