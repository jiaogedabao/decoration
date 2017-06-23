package org.offer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/** 
 * <p>Description: [描述该类概要功能介绍]</p>
 * Created on 2017年6月21日
 * @author  <a href="mailto: wangli@camelotchina.com">王力</a>
 * @version 1.0 
 * Copyright (c) 2017 北京柯莱特科技有限公司 交付部 
 */ 
@Api(value = "区域接口",description="区域接口")
@RestController
@RequestMapping("/area")
public class AreaController {
	
//	@Resource
//	private IAreaService areaService;
//	
//	@ApiOperation("区域列表查询接口[wangli@camelotchina.com]")
//	@ApiImplicitParams({
//		@ApiImplicitParam(name = "id", value = "区域id", required = false, paramType="query"),
//		@ApiImplicitParam(name = "areaName", value = "区域名称", required = false, paramType="query"),
//		@ApiImplicitParam(name = "areaLevel", value = "区域等级(L1:城市,L2:办公楼,L3:楼层)", required = false, paramType="query"),
//		@ApiImplicitParam(name = "parentId", value = "父级区域id(area->id)", required = false, paramType="query"),
//		@ApiImplicitParam(name = "areaName1", value = "一级区域名称", required = false, paramType="query"),
//		@ApiImplicitParam(name = "areaName2", value = "二级区域名称", required = false, paramType="query", dataType="integer")})
//	@GetMapping(value="queryList",produces="application/json;charset=UTF-8")
//	public JSONObject queryList(@ApiIgnore() AreaBean bean, @ApiParam(value="当前页") @RequestParam() Integer page){
//		return ApiResponse.jsonData(APIStatus.OK_200, bean);
//	}
//
//	
//	@ApiOperation("在redis中查询id区域[wangli@camelotchina.com]")
//   	@GetMapping(value="queryRedisByPid",produces="application/json;charset=UTF-8")
//    public JSONObject queryRedisById(@ApiParam(value="id") @RequestParam() Integer id){
//		AreaBean bean = areaService.queryById(id);
//		return ApiResponse.jsonData(APIStatus.OK_200, bean);
//    }
}
