package dm.riselogic.com.okinavakazan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.phone).setOnClickListener(this::phone);
        findViewById(R.id.btn).setOnClickListener(this::btn);
    }

    void phone(View view){
        String uri = "tel:" + "8 (843) 233-44-33";
        startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri)));
    }

    void btn(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=ru.timrlm.oki")));
    }
}
