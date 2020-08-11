package lm.test.ehcache_demo.dao.mapper;

import lm.test.ehcache_demo.common.BaseMapper;
import lm.test.ehcache_demo.dao.pojo.EmpInfo;
import org.apache.ibatis.annotations.Select;

public interface EmpInfoMapper extends BaseMapper<EmpInfo> {

    @Select("select * from emp_info t where t.userid = #{userid}")
    public EmpInfo selectEmpInfoByUserId(String userid);
}