package sims2016derive.quotationtranscode.context.struct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

public class CThostFtdcTransferQryBankRspField extends StructObject {
	public CThostFtdcTransferQryBankRspField() {
		super();
	}

	/**
	 * \u54cd\u5e94\u4ee3\u7801
	 */
	@Array({5}) 
	@Field(0) 
	private Pointer<Byte> RetCode() {
		return this.io.getPointerField(this, 0);
	}

	@Array({5})
	@Field(0)
	public void setRetCode(String retCode) {
		this.io.getPointerField(this, 0).setCString(retCode);
	}

	public String getRetCode() {
		return RetCode().getCString();
	}

	/**
	 * \u54cd\u5e94\u4fe1\u606f
	 */
	@Array({129}) 
	@Field(1) 
	private Pointer<Byte> RetInfo() {
		return this.io.getPointerField(this, 1);
	}

	@Array({129})
	@Field(1)
	public void setRetInfo(String retInfo) {
		this.io.getPointerField(this, 1).setCString(retInfo);
	}

	public String getRetInfo() {
		return RetInfo().getCString();
	}

	/**
	 * \u8d44\u91d1\u8d26\u6237
	 */
	@Array({13}) 
	@Field(2) 
	private Pointer<Byte> FutureAccount() {
		return this.io.getPointerField(this, 2);
	}

	@Array({13})
	@Field(2)
	public void setFutureAccount(String futureAccount) {
		this.io.getPointerField(this, 2).setCString(futureAccount);
	}

	public String getFutureAccount() {
		return FutureAccount().getCString();
	}

	/**
	 * \u94f6\u884c\u4f59\u989d
	 */
	@Field(3) 
	private double TradeAmt() {
		return this.io.getDoubleField(this, 3);
	}

	public double getTradeAmt() {
		return TradeAmt();
	}

	/**
	 * \u94f6\u884c\u4f59\u989d
	 */
	@Field(3) 
	private CThostFtdcTransferQryBankRspField TradeAmt(double TradeAmt) {
		this.io.setDoubleField(this, 3, TradeAmt);
		return this;
	}

	public void setTradeAmt(double tradeAmt) {
		TradeAmt(tradeAmt);
	}

	/**
	 * \u94f6\u884c\u53ef\u7528\u4f59\u989d
	 */
	@Field(4) 
	private double UseAmt() {
		return this.io.getDoubleField(this, 4);
	}

	public double getUseAmt() {
		return UseAmt();
	}

	/**
	 * \u94f6\u884c\u53ef\u7528\u4f59\u989d
	 */
	@Field(4) 
	private CThostFtdcTransferQryBankRspField UseAmt(double UseAmt) {
		this.io.setDoubleField(this, 4, UseAmt);
		return this;
	}

	public void setUseAmt(double useAmt) {
		UseAmt(useAmt);
	}

	/**
	 * \u94f6\u884c\u53ef\u53d6\u4f59\u989d
	 */
	@Field(5) 
	private double FetchAmt() {
		return this.io.getDoubleField(this, 5);
	}

	public double getFetchAmt() {
		return FetchAmt();
	}

	/**
	 * \u94f6\u884c\u53ef\u53d6\u4f59\u989d
	 */
	@Field(5) 
	private CThostFtdcTransferQryBankRspField FetchAmt(double FetchAmt) {
		this.io.setDoubleField(this, 5, FetchAmt);
		return this;
	}

	public void setFetchAmt(double fetchAmt) {
		FetchAmt(fetchAmt);
	}

	/**
	 * \u5e01\u79cd
	 */
	@Array({4}) 
	@Field(6) 
	private Pointer<Byte> CurrencyCode() {
		return this.io.getPointerField(this, 6);
	}

	@Array({4})
	@Field(6)
	public void setCurrencyCode(String currencyCode) {
		this.io.getPointerField(this, 6).setCString(currencyCode);
	}

	public String getCurrencyCode() {
		return CurrencyCode().getCString();
	}

	public CThostFtdcTransferQryBankRspField(Pointer pointer) {
		super(pointer);
	}

}
