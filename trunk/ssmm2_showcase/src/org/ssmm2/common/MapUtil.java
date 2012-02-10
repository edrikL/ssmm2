package org.ssmm2.common;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.time.DateUtils;

public class MapUtil {

	private Map<String, String> prop = null;
	private static int ARRAY_SIZE=500;
	public MapUtil() {
	}

	public MapUtil(Map<String, String> map) {
		this.prop = map;
	}

	public void set(Map<String, String> map) {
		this.prop = map;
	}
	
	public static int getInt(Map<String,String> map,String key){
		if (map.get(key) == null)
			return 0;
		return NumberUtils.toInt(map.get(key));
	}
	
	public static byte getByte(Map<String,String> map,String key) {
		if (map.get(key) == null)
			return 0;
		return NumberUtils.toByte(map.get(key));
	}
	
	public static short getStort(Map<String,String> map,String key) {
		if (map.get(key) == null)
			return 0;
		return NumberUtils.toShort(map.get(key));
	}
	
	public static long getLong(Map<String,String> map,String key) {
		if (map.get(key) == null)
			return 0;
		return NumberUtils.toLong(map.get(key));
	}
	
	public static float getFloat(Map<String,String> map,String key) {
		if (map.get(key) == null)
			return 0;
		return NumberUtils.toFloat(map.get(key));
	}
	
	public static double getDouble(Map<String,String> map,String key) {
		if (map.get(key) == null)
			return 0;
		return NumberUtils.toDouble(map.get(key));
	}
	
	public static boolean getBoolean(Map<String,String> map,String key) {
		if (map.get(key) == null)
			return false;
		if (NumberUtils.isNumber(map.get(key))) {
			return BooleanUtils.toBoolean(NumberUtils.toInt(map.get(key)));
		} else {
			return BooleanUtils.toBoolean(map.get(key));
		}
	}
	
	public static Date getDate(Map<String,String> map,String key) {
		if (map.get(key) == null)
			return null;
		Date d = null;
		try {
			String[] format = { "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd",
					"MM/dd/yyyy HH:mm:ss", "MM/dd/yyyy" };
			d = DateUtils.parseDate(map.get(key), format);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	

	public int getInt(String key) {
		if (prop.get(key) == null)
			return 0;
		return NumberUtils.toInt(prop.get(key));
	}
	
	public byte getByte(String key) {
		if (prop.get(key) == null)
			return 0;

		return NumberUtils.toByte(prop.get(key));
	}
	
	public short getStort(String key) {
		if (prop.get(key) == null)
			return 0;
		return NumberUtils.toShort(prop.get(key));
	}
	
	public long getLong(String key) {
		if (prop.get(key) == null)
			return 0;
		return NumberUtils.toLong(prop.get(key));
	}
	
	public float getFloat(String key) {
		if (prop.get(key) == null)
			return 0;
		return NumberUtils.toFloat(prop.get(key));
	}
	
	public double getDouble(String key) {
		if (prop.get(key) == null)
			return 0;
		return NumberUtils.toDouble(prop.get(key));
	}
	
	/**
	 * 0为假，非0为真,非true的字符串为false
	 * @param key
	 * @return boolean
	 */
	public boolean getBoolean(String key) {
		if (prop.get(key) == null)
			return false;
		if (NumberUtils.isNumber(prop.get(key))) {
			return BooleanUtils.toBoolean(NumberUtils.toInt(prop.get(key)));
		} else {
			return BooleanUtils.toBoolean(prop.get(key));
		}
	}

	public String getString(String key) {
		return prop.get(key);
	}
	
	public Date getDate(String key) {
		if (prop.get(key) == null)
			return null;
		Date d = null;
		try {
			String[] format = {"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd",
					"MM/dd/yyyy HH:mm:ss", "MM/dd/yyyy" };
			d = DateUtils.parseDate(prop.get(key), format);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public int[] getIntArray(String key) {
		if (prop.get(key) == null)
			return null;
		int[] array = new int[ARRAY_SIZE];
		String[] s_array = prop.get(key).split(", ");
		for (int i = 0; i < s_array.length; ++i) {
			array[i] = NumberUtils.toInt(s_array[i]);
		}
		return array;
	}


	public byte[] getByteArray(String key) {
		if (prop.get(key) == null)
			return null;
		byte[] array = new byte[ARRAY_SIZE];
		String[] s_array = prop.get(key).split(", ");
		for (int i = 0; i < s_array.length; ++i) {
			array[i] = NumberUtils.toByte(s_array[i]);
		}
		return array;
	}


	public short[] getStortArray(String key) {
		if (prop.get(key) == null)
			return null;
		short[] array = new short[ARRAY_SIZE];
		String[] s_array = prop.get(key).split(", ");
		for (int i = 0; i < s_array.length; ++i) {
			array[i] = NumberUtils.toShort(s_array[i]);
		}
		return array;
	}

	public long[] getLongArray(String key) {
		if (prop.get(key) == null)
			return null;
		long[] array = new long[ARRAY_SIZE];
		String[] s_array = prop.get(key).split(", ");
		for (int i = 0; i < s_array.length; ++i) {
			array[i] = NumberUtils.toLong(s_array[i]);
		}
		return array;
	}

	public float[] getFloatArray(String key) {
		if (prop.get(key) == null)
			return null;
		float[] array = new float[ARRAY_SIZE];
		String[] s_array = prop.get(key).split(", ");
		for (int i = 0; i < s_array.length; ++i) {
			array[i] = NumberUtils.toFloat(s_array[i]);
		}
		return array;
	}

	public double[] getDoubleArray(String key) {
		if (prop.get(key) == null)
			return null;
		double[] array = new double[ARRAY_SIZE];
		String[] s_array = prop.get(key).split(", ");
		for (int i = 0; i < s_array.length; ++i) {
			array[i] = NumberUtils.toDouble(s_array[i]);
		}
		return array;
	}

	public String[] getStringArray(String key) {
		if (prop.get(key) == null)
			return null;
		return prop.get(key).split(", ");
	}

	public static void main(String[] args) {
		MapUtil p = new MapUtil();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "2, 3, 4, 5");
		map.put("date", "2012-12-1");
		map.put("flag", "false");
		p.set(map);
		
		
		int i=p.getInt("name");
		Date d=p.getDate("date");
		boolean flag=p.getBoolean("flag");
		String[] ay=p.getStringArray("name");
		
		System.out.println(d);
		
		
		System.out.println(i);
		System.out.println(flag);
		System.out.println(ay[2]);
		
	}

}
