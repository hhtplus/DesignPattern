/**
 * 
 */
package com.hanlinonlne.singleton;

/**
 * 单例模式
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
