package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:789</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class FeedDescription extends Structure {
	/** data source version */
	public int version;
	/**
	 * data source name<br>
	 * C type : char[128]
	 */
	public byte[] name = new byte[128];
	/**
	 * copyright string<br>
	 * C type : char[128]
	 */
	public byte[] copyright = new byte[128];
	/**
	 * data source web<br>
	 * C type : char[128]
	 */
	public byte[] web = new byte[128];
	/**
	 * data source email<br>
	 * C type : char[128]
	 */
	public byte[] email = new byte[128];
	/**
	 * feeder server<br>
	 * C type : char[128]
	 */
	public byte[] server = new byte[128];
	/**
	 * default feeder name<br>
	 * C type : char[32]
	 */
	public byte[] username = new byte[32];
	/**
	 * default feeder password<br>
	 * C type : char[32]
	 */
	public byte[] userpass = new byte[32];
	/** feeder modes (enum FeederModes) */
	public int modes;
	/**
	 * feeder description<br>
	 * C type : char[512]
	 */
	public byte[] description = new byte[512];
	/**
	 * datafeed name in license<br>
	 * C type : char[32]
	 */
	public byte[] module = new byte[32];
	/**
	 * reserved<br>
	 * C type : int[54]
	 */
	public int[] reserved = new int[54];
	public FeedDescription() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("version", "name", "copyright", "web", "email", "server", "username", "userpass", "modes", "description", "module", "reserved");
	}
	public FeedDescription(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FeedDescription implements Structure.ByReference {
		
	};
	public static class ByValue extends FeedDescription implements Structure.ByValue {
		
	};
}