package org.ssmm2.common.persistence.dialect;

/**
 * @author zyj
 *
 */
public class MySQLDialect extends Dialect{

	public boolean supportsLimitOffset(){
		return true;
	}
	
    public boolean supportsLimit() {   
        return true;   
    }  
    
	public String getLimitString(String sql, int offset,String offsetPlaceholder, int limit, String limitPlaceholder) {
  /*      if (offset > 0) {   
        	return sql + " limit "+offsetPlaceholder+","+limitPlaceholder; 
        } else {   
            return sql + " limit "+limitPlaceholder;
        } */ 
        return new StringBuffer(sql.length()+40)
               .append(sql)
               .append(offset > 0?" limit "+offsetPlaceholder+","+limitPlaceholder:" limit "+limitPlaceholder)
               .toString();
	}   
  
}
