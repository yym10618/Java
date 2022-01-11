package ch10;

import java.util.ArrayList;
import java.util.List;

import ch09.Apple;

/*
 * ��¥ : 2022/01/11
 * �̸� : ����
 * ���� : �ڹ� �÷��� ����Ʈ �ǽ��ϱ� ���� p348
 */
public class Sub2_ListTest {
	
	public static void main(String[] args) {
		
		// List ����
		List<Integer> list1 = new ArrayList<>();
		
		// List ������ ����
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);
		
		System.out.println("list1 : "+list1);
		
		// List ũ��
		System.out.println("list1 ũ�� : "+list1.size());
		
		// List ������ ���
		System.out.println("list.get(0) : "+list1.get(0));
		System.out.println("list.get(3) : "+list1.get(3));
		
		// List �ݺ���
		for(int n : list1) {
			System.out.print(n +", ");
			
		}
		
		System.out.print("\n");
		
		// ���ڿ� ����Ʈ
		List<String> list2 = new ArrayList<>();
		list2.add("������");
		list2.add("������");
		list2.add("�庸��");
		list2.add("������");
		list2.add("�̼���");
		
		System.out.println("list2 : "+list2);
		
		// ��ü ����Ʈ
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("�ѱ�", 3000));
		list3.add(new Apple("�̱�", 2000));
		list3.add(new Apple("�Ϻ�", 1000));
		
		System.out.println("list3 : "+list3);
		
		// �ѱ���� ���
		Apple a1 = list3.get(0);
		a1.toString();
		
		// �̱���� ���
		list3.get(1).toString();
		
		// �Ϻ���� ���
		list3.get(2).toString();
	}

}
