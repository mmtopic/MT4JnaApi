package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : MT4ManagerAPI.h:849</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public abstract class RateInfo extends Structure {
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** open price: 11987=119.87 */
	public int open;
	/** high,low,close shift from open */
	public int high;
	/** high,low,close shift from open */
	public int low;
	/** high,low,close shift from open */
	public int close;
	/** volume */
	public double vol;
	public RateInfo() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("open", "high", "low", "close", "vol");
	}
	/**
	 * @param open open price: 11987=119.87<br>
	 * @param high high,low,close shift from open<br>
	 * @param low high,low,close shift from open<br>
	 * @param close high,low,close shift from open<br>
	 * @param vol volume
	 */
	public RateInfo(int open, int high, int low, int close, double vol) {
		super();
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.vol = vol;
	}
	public RateInfo(Pointer peer) {
		super(peer);
	}
	public static abstract class ByReference extends RateInfo implements Structure.ByReference {
		
	};
	public static abstract class ByValue extends RateInfo implements Structure.ByValue {
		
	};
}