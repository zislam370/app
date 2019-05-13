package com.rafi.fireinfo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


import com.rafi.fireinfo.R;
import com.squareup.picasso.Picasso;


public class InfoDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_details);
        getIncomingIntent();
    }


    private void getIncomingIntent(){
        Log.d("", "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_deg")&& getIntent().hasExtra("image_phone")&& getIntent().hasExtra("image_vill")&& getIntent().hasExtra("image_post")&& getIntent().hasExtra("image_chest")){
            Log.d("tag", "getIncomingIntent: found intent extras.");

            int imageUrl = getIntent().getIntExtra("image_url",-1);
            String imageName = getIntent().getStringExtra("image_name");

            String imageFaname = getIntent().getStringExtra("image_father_name");
            Log.e("tag", imageFaname);
            String imageDeg = getIntent().getStringExtra("image_deg");
            String imagePhone = getIntent().getStringExtra("image_phone");
            String imageVill = getIntent().getStringExtra("image_vill");
            String imagePost =getIntent().getStringExtra("image_post");
            // self
            String imageChest =getIntent().getStringExtra("image_chest");
            String imageThana =getIntent().getStringExtra("image_Thana");
            String imageZella =getIntent().getStringExtra("image_Zella");
            String imageEmail =getIntent().getStringExtra("image_Email");
            String imageBlood =getIntent().getStringExtra("image_Blood");



            setImage(imageUrl, imageName,imageFaname,imageDeg,imagePhone,imageVill,imagePost,imageChest,imageThana,imageZella,imageEmail,imageBlood);
        }
    }


    private void setImage(int imageUrl, String imageName,String imageFaname,String imageDeg,String imagePhone,String imageVill,String imagePost,String imageChest,String imageThana,String imageZella,String imageEmail,String imageBlood){


        //self
        TextView chest = findViewById(R.id.image_chest);
        chest.setText(imageChest);
        //self
        TextView name = findViewById(R.id.image_name);
        name.setText(imageName);

        TextView deg = findViewById(R.id.image_deg);
        deg.setText(imageDeg);

        TextView phn = findViewById(R.id.image_phn);
        phn.setText(imagePhone);

        TextView fatherName = findViewById(R.id.image_father_name);
        fatherName.setText(imageFaname);


        TextView vill = findViewById(R.id.image_vill_name);
        vill.setText(imageVill);

        TextView post = findViewById(R.id.image_post);
        post.setText(imagePost);

        //self
        TextView thana = findViewById(R.id.image_Thana);
        thana.setText(imageThana);

        TextView zella = findViewById(R.id.image_Zella);
        zella.setText(imageZella);

        TextView email = findViewById(R.id.image_Email);
        email.setText(imageEmail);

        TextView blood = findViewById(R.id.image_Blood);
        blood.setText(imageBlood);
        //self

        ImageView image = findViewById(R.id.image);
       // image.setImageResource(imageUrl);

        Picasso.get().load(imageUrl).into(image);
        //Log.e("imageUrl",imageUrl);

       // Picasso.get().load(imageUrl).into(image);



    }
}
