package com.lwxf.industry4.webapp.bizservice.warehouse;


import java.util.List;


import com.lwxf.industry4.webapp.common.model.PaginatedFilter;
import com.lwxf.industry4.webapp.common.model.PaginatedList;
import com.lwxf.industry4.webapp.domain.dto.warehouse.StorageOutputInDto;
import com.lwxf.mybatis.utils.MapContext;
import com.lwxf.industry4.webapp.bizservice.base.BaseService;
import com.lwxf.industry4.webapp.domain.entity.warehouse.StorageOutputIn;


/**
 * 功能：
 * 
 * @author：F_baisi(F_baisi@163.com)
 * @created：2018-12-20 10:16:05
 * @version：2018 V1.0
 * @company：老屋新房 Created with IntelliJ IDEA
 */
public interface StorageOutputInService extends BaseService <StorageOutputIn, String> {

	PaginatedList<StorageOutputIn> selectByFilter(PaginatedFilter paginatedFilter);

	PaginatedList<StorageOutputInDto> findListByPaginateFilter(PaginatedFilter paginatedFilter);

	StorageOutputIn findOneByNo(String no,String branchId);

}