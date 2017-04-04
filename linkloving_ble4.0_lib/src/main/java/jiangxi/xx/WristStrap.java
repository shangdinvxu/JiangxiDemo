package jiangxi.xx;


import jiangxi.zchr.rd.tsmcontro.TsmContro;
import jiangxi.zchr.rd.tsmcontro.util.WristStrapData;
import jiangxi.zchr.rd.tsmcontro.util.WristStrapProcData;


public class WristStrap {

	public WristStrap(WristStrapProcData i_objWristStrapProcData) {



	}

	//是否正在扫描
	public boolean isScanning() {
		return true;
	}

	//扫描设备
	public int scanfDevice() {

		return TsmContro.TSM_CONTRO_SUCCESS;
	}

	//停止扫描
	public int stopScanfDevice() {

		return TsmContro.TSM_CONTRO_SUCCESS;
	}

	//连接设备
	public int connectDevice(WristStrapData i_objWristStrap) {

		return TsmContro.TSM_CONTRO_SUCCESS;
	}

	//断开连接设备
	public int disconnectDevice() {

		return TsmContro.TSM_CONTRO_SUCCESS;
	}

	//是否已连接设备
	public int isConnectDevice() {

		return TsmContro.TSM_CONTRO_SUCCESS;
	}

	//Apdu
	public int powerOn() {

		return TsmContro.TSM_CONTRO_SUCCESS;
	}

	//上电
	public byte[] apduCommunication(byte[] i_byteSend, int i_iSendOffset, int i_iSendLen) {

		byte[] byteRsp = new byte[255];

		return byteRsp;
	}

	//下电
	public int powerOff() {

		return TsmContro.TSM_CONTRO_SUCCESS;
	}
}
