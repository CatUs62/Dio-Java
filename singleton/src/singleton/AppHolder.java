package singleton;

public class AppHolder {
    private static class InstanceHolder {
        public static AppHolder inAppHolder = new AppHolder();
    }

    private AppHolder() {
        super();
    }

    public static AppHolder getAppHolder() {
        return InstanceHolder.inAppHolder;
    }
}
