cd C:\Program Files (x86)\Jenkins\workspace\Job1\Pro\bin
adb -r install Pro.apk
cd C:\Program Files (x86)\Jenkins\workspace\Job1\ProTest\bin
adb -r install ProTest.apk
adb shell am instrument -w com.example.pro.test/android.test.InstrumentationTestRunner
