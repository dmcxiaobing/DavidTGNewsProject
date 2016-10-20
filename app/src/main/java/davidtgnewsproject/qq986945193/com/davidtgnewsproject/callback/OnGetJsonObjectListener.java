package davidtgnewsproject.qq986945193.com.davidtgnewsproject.callback;

import org.json.JSONObject;

/**
 * 处理OkHttp获取到的JsonObject对象
 */
public interface OnGetJsonObjectListener {
    void onResponse(JSONObject jsonObject);
}
