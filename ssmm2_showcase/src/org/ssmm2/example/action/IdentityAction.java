package org.ssmm2.example.action;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.ssmm2.common.web.action.ExecuteAction;
import org.ssmm2.example.service.IdentityService;

public class IdentityAction extends ExecuteAction {
	@Autowired
	private transient IdentityService identityService;
	private static final long serialVersionUID = 1L;

	
	public String addUser() {
		Map<String,String> users=this.getProp();
		System.out.println(users.get("NAME"));
		System.out.println(users.get("PASSWORD"));
		try {
			//identityService.addUser(users);
			identityService.findBypage(2, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String addGroup()
	{
		return SUCCESS;
	}
	
	public String deleteGroup()
	{
		return SUCCESS;
	}
	
	public String deleteUser() 
	{
		try {
			identityService.deleteUser(this.getProp());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

}
