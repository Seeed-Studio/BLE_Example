/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.seeedstudio.BLE;

import java.util.HashMap;
import java.util.UUID;

import android.bluetooth.BluetoothGattCharacteristic;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
	private static HashMap<String, String> attributes = new HashMap<String, String>();
	
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String HM_10_CONF = "0000ffe0-0000-1000-8000-00805f9b34fb";
	public static String BLE_TX = "0000ffe1-0000-1000-8000-00805f9b34fb";
	public static String BLE_RX = "0000ffe1-0000-1000-8000-00805f9b34fb";
	public static String BLE_SERVICE = "713d0000-503e-4c75-ba94-3148f18d941e";
    static {
        // Sample Services.
    	attributes.put("0000fff0-0000-1000-8000-00805f9b34fb", "基于自定义通信协议的蓝牙服务");
    	attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access Profile Service");
    	attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute Profile Service");
    	
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put("0000ffe1-0000-1000-8000-00805f9b34fb", "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("0000fff1-0000-1000-8000-00805f9b34fb", "第一特征值");
        attributes.put("0000fff2-0000-1000-8000-00805f9b34fb", "第二特征值");
        attributes.put("0000fff3-0000-1000-8000-00805f9b34fb", "第三特征值");
        attributes.put("0000fff4-0000-1000-8000-00805f9b34fb", "第四特征值");
        attributes.put("0000fff5-0000-1000-8000-00805f9b34fb", "第五特征值");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}