package ganesh.com.idmobile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MacAddress extends Activity {

    TextView txtmacadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac_address);

        txtmacadd= (TextView) findViewById(R.id.macadd);

        //Utils.getMACAddress("wlan0");
        //Utils.getMACAddress("eth0");
        //Utils.getIPAddress(true); // IPv4
        //Utils.getIPAddress(false); // IPv6

        String address=Utils.getMACAddress("wlan0");
        txtmacadd.setText("Android Device Mac Address: " +address);
    }
}
