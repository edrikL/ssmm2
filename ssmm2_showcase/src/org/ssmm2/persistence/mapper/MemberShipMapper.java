package org.ssmm2.persistence.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
@SuppressWarnings("rawtypes")
public interface MemberShipMapper {
	int insert(Object...examples);
	int deleteByExample( Map user);
	int deleteByIds(Object...ids);
	int update(Map...entity);
	List<Map> findByAll();
	List<Map> findByIds(String...id);
	List<Map> findByExample(Map example);
	int count();
	List<Map> findByPage(@Param("rowBounds") RowBounds rowBounds);
	List<Map> findByUser(String uid);
}
