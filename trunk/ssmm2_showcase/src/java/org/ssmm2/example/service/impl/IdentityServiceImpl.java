package org.ssmm2.example.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssmm2.example.service.IdentityService;

@Service("identityService")
public class IdentityServiceImpl implements IdentityService {
	@Autowired
	private UserGroupServiceImpl userGroupServiceImpl;
	@Autowired
	private UserServiceImpl userServiceImpl;
	public int login(Map<String, String> user) throws Exception {
		
		return 0;
	}
	public Map addUser(Map<String, String> user) throws Exception {
		
		return null;
	}
	public int deleteUser(Map<String, String> user) throws Exception {
	
		return 0;
	}
	public int addGroup(Map<String, String> user) throws Exception {
		return 0;
	}
	public int deleteGroup(Map<String, String> user) throws Exception {
		return 0;
	}
	
}
