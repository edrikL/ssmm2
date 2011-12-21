package org.ssmm2.example.persistence.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
@SuppressWarnings("rawtypes")
public interface BaseMapper {
	int insert(Object...examples);
	int deleteByExample(Map user);
	int deleteByIds(Object...ids);
	int update(Map...entity);
	List<Map> findByAll();
	List<Map> findByIds(String...id);
	List<Map> findByExample(Map<Object,Object> example);
	int count();
	List<Map> findByPage(@Param("rowBounds") RowBounds rowBounds);
	
}
