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

public class CThostFtdcBrokerTradingAlgosField extends StructObject {
	public CThostFtdcBrokerTradingAlgosField() {
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
	 * \u4ea4\u6613\u6240\u4ee3\u7801
	 */
	@Array({9}) 
	@Field(1) 
	private Pointer<Byte> ExchangeID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({9})
	@Field(1)
	public void setExchangeID(String exchangeID) {
		this.io.getPointerField(this, 1).setCString(exchangeID);
	}

	public String getExchangeID() {
		return ExchangeID().getCString();
	}

	/**
	 * \u5408\u7ea6\u4ee3\u7801
	 */
	@Array({31}) 
	@Field(2) 
	private Pointer<Byte> InstrumentID() {
		return this.io.getPointerField(this, 2);
	}

	@Array({31})
	@Field(2)
	public void setInstrumentID(String instrumentID) {
		this.io.getPointerField(this, 2).setCString(instrumentID);
	}

	public String getInstrumentID() {
		return InstrumentID().getCString();
	}

	/**
	 * \u6301\u4ed3\u5904\u7406\u7b97\u6cd5\u7f16\u53f7
	 */
	@Field(3) 
	private byte HandlePositionAlgoID() {
		return this.io.getByteField(this, 3);
	}

	public char getHandlePositionAlgoID() {
		return (char)HandlePositionAlgoID();
	}

	/**
	 * \u6301\u4ed3\u5904\u7406\u7b97\u6cd5\u7f16\u53f7
	 */
	@Field(3) 
	private CThostFtdcBrokerTradingAlgosField HandlePositionAlgoID(byte HandlePositionAlgoID) {
		this.io.setByteField(this, 3, HandlePositionAlgoID);
		return this;
	}

	public void setHandlePositionAlgoID(char handlePositionAlgoID) {
		HandlePositionAlgoID((byte)handlePositionAlgoID);
	}

	/**
	 * \u5bfb\u627e\u4fdd\u8bc1\u91d1\u7387\u7b97\u6cd5\u7f16\u53f7
	 */
	@Field(4) 
	private byte FindMarginRateAlgoID() {
		return this.io.getByteField(this, 4);
	}

	public char getFindMarginRateAlgoID() {
		return (char)FindMarginRateAlgoID();
	}

	/**
	 * \u5bfb\u627e\u4fdd\u8bc1\u91d1\u7387\u7b97\u6cd5\u7f16\u53f7
	 */
	@Field(4) 
	private CThostFtdcBrokerTradingAlgosField FindMarginRateAlgoID(byte FindMarginRateAlgoID) {
		this.io.setByteField(this, 4, FindMarginRateAlgoID);
		return this;
	}

	public void setFindMarginRateAlgoID(char findMarginRateAlgoID) {
		FindMarginRateAlgoID((byte)findMarginRateAlgoID);
	}

	/**
	 * \u8d44\u91d1\u5904\u7406\u7b97\u6cd5\u7f16\u53f7
	 */
	@Field(5) 
	private byte HandleTradingAccountAlgoID() {
		return this.io.getByteField(this, 5);
	}

	public char getHandleTradingAccountAlgoID() {
		return (char)HandleTradingAccountAlgoID();
	}

	/**
	 * \u8d44\u91d1\u5904\u7406\u7b97\u6cd5\u7f16\u53f7
	 */
	@Field(5) 
	private CThostFtdcBrokerTradingAlgosField HandleTradingAccountAlgoID(byte HandleTradingAccountAlgoID) {
		this.io.setByteField(this, 5, HandleTradingAccountAlgoID);
		return this;
	}

	public void setHandleTradingAccountAlgoID(char handleTradingAccountAlgoID) {
		HandleTradingAccountAlgoID((byte)handleTradingAccountAlgoID);
	}

	public CThostFtdcBrokerTradingAlgosField(Pointer pointer) {
		super(pointer);
	}

}
