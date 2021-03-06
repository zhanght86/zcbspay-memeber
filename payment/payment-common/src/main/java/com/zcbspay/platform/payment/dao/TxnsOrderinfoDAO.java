/* 
 * ITxnsOrderinfoDAO.java  
 * 
 * version TODO
 *
 * 2015年8月29日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.payment.dao;

import com.zcbspay.platform.payment.commons.dao.BaseDAO;
import com.zcbspay.platform.payment.exception.PaymentQuickPayException;
import com.zcbspay.platform.payment.pojo.PojoTxnsOrderinfo;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2015年8月29日 下午3:39:25
 * @since 
 */
public interface TxnsOrderinfoDAO extends BaseDAO<PojoTxnsOrderinfo>{

	/**
	 * 保存订单信息
	 * @param orderinfo
	 */
    public void saveOrderInfo(PojoTxnsOrderinfo orderinfo);
    
    /**
     * 通过交易序列号获取订单信息
     * @param txnseqno
     * @return
     */
    public PojoTxnsOrderinfo getOrderinfoByTxnseqno(String txnseqno);
    
    /**
     * 通过订单号和商户号获取订单信息
     * @param orderNo
     * @param merchNo
     * @return
     */
    public PojoTxnsOrderinfo getOrderinfoByOrderNoAndMerchNo(String orderNo,String merchNo);
    
    /**
     * 通过TN获取订单信息
     * @param tn
     * @return
     */
    public PojoTxnsOrderinfo getOrderinfoByTN(String tn);
    
    /**
     * 更新订单状态为开始支付
     * @param txnseqno
     * @throws PaymentQuickPayException
     */
    public void updateOrderToStartPay(String txnseqno)
			throws PaymentQuickPayException ;
    
   
}
