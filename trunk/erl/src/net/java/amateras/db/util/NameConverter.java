package net.java.amateras.db.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Naoki Takezoe
 */
public class NameConverter {

	public static final List<Name> NAMES = new ArrayList<Name>();

	static {
		loadDefaultDictionary();
	}

	/**
	 * Loads a default dictionary.
	 */
	private static void loadDefaultDictionary(){
		InputStream in = NameConverter.class.getResourceAsStream("dictionary.txt");

		String str = IOUtils.loadStream(in, "UTF-8");
		str = str.replaceAll("\r\n", "\n");
		str = str.replaceAll("\r", "\n");

		String[] lines = str.split("\n");
		for(String line: lines){
			String key = line.substring(0, line.indexOf('='));
			String value = line.substring(line.indexOf('=') + 1);
			NAMES.add(new Name(key, value));
		}
	}

	public static class Name {

		public String physical;
		public String logical;

		public Name( String physical, String logical){
			this.physical = physical;
			this.logical = logical;
		}

		@Override
		public String toString(){
			return physical + "=" + logical;
		}
	}

	/**
	 * Converts the logical name to the physical name.
	 *
	 * @param logical ths logical name
	 * @return the physical name
	 */
	public static String logical2physical(String logical){
		logical = logical.toUpperCase();

		for(Name name: NAMES){
			logical = logical.replace(name.logical, "_" + name.physical + "_");
		}
		logical = logical.replaceAll("_+", "_");
		logical = logical.replaceAll("^_|_$", "");
		return logical;
	}

	/**
	 * Converts the physical name to the logical name.
	 *
	 * @param physical ths physical name
	 * @return the logical name
	 */
	public static String physical2logical(String physical){
		physical = physical.toUpperCase();

		for(Name name: NAMES){
			physical = physical.replace(name.physical, name.logical);
		}
		physical = physical.replace("_", "");
		return physical;
	}


//	public static void main(String[] args) {
//		System.out.println(physical2logical("COMPANY_NAME"));
//		System.out.println(physical2logical("USER_ID"));
//		System.out.println(physical2logical("EMP_NO"));
//		System.out.println(physical2logical("EMP_NAME"));
//
//		System.out.println(logical2physical("商品詳細情報"));
//		System.out.println(logical2physical("更新日"));
//		System.out.println(logical2physical("従業員番号"));
//		System.out.println(logical2physical("従業員名"));
//	}

}
