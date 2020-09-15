package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:381</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ConHoliday extends Structure {
	/** year */
	public int year;
	/** month */
	public int month;
	/** day */
	public int day;
	/** work time-from & to (minutes) */
	public int from;
	/** work time-from & to (minutes) */
	public int to;
	/**
	 * security name or symbol's group name or "All"<br>
	 * C type : char[32]
	 */
	public byte[] symbol = new byte[32];
	/**
	 * description<br>
	 * C type : char[128]
	 */
	public byte[] description = new byte[128];
	/** enable */
	public int enable;
	/**
	 * reserved<br>
	 * C type : int[13]
	 */
	public int[] reserved = new int[13];
	/**
	 * internal data<br>
	 * C type : ConHoliday*
	 */
	public ConHoliday.ByReference next;
	public ConHoliday() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("year", "month", "day", "from", "to", "symbol", "description", "enable", "reserved", "next");
	}
	public ConHoliday(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ConHoliday implements Structure.ByReference {
		
	};
	public static class ByValue extends ConHoliday implements Structure.ByValue {
		
	};
}