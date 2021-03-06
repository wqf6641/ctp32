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

public class CThostFtdcEWarrantOffsetField extends StructObject {
	public CThostFtdcEWarrantOffsetField() {
		super();
	}

	/**
	 * \u4ea4\u6613\u65e5\u671f
	 */
	@Array({9}) 
	@Field(0) 
	private Pointer<Byte> TradingDay() {
		return this.io.getPointerField(this, 0);
	}

	@Array({9})
	@Field(0)
	public void setTradingDay(String tradingDay) {
		this.io.getPointerField(this, 0).setCString(tradingDay);
	}

	public String getTradingDay() {
		return TradingDay().getCString();
	}

	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801
	 */
	@Array({11}) 
	@Field(1) 
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({11})
	@Field(1)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 1).setCString(brokerID);
	}

	public String getBrokerID() {
		return BrokerID().getCString();
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
	 * \u4ea4\u6613\u6240\u4ee3\u7801
	 */
	@Array({9}) 
	@Field(3) 
	private Pointer<Byte> ExchangeID() {
		return this.io.getPointerField(this, 3);
	}

	@Array({9})
	@Field(3)
	public void setExchangeID(String exchangeID) {
		this.io.getPointerField(this, 3).setCString(exchangeID);
	}

	public String getExchangeID() {
		return ExchangeID().getCString();
	}

	/**
	 * \u5408\u7ea6\u4ee3\u7801
	 */
	@Array({31}) 
	@Field(4) 
	private Pointer<Byte> InstrumentID() {
		return this.io.getPointerField(this, 4);
	}

	@Array({31})
	@Field(4)
	public void setInstrumentID(String instrumentID) {
		this.io.getPointerField(this, 4).setCString(instrumentID);
	}

	public String getInstrumentID() {
		return InstrumentID().getCString();
	}

	/**
	 * \u4e70\u5356\u65b9\u5411
	 */
	@Field(5) 
	private byte Direction() {
		return this.io.getByteField(this, 5);
	}

	public char getDirection() {
		return (char)Direction();
	}

	/**
	 * \u4e70\u5356\u65b9\u5411
	 */
	@Field(5) 
	private CThostFtdcEWarrantOffsetField Direction(byte Direction) {
		this.io.setByteField(this, 5, Direction);
		return this;
	}

	public void setDirection(char direction) {
		Direction((byte)direction);
	}

	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7
	 */
	@Field(6) 
	private byte HedgeFlag() {
		return this.io.getByteField(this, 6);
	}

	public char getHedgeFlag() {
		return (char)HedgeFlag();
	}

	/**
	 * \u6295\u673a\u5957\u4fdd\u6807\u5fd7
	 */
	@Field(6) 
	private CThostFtdcEWarrantOffsetField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 6, HedgeFlag);
		return this;
	}

	public void setHedgeFlag(char hedgeFlag) {
		HedgeFlag((byte)hedgeFlag);
	}

	/**
	 * \u6570\u91cf
	 */
	@Field(7) 
	private int Volume() {
		return this.io.getIntField(this, 7);
	}

	public int getVolume() {
		return Volume();
	}

	/**
	 * \u6570\u91cf
	 */
	@Field(7) 
	private CThostFtdcEWarrantOffsetField Volume(int Volume) {
		this.io.setIntField(this, 7, Volume);
		return this;
	}

	public void setVolume(int volume) {
		Volume(volume);
	}

	public CThostFtdcEWarrantOffsetField(Pointer pointer) {
		super(pointer);
	}

}

