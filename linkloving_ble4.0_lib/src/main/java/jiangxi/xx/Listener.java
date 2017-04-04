package jiangxi.xx;


import android.bluetooth.BluetoothDevice;

import com.example.android.bluetoothlegatt.proltrol.dto.LPDeviceInfo;
import com.example.android.bluetoothlegatt.proltrol.dto.LPSportData;

import java.util.List;

//继承恒宝自定义的回调基类，回调可以通过Handler方式通知Activity，值及Handler参数在WristStrapProcData里
public class Listener {

    //扫描到设备时回调
    public void scanDevice(BluetoothDevice device) {
    }

    //连接成功时回调
    public void connectSuccess() {
    }

    //断开连接后回调
    public void connectLost() {
    }

    //保存运动数据
    protected void saveSportData(List<LPSportData> originalSportDatas) {
    }

    //上电结果
    public void powerOnResult(boolean obj) {

    }

    //获取设备信息
    public void getDeviceInfoNew(LPDeviceInfo latestDeviceInfo) {

    }
}
