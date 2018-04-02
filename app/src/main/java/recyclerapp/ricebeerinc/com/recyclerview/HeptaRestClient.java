package recyclerapp.ricebeerinc.com.recyclerview;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by Akilan on 09-03-2018.
 */

public class HeptaRestClient {
    private static final String BASE_URL = "http://34.197.72.79:8082/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    /*public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }*/

    public static void get(String url, String token, RequestParams params, AsyncHttpResponseHandler responseHandler){
        client.addHeader("Authorization",token);
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

}
