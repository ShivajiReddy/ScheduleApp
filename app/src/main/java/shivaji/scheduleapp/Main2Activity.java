package shivaji.scheduleapp;

import android.graphics.Matrix;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.id;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(R.id.imageView);



        String string = getIntent().getStringExtra("section");
        if (string.equals("a")) {
            imageView.setImage(ImageSource.resource(R.drawable.sa));
        } else if (string.equals("b")) {
            imageView.setImage(ImageSource.resource(R.drawable.sb));
        } else if (string.equals("c")) {
            imageView.setImage(ImageSource.resource(R.drawable.sc));
        } else if (string.equals("d")) {
            imageView.setImage(ImageSource.resource(R.drawable.sd));
        } else if (string.equals("e")) {
            imageView.setImage(ImageSource.resource(R.drawable.se));
        } else if (string.equals("f")) {
            imageView.setImage(ImageSource.resource(R.drawable.sf));
        } else if (string.equals("g")) {
            imageView.setImage(ImageSource.resource(R.drawable.sg));
        } else if (string.equals("h")) {
            imageView.setImage(ImageSource.resource(R.drawable.sh));
        } else if (string.equals("i")) {
            imageView.setImage(ImageSource.resource(R.drawable.si));
        } else if (string.equals("j")) {
            imageView.setImage(ImageSource.resource(R.drawable.sj));
        } else if (string.equals("k")) {
            imageView.setImage(ImageSource.resource(R.drawable.sk));
        } else if (string.equals("l")) {
            imageView.setImage(ImageSource.resource(R.drawable.sl));
        } else if (string.equals("m")) {
            imageView.setImage(ImageSource.resource(R.drawable.sm));
        } else if (string.equals("n")) {
            imageView.setImage(ImageSource.resource(R.drawable.sn));
        } else if (string.equals("o")) {
            imageView.setImage(ImageSource.resource(R.drawable.so));
        } else if (string.equals("p")) {
            imageView.setImage(ImageSource.resource(R.drawable.sp));
        } else if (string.equals("q")) {
            imageView.setImage(ImageSource.resource(R.drawable.sq));
        } else if (string.equals("r")) {
            imageView.setImage(ImageSource.resource(R.drawable.sr));
        } else if (string.equals("s")) {
            imageView.setImage(ImageSource.resource(R.drawable.ss));
        } else if (string.equals("t")) {
            imageView.setImage(ImageSource.resource(R.drawable.st));
        } else if (string.equals("u")) {
            imageView.setImage(ImageSource.resource(R.drawable.su));
        } else if (string.equals("v")) {
            imageView.setImage(ImageSource.resource(R.drawable.sv));
        } else if (string.equals("w")) {
            imageView.setImage(ImageSource.resource(R.drawable.sw));
        } else if (string.equals("x")) {
            imageView.setImage(ImageSource.resource(R.drawable.sx));
        }


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main2 Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
