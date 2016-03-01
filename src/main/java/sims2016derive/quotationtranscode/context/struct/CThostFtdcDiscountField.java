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
/**
 * 会员资金折扣
 * @author Hraink E-mail:Hraink@Gmail.com
 * @version 2013-1-31 下午11:24:11
 */

public class CThostFtdcDiscountField extends StructObject {
	public CThostFtdcDiscountField() {
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
	 * \u6295\u8d44\u8005\u8303\u56f4
	 */
	@Field(1) 
	private byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}

	public char getInvestorRange() {
		return (char)InvestorRange();
	}

	/**
	 * \u6295\u8d44\u8005\u8303\u56f4
	 */
	@Field(1) 
	private CThostFtdcDiscountField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}

	public void setInvestorRange(char investorRange) {
		InvestorRange((byte)investorRange);
	}

	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801
	 */
	@Array({13}) 
	@Field(2) 
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({13})
	@Field(2)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 2).setCString(investorID);
	}

	public String getInvestorID() {
		return InvestorID().getCString();
	}

	/**
	 * \u8d44\u91d1\u6298\u6263\u6bd4\u4f8b
	 */
	@Field(3) 
	private double Discount() {
		return this.io.getDoubleField(this, 3);
	}

	public double getDiscount() {
		return Discount();
	}

	/**
	 * \u8d44\u91d1\u6298\u6263\u6bd4\u4f8b
	 */
	@Field(3) 
	private CThostFtdcDiscountField Discount(double Discount) {
		this.io.setDoubleField(this, 3, Discount);
		return this;
	}

	public void setDiscount(double discount) {
		Discount(discount);
	}

	public CThostFtdcDiscountField(Pointer pointer) {
		super(pointer);
	}

}
