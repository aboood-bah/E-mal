package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class AfterActivity extends AppCompatActivity {

    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after);


        Button btngo = (Button) findViewById(R.id.btnstart);
        Button btnveri = (Button) findViewById(R.id.btnurl);

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        Button gourl = (Button)findViewById(R.id.btnurl);
        gourl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://data.bayanat.ae/ar/dataset/card-for-people-with-disabilities-people-of-determination/resource/2bb19373-8ab6-4d67-9d51-f820709fb29e"));
                startActivity(intent);


            }
        });
    }
}
