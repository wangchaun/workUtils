package learningforbestme.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 海关核放清单明细
 * 
 * @author zhouliang
 * @date 2018年11月2日  新建
 */
public class CheckBill implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// 序号
	private Integer gNo;
	
	// 商品料件号
	private String goodsId;
	
	// 商品编码（对应WMS条形码）
	private String codeTs;
	
	// 商品中文名称
	private String gNameCn;
	
	// 申报数量
	private Integer gQty;
	
	// 对应商品的平均单价
	private BigDecimal declPrice;
	
	// 总价
	private BigDecimal declTotal;

	// 报关单号
	private String customsDeclarationNo;

	// 商品备案序号
	private String putrecSeqNo;

	public String getPutrecSeqNo() {
		return putrecSeqNo;
	}

	public void setPutrecSeqNo(String putrecSeqNo) {
		this.putrecSeqNo = putrecSeqNo;
	}

	public Integer getgNo() {
		return gNo;
	}

	public void setgNo(Integer gNo) {
		this.gNo = gNo;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getCodeTs() {
		return codeTs;
	}

	public void setCodeTs(String codeTs) {
		this.codeTs = codeTs;
	}

	public String getgNameCn() {
		return gNameCn;
	}

	public void setgNameCn(String gNameCn) {
		this.gNameCn = gNameCn;
	}

	public Integer getgQty() {
		return gQty;
	}

	public void setgQty(Integer gQty) {
		this.gQty = gQty;
	}

	public BigDecimal getDeclPrice() {
		return declPrice;
	}

	public void setDeclPrice(BigDecimal declPrice) {
		this.declPrice = declPrice;
	}

	public BigDecimal getDeclTotal() {
		return declTotal;
	}

	public void setDeclTotal(BigDecimal declTotal) {
		this.declTotal = declTotal;
	}

	public String getCustomsDeclarationNo() {
		return customsDeclarationNo;
	}

	public void setCustomsDeclarationNo(String customsDeclarationNo) {
		this.customsDeclarationNo = customsDeclarationNo;
	}
}
