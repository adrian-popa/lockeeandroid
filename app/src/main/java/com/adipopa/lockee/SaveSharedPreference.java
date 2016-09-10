package com.adipopa.lockee;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SaveSharedPreference {
    static final String PREF_LOGIN_STATUS = "logged in";
    static final String PREF_SHARED_ID = "shared";

    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setLoginStatus(Context ctx, String userName) {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_LOGIN_STATUS, userName);
        editor.apply();
    }

    public static String getLoginStatus(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_LOGIN_STATUS, "not logged");
    }

    public static void setSharedID(Context ctx, String shareID){
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_SHARED_ID, shareID);
        editor.apply();
    }

    public static String getSharedID(Context ctx) {
        return getSharedPreferences(ctx).getString(PREF_SHARED_ID, "not shared");
    }
}
