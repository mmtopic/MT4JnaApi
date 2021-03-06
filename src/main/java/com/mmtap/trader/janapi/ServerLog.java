package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:1421</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ServerLog extends Structure {
	/** code */
	public int code;
	/**
	 * time<br>
	 * C type : char[24]
	 */
	public byte[] time = new byte[24];
	/**
	 * ip<br>
	 * C type : char[256]
	 */
	public byte[] ip = new byte[256];
	/**
	 * message<br>
	 * C type : char[512]
	 */
	public byte[] message = new byte[512];
	public ServerLog() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("code", "time", "ip", "message");
	}
	/**
	 * @param code code<br>
	 * @param time time<br>
	 * C type : char[24]<br>
	 * @param ip ip<br>
	 * C type : char[256]<br>
	 * @param message message<br>
	 * C type : char[512]
	 */
	public ServerLog(int code, byte time[], byte ip[], byte message[]) {
		super();
		this.code = code;
		if ((time.length != this.time.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.time = time;
		if ((ip.length != this.ip.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.ip = ip;
		if ((message.length != this.message.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.message = message;
	}
	public ServerLog(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ServerLog implements Structure.ByReference {
		
	};
	public static class ByValue extends ServerLog implements Structure.ByValue {
		
	};
}
