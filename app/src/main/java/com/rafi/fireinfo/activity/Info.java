package com.rafi.fireinfo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.rafi.fireinfo.R;
import com.rafi.fireinfo.adapter.InfoAdapter;

import java.util.ArrayList;

public class Info extends AppCompatActivity {

    private static final String TAG = "Info";


    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDegs = new ArrayList<>();
    private ArrayList<String> mFaNames = new ArrayList<>();
    private ArrayList<String> mVills = new ArrayList<>();
    private ArrayList<String> mPosts = new ArrayList<>();
    private ArrayList<String> mPHones = new ArrayList<>();

    private ArrayList<Integer> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add(R.drawable.logo);
        mNames.add("মোঃ আজিজুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ রফিকুল ইসলাম");
        mVills.add("গ্রামঃ জগথা");
        mPosts.add("ডাকঘরঃ পীরগঞ্জ");
        mPHones.add("মোবাইল নং-০১৭৩৭-৮২৮৬১২");


        mImageUrls.add(R.drawable.logo);
        mNames.add("মোঃ আজিজুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ রফিকুল ইসলাম");
        mVills.add("গ্রামঃ জগথা");
        mPosts.add("ডাকঘরঃ পীরগঞ্জ");
        mPHones.add("মোবাইল নং-০১৭৩৭-৮২৮৬১২");

        mImageUrls.add(R.drawable.logo);
        mNames.add("মোঃ আজিজুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ রফিকুল ইসলাম");
        mVills.add("গ্রামঃ জগথা");
        mPosts.add("ডাকঘরঃ পীরগঞ্জ");
        mPHones.add("মোবাইল নং-০১৭৩৭-৮২৮৬১২");

        mImageUrls.add(R.drawable.logo);
        mNames.add("মোঃ আজিজুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ রফিকুল ইসলাম");
        mVills.add("গ্রামঃ জগথা");
        mPosts.add("ডাকঘরঃ পীরগঞ্জ");
        mPHones.add("মোবাইল নং-০১৭৩৭-৮২৮৬১২");

        mImageUrls.add(R.drawable.logo);
        mNames.add("মোঃ আজিজুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ রফিকুল ইসলাম");
        mVills.add("গ্রামঃ জগথা");
        mPosts.add("ডাকঘরঃ পীরগঞ্জ");
        mPHones.add("মোবাইল নং-০১৭৩৭-৮২৮৬১২");

        mImageUrls.add(R.drawable.logo);
        mNames.add("মোঃ আজিজুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ রফিকুল ইসলাম");
        mVills.add("গ্রামঃ জগথা");
        mPosts.add("ডাকঘরঃ পীরগঞ্জ");
        mPHones.add("মোবাইল নং-০১৭৩৭-৮২৮৬১২");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        InfoAdapter adapter = new InfoAdapter(this, mNames, mImageUrls,mDegs,mFaNames,mVills,mPosts,mPHones);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void organizedBtn(View v){

        Intent dashBord = new Intent(this, Organizer.class);
        startActivity(dashBord);



    }
}
