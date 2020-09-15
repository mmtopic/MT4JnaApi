package com.mmtap.trader.janapi;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:55</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public abstract class ConCommon extends Structure {
	/**
	 * servers owner (include version & build)<br>
	 * C type : char[128]
	 */
	public byte[] owner = new byte[128];
	/**
	 * server name<br>
	 * C type : char[32]
	 */
	public byte[] name = new byte[32];
	/** IP address assigned to the server */
	public NativeLong address;
	/** port */
	public int port;
	/** sockets timeout */
	public int timeout;
	/** demo-accounts type (DEMO_DISABLED, DEMO_PROLONG, DEMO_FIXED) */
	public int typeofdemo;
	/** demo-account living time */
	public int timeofdemo;
	/** allow daylight correction */
	public int daylightcorrection;
	/**
	 * reserved<br>
	 * C type : char[60]
	 */
	public byte[] internal = new byte[60];
	/** time zone with day light mode */
	public int timezone_real;
	/** time zone 0-GMT;-1=GMT-1;1=GMT+1; */
	public int timezone;
	/**
	 * time synchronization server address<br>
	 * C type : char[64]
	 */
	public byte[] timesync = new byte[64];
	/** minimal authorized client version */
	public int minclient;
	/** minimal authorized client version */
	public int minapi;
	/** data feed switch timeout */
	public int feeder_timeout;
	/** internal mail keep period */
	public int keepemails;
	/** end of day time-hour & minute */
	public int endhour;
	/** end of day time-hour & minute */
	public int endminute;
	/** optimization start time (minutes) */
	public int optimization_time;
	/** optimization last time */
	public int optimization_lasttime;
	/** internal variable */
	public int optimization_counter;
	/**
	 * reserved for future use<br>
	 * C type : int[8]
	 */
	public int[] optimization_unused = new int[8];
	/** enable antiflood control */
	public int antiflood;
	/** max. antiflood connections */
	public int floodcontrol;
	/** LiveUpdate mode (LIVE_UPDATE_NO,LIVE_UPDATE_ALL,LIVE_UPDATE_NO_SERVER) */
	public int liveupdate_mode;
	/** last order's ticket     (read only) */
	public int lastorder;
	/** last account's number   (read only) */
	public int lastlogin;
	/** lost commission's login (read only) */
	public int lostlogin;
	/** rollover mode (ROLLOVER_NORMAL,ROLLOVER_REOPEN_BY_CLOSE_PRICE,ROLLOVER_REOPEN_BY_BID) */
	public int rollovers_mode;
	/**
	 * path to databases<br>
	 * C type : char[256]
	 */
	public byte[] path_database = new byte[256];
	/**
	 * path to history bases<br>
	 * C type : char[256]
	 */
	public byte[] path_history = new byte[256];
	/**
	 * path to log<br>
	 * C type : char[256]
	 */
	public byte[] path_log = new byte[256];
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/**
	 * network adapters list (read-only)<br>
	 * C type : char[256]
	 */
	public byte[] adapters = new byte[256];
	/**
	 * array of avaible IP addresses<br>
	 * C type : ULONG[8]
	 */
	public NativeLong[] bind_adresses = new NativeLong[8];
	/** server version */
	public short server_version;
	/** server build */
	public short server_build;
	/**
	 * web services access list (comma separated IP addresses)<br>
	 * C type : ULONG[8]
	 */
	public NativeLong[] web_adresses = new NativeLong[8];
	/** statement generation time (STATEMENT_END_DAY,STATEMENT_START_DAY) */
	public int statement_mode;
	/** monthly statement generation day (MONTHLY_STATEMENT_END_MONTH,MONTHLY_STATEMENT_START_MONTH) */
	public int monthly_state_mode;
	/** ticks keep period */
	public int keepticks;
	/** generate statements at weekends */
	public int statement_weekend;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** last stop delay */
	public int stop_delay;
	/** last stop reason */
	public int stop_reason;
	/**
	 * account allocation URL<br>
	 * C type : char[128]
	 */
	public byte[] account_url = new byte[128];
	/** C type : int[16] */
	public int[] reserved = new int[16];
	public ConCommon() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("owner", "name", "address", "port", "timeout", "typeofdemo", "timeofdemo", "daylightcorrection", "internal", "timezone_real", "timezone", "timesync", "minclient", "minapi", "feeder_timeout", "keepemails", "endhour", "endminute", "optimization_time", "optimization_lasttime", "optimization_counter", "optimization_unused", "antiflood", "floodcontrol", "liveupdate_mode", "lastorder", "lastlogin", "lostlogin", "rollovers_mode", "path_database", "path_history", "path_log", "adapters", "bind_adresses", "server_version", "server_build", "web_adresses", "statement_mode", "monthly_state_mode", "keepticks", "statement_weekend", "stop_delay", "stop_reason", "account_url", "reserved");
	}
	public ConCommon(Pointer peer) {
		super(peer);
	}
	public static abstract class ByReference extends ConCommon implements Structure.ByReference {
		
	};
	public static abstract class ByValue extends ConCommon implements Structure.ByValue {
		
	};
}