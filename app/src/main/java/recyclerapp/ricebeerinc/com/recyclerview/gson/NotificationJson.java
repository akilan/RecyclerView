package recyclerapp.ricebeerinc.com.recyclerview.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Akilan on 09-03-2018.
 */

public class NotificationJson {
    public int total;
    public int per_page;
    public int current_page;
    public int last_page;
    public String next_page_url;

    @SerializedName("data")
    private List<NotificationItemJson> notificationItemJsons;

    public List<NotificationItemJson> getNotificationItemJsons() {
        return notificationItemJsons;
    }

    public void setNotificationItemJsons(List<NotificationItemJson> notificationItemJsons) {
        this.notificationItemJsons = notificationItemJsons;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public String getNext_page_url() {
        return next_page_url;
    }

    public void setNext_page_url(String next_page_url) {
        this.next_page_url = next_page_url;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
