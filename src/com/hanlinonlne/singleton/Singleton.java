/**
 * 
 */
package com.hanlinonlne.singleton;

/**
 * ����ģʽ
 * 
 * @author lazier
 */
public class Singleton {
	
	private static class SingletonHolder{
		static{
			System.out.println("inner holder...");
		}
		public static Singleton INSTANCE = new Singleton();
	}

	private Singleton(){
		System.out.println("start to init ...");
	}
	
	public static Singleton getInstance(){
		System.out.println("start to get instance....");
		return SingletonHolder.INSTANCE;
	}
}
