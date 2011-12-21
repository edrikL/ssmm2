package org.ssmm2.persistence.mapper;

import java.util.List;
import java.util.Map;

public interface MemberShipMapper extends BaseMapper {
	List<Map<String,Object>> findByUser(String uid);
}
