package davidtgnewsproject.qq986945193.com.davidtgnewsproject.utils;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @交流Qq ：986945193
 * @GitHub: https://github.com/QQ986945193
 */

/**
 * Picasso显示图片的功能封装
 */
public class PicassoWithImageUtils {
    /**
     * Picasso加载图片
     *
     * @param context
     * @param imageUrl
     * @param imageView
     */
    public static void withImageView(Context context, String imageUrl, ImageView imageView) {
        if (imageView != null && context != null && imageUrl != null) {
            Picasso.with(context).load(imageUrl).into(imageView);
        }

    }


}
