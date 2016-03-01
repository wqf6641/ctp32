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

public class CThostFtdcBrokerTradingParamsField extends StructObject {
	public CThostFtdcBrokerTradingParamsField() {
		super();
	}

	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(0) 
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 0);
	}

	@Array({11})
	@Field(0)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 0).setCString(brokerID);
	}

	public String getBrokerID() {
		return BrokerID().getCString();
	}

	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(1) 
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({13})
	@Field(1)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 1).setCString(investorID);
	}

	public String getInvestorID() {
		return InvestorID().getCString();
	}

	/**
	 * \u4fdd\u8bc1\u91d1\u4ef7\u683c\u7c7b\u578b
	 */
	@Field(2) 
	private byte MarginPriceType() {
		return this.io.getByteField(this, 2);
	}

	public char getMarginPriceType() {
		return (char)MarginPriceType();
	}

	/**
	 * \u4fdd\u8bc1\u91d1\u4ef7\u683c\u7c7b\u578b
	 */
	@Field(2) 
	private CThostFtdcBrokerTradingParamsField MarginPriceType(byte MarginPriceType) {
		this.io.setByteField(this, 2, MarginPriceType);
		return this;
	}

	public void setMarginPriceType(char marginPriceType) {
		MarginPriceType((byte)marginPriceType);
	}

	/**
	 * \u76c8\u4e8f\u7b97\u6cd5
	 */
	@Field(3) 
	private byte Algorithm() {
		return this.io.getByteField(this, 3);
	}

	public char getAlgorithm() {
		return (char)Algorithm();
	}

	/**
	 * \u76c8\u4e8f\u7b97\u6cd5
	 */
	@Field(3) 
	private CThostFtdcBrokerTradingParamsField Algorithm(byte Algorithm) {
		this.io.setByteField(this, 3, Algorithm);
		return this;
	}

	public void setAlgorithm(char algorithm) {
		Algorithm((byte)algorithm);
	}

	/**
	 * \u53ef\u7528\u662f\u5426\u5305\u542b\u5e73\u4ed3\u76c8\u5229
	 */
	@Field(4) 
	private byte AvailIncludeCloseProfit() {
		return this.io.getByteField(this, 4);
	}

	public char getAvailIncludeCloseProfit() {
		return (char)AvailIncludeCloseProfit();
	}

	/**
	 * \u53ef\u7528\u662f\u5426\u5305\u542b\u5e73\u4ed3\u76c8\u5229
	 */
	@Field(4) 
	private CThostFtdcBrokerTradingParamsField AvailIncludeCloseProfit(byte AvailIncludeCloseProfit) {
		this.io.setByteField(this, 4, AvailIncludeCloseProfit);
		return this;
	}

	public void setAvailIncludeCloseProfit(char availIncludeCloseProfit) {
		AvailIncludeCloseProfit((byte)availIncludeCloseProfit);
	}

	public CThostFtdcBrokerTradingParamsField(Pointer pointer) {
		super(pointer);
	}

}
