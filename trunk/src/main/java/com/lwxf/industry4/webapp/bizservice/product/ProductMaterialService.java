package com.lwxf.industry4.webapp.bizservice.product;


import java.util.List;


import com.lwxf.industry4.webapp.common.model.PaginatedFilter;
import com.lwxf.industry4.webapp.common.model.PaginatedList;
import com.lwxf.industry4.webapp.domain.dto.product.ProductMaterialDto;
import com.lwxf.industry4.webapp.domain.entity.product.ProductColor;
import com.lwxf.mybatis.utils.MapContext;
import com.lwxf.industry4.webapp.bizservice.base.BaseService;
import com.lwxf.industry4.webapp.domain.entity.product.ProductMaterial;


/**
 * 功能：
 * 
 * @author：F_baisi(F_baisi@163.com)
 * @created：2018-12-01 10:21:33
 * @version：2018 V1.0
 * @company：老屋新房 Created with IntelliJ IDEA
 */
public interface ProductMaterialService extends BaseService <ProductMaterial, String> {

	PaginatedList<ProductMaterial> selectByFilter(PaginatedFilter paginatedFilter);
	List<ProductMaterial> selectByCategoryId(String id);
	List<ProductMaterial> selectByType(Integer type);
	List<ProductMaterialDto> selectProductMaterialList(String cid, String name);
	boolean isExistByProductMaterial(ProductMaterial productMaterial);
	List<ProductMaterial> findAll();


}