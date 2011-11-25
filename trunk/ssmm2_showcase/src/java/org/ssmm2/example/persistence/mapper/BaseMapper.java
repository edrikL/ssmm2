package org.ssmm2.example.persistence.mapper;

import java.util.List;
import java.util.Map;

public interface BaseMapper {
	int save(Object...example);
	int saveByAll(List<Map<Object,Object>> examples);
	int deleteByExample(Map<String, Object>user);
	int deleteByIds(Object...ids);
	int update(Map<Object,Object>...entity);
	List<Map<Object,Object>> findByAll();
	List<Map<Object,Object>> findByIds(String...id);
	List<Map<Object,Object>> findByExample(Map<Object,Object> example);
	long count();
}
