package com.lwxf.industry4.webapp.facade.admin.factory.statement;

import com.lwxf.industry4.webapp.common.result.RequestResult;
import com.lwxf.industry4.webapp.facade.base.BaseFacade;
import com.lwxf.mybatis.utils.MapContext;

import java.util.Date;
import java.util.Map;

/**
 * 功能：
 *
 * @author：SunXianWei(17838625030@163.com)
 * @create：2019/6/30 0030 9:25
 * @version：2019 Version：1.0
 * @company：老屋新房 Created with IntelliJ IDEA
 */
public interface ErpBigDataStatementFacade extends BaseFacade {

	Map queryBigdData(String refresh);
}
