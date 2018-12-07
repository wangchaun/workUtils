package learningforbestme.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InvLot implements Serializable{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	// 内部主键
	private Long sysNo;

	// 公司(货主)Id
	private Long companySysNo;

	// 公司(货主)编码
	private String companyCode;

	// 公司(货主)名称
	private String companyName;

	// 仓库id
	private Long whSysNo;

	// 仓库编码
	private String whCode;

	// 仓库名称
	private String whName;

	// 商品id
	private Long skuSysNo;

	// 商品海关备案号
	private String skuVirtualCode;

	// 商品编码
	private String skuCode;

	// 商品名称
	private String skuName;

	// 批号
	private String lot;

	// 属性1
	private String attribute1;

	// 属性2
	private String attribute2;

	// 属性3
	private String attribute3;

	// 属性4
	private String attribute4;

	// 属性5
	private String attribute5;

	// 属性6
	private String attribute6;

	// 属性7
	private String attribute7;

	// 属性8
	private String attribute8;

	// 属性9
	private String attribute9;

	// 属性10
	private String attribute10;
	// 属性11
	private String attribute11;

	// 属性12
	private String attribute12;

	// 属性13
	private String attribute13;

	// 属性14
	private String attribute14;

	// 属性15
	private String attribute15;

	// 库存属性(01:良品;03:样品;05:不良品)
	private String inventoryType;

	// 供应商编码
	private String vendorCode;

	// 质检标志(Y:已质检;N未质检)
	private String qcFlag;

	// 质检单号
	private String qualNo;

	// 报关单号
	private String cumstomerNo;

	// Y:锁定;N:解锁
	private String holdFlag;

	// 在库数量(良品)
	private BigDecimal qtyOnhand;

	// 分配数量(良品)
	private BigDecimal qtyAllocated;

	// 冻结数量(良品)
	private BigDecimal qtyHold;

	// 在库数量(不良品)
	private BigDecimal qtyDamage;

	// 冻结数量(不良品)
	private BigDecimal qtyDamageHold;

	// 分配数量(不良品)
	private BigDecimal qtyDamageAllocated;

	// 预分配标记(Y：要预分配；N：不要预分配)
	private String preAllocFlag;

	// 是否有效
	private String yn;

	// 时间戳
	private Date ts;

	// 创建时间
	private Date createTime;

	// 创建人
	private String createPin;

	// 更新人
	private String updatePin;

	// 
	private String alertFlag;

	// 
	private String alert2Flag;

	// 
	private String alertAllocFlag;



	/**
	 *
	 * 内部主键 <br />
	 *
	 * @return 
	 */
	public Long getSysNo() {
		return sysNo;
	}

	/**
	 *
	 * 内部主键 <br />
	 *
	 * @param sysNo
	 */
	public void setSysNo(Long sysNo) {
		this.sysNo = sysNo;
	}

	/**
	 *
	 * 公司(货主)Id <br />
	 *
	 * @return 
	 */
	public Long getCompanySysNo() {
		return companySysNo;
	}

	/**
	 *
	 * 公司(货主)Id <br />
	 *
	 * @param companySysNo
	 */
	public void setCompanySysNo(Long companySysNo) {
		this.companySysNo = companySysNo;
	}

	/**
	 *
	 * 公司(货主)编码 <br />
	 *
	 * @return 
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 *
	 * 公司(货主)编码 <br />
	 *
	 * @param companyCode
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	/**
	 *
	 * 公司(货主)名称 <br />
	 *
	 * @return 
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 *
	 * 公司(货主)名称 <br />
	 *
	 * @param companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 *
	 * 仓库id <br />
	 *
	 * @return 
	 */
	public Long getWhSysNo() {
		return whSysNo;
	}

	/**
	 *
	 * 仓库id <br />
	 *
	 * @param whSysNo
	 */
	public void setWhSysNo(Long whSysNo) {
		this.whSysNo = whSysNo;
	}

	/**
	 *
	 * 仓库编码 <br />
	 *
	 * @return 
	 */
	public String getWhCode() {
		return whCode;
	}

	/**
	 *
	 * 仓库编码 <br />
	 *
	 * @param whCode
	 */
	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}

	/**
	 *
	 * 仓库名称 <br />
	 *
	 * @return 
	 */
	public String getWhName() {
		return whName;
	}

	/**
	 *
	 * 仓库名称 <br />
	 *
	 * @param whName
	 */
	public void setWhName(String whName) {
		this.whName = whName;
	}

	/**
	 *
	 * 商品id <br />
	 *
	 * @return 
	 */
	public Long getSkuSysNo() {
		return skuSysNo;
	}

	/**
	 *
	 * 商品id <br />
	 *
	 * @param skuSysNo
	 */
	public void setSkuSysNo(Long skuSysNo) {
		this.skuSysNo = skuSysNo;
	}

	/**
	 *
	 * 商品海关备案号 <br />
	 *
	 * @return 
	 */
	public String getSkuVirtualCode() {
		return skuVirtualCode;
	}

	/**
	 *
	 * 商品海关备案号 <br />
	 *
	 * @param skuVirtualCode
	 */
	public void setSkuVirtualCode(String skuVirtualCode) {
		this.skuVirtualCode = skuVirtualCode;
	}

	/**
	 *
	 * 商品编码 <br />
	 *
	 * @return 
	 */
	public String getSkuCode() {
		return skuCode;
	}

	/**
	 *
	 * 商品编码 <br />
	 *
	 * @param skuCode
	 */
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	/**
	 *
	 * 商品名称 <br />
	 *
	 * @return 
	 */
	public String getSkuName() {
		return skuName;
	}

	/**
	 *
	 * 商品名称 <br />
	 *
	 * @param skuName
	 */
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	/**
	 *
	 * 批号 <br />
	 *
	 * @return 
	 */
	public String getLot() {
		return lot;
	}

	/**
	 *
	 * 批号 <br />
	 *
	 * @param lot
	 */
	public void setLot(String lot) {
		this.lot = lot;
	}

	/**
	 *
	 * 属性1 <br />
	 *
	 * @return 
	 */
	public String getAttribute1() {
		return attribute1;
	}

	/**
	 *
	 * 属性1 <br />
	 *
	 * @param attribute1
	 */
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	/**
	 *
	 * 属性2 <br />
	 *
	 * @return 
	 */
	public String getAttribute2() {
		return attribute2;
	}

	/**
	 *
	 * 属性2 <br />
	 *
	 * @param attribute2
	 */
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	/**
	 *
	 * 属性3 <br />
	 *
	 * @return 
	 */
	public String getAttribute3() {
		return attribute3;
	}

	/**
	 *
	 * 属性3 <br />
	 *
	 * @param attribute3
	 */
	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	/**
	 *
	 * 属性4 <br />
	 *
	 * @return 
	 */
	public String getAttribute4() {
		return attribute4;
	}

	/**
	 *
	 * 属性4 <br />
	 *
	 * @param attribute4
	 */
	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	/**
	 *
	 * 属性5 <br />
	 *
	 * @return 
	 */
	public String getAttribute5() {
		return attribute5;
	}

	/**
	 *
	 * 属性5 <br />
	 *
	 * @param attribute5
	 */
	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	/**
	 *
	 * 属性6 <br />
	 *
	 * @return 
	 */
	public String getAttribute6() {
		return attribute6;
	}

	/**
	 *
	 * 属性6 <br />
	 *
	 * @param attribute6
	 */
	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	/**
	 *
	 * 属性7 <br />
	 *
	 * @return 
	 */
	public String getAttribute7() {
		return attribute7;
	}

	/**
	 *
	 * 属性7 <br />
	 *
	 * @param attribute7
	 */
	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}

	/**
	 *
	 * 属性8 <br />
	 *
	 * @return 
	 */
	public String getAttribute8() {
		return attribute8;
	}

	/**
	 *
	 * 属性8 <br />
	 *
	 * @param attribute8
	 */
	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
	}

	/**
	 *
	 * 属性9 <br />
	 *
	 * @return 
	 */
	public String getAttribute9() {
		return attribute9;
	}

	/**
	 *
	 * 属性9 <br />
	 *
	 * @param attribute9
	 */
	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
	}

	/**
	 *
	 * 属性10 <br />
	 *
	 * @return 
	 */
	public String getAttribute10() {
		return attribute10;
	}

	/**
	 *
	 * 属性10 <br />
	 *
	 * @param attribute10
	 */
	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
	}

	/**
	 *
	 * 库存属性(01:良品;03:样品;05:不良品) <br />
	 *
	 * @return 
	 */
	public String getInventoryType() {
		return inventoryType;
	}

	/**
	 *
	 * 库存属性(01:良品;03:样品;05:不良品) <br />
	 *
	 * @param inventoryType
	 */
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	/**
	 *
	 * 供应商编码 <br />
	 *
	 * @return 
	 */
	public String getVendorCode() {
		return vendorCode;
	}

	/**
	 *
	 * 供应商编码 <br />
	 *
	 * @param vendorCode
	 */
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	/**
	 *
	 * 质检标志(Y:已质检;N未质检) <br />
	 *
	 * @return 
	 */
	public String getQcFlag() {
		return qcFlag;
	}

	/**
	 *
	 * 质检标志(Y:已质检;N未质检) <br />
	 *
	 * @param qcFlag
	 */
	public void setQcFlag(String qcFlag) {
		this.qcFlag = qcFlag;
	}

	/**
	 *
	 * 质检单号 <br />
	 *
	 * @return 
	 */
	public String getQualNo() {
		return qualNo;
	}

	/**
	 *
	 * 质检单号 <br />
	 *
	 * @param qualNo
	 */
	public void setQualNo(String qualNo) {
		this.qualNo = qualNo;
	}

	/**
	 *
	 * 报关单号 <br />
	 *
	 * @return 
	 */
	public String getCumstomerNo() {
		return cumstomerNo;
	}

	/**
	 *
	 * 报关单号 <br />
	 *
	 * @param cumstomerNo
	 */
	public void setCumstomerNo(String cumstomerNo) {
		this.cumstomerNo = cumstomerNo;
	}

	/**
	 *
	 * Y:锁定;N:解锁 <br />
	 *
	 * @return 
	 */
	public String getHoldFlag() {
		return holdFlag;
	}

	/**
	 *
	 * Y:锁定;N:解锁 <br />
	 *
	 * @param holdFlag
	 */
	public void setHoldFlag(String holdFlag) {
		this.holdFlag = holdFlag;
	}

	/**
	 *
	 * 在库数量(良品) <br />
	 *
	 * @return 
	 */
	public BigDecimal getQtyOnhand() {
		return qtyOnhand;
	}

	/**
	 *
	 * 在库数量(良品) <br />
	 *
	 * @param qtyOnhand
	 */
	public void setQtyOnhand(BigDecimal qtyOnhand) {
		this.qtyOnhand = qtyOnhand;
	}

	/**
	 *
	 * 分配数量(良品) <br />
	 *
	 * @return 
	 */
	public BigDecimal getQtyAllocated() {
		return qtyAllocated;
	}

	/**
	 *
	 * 分配数量(良品) <br />
	 *
	 * @param qtyAllocated
	 */
	public void setQtyAllocated(BigDecimal qtyAllocated) {
		this.qtyAllocated = qtyAllocated;
	}

	/**
	 *
	 * 冻结数量(良品) <br />
	 *
	 * @return 
	 */
	public BigDecimal getQtyHold() {
		return qtyHold;
	}

	/**
	 *
	 * 冻结数量(良品) <br />
	 *
	 * @param qtyHold
	 */
	public void setQtyHold(BigDecimal qtyHold) {
		this.qtyHold = qtyHold;
	}

	/**
	 *
	 * 在库数量(不良品) <br />
	 *
	 * @return 
	 */
	public BigDecimal getQtyDamage() {
		return qtyDamage;
	}

	/**
	 *
	 * 在库数量(不良品) <br />
	 *
	 * @param qtyDamage
	 */
	public void setQtyDamage(BigDecimal qtyDamage) {
		this.qtyDamage = qtyDamage;
	}

	/**
	 *
	 * 冻结数量(不良品) <br />
	 *
	 * @return 
	 */
	public BigDecimal getQtyDamageHold() {
		return qtyDamageHold;
	}

	/**
	 *
	 * 冻结数量(不良品) <br />
	 *
	 * @param qtyDamageHold
	 */
	public void setQtyDamageHold(BigDecimal qtyDamageHold) {
		this.qtyDamageHold = qtyDamageHold;
	}

	/**
	 *
	 * 分配数量(不良品) <br />
	 *
	 * @return 
	 */
	public BigDecimal getQtyDamageAllocated() {
		return qtyDamageAllocated;
	}

	/**
	 *
	 * 分配数量(不良品) <br />
	 *
	 * @param qtyDamageAllocated
	 */
	public void setQtyDamageAllocated(BigDecimal qtyDamageAllocated) {
		this.qtyDamageAllocated = qtyDamageAllocated;
	}

	/**
	 *
	 * 预分配标记(Y：要预分配；N：不要预分配) <br />
	 *
	 * @return 
	 */
	public String getPreAllocFlag() {
		return preAllocFlag;
	}

	/**
	 *
	 * 预分配标记(Y：要预分配；N：不要预分配) <br />
	 *
	 * @param preAllocFlag
	 */
	public void setPreAllocFlag(String preAllocFlag) {
		this.preAllocFlag = preAllocFlag;
	}

	/**
	 *
	 * 是否有效 <br />
	 *
	 * @return 
	 */
	public String getYn() {
		return yn;
	}

	/**
	 *
	 * 是否有效 <br />
	 *
	 * @param yn
	 */
	public void setYn(String yn) {
		this.yn = yn;
	}

	/**
	 *
	 * 时间戳 <br />
	 *
	 * @return 
	 */
	public Date getTs() {
		return ts;
	}

	/**
	 *
	 * 时间戳 <br />
	 *
	 * @param ts
	 */
	public void setTs(Date ts) {
		this.ts = ts;
	}

	/**
	 *
	 * 创建时间 <br />
	 *
	 * @return 
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 *
	 * 创建时间 <br />
	 *
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 *
	 * 创建人 <br />
	 *
	 * @return 
	 */
	public String getCreatePin() {
		return createPin;
	}

	/**
	 *
	 * 创建人 <br />
	 *
	 * @param createPin
	 */
	public void setCreatePin(String createPin) {
		this.createPin = createPin;
	}

	/**
	 *
	 * 更新人 <br />
	 *
	 * @return 
	 */
	public String getUpdatePin() {
		return updatePin;
	}

	/**
	 *
	 * 更新人 <br />
	 *
	 * @param updatePin
	 */
	public void setUpdatePin(String updatePin) {
		this.updatePin = updatePin;
	}

	/**
	 *
	 *  <br />
	 *
	 * @return 
	 */
	public String getAlertFlag() {
		return alertFlag;
	}

	/**
	 *
	 *  <br />
	 *
	 * @param alertFlag
	 */
	public void setAlertFlag(String alertFlag) {
		this.alertFlag = alertFlag;
	}

	/**
	 *
	 *  <br />
	 *
	 * @return 
	 */
	public String getAlert2Flag() {
		return alert2Flag;
	}

	/**
	 *
	 *  <br />
	 *
	 * @param alert2Flag
	 */
	public void setAlert2Flag(String alert2Flag) {
		this.alert2Flag = alert2Flag;
	}

	/**
	 *
	 *  <br />
	 *
	 * @return 
	 */
	public String getAlertAllocFlag() {
		return alertAllocFlag;
	}

	/**
	 *
	 *  <br />
	 *
	 * @param alertAllocFlag
	 */
	public void setAlertAllocFlag(String alertAllocFlag) {
		this.alertAllocFlag = alertAllocFlag;
	}

	public String getAttribute11() {
		return attribute11;
	}

	public void setAttribute11(String attribute11) {
		this.attribute11 = attribute11;
	}

	public String getAttribute12() {
		return attribute12;
	}

	public void setAttribute12(String attribute12) {
		this.attribute12 = attribute12;
	}

	public String getAttribute13() {
		return attribute13;
	}

	public void setAttribute13(String attribute13) {
		this.attribute13 = attribute13;
	}

	public String getAttribute14() {
		return attribute14;
	}

	public void setAttribute14(String attribute14) {
		this.attribute14 = attribute14;
	}

	public String getAttribute15() {
		return attribute15;
	}

	public void setAttribute15(String attribute15) {
		this.attribute15 = attribute15;
	}
}