package zhou.v2ex;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by 州 on 2015/7/18 0018.
 */
public class Z2EX extends Application {

    public static final String HOT_TOPIC_NAME = "hot.cache";
    public static final String LATEST_TOPIC_NAME = "latest.cache";
    public static final String NODE_NAME = "node.cache";

    private static Z2EX z2EX;

    @Override
    public void onCreate() {
        super.onCreate();
        z2EX = this;
    }

    public static Z2EX getInstance() {
        return z2EX;
    }

    public boolean isNetworkConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null) {
            return networkInfo.isAvailable();
        }
        return false;
    }
}
