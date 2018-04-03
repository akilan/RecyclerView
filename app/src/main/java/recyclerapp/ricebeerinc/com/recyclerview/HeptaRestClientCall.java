package recyclerapp.ricebeerinc.com.recyclerview;

import android.util.Log;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * Created by Akilan on 09-03-2018.
 */

public class HeptaRestClientCall {
    public void getNotification(String token, RequestParams params, final OnJSONResponseCallback callback) throws JSONException{
        HeptaRestClient.get("notification", token, params, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response){
                /*Gson gson = new Gson();
                NotificationJson notificationJson = gson.fromJson(response.toString(),NotificationJson.class);
                List<NotificationItemJson> notificationItems = notificationJson.getNotificationItemJsons();
                Log.v("HRCC", notificationJson.getNext_page_url());
                for (NotificationItemJson notificationItemJson : notificationItems){
                    Log.v("HRCC", String.valueOf(notificationItemJson.getApp_id()));
                }*/
                callback.onJSONResponse(true, response);
            }
            public void onSuccess(int statusCode, Header[] headers, JSONArray response){
                Log.v("HRCC", response.toString());
            }
        });
    }
}
