package org.ssmm2.common.persistence.dialect;

public class DerbyDialect extends Dialect{

	public boolean supportsLimit() {
		return true;
	}

	public boolean supportsLimitOffset() {
		return true;
	}

	public String getLimitString(String sql, int offset,String offsetPlaceholder, int limit, String limitPlaceholder) {
		return new StringBuffer(sql.length()+42)
		.append(sql)
		.append(" OFFSET "+offsetPlaceholder+" ROWS  FETCH NEXT "+limitPlaceholder+" ROWS ONLY")
		.toString(); 
	}

}
