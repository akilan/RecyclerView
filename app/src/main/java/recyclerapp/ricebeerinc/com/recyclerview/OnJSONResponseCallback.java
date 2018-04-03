package recyclerapp.ricebeerinc.com.recyclerview;

import org.json.JSONObject;

/**
 * Created by Akilan on 03-04-2018.
 */

public interface OnJSONResponseCallback {
    public void onJSONResponse(boolean success, JSONObject response);
}
