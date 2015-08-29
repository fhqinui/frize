package com.fhqinui.firze.common.util;

/**
 * <p>volatile 关键字只能保证线程从主内存中加载的值是最新的。
 * <p>但是线程执行的过程是read、load、use、assign、store、write。
 * <p>线程1在还未执行write之前，线程2进入read，读到的数据与线程1相同，就会造成并发。
 *  
 * @author zhaofei
 * @date 2015年6月4日 下午5:09:16
 */
public class VolatileTest {

	private static volatile int a = 0;
	
	public static void main(String[] args) {
		for(int i = 0; i < 10000; i ++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					a ++ ;
				}
			}).start();
		}
		System.out.println(a);
	}
}
