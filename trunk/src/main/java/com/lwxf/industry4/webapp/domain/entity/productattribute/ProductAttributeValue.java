package com.lwxf.industry4.webapp.domain.entity.productattribute;
import com.lwxf.commons.exception.ErrorCodes;
import com.lwxf.commons.utils.DataValidatorUtils;
import com.lwxf.commons.utils.LwxfStringUtils;
import com.lwxf.industry4.webapp.common.result.RequestResult;
import com.lwxf.industry4.webapp.common.result.ResultFactory;
import com.lwxf.industry4.webapp.domain.entity.base.IdEntity;
import com.lwxf.mybatis.annotation.Column;
import com.lwxf.mybatis.annotation.Table;
import com.lwxf.mybatis.utils.MapContext;
import com.lwxf.mybatis.utils.TypesExtend;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Types;
import java.util.*;
/**
 * 功能：product_attribute_value 实体类
 *
 * @author：SunXianWei(17838625030@163.com)
 * @created：2020-07-29 10:14 
 * @version：2018 Version：1.0 
 * @dept：老屋新房 Created with IntelliJ IDEA 
 */ 
@ApiModel(value="product_attribute_value对象", description="product_attribute_value")
@Table(name = "product_attribute_value",displayName = "product_attribute_value")
public class ProductAttributeValue extends IdEntity  {
	private static final long serialVersionUID = 1L;
	@Column(type = Types.CHAR,length = 13,name = "branch_id",displayName = "工厂id，引用company表主键")
	@ApiModelProperty(value = "工厂id，引用company表主键")
	private String branchId;
	@Column(type = Types.CHAR,length = 13,name = "product_attribute_key_id",displayName = "产品属性id")
	@ApiModelProperty(value = "产品属性id")
	private String productAttributeKeyId;
	@Column(type = Types.VARCHAR,length = 100,name = "attribute_value",displayName = "属性值")
	@ApiModelProperty(value = "属性值")
	private String attributeValue;
	@Column(type = Types.INTEGER,name = "sort",displayName = "排序")
	@ApiModelProperty(value = "排序")
	private Integer sort;
	@Column(type = Types.INTEGER,name = "status",displayName = "启用状态（0-未启用，1-启用）")
	@ApiModelProperty(value = "启用状态（0-未启用，1-启用）")
	private Integer status;
	@Column(type = Types.CHAR,length = 13,name = "creator",displayName = "创建人")
	@ApiModelProperty(value = "创建人")
	private String creator;
	@Column(type = TypesExtend.DATETIME,name = "created",displayName = "创建时间")
	@ApiModelProperty(value = "创建时间")
	private Date created;
	@Column(type = Types.CHAR,length = 13,name = "updator",displayName = "修改人")
	@ApiModelProperty(value = "修改人")
	private String updator;
	@Column(type = TypesExtend.DATETIME,name = "updated",displayName = "修改时间")
	@ApiModelProperty(value = "修改时间")
	private Date updated;
	@Column(type = Types.INTEGER,name = "del_flag",displayName = "删除标识0-正常,1-已删除")
	@ApiModelProperty(value = "删除标识0-正常,1-已删除")
	private Integer delFlag;
	@Column(type = Types.VARCHAR,name = "key_name",displayName = "属性名称")
	@ApiModelProperty(value = "属性名称")
	private String keyName;

    public ProductAttributeValue() {  
     } 

	public RequestResult validateFields() {
		Map<String, String> validResult = new HashMap<>();
		if (LwxfStringUtils.getStringLength(this.branchId) > 13) {
			validResult.put("branchId", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
		}
		if (LwxfStringUtils.getStringLength(this.productAttributeKeyId) > 13) {
			validResult.put("productAttributeKeyId", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
		}
		if (LwxfStringUtils.getStringLength(this.attributeValue) > 100) {
			validResult.put("attributeValue", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
		}
		if (LwxfStringUtils.getStringLength(this.creator) > 13) {
			validResult.put("creator", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
		}
		if (LwxfStringUtils.getStringLength(this.updator) > 13) {
			validResult.put("updator", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
		}
		if(validResult.size()>0){
			return ResultFactory.generateErrorResult(ErrorCodes.VALIDATE_ERROR,validResult);
		}else {
			return null;
		}
	}

	private final static List<String> propertiesList = Arrays.asList("id","branchId","productAttributeKeyId","attributeValue","sort","status","creator","created","updator","updated","delFlag","keyName");

	public static RequestResult validateFields(MapContext map) {
		Map<String, String> validResult = new HashMap<>();
		if(map.size()==0){
			return ResultFactory.generateErrorResult("error",ErrorCodes.VALIDATE_NOTNULL);
		}
		boolean flag;
		Set<String> mapSet = map.keySet();
		flag = propertiesList.containsAll(mapSet);
		if(!flag){
			return ResultFactory.generateErrorResult("error",ErrorCodes.VALIDATE_ILLEGAL_ARGUMENT);
		}
		if(map.containsKey("sort")) {
			if (!DataValidatorUtils.isInteger1(map.getTypedValue("sort",String.class))) {
				validResult.put("sort", ErrorCodes.VALIDATE_INCORRECT_DATA_FORMAT);
			}
		}
		if(map.containsKey("status")) {
			if (!DataValidatorUtils.isBoolean(map.getTypedValue("status",String.class))) {
				validResult.put("status", ErrorCodes.VALIDATE_INCORRECT_DATA_FORMAT);
			}
		}
		if(map.containsKey("created")) {
			if (!DataValidatorUtils.isDate(map.getTypedValue("created",String.class))) {
				validResult.put("created", ErrorCodes.VALIDATE_INCORRECT_DATA_FORMAT);
			}
		}
		if(map.containsKey("updated")) {
			if (!DataValidatorUtils.isDate(map.getTypedValue("updated",String.class))) {
				validResult.put("updated", ErrorCodes.VALIDATE_INCORRECT_DATA_FORMAT);
			}
		}
		if(map.containsKey("delFlag")) {
			if (!DataValidatorUtils.isBoolean(map.getTypedValue("delFlag",String.class))) {
				validResult.put("delFlag", ErrorCodes.VALIDATE_INCORRECT_DATA_FORMAT);
			}
		}
		if(map.containsKey("branchId")) {
			if (LwxfStringUtils.getStringLength(map.getTypedValue("branchId",String.class)) > 13) {
				validResult.put("branchId", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
			}
		}
		if(map.containsKey("productAttributeKeyId")) {
			if (LwxfStringUtils.getStringLength(map.getTypedValue("productAttributeKeyId",String.class)) > 13) {
				validResult.put("productAttributeKeyId", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
			}
		}
		if(map.containsKey("attributeValue")) {
			if (LwxfStringUtils.getStringLength(map.getTypedValue("attributeValue",String.class)) > 100) {
				validResult.put("attributeValue", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
			}
		}
		if(map.containsKey("creator")) {
			if (LwxfStringUtils.getStringLength(map.getTypedValue("creator",String.class)) > 13) {
				validResult.put("creator", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
			}
		}
		if(map.containsKey("updator")) {
			if (LwxfStringUtils.getStringLength(map.getTypedValue("updator",String.class)) > 13) {
				validResult.put("updator", ErrorCodes.VALIDATE_LENGTH_TOO_LONG);
			}
		}
		if(validResult.size()>0){
			return ResultFactory.generateErrorResult(ErrorCodes.VALIDATE_ERROR,validResult);
		}else {
			return null;
		}
	}


	public void setBranchId(String branchId){
		this.branchId=branchId;
	}

	public String getBranchId(){
		return branchId;
	}

	public void setProductAttributeKeyId(String productAttributeKeyId){
		this.productAttributeKeyId=productAttributeKeyId;
	}

	public String getProductAttributeKeyId(){
		return productAttributeKeyId;
	}

	public void setAttributeValue(String attributeValue){
		this.attributeValue=attributeValue;
	}

	public String getAttributeValue(){
		return attributeValue;
	}

	public void setSort(Integer sort){
		this.sort=sort;
	}

	public Integer getSort(){
		return sort;
	}

	public void setCreator(String creator){
		this.creator=creator;
	}

	public String getCreator(){
		return creator;
	}

	public void setCreated(Date created){
		this.created=created;
	}

	public Date getCreated(){
		return created;
	}

	public void setUpdator(String updator){
		this.updator=updator;
	}

	public String getUpdator(){
		return updator;
	}

	public void setUpdated(Date updated){
		this.updated=updated;
	}

	public Date getUpdated(){
		return updated;
	}


	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
}
