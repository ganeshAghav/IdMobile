package ganesh.com.idmobile;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import android.widget.Toast;

public class Mobile extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);


        String number = getMyPhoneNO();
        TextView textView = (TextView) findViewById(R.id.phone_number_view);
        textView.setText("My Phone Nnumber is: " + number);


        String serialnumber = getMySrialNo();
        TextView serial = (TextView) findViewById(R.id.serialno);
        serial.setText("Sim Card Serial Nnumber is: " + serialnumber);
    }

    private String getMyPhoneNO() {

        TelephonyManager tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        String imei = tm.getLine1Number();
        return imei;
    }

    private String getMySrialNo() {

        TelephonyManager telemamanger = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        String getSimSerialNumber = telemamanger.getSimSerialNumber();
        return getSimSerialNumber;

    }
}