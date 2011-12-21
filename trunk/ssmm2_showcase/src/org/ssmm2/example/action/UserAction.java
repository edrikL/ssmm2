package org.ssmm2.example.action;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.ssmm2.common.web.action.ExecuteAction;
import org.ssmm2.example.service.UserService;

public class UserAction extends ExecuteAction {
	@Autowired
	private transient UserService userService;
	private static final long serialVersionUID = 1L;

	
	public String add() {
		Map<String,String> users=this.getProp();
		System.out.println(users.get("NAME"));
		System.out.println(users.get("PASSWORD"));
		try {
			userService.add(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String delete() 
	{
		try {
			userService.delete(this.getProp());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

}
