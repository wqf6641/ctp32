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

public class CThostFtdcRspInfoField extends StructObject {
	public CThostFtdcRspInfoField() {
		super();
	}

	/**
	 * \u9519\u8bef\u4ee3\u7801
	 */
	@Field(0) 
	private int ErrorID() {
		return this.io.getIntField(this, 0);
	}

	public int getErrorID() {
		return ErrorID();
	}

	/**
	 * \u9519\u8bef\u4ee3\u7801
	 */
	@Field(0) 
	private CThostFtdcRspInfoField ErrorID(int ErrorID) {
		this.io.setIntField(this, 0, ErrorID);
		return this;
	}

	public void setErrorID(int errorID) {
		ErrorID(errorID);
	}

	/**
	 * \u9519\u8bef\u4fe1\u606f
	 */
	@Array({81}) 
	@Field(1) 
	private Pointer<Byte> ErrorMsg() {
		return this.io.getPointerField(this, 1);
	}

	@Array({81})
	@Field(1)
	public void setErrorMsg(String errorMsg) {
		this.io.getPointerField(this, 1).setCString(errorMsg);
	}

	public String getErrorMsg() {
		return ErrorMsg().getCString();
	}

	public CThostFtdcRspInfoField(Pointer pointer) {
		super(pointer);
	}

}
