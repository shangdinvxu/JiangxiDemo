package jiangxi.xx;


import android.bluetooth.BluetoothDevice;
import android.content.Context;

import com.example.android.bluetoothlegatt.BLEHandler;
import com.example.android.bluetoothlegatt.BLEListHandler;
import com.example.android.bluetoothlegatt.BLEListProvider;
import com.example.android.bluetoothlegatt.BLEProvider;
import com.example.android.bluetoothlegatt.proltrol.dto.LPDeviceInfo;
import com.example.android.bluetoothlegatt.proltrol.dto.LPSportData;

import java.util.List;

import jiangxi.zchr.rd.tsmcontro.util.WristStrapData;


public class WristStrap {
    private Context context;
    public BLEProvider bleProvider;
    public BLEListProvider bleListProvider;
    public Listener listener ;

    public WristStrap(Context context,Listener listener) {
        this.context = context;
        this.listener = listener;
        initBleProvider(context);
        initBleListProvider(context);
    }

    private void initBleListProvider(Context context) {
        BLEListHandler handler = new BLEListHandler(context) {
            @Override
            protected void handleData(BluetoothDevice device) {
                listener.scanDevice(device);
            }
        };
        bleListProvider = new BLEListProvider(context, handler);
    }


    private void initBleProvider(Context context) {
        bleProvider = new BLEProvider(context) {
            @Override
            protected void saveSportSync2DB(List<LPSportData> originalSportDatas) {
                super.saveSportSync2DB(originalSportDatas);
                listener.saveSportData(originalSportDatas);

            }
        };

        bleProvider.setProviderHandler(new BLEHandler(context) {
            @Override
            protected BLEProvider getProvider() {
                return bleProvider;
            }

            @Override
            protected void handleConnectSuccessMsg() {
                super.handleConnectSuccessMsg();
                listener.connectSuccess();
            }

            @Override
            protected void handleConnectLostMsg() {
                super.handleConnectLostMsg();
                listener.connectLost();
            }

            @Override
            protected void notifyForOpenSmc(Object obj) {
                super.notifyForOpenSmc(obj);
                listener.powerOnResult((boolean)obj);
            }

            @Override
            protected void notifyFor0x13ExecSucess_D(LPDeviceInfo latestDeviceInfo) {
                super.notifyFor0x13ExecSucess_D(latestDeviceInfo);
                listener.getDeviceInfoNew(latestDeviceInfo);
            }
        });
    }

    //获取设备信息
    public void getAllDeviceInfoNew(int userId)
    {
        LPDeviceInfo lpDeviceInfo = new LPDeviceInfo();
        lpDeviceInfo.userId = userId ;
        bleProvider.getAllDeviceInfoNew(context,lpDeviceInfo);
    }

    //获取运动数据
    public void getSportDataNew()
    {
        bleProvider.getSportDataNew(context);
    }

    //扫描设备
    public void scanfDevice() {
        bleListProvider.scanDeviceList();
    }


    //停止扫描
    public void stopScanfDevice() {
        bleListProvider.stopScan();
    }

    //连接设备
    public void connectDevice(WristStrapData i_objWristStrap) {
        bleProvider.connect_mac(i_objWristStrap.getWristStrapId());
    }

    //断开连接设备
    public void disconnectDevice() {
        bleProvider.disConnect();
    }

    //是否已连接设备
    public boolean isConnectDevice() {
        return bleProvider.isConnectedAndDiscovered();
    }

    //上电
    public void powerOn() {
        bleProvider.openSmartCard(context);
    }

    //Apdu
    public byte[] apduCommunication(byte[] i_byteSend) {
        byte[] bytes = bleProvider.sendApdu(i_byteSend);
        return bytes;
    }

    //下电
    public void powerOff() {
        bleProvider.closeSmartCard(context);
    }


}
