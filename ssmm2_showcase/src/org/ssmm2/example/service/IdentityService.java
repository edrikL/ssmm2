package org.ssmm2.example.service;

import java.util.List;
import java.util.Map;

public interface IdentityService {
	int login(Map<String,String> user) throws Exception;
	Map<String,Object> addUser(Map<String,String> user) throws Exception;
	int deleteUser(Map<String,String> user)throws Exception;
	int addGroup(Map<String,String> user) throws Exception;
	int deleteGroup(Map<String,String> user) throws Exception;
	List<Map<String,Object>> findBypage(int curpage,int prepage);
}
