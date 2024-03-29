package org.ssmm2.users.action;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.ssmm2.common.web.action.ExecuteAction;
import org.ssmm2.users.service.GroupService;

public class GroupAction extends ExecuteAction  {
	@Autowired
	private transient GroupService groupService;
	private static final long serialVersionUID = 1L;
	public String add() {
		Map<String,String> group=this.getProp();
		System.out.println(group.get("NAME"));
		try {
			groupService.add(group);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String delete() 
	{
		try {
			groupService.delete(this.getProp());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

}
