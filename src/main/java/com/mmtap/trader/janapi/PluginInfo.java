package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:631</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PluginInfo extends Structure {
	/**
	 * plugin name<br>
	 * C type : char[128]
	 */
	public byte[] name = new byte[128];
	/** plugin version */
	public int version;
	/**
	 * plugin copyright<br>
	 * C type : char[128]
	 */
	public byte[] copyright = new byte[128];
	/**
	 * reserved<br>
	 * C type : int[32]
	 */
	public int[] reserved = new int[32];
	public PluginInfo() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("name", "version", "copyright", "reserved");
	}
	/**
	 * @param name plugin name<br>
	 * C type : char[128]<br>
	 * @param version plugin version<br>
	 * @param copyright plugin copyright<br>
	 * C type : char[128]<br>
	 * @param reserved reserved<br>
	 * C type : int[32]
	 */
	public PluginInfo(byte name[], int version, byte copyright[], int reserved[]) {
		super();
		if ((name.length != this.name.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.name = name;
		this.version = version;
		if ((copyright.length != this.copyright.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.copyright = copyright;
		if ((reserved.length != this.reserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.reserved = reserved;
	}
	public PluginInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PluginInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends PluginInfo implements Structure.ByValue {
		
	};
}
