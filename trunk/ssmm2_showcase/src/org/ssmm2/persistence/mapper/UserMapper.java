package org.ssmm2.persistence.mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper {
	List<Map<String,Object>> findByGroup(long gid);

}
