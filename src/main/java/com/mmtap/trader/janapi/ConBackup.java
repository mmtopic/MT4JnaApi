package com.mmtap.trader.janapi;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * +------------------------------------------------------------------+<br>
 * <i>native declaration : MT4ManagerAPI.h:169</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public abstract class ConBackup extends Structure {
	/**
	 * path to backup<br>
	 * C type : char[256]
	 */
	public byte[] fullbackup_path = new byte[256];
	/** full backup's period-BACKUP_1HOUR, BACKUP_4HOURS, BACKUP_1DAY */
	public int fullbackup_period;
	/** full backup's store time-BU_STORE_1MONTH, BU_STORE_3MONTHS, BU_STORE_6MONTHS,BU_STORE_1YEAR */
	public int fullbackup_store;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** full backup timeshift (minutes) */
	public short fullbackup_shift;
	/**
	 * path to external processing directory<br>
	 * C type : char[256]
	 */
	public byte[] external_path = new byte[256];
	/** period of archive backup-ARC_BACKUP_5MIN, ARC_BACKUP_15MIN, ARC_BACKUP_30MIN, ARC_BACKUP_1HOUR */
	public int archive_period;
	/** archive backup's store time-ARC_STORE_1WEEK, ARC_STORE_2WEEKS, ARC_STORE_1MONTH, ARC_STORE_3MONTH, ARC_STORE_6MONTH */
	public int archive_store;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/**
	 * comma separated list of exported securities<br>
	 * C type : char[512]
	 */
	public byte[] export_securities = new byte[512];
	/**
	 * path to export script<br>
	 * C type : char[256]
	 */
	public byte[] export_path = new byte[256];
	/** export period-enumeration EXPORT_1MIN, EXPORT_5MIN, EXPORT_15MIN, EXPORT_30MIN,EXPORT_1HOUR */
	public int export_period;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	/** server role { WATCH_STAND_ALONE, WATCH_MASTER, WATCH_SLAVE } */
	public int watch_role;
	/**
	 * slave server password<br>
	 * C type : char[16]
	 */
	public byte[] watch_password = new byte[16];
	/**
	 * opposite server IP address and port<br>
	 * C type : char[24]
	 */
	public byte[] watch_opposite = new byte[24];
	/** opposite server IP */
	public int watch_ip;
	/** shift of archive backup time (in minutes) */
	public byte archive_shift;
	/** watch dog state */
	public byte watch_state;
	/** watch dog failover mode */
	public byte watch_failover;
	/** watch dog timeout */
	public byte watch_timeout;
	/** watch dog login */
	public int watch_login;
	/** Conversion Error : time_t (Primitive without known type for this runtime: NativeTime) */
	public ConBackup() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("fullbackup_path", "fullbackup_period", "fullbackup_store", "fullbackup_shift", "external_path", "archive_period", "archive_store", "export_securities", "export_path", "export_period", "watch_role", "watch_password", "watch_opposite", "watch_ip", "archive_shift", "watch_state", "watch_failover", "watch_timeout", "watch_login");
	}
	public ConBackup(Pointer peer) {
		super(peer);
	}
	public static abstract class ByReference extends ConBackup implements Structure.ByReference {
		
	};
	public static abstract class ByValue extends ConBackup implements Structure.ByValue {
		
	};
}
