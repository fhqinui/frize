package com.fhqinui.frize.common.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtils {

	/**
	 * 将array中的所有值添加到List中
	 * @param list
	 * @param array
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:28:04
	 */
	public static <T> void addArrayToList(List<T> list, T[] array) {
		if (list == null || array == null || array.length <= 0) {
			return;
		}
		for (T r : array) {
			list.add(r);
		}
	}

	/**
	 * 将<key,value>值数组添加到Map里，当keys values长度必须一样
	 * @param map
	 * @param keys
	 * @param values
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:38:24
	 */
	public static <K, V> void addArrayToMap(Map<K, V> map, K[] keys, V[] values) {
		if (map == null || keys == null || keys.length <= 0 || values == null
				|| values.length <= 0 || keys.length != values.length) {
			return;
		}
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], values[i]);
		}
	}

	/**
	 * 将array中的所有值添加到set中
	 * @param set
	 * @param array
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:42:07
	 */
	public static <T> void addArrayToSet(Set<T> set, T[] array) {
		List<T> l = new ArrayList<T>();
		CollectionUtils.addArrayToList(l, array);
		set.addAll(l);
	}

	/**
	 * 合并多个数组到一个数组中
	 * @param arrs
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:42:42
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] combineArrs(T[]... arrs) {
		if (arrs == null) {
			return null;
		}
		int length = 0;
		int count = 0;
		T[] ret = null;
		for (T[] arr : arrs) {
			if (arr == null || arr.length <= 0) {
				continue;
			}
			if (ret == null) {
				ret = arr;
			}
			count++;
			length += arr.length;
		}
		if (length == 0 || count == 1 || ret == null) {
			return ret;
		}
		ret = (T[]) Array.newInstance(ret[0].getClass(), length);
		int ipos = 0;
		for (Object[] arr : arrs) {
			if (arr == null || arr.length <= 0) {
				continue;
			}
			System.arraycopy(arr, 0, ret, ipos, arr.length);
			ipos += arr.length;
		}
		return ret;
	}

	/**
	 * 去除数组中的空值
	 * @param array
	 * @param tclazz
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:44:05
	 */
	public static <T> T[] getArrayWithoutNull(T[] array, Class<T> tclazz) {
		if (array == null || array.length == 0) {
			return null;
		}
		List<T> voList = new ArrayList<T>();
		for (T vo : array) {
			if (vo == null) {
				continue;
			}
			voList.add(vo);
		}
		@SuppressWarnings("unchecked")
		T[] ret = (T[]) Array.newInstance(tclazz, voList.size());
		voList.toArray(ret);
		return ret;
	}

	/**
	 * 列表转换为数组
	 * @param list
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:48:58
	 */
	@SuppressWarnings("unchecked")
	public static <E> E[] listToArray(List<E> list) {
		if (CollectionUtils.isNullORZeroLength(list)) {
			return null;
		}
		E[] ret = (E[]) Array.newInstance(list.get(0).getClass(), list.size());
		return list.toArray(ret);
	}

	/**
	 * list为空或者长度为0 返回true
	 * @param list
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:49:50
	 */
	public static boolean isNullORZeroLength(List<?> list) {
		return list == null || list.isEmpty();
	}

	/**
	 * set为null或者isEmpty返回true
	 * @param set
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:52:12
	 */
	public static boolean isNullORZeroLength(Set<?> set) {
		return set == null || set.isEmpty();
	}

	/**
	 * set转换为数组
	 * @param set
	 * @return
	 * @author zhaofei
	 * @date 2015年6月4日 下午4:52:55
	 */
	@SuppressWarnings("unchecked")
	public static <E> E[] setToArray(Set<E> set) {
		if (isNullORZeroLength(set)) {
			return null;
		}
		Iterator<E> iter = set.iterator();
		if (!iter.hasNext()) {
			return null;
		}
		E v = iter.next();
		E[] ret = (E[]) Array.newInstance(v.getClass(), set.size());
		return set.toArray(ret);
	}

}
