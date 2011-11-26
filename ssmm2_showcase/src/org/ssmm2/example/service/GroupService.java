package org.ssmm2.example.service;

import java.util.Map;

public interface GroupService {
	int delete(Map<String,String> user) throws Exception;
	int add(Map<String,String> props) throws Exception;
}
