package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:1458</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class BalanceDiff extends Structure {
	public int login;
	public double diff;
	public BalanceDiff() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("login", "diff");
	}
	public BalanceDiff(int login, double diff) {
		super();
		this.login = login;
		this.diff = diff;
	}
	public BalanceDiff(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends BalanceDiff implements Structure.ByReference {
		
	};
	public static class ByValue extends BalanceDiff implements Structure.ByValue {
		
	};
}
