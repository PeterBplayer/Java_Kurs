package dziedziczenie;

import dziedziczenie.offsprings.AndroidApp;
import dziedziczenie.offsprings.IphoneApp;

public class AppChecker {
    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("MediLux");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("MediLux");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
