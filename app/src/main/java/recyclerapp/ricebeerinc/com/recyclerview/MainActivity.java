package recyclerapp.ricebeerinc.com.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.loopj.android.http.RequestParams;

import org.json.JSONException;

import java.util.List;
import java.util.Random;

/**
 * Created by dell on 20-02-2018.
 */

public class MainActivity extends Activity {

    private List<Contact> contacts;
    private ContactAdapter contactAdapter;
    private Random random;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HeptaRestClientCall heptaCall = new HeptaRestClientCall();
        try {
            String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdHVfaWQiOiJzdW5kMTdTMDAwMSIsImJhdGNoIjo3LCJzdWIiOnsidXNlcl9pZCI6InN1bmQxN1AwMDAxIiwidXNlcl9sb2dpbl9pZCI6NTQ4NiwiYXBwX2xvZ2luX3Bhc3N3b3JkX3N0YXR1cyI6MH0sInNjaG9vbF9pZCI6NDQsImlzcyI6Imh0dHA6XC9cLzM0LjE5Ny43Mi43OTo4MDgyXC9sb2dpbiIsImlhdCI6MTUyMDUyODU1NiwiZXhwIjoxNTUyMDY0NTU2LCJuYmYiOjE1MjA1Mjg1NTYsImp0aSI6Imx6UjNYRjdVTndyNnVabkkifQ.vsKQJiFsKC4qKH5TGMkCxVupv_RfV_F5gB1pec5TM1A";
            RequestParams params = new RequestParams();
            params.add("page","1");
            heptaCall.getNotification(token, params);
            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        /*
        contacts = new ArrayList<>();
        random = new Random();

        //set dummy data
        for (int i = 0; i < 10; i++) {
            Contact contact = new Contact();
            contact.setPhone(phoneNumberGenerating());
            contact.setEmail("DevExchanges" + i + "@gmail.com");
            contacts.add(contact);
        }

        //find view by id and attaching adapter for the RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        contactAdapter = new ContactAdapter(recyclerView, contacts, this);
        recyclerView.setAdapter(contactAdapter);

        //set load more listener for the RecyclerView adapter
        contactAdapter.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (contacts.size() <= 20) {
                    contacts.add(null);
                    contactAdapter.notifyItemInserted(contacts.size() - 1);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            contacts.remove(contacts.size() - 1);
                            contactAdapter.notifyItemRemoved(contacts.size());

                            //Generating more data
                            int index = contacts.size();
                            int end = index + 10;
                            for (int i = index; i < end; i++) {
                                Contact contact = new Contact();
                                contact.setPhone(phoneNumberGenerating());
                                contact.setEmail("DevExchanges" + i + "@gmail.com");
                                contacts.add(contact);
                            }
                            contactAdapter.notifyDataSetChanged();
                            contactAdapter.setLoaded();
                        }
                    }, 5000);
                } else {
                    Toast.makeText(MainActivity.this, "Loading data completed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        */
    }

    private String phoneNumberGenerating() {
        int low = 100000000;
        int high = 999999999;
        int randomNumber = random.nextInt(high - low) + low;

        return "0" + randomNumber;
    }
}
