package jiangxi.zchr.rd.tsmcontro;

public class TsmContro {

	//成功
	public static final int TSM_CONTRO_SUCCESS = 0x00;

	//失败
	public static final int TSM_CONTRO_ERROR = 0x01;

	//数据错误
	public static final int TSM_CONTRO_DATA_ERROR = 0x02;

	//未知厂商
	public static final int TSM_CONTRO_UNKNOWN_SE_MANU = 0x03;

	//超时
	public static final int TSM_CONTRO_TIME_OUT = 0x04;

	//无发现设备
	public static final int TSM_CONTRO_WITCHOUT_FOUND_DEVICES = 0x05;

	//设备不存在
	public static final int TSM_CONTRO_DEVICES_NO_EXSIT = 0x06;

	//设备未接
	public static final int TSM_CONTRO_DEVICES_NON_CONNECTED = 0x07;

	/******************* 安全级别 *******************/

	// 无安全级别
	public static final byte SECURITY_LEVEL_NONE = (byte) 0x00;

	// C-MAC安全级别

	public static final byte SECURITY_LEVEL_CMAC = (byte) 0x01;

	// C-MAC&Encryption安全级别
	public static final byte SECURITY_LEVEL_CMAC_ENCRYPTION = (byte) 0x03;

	/******************* 应用类型 *******************/

	//Applet,可执行装载文件
	public static final byte APP_TYPE_APPLET = (byte) 0x20;

	//应用实例或安全域
	public static final byte APP_TYPE_INSTANCE = (byte) 0x40;

	//只有发行者安全域
	public static final byte APP_TYPE_ISD = (byte) 0x80;

	/******************* 对象类型 *******************/

	//Applet,可执行装载文件
	public static final byte OBJ_TYPE_APPLET_INSTANS = (byte) 0x00;

	//密钥
	public static final byte OBJ_TYPE_KEY = (byte) 0x01;
}
