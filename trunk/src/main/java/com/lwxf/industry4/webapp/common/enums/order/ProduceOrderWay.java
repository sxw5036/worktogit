package com.lwxf.industry4.webapp.common.enums.order;

/**
 * 功能：
 *
 * @author：Administrator
 * @create：2019/4/12/012 13:36
 * @version：2019 Version：1.0
 * @company：老屋新房 Created with IntelliJ IDEA
 */
public enum ProduceOrderWay {
	SELF_PRODUCED(0,"自产"),
	COORDINATION(1,"外协"),
	SPECIAL(2,"特供实木");

	private Integer value;
	private String name;


	ProduceOrderWay(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	/**
	 * 数据范围校验
	 *
	 * @param value
	 * @return
	 */
	public static boolean contains(Integer value) {
		return null == getByValue(value)?Boolean.FALSE.booleanValue():Boolean.TRUE.booleanValue();
	}
	public Integer getValue() {
		return this.value;
	}

	public String getName(){
		return this.name;
	}

	public static ProduceOrderWay getByValue(Integer value){
		ProduceOrderWay allVaues[] = ProduceOrderWay.values();
		ProduceOrderWay status;
		for (int i=0,len = allVaues.length;i<len;i++){
			status = allVaues[i];
			if(status.getValue()==value){
				return status;
			}
		}
		return null;
	}
}
