package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:875</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public abstract class TickRequest extends Structure {
	/**
	 * symbol<br>
	 * C type : char[12]
	 */
	public byte[] symbol = new byte[12];
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** TICK_FLAG_* flags */
	public byte flags;
	public TickRequest() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("symbol", "flags");
	}
	/**
	 * @param symbol symbol<br>
	 * C type : char[12]<br>
	 * @param flags TICK_FLAG_* flags
	 */
	public TickRequest(byte symbol[], byte flags) {
		super();
		if ((symbol.length != this.symbol.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.symbol = symbol;
		this.flags = flags;
	}
	public TickRequest(Pointer peer) {
		super(peer);
	}
	public static abstract class ByReference extends TickRequest implements Structure.ByReference {
		
	};
	public static abstract class ByValue extends TickRequest implements Structure.ByValue {
		
	};
}
