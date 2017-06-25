package org.offer.controller;

import javax.annotation.Resource;

import org.offer.bean.DicProjectBean;
import org.offer.http.APIStatus;
import org.offer.http.ApiResponse;
import org.offer.service.DicProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.camelot.openplatform.common.bean.DataGrid;
import com.camelot.openplatform.common.bean.ExecuteResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springfox.documentation.annotations.ApiIgnore;

/**
* @ClassName: DicProjectController 
* @Description: 工程项目web接口
* @author wangdada
* @date 2017年6月24日
*
*/
@Api(value = "工程项目web接口", description="工程项目web接口")
@RestController
@RequestMapping("/dicProject")
public class DicProjectController {
	
	@Resource
	private DicProjectService dicProjectService;
	
	
	/**
	* @Title: listQuery
	* @Description: 工程项目分页列表
	* @param @param name 工程项目名称
	* @param @param page 当前页
	* @param @return    参数
	* @return JSONObject    返回类型
	* @throws
	*/
	@ApiOperation("工程项目分页列表")
	@GetMapping("list")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "name", value = "工程项目名称", required = true, paramType = "query", dataType = "String"),
			@ApiImplicitParam(name = "page", value = "当前页", required = false, paramType = "query", dataType = "Int") })
	public JSONObject listQuery(String name, Integer page){
		DataGrid<DicProjectBean> result = dicProjectService.queryPage(name, page);
		return ApiResponse.jsonData(APIStatus.OK_200, result);
	}
	
	
	/**
	* @Title: addProject
	* @Description: 工程项目添加
	* @param bean 工程项目
	* @return JSONObject    返回类型
	* @throws
	*/
	@ApiOperation("工程项目添加")
	@PutMapping("add")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "name", value = "工程项目名称", required = true, paramType = "query"),
			@ApiImplicitParam(name = "unit", value = "工程项目单位", required = true, paramType = "query"),
			@ApiImplicitParam(name = "desConstruction", value = "施工描述", required = true, paramType = "query"),
			@ApiImplicitParam(name = "desStuff", value = "材料描述", required = true, paramType = "query"),
			@ApiImplicitParam(name = "price", value = "价格", required = true, paramType = "query", dataType="Float"),
			@ApiImplicitParam(name = "remarks", value = "备注", required = false, paramType = "query")})
	public JSONObject addProject(@ApiIgnore() DicProjectBean bean){
		ExecuteResult<APIStatus> result = dicProjectService.addProject(bean);
		return ApiResponse.jsonData(result.getResult());
	}
	
	
	/**
	* @Title: modifyProject
	* @Description: 工程项目编辑
	* @param bean 工程项目
	* @return JSONObject    返回类型
	* @throws
	*/
	@ApiOperation("工程项目编辑")
	@PostMapping("modify")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "工程项目id", required = true, paramType = "query", dataType="Long"),
			@ApiImplicitParam(name = "name", value = "工程项目名称", required = true, paramType = "query"),
			@ApiImplicitParam(name = "unit", value = "工程项目单位", required = true, paramType = "query"),
			@ApiImplicitParam(name = "desConstruction", value = "施工描述", required = true, paramType = "query"),
			@ApiImplicitParam(name = "desStuff", value = "材料描述", required = true, paramType = "query"),
			@ApiImplicitParam(name = "price", value = "价格", required = true, paramType = "query", dataType="Float"),
			@ApiImplicitParam(name = "remarks", value = "备注", required = false, paramType = "query")})
	public JSONObject modifyProject(DicProjectBean bean){
		ExecuteResult<APIStatus> result = dicProjectService.updateProject(bean);
		return ApiResponse.jsonData(result.getResult());
	}
	
	
	/**
	* @Title: deleteProject
	* @Description: 工程项目删除
	* @return JSONObject    返回类型
	* @throws
	*/
	@ApiOperation("工程项目删除")
	@PostMapping("delete")
	public JSONObject deleteProject(@ApiParam(value="工程项目id") @RequestParam(required = true) Long id){
		ExecuteResult<APIStatus> result = dicProjectService.deleteProject(id);
		return ApiResponse.jsonData(result.getResult());
	}

}
