package com.lwxf.industry4.webapp.domain.dao.financing;


import java.util.List;


import com.lwxf.industry4.webapp.common.model.PaginatedFilter;
import com.lwxf.industry4.webapp.common.model.PaginatedList;
import com.lwxf.mybatis.utils.MapContext;
import com.lwxf.mybatis.annotation.IBatisSqlTarget;
import com.lwxf.industry4.webapp.domain.dao.base.BaseDao;
import com.lwxf.industry4.webapp.domain.entity.financing.PaymentFiles;


/**
 * 功能：
 * 
 * @author：panchenxiao(Mister_pan@126.com)
 * @created：2018-12-19 16:16:41
 * @version：2018 V1.0
 * @company：老屋新房 Created with IntelliJ IDEA
 */
@IBatisSqlTarget
public interface PaymentFilesDao extends BaseDao<PaymentFiles, String> {

	PaginatedList<PaymentFiles> selectByFilter(PaginatedFilter paginatedFilter);

	List<PaymentFiles> findByPaymentId (String paymentId);

	int deleteByPaymentId(String paymentId);
}