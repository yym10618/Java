package ch10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch09.Apple;

/*
 * ��¥ : 2022/01/11
 * �̸� : ����
 * ���� : �ڹ� �÷��� ��(Map) �ǽ��ϱ� ���� p372
 */
public class Sub4_MapTest {
	
	public static void main(String[] args) {
		
		// Map ����
		Map<String, String> map1 = new HashMap<>();
		
		map1.put("A", "Apple");
		map1.put("B", "Banana");
		map1.put("C", "Cherry");
		
		System.out.println("map1 : "+map1);
		
		// Map ũ��
		System.out.println("map1 ũ�� :"+map1.size());
		
		// Map ���
		System.out.println("map1 ŰA : "+map1.get("A"));
		System.out.println("map1 ŰB : "+map1.get("B"));
		System.out.println("map1 ŰC : "+map1.get("C"));
		
		// Map ����
		List<Map<Integer, Apple>> mapList = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("�ѱ�", 3000));
		m1.put(102, new Apple("�߱�", 2000));
		m1.put(103, new Apple("�Ϻ�", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("�̱�", 3000));
		m2.put(202, new Apple("����", 2000));
		m2.put(203, new Apple("ȣ��", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("�±�", 3000));
		m3.put(302, new Apple("�븸", 2000));
		m3.put(303, new Apple("ȫ��", 1000));
		
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		// �ѱ���� ���
		Map<Integer, Apple> appleMap = mapList.get(0);
		Apple apple = appleMap.get(101);
		apple.toString();
		
		// ȣ�ֻ�� ���(Method Chaining)
		mapList.get(1).get(203).toString();
		
		// �븸��� ���
		mapList.get(2).get(302).toString();
		
		
	}

}
