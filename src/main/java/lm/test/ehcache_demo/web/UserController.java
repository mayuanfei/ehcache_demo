package lm.test.ehcache_demo.web;

import lm.test.ehcache_demo.common.CommonResponse;
import lm.test.ehcache_demo.dao.pojo.EmpInfo;
import lm.test.ehcache_demo.service.EmpInfoService;
import lm.test.ehcache_demo.util.impl.SysEhcacheUtil;
import lm.test.ehcache_demo.util.impl.TimeEhcacheUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: ehcache_demo
 * @description:
 * @author: 老马
 * @create: 2020-08-05 16:48
 **/
@RestController
@Slf4j
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private EmpInfoService empService;
    @Resource
    private TimeEhcacheUtil timeEhcacheUtil;
    @Resource
    private SysEhcacheUtil sysEhcacheUtil;


    @GetMapping("/permanent")
    public CommonResponse testCachePermanent() throws Exception{
        Object laoma = sysEhcacheUtil.get("laoma333");
        Object laoma444 = sysEhcacheUtil.get("laoma444");
        if(laoma == null) {
            sysEhcacheUtil.put("laoma333", "老马永久333");
            sysEhcacheUtil.put("laoma444", "老马永久444");
        }
        return CommonResponse.buildSuccessCommonResponseWithData(laoma);
    }

    @GetMapping("/test10s")
    public CommonResponse testCache10s() throws Exception{
        Object laoma = timeEhcacheUtil.get("laoma");
        if(laoma == null) {
            timeEhcacheUtil.put("laoma", "laoma10");
        }
        return CommonResponse.buildSuccessCommonResponseWithData(laoma);
    }

    @GetMapping("/{userid}")
    public CommonResponse searchUser(@PathVariable String userid) throws Exception{
        EmpInfo user = this.empService.getEmpInfoByUserId(userid);
        if(user == null) {
            return CommonResponse.buildFailCommonResponse("没有找到相应的用户信息");
        }else {
            return CommonResponse.buildSuccessCommonResponseWithData(user);
        }
    }
    @GetMapping("/{userid}/count5")
    public CommonResponse searchUser5(@PathVariable String userid) throws Exception{
        EmpInfo user = this.empService.getEmpInfoByUserIdCount5(userid);
        if(user == null) {
            return CommonResponse.buildFailCommonResponse("没有找到相应的用户信息");
        }else {
            return CommonResponse.buildSuccessCommonResponseWithData(user);
        }
    }
}
