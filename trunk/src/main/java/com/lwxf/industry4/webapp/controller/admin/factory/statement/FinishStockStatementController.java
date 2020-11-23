package com.lwxf.industry4.webapp.controller.admin.factory.statement;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

import com.lwxf.commons.json.JsonMapper;
import com.lwxf.industry4.webapp.common.constant.WebConstant;
import com.lwxf.industry4.webapp.common.result.RequestResult;
import com.lwxf.industry4.webapp.common.result.ResultFactory;
import com.lwxf.industry4.webapp.common.utils.WebUtils;
import com.lwxf.industry4.webapp.facade.AppBeanInjector;
import com.lwxf.industry4.webapp.facade.wxapi.factory.statements.FinishStockStatementFacade;
import com.lwxf.mybatis.utils.MapContext;

/**
 * 功能：入库报表接口
 *
 * @author：SunXianWei(17838625030@163.com)
 * @create：2019/7/3 0003 15:11
 * @version：2019 Version：1.0
 * @company：老屋新房 Created with IntelliJ IDEA
 */
@Api(value="pcFinishStockStatementController",tags={"pc端后台接口:入库报表接口"})
@RestController("pcFinishStockStatementController")
@RequestMapping(value = "/api/f/",produces = WebConstant.RESPONSE_CONTENT_TYPE_JSON_CHARTSET)
public class FinishStockStatementController {
	@Resource(name = "pcFinishStockStatementFacade")
	private FinishStockStatementFacade finishStockStatementFacade;

	@ApiOperation(value="本周入库报表",notes="本周入库报表")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "countType",value = "要查看的类型，新增统计传“0”，库存单统计传“1”",dataType = "string",paramType = "path",required = true)
	})
	@GetMapping("/finishStockStatements/week/{countType}")
	private String weekFinishStockStatements(@PathVariable String countType
										){
		JsonMapper jsonMapper=new JsonMapper();
		String uid = WebUtils.getCurrUserId();
		String branchId =WebUtils.getCurrBranchId();
		if(uid==null){
			return jsonMapper.toJson(ResultFactory.generateErrorResult(com.lwxf.industry4.webapp.common.exceptions.ErrorCodes.VALIDATE_USER_NOT_LOGGED, AppBeanInjector.i18nUtil.getMessage("VALIDATE_USER_NOT_LOGGED")));
		}

		RequestResult result=this.finishStockStatementFacade.weekFinishStockBillStatements(branchId,countType);
		return jsonMapper.toJson(result);
	}
	@ApiOperation(value="本月入库报表接口",notes="本月入库报表接口")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "countType",value = "要查看的类型，新增统计传“0”，库存单统计传“1”",dataType = "string",paramType = "path",required = true)
	})
	@GetMapping("/finishStockStatements/month/{countType}")
	private String monthFinishStockBillStatements(@PathVariable String countType
											   ){
		JsonMapper jsonMapper=new JsonMapper();
		String uid = WebUtils.getCurrUserId();
		String branchId =WebUtils.getCurrBranchId();
		if(uid==null){
			return jsonMapper.toJson(ResultFactory.generateErrorResult(com.lwxf.industry4.webapp.common.exceptions.ErrorCodes.VALIDATE_USER_NOT_LOGGED, AppBeanInjector.i18nUtil.getMessage("VALIDATE_USER_NOT_LOGGED")));
		}
		RequestResult result=this.finishStockStatementFacade.monthFinisheStockStatements(branchId,countType);
		return jsonMapper.toJson(result);
	}
	@ApiOperation(value="本季入库报表接口",notes="本季入库报表接口")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "countType",value = "要查看的类型，新增统计传“0”，库存单统计传“1”",dataType = "string",paramType = "path",required = true)
	})
	@GetMapping("/finishStockStatements/quarter/{countType}")
	private String quarterFinishStockStatements(@PathVariable String countType
												 ){
		JsonMapper jsonMapper=new JsonMapper();
		String uid = WebUtils.getCurrUserId();
		String branchId =WebUtils.getCurrBranchId();
		if(uid==null){
			return jsonMapper.toJson(ResultFactory.generateErrorResult(com.lwxf.industry4.webapp.common.exceptions.ErrorCodes.VALIDATE_USER_NOT_LOGGED, AppBeanInjector.i18nUtil.getMessage("VALIDATE_USER_NOT_LOGGED")));
		}
		RequestResult result=this.finishStockStatementFacade.quarterFinishStockStatements(branchId,countType);
		return jsonMapper.toJson(result);
	}
	@ApiOperation(value="本年入库报表接口",notes="本年入库报表接口")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "countType",value = "要查看的类型，新增统计传“0”，库存单统计传“1”",dataType = "string",paramType = "path",required = true)
	})
	@GetMapping("/finishStockStatements/year/{countType}")
	private String yearFinishStockStatements(@PathVariable String countType
											  ){
		JsonMapper jsonMapper=new JsonMapper();
		String uid = WebUtils.getCurrUserId();
		String branchId =WebUtils.getCurrBranchId();
		if(uid==null){
			return jsonMapper.toJson(ResultFactory.generateErrorResult(com.lwxf.industry4.webapp.common.exceptions.ErrorCodes.VALIDATE_USER_NOT_LOGGED, AppBeanInjector.i18nUtil.getMessage("VALIDATE_USER_NOT_LOGGED")));
		}
		RequestResult result=this.finishStockStatementFacade.yearFinishStockStatements(branchId,countType);
		return jsonMapper.toJson(result);
	}
	@ApiOperation(value="条件搜索发货报表接口",notes="条件搜索发货报表接口")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "countType",value = "要查看的类型，包装统计传“0”，发货单统计传“1”",dataType = "string",paramType = "path",required = true),
			@ApiImplicitParam(name = "dateType",value = "要查看的时间类型 0-按日 1-按月 2-按年",dataType = "String",paramType = "query"),
			@ApiImplicitParam(name = "startTime",value = "开始时间",dataType = "string",paramType = "query"),
			@ApiImplicitParam(name = "endTime",value = "结束时间",dataType = "string",paramType = "query")
	})
	@GetMapping("/finishStockStatements/{countType}")
	private String finishStockStatements(@PathVariable String countType,
										 @RequestParam(required = false) String dateType,
										  @RequestParam(required = false) String startTime,
										  @RequestParam(required = false) String endTime
										  ){
		JsonMapper jsonMapper=new JsonMapper();
		String uid = WebUtils.getCurrUserId();
		String branchId =WebUtils.getCurrBranchId();
		if(uid==null){
			return jsonMapper.toJson(ResultFactory.generateErrorResult(com.lwxf.industry4.webapp.common.exceptions.ErrorCodes.VALIDATE_USER_NOT_LOGGED, AppBeanInjector.i18nUtil.getMessage("VALIDATE_USER_NOT_LOGGED")));
		}
		MapContext mapContext=MapContext.newOne();
		if(startTime!=null&&!startTime.equals("")){
			mapContext.put("startTime",startTime);
		}
		if(endTime!=null&&!endTime.equals("")){
			mapContext.put("endTime",endTime);
		}
		if(dateType!=null&&!dateType.equals("")){
			mapContext.put("dateType",dateType);
		}else {
			mapContext.put("dateType","0");
		}
		RequestResult result=this.finishStockStatementFacade.finishStockStatements(branchId,countType,mapContext);
		return jsonMapper.toJson(result);
	}

}
