package org.ssmm2.users.service;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssmm2.persistence.mapper.UserMapper;

import java.util.List;
import java.util.Map;

@Service
public class UserService  {
	@Autowired
	private UserMapper userMapper=null;

	public int login(Map<String, Object> user) throws Exception {
		return  userMapper.deleteByExample(user);
	}

	public int add(Map<String, String> user) throws Exception {
		  
		return userMapper.insert(user);
	}

	public void delete(Map<String, String> prop) {
		// TODO Auto-generated method stub
		
	}
	public List<Map> find(int curpage,int pre)
	{
		return userMapper.findByPage(new RowBounds(curpage,pre));
	}
	
}
