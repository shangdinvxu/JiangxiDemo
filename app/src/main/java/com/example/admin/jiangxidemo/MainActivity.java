package com.example.admin.jiangxidemo;

import android.bluetooth.BluetoothDevice;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.android.bluetoothlegatt.proltrol.dto.LPDeviceInfo;
import com.example.android.bluetoothlegatt.proltrol.dto.LPSportData;

import java.util.List;

import jiangxi.xx.Listener;
import jiangxi.xx.MyBluetoothDevice;
import jiangxi.xx.WristStrap;
import jiangxi.zchr.rd.tsmcontro.util.WristStrapData;
import jiangxi.zchr.rd.tsmcontro.util.WristStrapProcData;

public class MainActivity extends AppCompatActivity {

    private WristStrap wristStrap;
    private View button1;
    private View button2;
    private View button3;
    private View button4;
    private View button5;
    WristStrapData wristStrapData = new WristStrapData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
        wristStrap = new WristStrap(MainActivity.this,new Mylistener()){};
    }

    private void initView() {
        button1 = findViewById(R.id.button6);
        button2 = findViewById(R.id.button7);
        button3 = findViewById(R.id.button8);
        button4 = findViewById(R.id.button9);
        button5 = findViewById(R.id.button10);
    }

    private void initListener() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wristStrap.scanfDevice();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wristStrap.connectDevice(wristStrapData);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wristStrap.powerOn();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wristStrap.disconnectDevice();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wristStrap.isConnectDevice();
            }
        });

    }


    public class Mylistener extends Listener{
        @Override
        public void connectLost() {
            super.connectLost();
        }

        @Override
        public void scanDevice(BluetoothDevice device) {
            super.scanDevice(device);
        }

        @Override
        public void connectSuccess() {
            super.connectSuccess();
        }

        @Override
        protected void saveSportData(List<LPSportData> originalSportDatas) {
            super.saveSportData(originalSportDatas);
        }

        @Override
        public void powerOnResult(boolean obj) {
            super.powerOnResult(obj);
        }

        @Override
        public void getDeviceInfoNew(LPDeviceInfo latestDeviceInfo) {
            super.getDeviceInfoNew(latestDeviceInfo);
        }

    }


}
