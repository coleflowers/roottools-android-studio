# roottools-android-studio
判断Android设备是否已Root

-----
Code base on [softctrl/roottools][1] 

Usage
-----

Add it to your build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and:

```gradle
dependencies {
    compile 'com.github.coleflowers:roottools-android-studio:v1.0'
}
```

and:
```java
import com.stericson.RootTools.RootTools;
```
```java
if (RootTools.isRootAvailable()){

} else {

}

  [1]: https://github.com/softctrl/roottools