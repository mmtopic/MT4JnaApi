package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:690</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ConGatewayMarkup extends Structure {
	/** enable flag 0 - disabled, 1 - enabled */
	public int enable;
	/**
	 * source symbol\symbols mask\symbols group name<br>
	 * C type : char[128]
	 */
	public byte[] source = new byte[128];
	/**
	 * local symbol name<br>
	 * C type : char[12]
	 */
	public byte[] symbol = new byte[12];
	/**
	 * account name (obsolete)<br>
	 * C type : char[64]
	 */
	public byte[] account_name = new byte[64];
	/** account internal id (obsolete) */
	public int account_id;
	/** bid markup in pips */
	public int bid_markup;
	/** ask markup in pips */
	public int ask_markup;
	/**
	 * reserved<br>
	 * C type : int[16]
	 */
	public int[] reserved = new int[16];
	public ConGatewayMarkup() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("enable", "source", "symbol", "account_name", "account_id", "bid_markup", "ask_markup", "reserved");
	}
	/**
	 * @param enable enable flag 0 - disabled, 1 - enabled<br>
	 * @param source source symbol\symbols mask\symbols group name<br>
	 * C type : char[128]<br>
	 * @param symbol local symbol name<br>
	 * C type : char[12]<br>
	 * @param account_name account name (obsolete)<br>
	 * C type : char[64]<br>
	 * @param account_id account internal id (obsolete)<br>
	 * @param bid_markup bid markup in pips<br>
	 * @param ask_markup ask markup in pips<br>
	 * @param reserved reserved<br>
	 * C type : int[16]
	 */
	public ConGatewayMarkup(int enable, byte source[], byte symbol[], byte account_name[], int account_id, int bid_markup, int ask_markup, int reserved[]) {
		super();
		this.enable = enable;
		if ((source.length != this.source.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.source = source;
		if ((symbol.length != this.symbol.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.symbol = symbol;
		if ((account_name.length != this.account_name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.account_name = account_name;
		this.account_id = account_id;
		this.bid_markup = bid_markup;
		this.ask_markup = ask_markup;
		if ((reserved.length != this.reserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserved = reserved;
	}
	public ConGatewayMarkup(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ConGatewayMarkup implements Structure.ByReference {
		
	};
	public static class ByValue extends ConGatewayMarkup implements Structure.ByValue {
		
	};
}
