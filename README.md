# Prerequisites

⦁	Java installed on system
⦁	JAVA_HOME is set in environment variables
⦁	Command to check : java -version
⦁	- Connecting mobile devide with the usb cable 
⦁	- 200 MB to 1 GB of free space in your machine

# Step 1 : Download SDK tools
 https://developer.android.com/studio
----------------------------------------------------------------------------------
# Step 2 : Unzip folder & Extract platform tools
----------------------------------------------------------------------------------
# Step 3 : Set environment variables
 ANDROID_HOME = location of sdk folder
 Path : append path of platform_tools folder
----------------------------------------------------------------------------------
# Step 4 : Check command adb devices on command line
----------------------------------------------------------------------------------
# Step 5 : Make device ready
 - enable developer mode
 - make USB Debugging on
----------------------------------------------------------------------------------
# Step 6 : Connect device to computer system thorugh USB cable
 - if asked enable USB Debbugging
----------------------------------------------------------------------------------
# Step 7 : Run command adb devices
  adb = android debug bridge
 Check your device id displayed
- Install appium with node.js
- Install appium with with Appium Desktop Client
-	Check installation & dependencies (appium-doctor)
----------------------------------------------------------------------------------

# Step 8 : Download appium desktop client
   http://appium.io/
   https://github.com/appium/appium-desk...
----------------------------------------------------------------------------------
# Step 9 : Install appium desktop client
----------------------------------------------------------------------------------
# Step 10 : Start appium through appium desktop client
----------------------------------------------------------------------------------
#	Step 11 : To check appium installation & dependencies:
- Install appium-doctor
- https://github.com/appium/appium-doctor
- npm install appium-doctor -g
- appium-doctor -h
- appium-doctor --android
----------------------------------------------------------------------------------
# Step 12: Create a new connection 
-	Open Appium desktop client
- Start appium server
- Create new connection
- Provide desired capabilities (src/test/resources/apps/app.properties)
- Start session on Appium Dsktop
- Tap on objects to view the details
- Run the project (src/test/java/tests/Tests.java)
- See the result in the Extendible Report (/AppiumMobileTestAutomation/target/extent.html)
