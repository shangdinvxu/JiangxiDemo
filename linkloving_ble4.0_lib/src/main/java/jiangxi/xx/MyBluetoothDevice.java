package jiangxi.xx;


import android.bluetooth.BluetoothDevice;

/**
 * Created by Administrator on 2016/7/8.
 */

public class MyBluetoothDevice implements Comparable<MyBluetoothDevice>{

    private boolean click;
    private int mRaw;

    private BluetoothDevice mBluetoothDevice;

    public MyBluetoothDevice(BluetoothDevice bluetoothDevice, int raw) {
        mBluetoothDevice = bluetoothDevice;
        this.mRaw=raw;
    }

    public String getName(){
        return getBluetoothDevice().getName();
    }
    public String getAdress(){
        return getBluetoothDevice().getAddress();
    }

    @Override
    public int compareTo(MyBluetoothDevice dateBean) {
//        return ((Integer)mRaw).compareTo(dateBean.getRaw());
        return ((Integer)dateBean.getRaw()).compareTo((Integer)mRaw);
    }
    public BluetoothDevice getBluetoothDevice(){
        return mBluetoothDevice;
    }
    public int getRaw() {
        return mRaw;
    }

    public void setRaw(int raw) {
        mRaw = raw;
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }
}
