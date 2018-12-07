package learningforbestme.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 核放单
 * 
 * @author zhouliang
 * @date 2018年11月2日  新建
 */
public class CheckBillList implements Serializable {

	private static final long serialVersionUID = 1L;

	// 毛重
    private BigDecimal grossWt;
    
    // 净重
	private BigDecimal netWt;
	
	// 总件数
	private Integer packNo;
	
	// 订单号(用“|”分隔开)
	private String orderId;
	
	// 托盘号
	private String palletNo;

	// formId
	private String formId;
	
	// 核放单明细
	private List<CheckBill> checkBill;

	public BigDecimal getGrossWt() {
		return grossWt;
	}

	public void setGrossWt(BigDecimal grossWt) {
		this.grossWt = grossWt;
	}

	public BigDecimal getNetWt() {
		return netWt;
	}

	public void setNetWt(BigDecimal netWt) {
		this.netWt = netWt;
	}

	public Integer getPackNo() {
		return packNo;
	}

	public void setPackNo(Integer packNo) {
		this.packNo = packNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getPalletNo() {
		return palletNo;
	}

	public void setPalletNo(String palletNo) {
		this.palletNo = palletNo;
	}

	public List<CheckBill> getCheckBill() {
		return checkBill;
	}

	public void setCheckBill(List<CheckBill> checkBill) {
		this.checkBill = checkBill;
	}
	
	
}
