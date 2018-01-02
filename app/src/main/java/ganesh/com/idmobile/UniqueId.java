package ganesh.com.idmobile;

import android.content.Context;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UniqueId extends AppCompatActivity {

    TextView textView;
    private String androidDeviceId;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unique_id);

        textView = (TextView) findViewById(R.id.android_device_unique_id);

        androidDeviceId = Secure.getString(getApplicationContext().getContentResolver(),
                Secure.ANDROID_ID);

        textView.setText("Your Device ID Address: " + androidDeviceId);
    }
}