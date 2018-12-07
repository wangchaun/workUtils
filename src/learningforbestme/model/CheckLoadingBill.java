package learningforbestme.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CheckLoadingBill implements Serializable  {

	private static final long serialVersionUID = 1L;

	// 装载单号
	private String loadingNo;

	// 车牌号
	private String plateNumber;

	// 仓库编码
	private String whCode;

	// 商品毛重
	private BigDecimal skuGrossWeight;

	// 商品净重
	private BigDecimal skuNewWeight;

	// 柜型
	private String containerType;

	// 柜号
	private String containerNo;

	// 车重
	private BigDecimal carWt;

	// 集装箱重量
	private BigDecimal containerWt;

	// 核放清单列表
	private List<CheckBillList> checkBillList;

	public String getLoadingNo() {
		return loadingNo;
	}

	public void setLoadingNo(String loadingNo) {
		this.loadingNo = loadingNo;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getWhCode() {
		return whCode;
	}

	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}

	public List<CheckBillList> getCheckBillList() {
		return checkBillList;
	}

	public void setCheckBillList(List<CheckBillList> checkBillList) {
		this.checkBillList = checkBillList;
	}


	public BigDecimal getSkuGrossWeight() {
		return skuGrossWeight;
	}

	public void setSkuGrossWeight(BigDecimal skuGrossWeight) {
		this.skuGrossWeight = skuGrossWeight;
	}

	public BigDecimal getSkuNewWeight() {
		return skuNewWeight;
	}

	public void setSkuNewWeight(BigDecimal skuNewWeight) {
		this.skuNewWeight = skuNewWeight;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public BigDecimal getCarWt() {
		return carWt;
	}

	public void setCarWt(BigDecimal carWt) {
		this.carWt = carWt;
	}

	public BigDecimal getContainerWt() {
		return containerWt;
	}

	public void setContainerWt(BigDecimal containerWt) {
		this.containerWt = containerWt;
	}
}
