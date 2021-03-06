package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * --- server datafeed<br>
 * <i>native declaration : MT4ManagerAPI.h:813</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ServerFeed extends Structure {
	/**
	 * feeder file name<br>
	 * C type : char[256]
	 */
	public byte[] file = new byte[256];
	/**
	 * feeder description<br>
	 * C type : FeedDescription
	 */
	public FeedDescription feed;
	public ServerFeed() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("file", "feed");
	}
	/**
	 * @param file feeder file name<br>
	 * C type : char[256]<br>
	 * @param feed feeder description<br>
	 * C type : FeedDescription
	 */
	public ServerFeed(byte file[], FeedDescription feed) {
		super();
		if ((file.length != this.file.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.file = file;
		this.feed = feed;
	}
	public ServerFeed(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ServerFeed implements Structure.ByReference {
		
	};
	public static class ByValue extends ServerFeed implements Structure.ByValue {
		
	};
}
