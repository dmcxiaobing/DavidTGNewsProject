package davidtgnewsproject.qq986945193.com.davidtgnewsproject.app;

import android.app.Application;
import android.graphics.Bitmap;
import android.os.Environment;

import java.io.File;

import davidtgnewsproject.qq986945193.com.davidtgnewsproject.R;
import davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils.OkHttpUtils;
/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @交流Qq ：986945193
 * @GitHub: https://github.com/QQ986945193
 */

/**
 * Application的配置 继承MultiDexApplication是为了使项目能够突破65535限制
 */
public class MyApplication extends Application {
    private static MyApplication app;
    private OkHttpUtils mOkHttpUtils;


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        initOkHttpUtils();

    }


    /**
     * 初始化OkHttp
     */
    private void initOkHttpUtils() {
        mOkHttpUtils = OkHttpUtils.getInstance();

    }


    public static MyApplication getApp() {
        return app;
    }


    /**
     * @return
     * @GitHub: https://github.com/QQ986945193
     * @CSDN博客: http://blog.csdn.net/qq_21376985
     */
    public OkHttpUtils getOkHttpUtils() {
        return this.mOkHttpUtils;
    }


}
