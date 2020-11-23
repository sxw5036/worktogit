package com.lwxf.industry4.webapp.bizservice.financing;


import java.util.List;


import com.lwxf.industry4.webapp.common.model.PaginatedFilter;
import com.lwxf.industry4.webapp.common.model.PaginatedList;
import com.lwxf.industry4.webapp.domain.dto.financing.FundsDto;
import com.lwxf.mybatis.utils.MapContext;
import com.lwxf.industry4.webapp.bizservice.base.BaseService;
import com.lwxf.industry4.webapp.domain.entity.financing.Funds;


/**
 * 功能：
 * 
 * @author：SunXianWei(17838625030@163.com)
 * @created：2019-09-25 09:25:44
 * @version：2018 V1.0
 * @company：老屋新房 Created with IntelliJ IDEA
 */
public interface FundsService extends BaseService <Funds, String> {

	PaginatedList<Funds> selectByFilter(PaginatedFilter paginatedFilter);

	List<FundsDto> findFundsList(MapContext mapContext);

	List<FundsDto> findByParentId(String id);
}