package com.example.xyzreader.remote;

import android.content.Context;
import android.net.ConnectivityManager;

import static android.content.Context.CONNECTIVITY_SERVICE;

/**
 * Created by mohamed on 10/05/2017.
 */

public class CheckConnection {

    public static boolean Connection(Context context){
        return isNetworkAvailableAndConnected(context)&&isNetworkConnected(context)?true:false;
    }

    static boolean isNetworkConnected(Context context) {
    ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    return cm.getActiveNetworkInfo() != null;
       }
    public  static boolean isNetworkAvailableAndConnected(Context context){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(CONNECTIVITY_SERVICE);

        boolean isAvailable=cm.getActiveNetworkInfo()!=null;
        boolean isConnected=isAvailable && cm.getActiveNetworkInfo().isConnected();
        return isConnected;
    }
}
