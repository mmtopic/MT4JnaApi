package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:1010</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public abstract class TradeRecord extends Structure {
	/** order ticket */
	public int order;
	/** owner's login */
	public int login;
	/**
	 * security<br>
	 * C type : char[12]
	 */
	public byte[] symbol = new byte[12];
	/** security precision */
	public int digits;
	/** trade command */
	public int cmd;
	/** volume */
	public int volume;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** reserved */
	public int state;
	/** open price */
	public double open_price;
	/** stop loss & take profit */
	public double sl;
	/** stop loss & take profit */
	public double tp;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** gateway order volume */
	public int gw_volume;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** trade reason */
	public byte reason;
	/**
	 * reserved fields<br>
	 * C type : char[3]
	 */
	public byte[] conv_reserv = new byte[3];
	/**
	 * convertation rates from profit currency to group deposit currency<br>
	 * C type : double[2]
	 */
	public double[] conv_rates = new double[2];
	/** commission */
	public double commission;
	/** agent commission */
	public double commission_agent;
	/** order swaps */
	public double storage;
	/** close price */
	public double close_price;
	/** profit */
	public double profit;
	/** taxes */
	public double taxes;
	/** special value used by client experts */
	public int magic;
	/**
	 * comment<br>
	 * C type : char[32]
	 */
	public byte[] comment = new byte[32];
	/** gateway order ticket */
	public int gw_order;
	/** used by MT Manager */
	public int activation;
	/** gateway order price deviation (pips) from order open price */
	public short gw_open_price;
	/** gateway order price deviation (pips) from order close price */
	public short gw_close_price;
	/** margin convertation rate (rate of convertation from margin currency to deposit one) */
	public double margin_rate;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/**
	 * for api usage<br>
	 * C type : int[4]
	 */
	public int[] api_data = new int[4];
	/**
	 * internal data<br>
	 * C type : TradeRecord*
	 */
	public TradeRecord.ByReference next;
	public TradeRecord() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("order", "login", "symbol", "digits", "cmd", "volume", "state", "open_price", "sl", "tp", "gw_volume", "reason", "conv_reserv", "conv_rates", "commission", "commission_agent", "storage", "close_price", "profit", "taxes", "magic", "comment", "gw_order", "activation", "gw_open_price", "gw_close_price", "margin_rate", "api_data", "next");
	}
	public TradeRecord(Pointer peer) {
		super(peer);
	}
	public static abstract class ByReference extends TradeRecord implements Structure.ByReference {
		
	};
	public static abstract class ByValue extends TradeRecord implements Structure.ByValue {
		
	};
}