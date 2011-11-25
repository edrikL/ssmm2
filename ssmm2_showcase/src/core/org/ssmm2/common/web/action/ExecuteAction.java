package org.ssmm2.common.web.action;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * @author zyj
 *
 */
public class ExecuteAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Map<String,String> prop;
	protected ActionContext context=ActionContext.getContext();

	
	public String value(String value) {
		
		return prop.get(value);
	}
	
	public Map<String,String> getProp() {
		return prop;
	}
	
	public void setProp(Map<String,String> prop) {
		this.prop = prop;
	}
}
