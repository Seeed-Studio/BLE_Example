## BLE Example

### Introduction
![BLE Example](http://www.seeedstudio.com/wiki/images/e/e5/Ble_UUIDSelected.png)<br>
This android app is used to build communication with BLE Slave device. You can send/receive message with these devices, such as [Xadow BLE](http://www.seeedstudio.com/depot/Xadow-BLE-p-1727.html) or [Xadow BLE Slave](http://www.seeedstudio.com/depot/Xadow-BLE-Slave-p-1546.html). It will help you to increase the understanding of BLE.
### Usage
####1. Install the APK

1. Install the APK file(**BLE_Example.apk**) in bin/ folder, you need to make sure the android verison of your smart phone is higher than 4.3. 
2. After successful install, click the ico of the APK, and you will see the UI as follow.<br>
![BLE UI](http://www.seeedstudio.com/wiki/images/a/a7/Ble_start.png)<br>



####2. Scan for slave devices

1.click the **start** button in the center of UI, it will start to scan for BLE slave devices. just like follow:<br>
![BLE Scan](http://www.seeedstudio.com/wiki/images/0/03/Ble_scan.png)<br>
<br>
2. The scan period will be up to 8 seconds, when it finished, the scan result will be show in the following dialog:<br>
![BLE Scan Result](http://www.seeedstudio.com/wiki/images/2/2d/Ble_scanResult.png)<br>
<br>
3. click the BLE device that you want to connect, then your mobilephone will try to connect the specified device automatically.<br>

####3. Select specified UUID
1. If you can connect the ble slave device successfully, the UI will be as follow:<br>
![BLE Select UUID](http://www.seeedstudio.com/wiki/images/1/13/Ble_selectUUID.png)<br>
You will find that the UUID is null and you need to pick up one from the list of **Characteristics UUID List**
2. Here we choose the UUID:0000ffe1-0000-1000-8000-00805f9b34fb, and the UI turns to:<br>
![BLE UUID Selected](http://www.seeedstudio.com/wiki/images/e/e5/Ble_UUIDSelected.png)<br>

####4. Send and recv data
OK, the exciting moment has come! Input the command(data) to the textbox, and then click the Send button, the message will be send to the specified ble devices. and the recv textbox will show the message from the slave devices, just as follow. Have fun!<br>
![BLE Send Data](http://www.seeedstudio.com/wiki/images/f/ff/Ble_sendData.png)
![BLE Recv Data](http://www.seeedstudio.com/wiki/images/7/7f/Ble_recvData.png)<br>


----
This software is written by lawliet zou (![](http://www.seeedstudio.com/wiki/images/f/f8/Email-lawliet.zou.jpg)) for [Seeed Technology Inc.](http://www.seeed.cc) and is licensed under The GPL v2 License. Check License.txt for more information.<br>

Contributing to this software is warmly welcomed. You can do this basically by [forking](https://help.github.com/articles/fork-a-repo), committing modifications and then [pulling requests](https://help.github.com/articles/using-pull-requests) (follow the links above for operating guide). Adding change log and your contact into file header is encouraged.<br>
Thanks for your contribution.

Seeed is a hardware innovation platform for makers to grow inspirations into differentiating products. By working closely with technology providers of all scale, Seeed provides accessible technologies with quality, speed and supply chain knowledge. When prototypes are ready to iterate, Seeed helps productize 1 to 1,000 pcs using in-house engineering, supply chain management and agile manufacture forces. Seeed also team up with incubators, Chinese tech ecosystem, investors and distribution channels to portal Maker startups beyond.

[![Analytics](https://ga-beacon.appspot.com/UA-46589105-3/BLE_Example)](https://github.com/igrigorik/ga-beacon)

