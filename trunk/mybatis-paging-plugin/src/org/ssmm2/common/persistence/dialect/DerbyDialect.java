package org.ssmm2.common.persistence.dialect;

/**
 * @author zyj
 */
public class DerbyDialect extends Dialect{

	public boolean supportsLimit() {
		return true;
	}

	public boolean supportsLimitOffset() {
		return true;
	}

	public String getLimitString(String sql, int offset,String offsetPlaceholder, int limit, String limitPlaceholder) {

		return new StringBuffer(sql.length()+30)
			.append(sql)
			.append(" offset "+offsetPlaceholder+" rows fetch next "+limitPlaceholder+" rows only")
			.toString();
	       
	}

}
