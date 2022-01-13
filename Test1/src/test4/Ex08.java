package test4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ��¥ : 2022/01/13
 * �̸� : ����
 * ���� : �ζ� ��ȣ ������ ��������
 */
public class Ex08 {	
	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random()*45);			
				
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		// �ζǹ�ȣ ����
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		// �ζǹ�ȣ ���
		Iterator<Integer> iter = treeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
	}
}
