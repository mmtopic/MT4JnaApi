package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:672</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ConGatewayAccount extends Structure {
	/** enable flag 0 - disabled, 1 - enabled */
	public int enable;
	/**
	 * public name<br>
	 * C type : char[64]
	 */
	public byte[] name = new byte[64];
	/** internal id */
	public int id;
	/** type (obsolete) */
	public int type;
	/** STP MT4 login */
	public int login;
	/**
	 * MT4 server address<br>
	 * C type : char[64]
	 */
	public byte[] address = new byte[64];
	/**
	 * STP MT4 password<br>
	 * C type : char[64]
	 */
	public byte[] password = new byte[64];
	/**
	 * list of logins for internal email notification<br>
	 * C type : int[8]
	 */
	public int[] notify_logins = new int[8];
	/** flag fields */
	public int flags;
	/**
	 * reserved<br>
	 * C type : int[23]
	 */
	public int[] reserved = new int[23];
	public ConGatewayAccount() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("enable", "name", "id", "type", "login", "address", "password", "notify_logins", "flags", "reserved");
	}
	public ConGatewayAccount(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ConGatewayAccount implements Structure.ByReference {
		
	};
	public static class ByValue extends ConGatewayAccount implements Structure.ByValue {
		
	};
}
