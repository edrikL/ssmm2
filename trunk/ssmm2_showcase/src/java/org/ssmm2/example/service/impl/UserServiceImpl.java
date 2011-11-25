package org.ssmm2.example.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssmm2.example.persistence.mapper.UserMapper;
import java.util.Map;

@Service
public class UserServiceImpl  {
	@Autowired
	private UserMapper userMapper=null;

	public int login(Map<String, Object> user) throws Exception {
		return  userMapper.deleteByExample(user);
	}

	public int add(Map<String, String> user) throws Exception {
		  userMapper.save(user);
		  userMapper.save(user);
		return 0;
	}

	public void delete(Map<String, String> prop) {
		// TODO Auto-generated method stub
		
	}
	
}
