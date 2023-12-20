package singleton;

public class App {
    private static App insApp;

    private App(){
        super();
    }

    public static App getApp(){
        if(insApp == null){
            insApp = new App();
        }

        return insApp;
    }
}
