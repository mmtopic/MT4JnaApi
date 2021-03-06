package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:704</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ConGatewayRule extends Structure {
	/** enable flag 0 - disabled, 1 - enabled */
	public int enable;
	/**
	 * public name<br>
	 * C type : char[64]
	 */
	public byte[] name = new byte[64];
	/**
	 * symbol\symbols mask\symbols group name<br>
	 * C type : char[128]
	 */
	public byte[] request_symbol = new byte[128];
	/**
	 * group name or group mask<br>
	 * C type : char[128]
	 */
	public byte[] request_group = new byte[128];
	/**
	 * reserved<br>
	 * C type : int[32]
	 */
	public int[] request_reserved = new int[32];
	/**
	 * account name<br>
	 * C type : char[64]
	 */
	public byte[] exe_account_name = new byte[64];
	/** account internal id */
	public int exe_account_id;
	/** max. devation */
	public int exe_max_deviation;
	/** max profit slippage in pips */
	public int exe_max_profit_slippage;
	/** max profit slippage volume in lots */
	public int exe_max_profit_slippage_lots;
	/** max losing slippage in pips */
	public int exe_max_losing_slippage;
	/** max losing slippage volume in lots */
	public int exe_max_losing_slippage_lots;
	/** account current position */
	public int exe_account_pos;
	/** coverage percentage */
	public int exe_volume_percent;
	/**
	 * reserved<br>
	 * C type : int[26]
	 */
	public int[] exe_reserved = new int[26];
	public ConGatewayRule() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("enable", "name", "request_symbol", "request_group", "request_reserved", "exe_account_name", "exe_account_id", "exe_max_deviation", "exe_max_profit_slippage", "exe_max_profit_slippage_lots", "exe_max_losing_slippage", "exe_max_losing_slippage_lots", "exe_account_pos", "exe_volume_percent", "exe_reserved");
	}
	public ConGatewayRule(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ConGatewayRule implements Structure.ByReference {
		
	};
	public static class ByValue extends ConGatewayRule implements Structure.ByValue {
		
	};
}
