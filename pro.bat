cd D:\Mohan\One\adt-bundle\adt-bundle-windows-x86-20140702\sdk\tools
emulator -avd Nexus7
emulator -avd Android4.0.3
cd D:\Mohan\One\workspace\Pro\bin
adb -s emulator-5554 install Pro.apk
adb -s emulator-5556 install Pro.apk
echo Wait until the emulator opens
cd D:\Mohan\One\workspace\ProTest\bin
adb -s emulator-5554 install ProTest.apk
adb -s emulator-5556 install ProTest.apk
adb -s emulator-5554 shell am instrument -w com.example.pro.test/android.test.InstrumentationTestRunner
adb -s emulator-5556 shell am instrument -w com.example.pro.test/android.test.InstrumentationTestRunner
cd D:\Mohan\One\workspace\Pro
mvn android:emulator-stop
