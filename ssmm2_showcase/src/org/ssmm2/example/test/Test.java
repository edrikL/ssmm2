package org.ssmm2.example.test;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.ssmm2.persistence.mapper.UserMapper;


public class Test {
	public static void main(String[] args) {

		String resource = "org/ssmm2/example/test/mybatis-config.xml";
		Reader reader=null;
		SqlSessionFactory sqlMapper=null;
		SqlSession session = null;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			session = sqlMapper.openSession();
			UserMapper userMapper = session.getMapper(UserMapper.class);
			Map<String,String> user = new HashMap<String,String>();
			user.put("NAME", "zhuyj1");
			user.put("PASSWORD", "123456");
			user.put("REMARK", "");
			List<Map<String,String>> users=new ArrayList<Map<String,String>>();
			for(int i=0;i<1500;i++)
			{
			  users.add(user);
			}
			long l=new Date().getTime();
			userMapper.save(users.toArray());
			long ll=new Date().getTime();
			
            session.commit();
            System.out.println(ll-l);
            
            List<Map<Object, Object>> list=userMapper.findByAll();
            for(Map<Object, Object> map:list)
            {
              Iterator<Entry<Object, Object>> i=map.entrySet().iterator();
              while (i.hasNext()) {
            	  Entry<Object, Object> entry=i.next();
            	  System.out.print(entry.getKey()+"--");
            	  System.out.println(entry.getValue());
            	
				
			}
              System.out.println("");
            	
            }
            
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
