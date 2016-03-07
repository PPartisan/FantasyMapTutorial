package com.werdpressed.partisan.fantasymaptutorial.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

public final class UserInterfaceUtils {

    private UserInterfaceUtils() { throw new AssertionError(); }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public static int getUiFlags(int buildVersion) {

        int flags = 0;

        if (buildVersion >= Build.VERSION_CODES.KITKAT) {
            flags = View.SYSTEM_UI_FLAG_IMMERSIVE;
        }

        if (buildVersion >= Build.VERSION_CODES.JELLY_BEAN) {
            flags = (flags
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_FULLSCREEN);
        }

        return flags;

    }

}
