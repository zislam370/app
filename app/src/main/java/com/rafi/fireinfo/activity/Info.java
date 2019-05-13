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
    private ArrayList<String> mChest = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDegs = new ArrayList<>();
    private ArrayList<String> mFaNames = new ArrayList<>();
    private ArrayList<String> mVills = new ArrayList<>();
    private ArrayList<String> mPosts = new ArrayList<>();
    private ArrayList<String> mThana = new ArrayList<>();
    private ArrayList<String> mZella = new ArrayList<>();
    private ArrayList<String> memail = new ArrayList<>();
    private ArrayList<String> mblood = new ArrayList<>();
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






        mImageUrls.add(R.drawable.chest1);
        mChest.add("বক্ষ নং-০১");
        mNames.add("মোঃ আজিজুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ রফিকুলইসলাম");
        mVills.add("গ্রামঃ জগথা");
        mPosts.add("ডাকঘরঃ পীরগঞ্জ");
        mThana.add("থানা/উপজেলাঃ পীরগঞ্জ");
        mZella.add("জেলাঃ ঠাকুরগাও");
        memail.add("ই-মেইল নং-");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭৩৭-৮২৮৬১২");


        mImageUrls.add(R.drawable.chest2);
        mChest.add("বক্ষ নং-০২");
        mNames.add("মোঃ নাছিম ইকবাল");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মৃত মহিউদ্দিন সরকার");
        mVills.add("গ্রামঃ কলাবাড়ী");
        mPosts.add("ডাকঘরঃ কলমপুর");
        mThana.add("থানা/উপজেলাঃ কোতোয়ালী");
        mZella.add("জেলাঃ দিনাজপুর");
        memail.add("ই-মেইল নং-nasimiqbaliubd91@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭২০-৯৯২২৬৪ ");


        mImageUrls.add(R.drawable.chest3);
        mChest.add("বক্ষ নং-০৩");
        mNames.add("মোঃ তারিকুল ইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ জিকরুল হক");
        mVills.add("গ্রামঃ সোনাপুকুর");
        mPosts.add("ডাকঘরঃ বেলাইচন্ডী");
        mThana.add("থানা/উপজেলাঃ পার্বতীপুর");
        mZella.add("জেলাঃ দিনাজপুর");
        memail.add("ই-মেইল নং-tariqul1788@gmail.com");
        mblood.add("রক্তের গ্রুপঃ A+");
        mPHones.add("মোবাইল নং-০১৭১৭-৭৪৫৪৩৮");


        mImageUrls.add(R.drawable.chest4);
        mChest.add("বক্ষ নং-০৪");
        mNames.add("তুষার কান্তি রায়");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মনোরঞ্জন রায়");
        mVills.add("গ্রামঃ গুরুগোবিন্দ");
        mPosts.add("ডাকঘরঃ বড়বাড়ী");
        mThana.add("থানা/উপজেলাঃ লালমনিরহাট সদর");
        mZella.add("জেলাঃ লালমনিরহাট");
        memail.add("ই-মেইল নং-tusharkantiroyyy@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭১৭-৪১৩৯৫৭");


        mImageUrls.add(R.drawable.chest5);
        mChest.add("বক্ষ নং-০৫");
        mNames.add("রিফাত আল-মামুন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ তাহমুদুল হক");
        mVills.add("গ্রামঃ বড়বিল");
        mPosts.add("ডাকঘরঃ বড়বিল");
        mThana.add("থানা/উপজেলাঃ গংঙ্গাচড়া");
        mZella.add("জেলাঃ রংপুর");
        memail.add("ই-মেইল নং-muhammad.rm47@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭৬১-১৪৪০৩৪");



        mImageUrls.add(R.drawable.chest6);
        mChest.add("বক্ষ নং-০৬");
        mNames.add("মিজানুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ আঃ মান্নান");
        mVills.add("গ্রামঃ জুয়ান");
        mPosts.add("ডাকঘরঃ জ্ঞানগঞ্জ");
        mThana.add("থানা/উপজেলাঃ পীরগাছা");
        mZella.add("জেলাঃ রংপুর");
        memail.add("ই-মেইল নং-mizanurrahman71@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭৮৩-০০৩১৯৬");


        mImageUrls.add(R.drawable.chest7);
        mChest.add("বক্ষ নং-০৭");
        mNames.add("নাজমুল সরকার");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ আবুল হোসেন সরকার");
        mVills.add("গ্রামঃ কেবলকৃষ্ণ");
        mPosts.add("ডাকঘরঃ জুম্মাহাট");
        mThana.add("থানা/উপজেলাঃ উলিপুর");
        mZella.add("জেলাঃ কুড়িগ্রাম");
        memail.add("ই-মেইল নং-nazmulsarkar2019@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭৩৪-৮৯৯৪৮২");


        mImageUrls.add(R.drawable.chest8);
        mChest.add("বক্ষ নং-০৮");
        mNames.add("মোঃ কামরুজ্জামান সুমন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আব্দুল জলিল");
        mVills.add("গ্রামঃ ছোট কুষ্টারী");
        mPosts.add("ডাকঘরঃ চিলমারী");
        mThana.add("থানা/উপজেলাঃ চিলমারী");
        mZella.add("জেলাঃ কুড়িগ্রাম");
        memail.add("ই-মেইল নং-drklord58@gmail.com");
        mblood.add("রক্তের গ্রুপঃ AB+");
        mPHones.add("মোবাইল নং-০১৭১৭-১৮৪৭৮০");



        mImageUrls.add(R.drawable.chest9);
        mChest.add("বক্ষ নং-০৯");
        mNames.add("নয়ন বাবু চেীধুরী");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মতিলাল চৌধুরী");
        mVills.add("গ্রামঃ বুজরুক বোয়ালীয়া, মাষ্টার পাড়া");
        mPosts.add("ডাকঘরঃ গোবিন্দগঞ্জ");
        mThana.add("থানা/উপজেলাঃ গোবিন্দগঞ্জ");
        mZella.add("জেলাঃ গাইবান্ধা");
        memail.add("ই-মেইল নং-nayonchowdhury1989@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং- ০১৭২৫-৯৫২৬৯৬");



        mImageUrls.add(R.drawable.chest10);
        mChest.add("বক্ষ নং-১০");
        mNames.add("মোঃ ইমন মিয়া");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মৃত ফজলুল হক");
        mVills.add("গ্রামঃ মধ্যকঞ্চিপাড়া");
        mPosts.add("ডাকঘরঃ ভবানীগঞ্জ");
        mThana.add("থানা/উপজেলাঃ ফুলছড়ি");
        mZella.add("জেলাঃ গাইবান্ধা");
        memail.add("ই-মেইল নং-mdemon7027@gmail.com");
        mblood.add("রক্তের গ্রুপঃ A+");
        mPHones.add("মোবাইল নং-০১৭৪২-৭৩৭০২৭");



        mImageUrls.add(R.drawable.chest11);
        mChest.add("বক্ষ নং-১১");
        mNames.add("মোঃ মেহেদী হাসান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ কোরবান আলী");
        mVills.add("গ্রামঃ ইছাইদহ");
        mPosts.add("ডাকঘরঃ সাবগ্রাম");
        mThana.add("থানা/উপজেলাঃ বগুড়া সদর");
        mZella.add("জেলাঃ বগুড়া");
        memail.add("ই-মেইল নং-mehedi868184@gmail.com");
        mblood.add("রক্তের গ্রুপঃ A-");
        mPHones.add("মোবাইল নং-০১৭২৩-৭৫৬৯৯৯");



        mImageUrls.add(R.drawable.chest12);
        mChest.add("বক্ষ নং-১২");
        mNames.add("এ, কে, এম লতিফুল বারী");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আজিজার রহমান");
        mVills.add("গ্রামঃ খাটিয়ামারী");
        mPosts.add("ডাকঘরঃ পাকুল্যা");
        mThana.add("থানা/উপজেলাঃ সোনাতলা");
        mZella.add("জেলাঃ বগুড়া");
        memail.add("ই-মেইল নং-latifulmilon@gmail.com");
        mblood.add("রক্তের গ্রুপঃ A+");
        mPHones.add("মোবাইল নং-০১৭২২-৯৪৮২৪২");


        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-১৩");
        mNames.add("শহিদুল ইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ রেজাউল করিম");
        mVills.add("গ্রামঃ মাঝগ্রাম");
        mPosts.add("ডাকঘরঃ নন্দিগ্রাম");
        mThana.add("থানা/উপজেলাঃ নন্দিগ্রাম");
        mZella.add("জেলাঃ বগুড়া");
        memail.add("ই-মেইল নং-");
        mblood.add("রক্তের গ্রুপঃ A+");
        mPHones.add("মোবাইল নং-০১৭১০-০৫৪৫৯০");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-১৪");
        mNames.add("মোঃ মাসুদ রানা");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ মাহবুব আলম");
        mVills.add("গ্রামঃ শিমুলিয়া");
        mPosts.add("ডাকঘরঃ সান্তাহার");
        mThana.add("থানা/উপজেলাঃ নওগাঁ সদর");
        mZella.add("জেলাঃ নওগাঁ");
        memail.add("ই-মেইল নং-");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৭৬২-৭৬৩১৩১");


        mImageUrls.add(R.drawable.chest15);
        mChest.add("বক্ষ নং-১৫");
        mNames.add("মোঃ আব্দুর রউফ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আনিছুর রহমান");
        mVills.add("গ্রামঃ সন্তোষপাড়া");
        mPosts.add("ডাকঘরঃ পত্নীতলা");
        mThana.add("থানা/উপজেলাঃ পত্নীতলা");
        mZella.add("জেলাঃ নওগাঁ");
        memail.add("ই-মেইল নং-");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৭২২-৯২৫৭৪৭");



        mImageUrls.add(R.drawable.chest16);
        mChest.add("বক্ষ নং-১৬");
        mNames.add("মোঃ আকরামুল হাসান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আনোয়ার হোসেন");
        mVills.add("গ্রামঃ বাচাড়ীগ্রাম");
        mPosts.add("ডাকঘরঃ চক-আতিথা");
        mThana.add("থানা/উপজেলাঃ নওগাঁ সদর");
        mZella.add("জেলাঃ নওগাঁ");
        memail.add("ই-মেইল নং-tusher.himsitol7@gmail.com");
        mblood.add("রক্তের গ্রুপঃ AB+");
        mPHones.add("মোবাইল নং-০১৭৪৫-৩১৬৮০৫");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-১৭");
        mNames.add("মোঃ জাহিদুল ইসলাম জাহিদ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মৃত নুরুল ইসলাম");
        mVills.add("গ্রামঃ কাওয়াক");
        mPosts.add("ডাকঘরঃ উল্লাপাড়া");
        mThana.add("থানা/উপজেলাঃ উল্লাপাড়া");
        mZella.add("জেলাঃ সিরাজগঞ্জ");
        memail.add("ই-মেইল নং-zahidulzahid0231@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৮২৬-১৬১৯৫৫");



        mImageUrls.add(R.drawable.chest18);
        mChest.add("বক্ষ নং-১৮");
        mNames.add("মোঃ আতাউর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আব্দুল লতিফ শেখ");
        mVills.add("গ্রামঃ মথুরাপুর");
        mPosts.add("ডাকঘরঃ সুজানগর");
        mThana.add("থানা/উপজেলাঃ সুজানগর");
        mZella.add("জেলাঃ পাবনা");
        memail.add("ই-মেইল নং-ataur545@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭১২-৩৪৫৩৮৮");


        mImageUrls.add(R.drawable.chest19);
        mChest.add("বক্ষ নং-১৯");
        mNames.add("ওহিদুল ইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ ওমর আলী");
        mVills.add("গ্রামঃ পদ্মনগর");
        mPosts.add("ডাকঘরঃ করিমপুর");
        mThana.add("থানা/উপজেলাঃ কুষ্টিয়া সদর");
        mZella.add("জেলাঃ কুষ্টিয়া");
        memail.add("ই-মেইল নং-");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৩১৮৬১৩৭৫৫");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-২০");
        mNames.add("মোঃ আসাদুজ্জামান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আব্দুর রশিদ");
        mVills.add("গ্রামঃ নওদা আজমপুর");
        mPosts.add("ডাকঘরঃ আমলা সদরপুর");
        mThana.add("থানা/উপজেলাঃ মিরপুর");
        mZella.add("জেলাঃ কুষ্টিয়া");
        memail.add("ই-মেইল নং-likhon.ali8@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭৩৫-৮০৮৬৮৮ ");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-২১");
        mNames.add("মোঃ সোহাগউজ্জামান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মৃত নাজিম উদ্দিন মল্লিক");
        mVills.add("গ্রামঃ মাজহাদ");
        mPosts.add("ডাকঘরঃ নীলমনিগঞ্জ");
        mThana.add("থানা/উপজেলাঃ আলমডাঙ্গা");
        mZella.add("জেলাঃ চুয়াডাঙ্গা");
        memail.add("ই-মেইল নং-shohaguzzamancctc@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৭৬৮-৯৬৯৩৮০");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-২২");
        mNames.add("সাফায়েত হোসেন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ রোকন উদ্দীন খান");
        mVills.add("গ্রামঃ কাঞ্চননগর");
        mPosts.add("ডাকঘরঃ ঝিনাইদহ");
        mThana.add("থানা/উপজেলাঃ ঝিনাইদহ সদর");
        mZella.add("জেলাঃ ঝিনাইদহ");
        memail.add("ই-মেইল নং-safayat1493@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৬৭১-৯৩৭২৬০");



        mImageUrls.add(R.drawable.chest23);
        mChest.add("বক্ষ নং-২৩");
        mNames.add("মোঃ সনাজ মিয়া");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ শাপিয়ার রহমান");
        mVills.add("গ্রামঃ উদয়পুর");
        mPosts.add("ডাকঘরঃ ঝিনাইদহ");
        mThana.add("থানা/উপজেলাঃ ঝিনাইদহ সদর");
        mZella.add("জেলাঃ ঝিনাইদহ");
        memail.add("ই-মেইল নং-sanazmia4@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৭৯২-৪৩২৫১৬");



        mImageUrls.add(R.drawable.chest24);
        mChest.add("বক্ষ নং-২৪");
        mNames.add("বিপুল হোসেন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আনসার মোল্লা");
        mVills.add("গ্রামঃ কুশাবাড়িয়া");
        mPosts.add("ডাকঘরঃ সত্যপুর");
        mThana.add("থানা/উপজেলাঃ মাগুরা সদর");
        mZella.add("জেলাঃ মাগুরা");
        memail.add("ই-মেইল নং-bipulhossainhossain91644@gmail.com");
        mblood.add("রক্তের গ্রুপঃ A+");
        mPHones.add("মোবাইল নং-০১৭৫৩-১৪৯১২২");



        mImageUrls.add(R.drawable.chest25);
        mChest.add("বক্ষ নং-২৫");
        mNames.add("আল আমিন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ আঃ মালেক");
        mVills.add("গ্রামঃ রায়পাশা");
        mPosts.add("ডাকঘরঃ কোটাকোল");
        mThana.add("থানা/উপজেলাঃ লোহাগড়া");
        mZella.add("জেলাঃ নড়াইল");
        memail.add("ই-মেইল নং-alamink15@gmail.com");
        mblood.add("রক্তের গ্রুপঃ AB+");
        mPHones.add("মোবাইল নং-০১৭৪৮-১২৭৫৬৬");


        mImageUrls.add(R.drawable.chest26);
        mChest.add("বক্ষ নং-২৬");
        mNames.add("রিপন কুমার ঘোষ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ কার্তিক চন্দ্র ঘোষ");
        mVills.add("গ্রামঃ চন্তিপুর");
        mPosts.add("ডাকঘরঃ মাগুরাঘোনা");
        mThana.add("থানা/উপজেলাঃ ডুমুরিয়া");
        mZella.add("জেলাঃ খুলনা");
        memail.add("ই-মেইল নং-");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং- ০১৭৪১-৪১৯০৪২");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-২৭");
        mNames.add("মোঃ প্রিন্স হাওলাদার");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ আঃ রশিদ হাওলাদার");
        mVills.add("গ্রামঃ ডহরপাড়া");
        mPosts.add("ডাকঘরঃ ডহরপাড়া");
        mThana.add("থানা/উপজেলাঃ উজিরপুর");
        mZella.add("জেলাঃ বরিশাল");
        memail.add("ই-মেইল নং-mdprincehowlader@gmail.com");
        mblood.add("রক্তের গ্রুপঃ A+");
        mPHones.add("মোবাইল নং-০১৭৬১-২১৮৭৯৮");



        mImageUrls.add(R.drawable.chest28);
        mChest.add("বক্ষ নং-২৮");
        mNames.add("খোকন জমাদার");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মৃত ইসমাইল জমাদার");
        mVills.add("গ্রামঃ মোল্লাপাড়া");
        mPosts.add("ডাকঘরঃ মোল্লাপাড়া");
        mThana.add("থানা/উপজেলাঃ আগৈলঝাড়া");
        mZella.add("জেলাঃ বরিশাল");
        memail.add("ই-মেইল নং-khokanjamader@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৭৩৯-৯৩১৯৯৬");



        mImageUrls.add(R.drawable.chest29);
        mChest.add("বক্ষ নং-২৯");
        mNames.add("মোঃ সফিকুল ইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আব্দুর রাজ্জাক");
        mVills.add("গ্রামঃ তালাপ্রসাদ");
        mPosts.add("ডাকঘরঃ মসজিদবাড়ী");
        mThana.add("থানা/উপজেলাঃ বানারীপাড়া");
        mZella.add("জেলাঃ বরিশাল");
        memail.add("ই-মেইল নং-");
        mblood.add("রক্তের গ্রুপঃ B-");
        mPHones.add("মোবাইল নং-০১৭৮৩-৫৯১৪৮০");



        mImageUrls.add(R.drawable.chest30);
        mChest.add("বক্ষ নং-৩০");
        mNames.add("মোঃ রেজোয়ান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আঃ রশিদ হাওলাদার");
        mVills.add("গ্রামঃ ভূতেরদিয়া");
        mPosts.add("ডাকঘরঃ ভূতেরদিয়া");
        mThana.add("থানা/উপজেলাঃ বাবুগঞ্জ");
        mZella.add("জেলাঃ বরিশাল");
        memail.add("ই-মেইল নং-rejoan.raz.h@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৭২২-৮৪৬৪০২");




        mImageUrls.add(R.drawable.chest31);
        mChest.add("বক্ষ নং-৩১");
        mNames.add("মোঃ তামিম হাওলাদার");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ শাহ আলম হাওলাদার");
        mVills.add("গ্রামঃ কাজিসা");
        mPosts.add("ডাকঘরঃ মুন্সীরতাল্লুক");
        mThana.add("থানা/উপজেলাঃ উজিরপুর");
        mZella.add("জেলাঃ বরিশাল");
        memail.add("ই-মেইল নং-tamimfaraji29@gmail.com");
        mblood.add("রক্তের গ্রুপঃ AB+");
        mPHones.add("মোবাইল নং-০১৭৫৩-৯১০৭৩৪");




        mImageUrls.add(R.drawable.chest32);
        mChest.add("বক্ষ নং-৩২");
        mNames.add("রাশেদ বিন খালিদ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ তাজুল খালিদ");
        mVills.add("গ্রামঃ কুতুবা");
        mPosts.add("ডাকঘরঃ বোরহান উদ্দিন");
        mThana.add("থানা/উপজেলাঃ বোরহানউদ্দিন");
        mZella.add("জেলাঃ ভোলা");
        memail.add("ই-মেইল নং-rbkshuvo1111@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৭৩৪-৪৩৩৩৮৭");




        mImageUrls.add(R.drawable.chest33);
        mChest.add("বক্ষ নং-৩৩");
        mNames.add("মোঃ রবিউল হাসান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ এস. এম. নুরুজ্জামান");
        mVills.add("গ্রামঃ কলাগাছিয়া");
        mPosts.add("ডাকঘরঃ সুন্দ্রা কালিকাপুর");
        mThana.add("থানা/উপজেলাঃ মির্জাগঞ্জ");
        mZella.add("জেলাঃ পটুয়াখালী");
        memail.add("ই-মেইল নং-rabiul7549@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৭১১-৩৪৩৭০১");




        mImageUrls.add(R.drawable.chest34);
        mChest.add("বক্ষ নং-৩৪");
        mNames.add("মোঃ এনামুল হক সুমন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ ইলিয়াস মাহমুদ");
        mVills.add("গ্রামঃ ছোটবালিয়াতলী");
        mPosts.add("ডাকঘরঃ ছোটবালিয়াতলী");
        mThana.add("থানা/উপজেলাঃ কলাপাড়া");
        mZella.add("জেলাঃ পটুয়াখালী");
        memail.add("ই-মেইল নংanamulhaquesumon64@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭২৮-২৯০৫৯৪");




        mImageUrls.add(R.drawable.chest35);
        mChest.add("বক্ষ নং-৩৫");
        mNames.add("অনয় কুমার ঘোষ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ অরবিন্দু বিকাশ ঘোষ");
        mVills.add("গ্রামঃ ৬২ নং চরপাড়া বাইলেন");
        mPosts.add("ডাকঘরঃ ময়মনসিংহ সদর");
        mThana.add("থানা/উপজেলাঃ ময়মনসিংহ সদর");
        mZella.add("জেলাঃ ময়মনসিংহ");
        memail.add("ই-মেইল নং-anoykumar1@gmail.com");
        mblood.add("রক্তের গ্রুপঃ A+");
        mPHones.add("মোবাইল নং-০১৯১১-৮৭৪১০২");




        mImageUrls.add(R.drawable.chest36);
        mChest.add("বক্ষ নং-৩৬");
        mNames.add("মোঃ হাদিউল ইসলাম শুভ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ জামাল উদ্দিন");
        mVills.add("গ্রামঃ বীরখারুয়া");
        mPosts.add("ডাকঘরঃ বীরখারুয়া");
        mThana.add("থানা/উপজেলাঃ গফরগাঁও");
        mZella.add("জেলাঃ ময়মনসিংহ");
        memail.add("ই-মেইল নং- ");
        mblood.add("রক্তের গ্রুপঃ A+");
        mPHones.add("মোবাইল নং-০১৭১৯-৬৭৮২২৫");




        mImageUrls.add(R.drawable.chest37);
        mChest.add("বক্ষ নং-৩৭");
        mNames.add("মোঃ মাজহারুল ইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ সাহাব উদ্দীন");
        mVills.add("গ্রামঃ তারাপাশা");
        mPosts.add("ডাকঘরঃ জাহাঙ্গীরপুর");
        mThana.add("থানা/উপজেলাঃ নান্দাইল");
        mZella.add("জেলাঃ ময়মনসিংহ");
        memail.add("ই-মেইল নং-mazharulislam149@gmail.com");
        mblood.add("রক্তের গ্রুপঃ B+");
        mPHones.add("মোবাইল নং-০১৯১২-৬২০০৪১");




        mImageUrls.add(R.drawable.chest38);
        mChest.add("বক্ষ নং-৩৮");
        mNames.add("জামিল আহমেদ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ এ. বি. ছিদ্দিক আহমেদ");
        mVills.add("গ্রামঃ নওপাড়া");
        mPosts.add("ডাকঘরঃ আখরাইল");
        mThana.add("থানা/উপজেলাঃ ত্রিশাল");
        mZella.add("জেলাঃ ময়মনসিংহ");
        memail.add("ই-মেইল নং-ahmmedzamil7@gmail.com");
        mblood.add("রক্তের গ্রুপঃ AB+");
        mPHones.add("মোবাইল নং-০১৭৩৩-১০০৬৬৫");




        mImageUrls.add(R.drawable.chest39);
        mChest.add("বক্ষ নং-৩৯");
        mNames.add("রাকিবুল হাসান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ আবুল হোসেন");
        mVills.add("গ্রামঃ ছিপান");
        mPosts.add("ডাকঘরঃ মীরবাড়ি");
        mThana.add("থানা/উপজেলাঃ গাফরগাঁও");
        mZella.add("জেলাঃ ময়মনসিংহ");
        memail.add("ই-মেইল নং-rakibul90bd@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭১০-৪৪৭০২০");




        mImageUrls.add(R.drawable.chest40);
        mChest.add("বক্ষ নং-৪০");
        mNames.add("আবুজর গিফারী (ইপেল)");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ মোশারফ হোসেন");
        mVills.add("গ্রামঃ পাঁচবাগ");
        mPosts.add("ডাকঘরঃ পাঁচবাগ");
        mThana.add("থানা/উপজেলাঃ গাফরগাঁও");
        mZella.add("জেলাঃ ময়মনসিংহ");
        memail.add("ই-মেইল নং-abuzar1@gmail.com");
        mblood.add("রক্তের গ্রুপঃ O+");
        mPHones.add("মোবাইল নং-০১৭৩৬-৭৩০০৭৯");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৪১");
        mNames.add("মোঃসোহেল আহমেদ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমো ঃবগজিম উদ্দিন ");
        mVills.add("গ্রামঃরঘনামপুর");
        mPosts.add("ডাকঘরঃরঘনামপুরনতুনবাজার");
        mThana.add("থানা/উপজেলাঃমুক্তাগাছা");
        mZella.add("জেলাঃময়মনসিংহ");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৭৪৪-৪৭৭৪৩৬");




        mImageUrls.add(R.drawable.chest42);
        mChest.add("বক্ষনং-৪২");
        mNames.add("মোঃআসাদুজ্জামান");
        mDegs.add("স্টেশনঅফিসার");
        mFaNames.add("পিতারনামঃমোঃআঃহালিম");
        mVills.add("গ্রামঃদেউলডাংরা");
        mPosts.add("ডাকঘরঃদেউলডাংরা");
        mThana.add("থানা/উপজেলাঃনান্দাইল");
        mZella.add("জেলাঃময়মনসিংহ");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭৫০-৩৪২৪২৫");




        mImageUrls.add(R.drawable.chest43);
        mChest.add("বক্ষনং-৪৩");
        mNames.add("আল আমিন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃ আব্দুলহাকিম");
        mVills.add("গ্রামঃবাগবাড়ী");
        mPosts.add("ডাকঘরঃমাইজবাড়ী");
        mThana.add("থানা/উপজেলাঃগাফরগাঁও");
        mZella.add("জেলাঃময়মনসিংহ");
        memail.add("ই-মেইলনং ");
        mblood.add("রক্তেরগ্রুপঃ B+");
        mPHones.add("মোবাইলনং-০১৭২১-৫৭০৯৮৭");




        mImageUrls.add(R.drawable.chest44);
        mChest.add("বক্ষনং-৪৪");
        mNames.add("মোঃআব্দুল্লাহ খালিদ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃআব্দুলহাদী");
        mVills.add("গ্রামঃকর্মা");
        mPosts.add("ডাকঘরঃধীতপুর");
        mThana.add("থানা/উপজেলাঃঈশ্বরগঞ্জ");
        mZella.add("জেলাঃময়মনসিংহ");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭১০-৪০২১৫৪/০১৭৪৬-১৮৮৭৮৮");




        mImageUrls.add(R.drawable.chest45);
        mChest.add("বক্ষনং-৪৫");
        mNames.add("আহমেদুল কবির");
        mDegs.add("স্টেশনঅফিসার");
        mFaNames.add("পিতারনামঃমোঃসুলতান উদ্দিন");
        mVills.add("গ্রামঃবীররামপুর");
        mPosts.add("ডাকঘরঃগফাকুড়িবাজার");
        mThana.add("থানা/উপজেলাঃত্রিশাল");
        mZella.add("জেলাঃময়মনসিংহ");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃঙ-");
        mPHones.add("মোবাইলনং-০১৮৬৬-৯০৭২২৭");




        mImageUrls.add(R.drawable.chest46);
        mChest.add("বক্ষনং-৪৬");
        mNames.add("মিজানুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃ জুনাবুররহমান");
        mVills.add("গ্রামঃ শালচূড়া");
        mPosts.add("ডাকঘরঃ রাংটিয়া");
        mThana.add("থানা/উপজেলাঃঝিনাইগাতী");
        mZella.add("জেলাঃশেরপুর");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৮৮১-০০৯১৮২/০১৭১৯-৪০২৯২৫");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৪৭");
        mNames.add("মোঃআব্দুল হাই");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃহারুনরশিদ");
        mVills.add("গ্রামঃআমবাডিয়া");
        mPosts.add("ডাকঘরঃআমবাডিয়া");
        mThana.add("থানা/উপজেলাঃমেলান্দহ");
        mZella.add("জেলাঃজামালপুর");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৯১৮-৯১৫৯৬০");




        mImageUrls.add(R.drawable.chest48);
        mChest.add("বক্ষনং-৪৮");
        mNames.add("মোহাম্মদ বোরহান আলী");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃশাহজাহান আলী");
        mVills.add("গ্রামঃপোড়ারচর");
        mPosts.add("ডাকঘরঃপোড়ারচর");
        mThana.add("থানা/উপজেলাঃইসলামপুর");
        mZella.add("জেলাঃজামালপুর");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃAB+");
        mPHones.add("মোবাইলনং-০১৭৪৫-৬৩০৬৯৭/০১৯২৯-৫৩৪৪৬৮");




        mImageUrls.add(R.drawable.chest49);
        mChest.add("বক্ষনং-৪৯");
        mNames.add("সুমন মিয়া");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃ মোঃ শাজাহান");
        mVills.add("গ্রামঃফুলতলা");
        mPosts.add("ডাকঘরঃএফকুচুটি");
        mThana.add("থানা/উপজেলাঃকালিহাতী");
        mZella.add("জেলাঃটাঙ্গাইল");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৭২৯-৬৪১৭৫৪/০১৯২৬৯৮৮১২৪");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৫০");
        mNames.add("রিফাত মল্লিক");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃজাহিদ মল্লিক");
        mVills.add("গ্রামঃ কহেলা");
        mPosts.add("ডাকঘরঃ ওয়ার্শী পাইকপাড়া");
        mThana.add("থানা/উপজেলাঃ মির্জাপুর");
        mZella.add("জেলাঃ টাঙ্গাইল");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃ A+");
        mPHones.add("মোবাইলনং-০১৭৫৭-৩০৬২৩০");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৫১");
        mNames.add("সঞ্জয় খান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আমিনুর রহমান খান");
        mVills.add("গ্রামঃ নতুন কহেলা");
        mPosts.add("ডাকঘরঃ রাজাপুর");
        mThana.add("থানা/উপজেলাঃ মির্জাপুর");
        mZella.add("জেলাঃ টাঙ্গাইল");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃ B+");
        mPHones.add("মোবাইলনং-০১৭২৩-৭৭৫৬৬৫/০১৬৮৪-১১৮৩৫০");




        mImageUrls.add(R.drawable.chest52);
        mChest.add("বক্ষনং-৫২");
        mNames.add("মোঃরাফি আল ফারুক");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ ফারুক উজ্জামান ভূইয়া");
        mVills.add("গ্রামঃউকিলপাড়া হোল্ডিংনং-৫০৯");
        mPosts.add("ডাকঘরঃকিশোরগঞ্জ");
        mThana.add("থানা/উপজেলাঃকিশোরগঞ্জ সদর");
        mZella.add("জেলাঃ কিশোরগঞ্জ");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৯১১-৫৮৫৭৯৭/০১৭১৯-৩৩৫৫৩২");




        mImageUrls.add(R.drawable.chest53);
        mChest.add("বক্ষন ং-৫৩");
        mNames.add("খাইরুল আলম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃতাহের উদ্দিন");
        mVills.add("গ্রামঃহ রিপুর");
        mPosts.add("ডাকঘরঃর ায়টুটী");
        mThana.add("থানা/উপজেলাঃ ইটনা");
        mZella.add("জেলাঃ কিশোরগঞ্জ");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃ B+");
        mPHones.add("মোবাইলনং-০১৭৩৮-৬০৪০১০");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৫৪");
        mNames.add("মোঃআশেক আল মারুফ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ গোলাম সারুয়ার");
        mVills.add("গ্রামঃ চরটেকী");
        mPosts.add("ডাকঘরঃ তারাকান্দী");
        mThana.add("থানা/উপজেলাঃ পাকুন্দিয়া");
        mZella.add("জেলাঃ কিশোরগঞ্জ");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃ B+");
        mPHones.add("মোবাইলনং-০১৬৭৬-২৮৫২৬৫");




        mImageUrls.add(R.drawable.chest55);
        mChest.add("বক্ষ নং-৫৫");
        mNames.add("মোঃ ফিরোজ মিয়া");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ জর্জ মিয়া");
        mVills.add("গ্রামঃপূর্ বকুতুবপুর");
        mPosts.add("ডাকঘরঃ হালিমপুর");
        mThana.add("থানা/উপজেলাঃ বাজিতপুর");
        mZella.add("জেলাঃ কিশোরগঞ্জ");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৯৬৬-১২০৫৪৫/০১৭৮২-০৯৮৫৮৬");




        mImageUrls.add(R.drawable.chest56);
        mChest.add("বক্ষ নং-৫৬");
        mNames.add("দেলোয়ার হোসেন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ মোশারফ হোসেন");
        mVills.add("গ্রামঃ থানেশ্বর");
        mPosts.add("ডাকঘরঃ বাদলা");
        mThana.add("থানা/উপজেলাঃ ইটনা");
        mZella.add("জেলাঃ কিশোরগঞ্জ");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃ O+");
        mPHones.add("মোবাইলনং-০১৭৫৯-৪০৪০৬০");

        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-৫৭");
        mNames.add("সোহেল আহমেদ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ জাহাঙ্গীর আলম");
        mVills.add("গ্রামঃ সাহেব পাড়া");
        mPosts.add("ডাকঘরঃ ধানকোড়া");
        mThana.add("থানা/উপজেলাঃ সাটুরিয়া");
        mZella.add("জেলাঃ মানিকগঞ্জ");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃ O+");
        mPHones.add("মোবাইলনং-০১৭১৩-৫১৫২১৮");




        mImageUrls.add(R.drawable.chest58);
        mChest.add("বক্ষ নং-৫৮");
        mNames.add("মোঃ শাজাহান হোসেন সাজ্জাদ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ সোলায়মান");
        mVills.add("গ্রামঃ নতুন বাইচাইল");
        mPosts.add("ডাকঘরঃ জাগীর");
        mThana.add("থানা/উপজেলাঃ মানিকগঞ্জ সদর");
        mZella.add("জেলাঃ মানিকগঞ্জ");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃ B+");
        mPHones.add("মোবাইলনং-০১৬৭১-১০৭৬০১");




        mImageUrls.add(R.drawable.chest59);
        mChest.add("বক্ষ নং-৫৯");
        mNames.add("মোঃ শফিকুল ইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আবুল কালাম ভূঁইয়া");
        mVills.add("গ্রামঃ দক্ষিনমাতুয়াইল মেডিকেল রোড-০৭");
        mPosts.add("ডাকঘরঃ তুাষারধারা");
        mThana.add("থানা/উপজেলাঃ কদমতলী");
        mZella.add("জেলাঃ ঢাকা");
        memail.add("ই-মেইলনং ");
        mblood.add("রক্তেরগ্রুপঃ B+");
        mPHones.add("vমোবাইলনং-০১৬৭৪-৮৭৮৩৪৩");

        mImageUrls.add(R.drawable.chest60);
        mChest.add("বক্ষ নং-৬০");
        mNames.add("মোঃ রুবেল আলম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ আব্দুল বারেক");
        mVills.add("গ্রামঃ শিবপুর");
        mPosts.add("ডাকঘরঃ সানোড়া");
        mThana.add("থানা/উপজেলাঃ ধামরাই");
        mZella.add("জেলাঃ ঢাকা");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃ A+");
        mPHones.add("মোবাইলনং-০১৯১১-৪৬২১৮৮");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষন ং-৬১");
        mNames.add("মোঃ শরীফুল ইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ কদ্দুস আলী");
        mVills.add("গ্রামঃ বাউটিয়া");
        mPosts.add("ডাকঘরঃ বেরশ");
        mThana.add("থানা/উপজেলাঃ ধামরাই");
        mZella.add("জেলাঃ ঢাকা");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃ B+");
        mPHones.add("মোবাইলনং-০১৬৭৫-৯১৫৫৫৩/০১৯২১-২২৪৩৭২");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-৬২");
        mNames.add("মুহাম্মদ আব্দুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মুহাম্মদ ইদ্রিস আলী");
        mVills.add("গ্রামঃ কুরগাঁও");
        mPosts.add("ডাকঘরঃ মির্জানগর");
        mThana.add("থানা/উপজেলাঃসাভার");
        mZella.add("জেলাঃঢাকা");
        memail.add("ই-মেইলনং-ahmedrafi98@gmail.com");
        mblood.add("রক্তেরগ্রুপঃ A+");
        mPHones.add("মোবাইলনং-০১৮১৭-৫৬২১৪৪");




        mImageUrls.add(R.drawable.chest63);
        mChest.add("বক্ষ নং-৬৩");
        mNames.add("মোঃ রাসেল মিয়া");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোহাম্মদ মহর আলী");
        mVills.add("গ্রামঃ মকিমপুর");
        mPosts.add("ডাকঘরঃ বারিন্দাবাজার");
        mThana.add("থানা/উপজেলাঃ ধামরাই");
        mZella.add("জেলাঃ ঢাকা");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃ O+");
        mPHones.add("মোবাইলনং-০১৭৩৭-০৪২৩৯৪");




        mImageUrls.add(R.drawable.chest64);
        mChest.add("বক্ষ নং-৬৪");
        mNames.add("মোঃজুলহাস উদ্দিন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মৃত লাল মিয়া");
        mVills.add("গ্রামঃ বালিথা");
        mPosts.add("ডাকঘরঃ সাহাবেনীশ্বর");
        mThana.add("থানা/উপজেলাঃ ধামরাই");
        mZella.add("জেলাঃ ঢাকা");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৭১৮-১৬১২৫৬/০১৯৯৯-৫২৩২৪৭");



        mImageUrls.add(R.drawable.chest65);
        mChest.add("বক্ষ নং-৬৫");
        mNames.add("মোঃতানভীর আহমেদ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃ মোঃশাহজাহান");
        mVills.add("গ্রামঃমধ্যনন্দীপাড়া");
        mPosts.add("ডাকঘরঃবাসাবো");
        mThana.add("থানা/উপজেলাঃখিলগাঁও");
        mZella.add("জেলাঃঢাকা");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৮১৩-০৯৬৪৮৬");




        mImageUrls.add(R.drawable.chest66);
        mChest.add("বক্ষ নং-৬৬");
        mNames.add("মোঃইমরান হোসেন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃইদ্রিস আলী");
        mVills.add("গ্রামঃইন্দরা");
        mPosts.add("ডাকঘরঃআমতা");
        mThana.add("থানা/উপজেলাঃধামরাই");
        mZella.add("জেলাঃঢাকা");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃই-");
        mPHones.add("মোবাইলনং-০১৬৮৭-৯৯০৪৯৮/০১৯৮৪-৬৬০৫০৪");




        mImageUrls.add(R.drawable.chest67);
        mChest.add("বক্ষ নং-৬৭");
        mNames.add("মোঃ সবুজ হোসেন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ মাসুদুর রহমান");
        mVills.add("গ্রামঃমদনদীয়া");
        mPosts.add("ডাকঘরঃমঙ্গলবাড়ী");
        mThana.add("থানা/উপজেলাঃধামরাই");
        mZella.add("জেলাঃঢাকা");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃAB+");
        mPHones.add("মোবাইলনং-০১৮৮৩-৯৬২৩৯৬");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৬৮");
        mNames.add("মোঃরাকিবুল হাসান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃনুরমোহাম্মদ");
        mVills.add("গ্রামঃকাশিপুর");
        mPosts.add("ডাকঘরঃকালামপুর");
        mThana.add("থানা/উপজেলাঃধামরাই");
        mZella.add("জেলাঃঢাকা");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৮৮৩-৭৯১৬৬৪");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৬৯");
        mNames.add("মোঃফয়সাল আখন্দ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃছিদ্দিকুর রহমান আখন্দ");
        mVills.add("গ্রামঃরাগদৈল");
        mPosts.add("ডাকঘরঃসাচাঁর");
        mThana.add("থানা/উপজেলাঃকচুয়া");
        mZella.add("জেলাঃচাঁদপুর");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৯১৩-৮১৮৩৫৭");




        mImageUrls.add(R.drawable.chest70);
        mChest.add("বক্ষ নং-৭০");
        mNames.add("রাম প্রসাদ পাল");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃব িদ্যানিধি পাল");
        mVills.add("গ্রামঃচাপাইর");
        mPosts.add("ডাকঘরঃকালিয়াকৈর");
        mThana.add("থানা/উপজেলাঃকালিয়াকৈর");
        mZella.add("জেলাঃগাজীপুর");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৬৭২-৪৯৫৭৪৯");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৭১");
        mNames.add("মোঃসাদিকুররহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃনজরুলখন্দকার");
        mVills.add("গ্রামঃবাড়ারচর");
        mPosts.add("ডাকঘরঃগয়েশপুর");
        mThana.add("থানা/উপজেলাঃপলাশ");
        mZella.add("জেলাঃনরসিংদী");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৯৬২-৮০৮১৮২");




        mImageUrls.add(R.drawable.chest72);
        mChest.add("বক্ষ নং-৭২");
        mNames.add("মোঃরাকিব");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ হেলাল উদ্দিন");
        mVills.add("গ্রামঃচৌপট");
        mPosts.add("ডাকঘরঃকুন্দারপাড়া");
        mThana.add("থানা/উপজেলাঃনরসিংদীসদর");
        mZella.add("জেলাঃনরসিংদী");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৭২৮-০১০৭৩৫");




        mImageUrls.add(R.drawable.chest73);
        mChest.add("বক্ষ নং-৭৩");
        mNames.add("মোঃরবিউলইসলাম");
        mDegs.add("স্টেশনঅফিসার");
        mFaNames.add("পিতারনামঃমোঃইউছুপমাতুব্বর");
        mVills.add("গ্রামঃগাড়–য়ারপাড়");
        mPosts.add("ডাকঘরঃকানফরদী");
        mThana.add("থানা/উপজেলাঃনগরকান্দা");
        mZella.add("জেলাঃফরিদপুর");
        memail.add("ই-মেইলনং-রংষধসৎ৯১১৮৫@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৭২৩-৯৬২২০০/০১৫৫১৬১৪৫৪০");




        mImageUrls.add(R.drawable.chest74);
        mChest.add("বক্ষ নং-৭৪");
        mNames.add("মোঃ জাফর শেখ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃতোফাজ্জেলশেখ");
        mVills.add("গ্রামঃআইজদ্দীনমাতুব্বরডাঙ্গী");
        mPosts.add("ডাকঘরঃবাকিগঞ্জ");
        mThana.add("থানা/উপজেলাঃকোতয়ালী");
        mZella.add("জেলাঃফরিদপুর");
        memail.add("ই-মেইলনং-ংযবরশযলধভধৎ৪৯০@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৭২৬-৪০৪২৬৭");




        mImageUrls.add(R.drawable.chest75);
        mChest.add("বক্ষ নং-৭৫");
        mNames.add("মোঃমেহেদীহাসান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃমোসলেমউদ্দিনবিশ্বাস");
        mVills.add("গ্রামঃবি-কয়া");
        mPosts.add("ডাকঘরঃবি-কয়া");
        mThana.add("থানা/উপজেলাঃকালুখালী");
        mZella.add("জেলাঃরাজবাড়ী");
        memail.add("ই-মেইলনং-যধংংধহ.সবযবফর১৯৭১@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৯১৫-৯৬৮৪০৭");



        mImageUrls.add(R.drawable.chest76);
        mChest.add("বক্ষ নং-৭৬");
        mNames.add("বিজন বিশ্বাস");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃমৃতসুনীলচন্দ্রবিশ্বাস");
        mVills.add("গ্রামঃপিড়ালীপাড়া");
        mPosts.add("ডাকঘরঃহাটবনগ্রাম");
        mThana.add("থানা/উপজেলাঃপাংশা");
        mZella.add("জেলাঃরাজবাড়ী");
        memail.add("ই-মেইলনং-নরলড়হনরংধিং@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৯৬২-৩৯০৪৪০");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-৭৭");
        mNames.add("আবু জাফর");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ আব্দুল মাজেদ");
        mVills.add("গ্রামঃলক্ষনদিয়া");
        mPosts.add("ডাকঘরঃহলুদবাড়ীয়া");
        mThana.add("থানা/উপজেলাঃপাংশা");
        mZella.add("জেলাঃরাজবাড়ী");
        memail.add("ই-মেইলনং-ধনুঁধভড়ৎ.ভংপফ@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭১১-৪২৮৬৬১");




        mImageUrls.add(R.drawable.chest78);
        mChest.add("বক্ষ নং-৭৮");
        mNames.add("মোঃ হাবিবুল্লাহ খান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃসুলতানআহমেদখান");
        mVills.add("গ্রামঃফলসী");
        mPosts.add("ডাকঘরঃনিঝামকান্দী");
        mThana.add("থানা/উপজেলাঃকাশিয়ানী");
        mZella.add("জেলাঃগোপালগঞ্জ");
        memail.add("ই-মেইলনং-সযশনধঢ়ঢ়ু৫০@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৭৫৭-৪৪৩৮৯৯");




        mImageUrls.add(R.drawable.chest79);
        mChest.add("বক্ষ নং-৭৯");
        mNames.add("শরীফআমিনুলইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ শরীফরেজাউল হক");
        mVills.add("গ্রামঃগোপীনাথপুর");
        mPosts.add("ডাকঘরঃমেরীগোপীনাথপুর");
        mThana.add("থানা/উপজেলাঃগোপালগঞ্জসদর");
        mZella.add("জেলাঃগোপালগঞ্জ");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭৫৬-৮১৪৩৬৩");




        mImageUrls.add(R.drawable.chest80);
        mChest.add("বক্ষ নং-৮০");
        mNames.add("আবদুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ হাবিবুর রহমান মোল্লা");
        mVills.add("গ্রামঃচরশুক্তাইল");
        mPosts.add("ডাকঘরঃচন্দ্রদিঘলিয়া");
        mThana.add("থানা/উপজেলাঃগোপালগঞ্জসদর");
        mZella.add("জেলাঃগোপালগঞ্জ");
        memail.add("ই-মেইলনং-ধনফঁৎ২৬০০@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৯১১-১১৯১৬৭");




        mImageUrls.add(R.drawable.chest81);
        mChest.add("বক্ষ নং-৮১");
        mNames.add("মিজানুর রহমান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ তোকাদ্দ্সে হোসেন");
        mVills.add("গ্রামঃকাঠী");
        mPosts.add("ডাকঘরঃকাঠীবাজার");
        mThana.add("থানা/উপজেলাঃগোপালগঞ্জসদর");
        mZella.add("জেলাঃগোপালগঞ্জ");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৬১৮-২৯২৬৬৬");




        mImageUrls.add(R.drawable.chest82);
        mChest.add("বক্ষ নং-৮২");
        mNames.add("ইফতেখার হোসেন রায়হান চেীধুরী");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ কমরউদ্দীন চৌধুরী");
        mVills.add("গ্রামঃদলইরগাঁওমাঝপাড়া");
        mPosts.add("ডাকঘরঃখাগাইলবাজার");
        mThana.add("থানা/উপজেলাঃকোম্পানীগঞ্জ");
        mZella.add("জেলাঃসিলেট");
        memail.add("ই-মেইলনং-ৎধুযধহংুষ১৩@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭৪২-৮৭৩৩৭৫");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষ নং-৮৩");
        mNames.add("মোঃবেলায়েত হোসেন সুজন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ কাজী আব্দুল মান্নান");
        mVills.add("গ্রামঃমহিমাউড়া");
        mPosts.add("ডাকঘরঃপঞ্চাশ");
        mThana.add("থানা/উপজেলাঃচুনারুঘাট");
        mZella.add("জেলাঃহবিগঞ্জ");
        memail.add("ই-মেইলনং-ংঃ.ৎধযঁষ১০@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৬৭২-২৭৭০৩৫");


        mImageUrls.add(R.drawable.chest84);
        mChest.add("বক্ষ নং-৮৪");
        mNames.add("নিউটন দাশ তালুকদার");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃনারায়নদাশতালুকদার");
        mVills.add("গ্রামঃগয়াহরি");
        mPosts.add("ডাকঘরঃনবীগঞ্জ");
        mThana.add("থানা/উপজেলাঃনবীগঞ্জ");
        mZella.add("জেলাঃহবিগঞ্জ");
        memail.add("ই-মেইলনং-হবঃিড়হসঁহহধ৮৯@ুধযড়ড়.পড়স");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৭১২-৩০২৩৩৮");




        mImageUrls.add(R.drawable.chest85);
        mChest.add("বক্ষ নং-৮৫");
        mNames.add("আরিফুল ইসলাম");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মৃত রমজান আলী");
        mVills.add("গ্রামঃবাড়াইল");
        mPosts.add("ডাকঘরঃসলিমগঞ্জ");
        mThana.add("থানা/উপজেলাঃনবীনগর");
        mZella.add("জেলাঃবি.বাড়ীয়া");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৬২৬-৩১৯৯৩২");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৮৬");
        mNames.add("জামিম");
        mDegs.add("স্টেশনঅফিসার");
        mFaNames.add("পিতারনামঃআঃঅদুদ");
        mVills.add("গ্রামঃকদমতলী");
        mPosts.add("ডাকঘরঃসোনারামপুর");
        mThana.add("থানা/উপজেলাঃবানছারামপুর");
        mZella.add("জেলাঃবি.বাড়ীয়া");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৯১৪-৮৭১৩০৬");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৮৭");
        mNames.add("মোঃরোবেলমিয়া");
        mDegs.add("স্টেশনঅফিসার");
        mFaNames.add("পিতারনামঃমোঃসিরাজুলইসলাম");
        mVills.add("গ্রামঃদৌলতপুর");
        mPosts.add("ডাকঘরঃপাঁচগাছিয়া");
        mThana.add("থানা/উপজেলাঃদাউদকান্দি");
        mZella.add("জেলাঃকুমিল্লা");
        memail.add("ই-মেইলনং-  ");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৮৩৫-০৯২৬৫৮/০১৯৩৭-০১২১২৫");



        mImageUrls.add(R.drawable.chest88);
        mChest.add("বক্ষ নং-৮৮");
        mNames.add("মোঃসাইফুল হাছান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃশামসুলহক");
        mVills.add("গ্রামঃরামচন্দ্রপুর");
        mPosts.add("ডাকঘরঃসালদানদী");
        mThana.add("থানা/উপজেলাঃব্রাক্ষনপাড়া");
        mZella.add("জেলাঃকুমিল্লা");
        memail.add("ই-মেইলনং-ংধরভঁষযধংধহ৭০২@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭৯৭-১২৫৬৬৭");




        mImageUrls.add(R.drawable.chest89);
        mChest.add("বক্ষ নং-৮৯");
        mNames.add("মোঃরায়হান");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃআলীআক্কছ");
        mVills.add("গ্রামঃদক্ষিনপাঁচগাছিয়া");
        mPosts.add("ডাকঘরঃছেংগারচরবাজার");
        mThana.add("থানা/উপজেলাঃমতলবউত্তর");
        mZella.add("জেলাঃচাঁদপুর");
        memail.add("ই-মেইলনং-ৎধুযধহ.হবংি২৪@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৭৩৬-৯৮৩৩৯২");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-৯০");
        mNames.add("শরিফআহম্মেদকবির");
        mDegs.add("স্টেশনঅফিসার");
        mFaNames.add("পিতারনামঃরশিদআহম্মদকবির");
        mVills.add("গ্রামঃউত্তরমজুপুর");
        mPosts.add("ডাকঘরঃলক্ষীপুর");
        mThana.add("থানা/উপজেলাঃলক্ষীপুরসদর");
        mZella.add("জেলাঃলক্ষীপুর");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৭৪৫-৫২৮০২১");




        mImageUrls.add(R.drawable.chest91);
        mChest.add("বক্ষ নং-৯১");
        mNames.add("মোহাম্মদ ইমদাদুল হক লিটন");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমোঃমাহাবুবুলহক");
        mVills.add("গ্রামঃঅলিপুর");
        mPosts.add("ডাকঘরঃধলিয়াবাজার");
        mThana.add("থানা/উপজেলাঃফেনীসদর");
        mZella.add("জেলাঃফেনী");
        memail.add("ই-মেইলনং-ষরঃড়হ.ঃরঃঁসরৎ@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃAB+");
        mPHones.add("মোবাইলনং-০১৭১১-০৭৯৪৪৭");




        mImageUrls.add(R.drawable.chest92);
        mChest.add("বক্ষ নং-৯২");
        mNames.add("মোহাম্মদ জাহেদ চেীধুরী");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতার নামঃ মোহাম্মদ আবুল হাশেম চৌধুরী ");
        mVills.add("গ্রামঃআলমপুর");
        mPosts.add("ডাকঘরঃসুলতাননগর");
        mThana.add("থানা/উপজেলাঃহাটহাজারী");
        mZella.add("জেলাঃচট্টগ্রাম");
        memail.add("ই-মেইলনং-পঃমলধযবফ৩৬@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৮১৬-৪৩৯৮৩৬");




        mImageUrls.add(R.drawable.chest93);
        mChest.add("বক্ষ নং-৯৩");
        mNames.add("মুকুল কুমার নাথ");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃমৃতবীরেন্দ্রকুমারনাথ");
        mVills.add("গ্রামঃদক্ষিনবাঁশবাড়ীয়া");
        mPosts.add("ডাকঘরঃবাঁশবাড়ীয়া");
        mThana.add("থানা/উপজেলাঃসীতাকুন্ড");
        mZella.add("জেলাঃচট্টগ্রাম");
        memail.add("ই-মেইলনং-সঁশঁষহধঃয৪০@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৮৪০-৪৪৫৬৬৩/০১৮৫৫-৬৩৯৬৯৫");




        mImageUrls.add(R.drawable.chest94);
        mChest.add("বক্ষ নং-৯৪");
        mNames.add("রাজেশ বড়–য়া");
        mDegs.add("স্টেশন অফিসার");
        mFaNames.add("পিতারনামঃ শংকরপ্রসাদ বড়–য়া");
        mVills.add("গ্রামঃ১নংপাথরঘাটা");
        mPosts.add("ডাকঘরঃরাঙ্গামাটি");
        mThana.add("থানা/উপজেলাঃরাঙ্গামাটি");
        mZella.add("জেলাঃরাঙ্গামাটি");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৮১৪-২৬১১৪৯");




        mImageUrls.add(R.drawable.chest1s);
        mChest.add("বক্ষ নং-০১");
        mNames.add("মোঃ জাহাঙ্গীর আলম সরকার");
        mDegs.add("স্টফ অফিসার");
        mFaNames.add("পিতারনামঃমৃতসামসুলহকসরকার");
        mVills.add("গ্রামঃউত্তরআরাজীচড়াইখোলা");
        mPosts.add("ডাকঘরঃদারোয়ানীসুতাকল");
        mThana.add("থানা/উপজেলাঃনীলফামারীসদর");
        mZella.add("জেলাঃনীলফামারী");
        memail.add("ই-মেইলনং-লধযধহমরৎ.ঁবঢ়ু@ুধযড়ড়.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭৩৩-২৯১২৭২");


        mImageUrls.add(R.drawable.chest2s);
        mChest.add("বক্ষ নং-০২");
        mNames.add("মোঃরোকনুজ্জামান (রোমান)");
        mDegs.add("স্টফ অফিসার");
        mFaNames.add("পিতারনামঃমোঃআঃরাজ্জাক");
        mVills.add("গ্রামঃবুঃকোমরপুর");
        mPosts.add("ডাকঘরঃবালারহাট");
        mThana.add("থানা/উপজেলাঃমিঠাপুকুর");
        mZella.add("জেলাঃরংপুর");
        memail.add("ই-মেইলনং-সফৎড়সধহ৯২৯২@ুধযড়ড়.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭২৩-৮৪৫২৭৪");



        mImageUrls.add(R.drawable.chest03s);
        mChest.add("বক্ষ নং-০৩");
        mNames.add("মোঃরাশেদুররহমান");
        mDegs.add("স্টফ অফিসার");
        mFaNames.add("পিতারনামঃমোঃফজলুলকরিমসরকার");
        mVills.add("গ্রামঃদীঘাপাড়া");
        mPosts.add("ডাকঘরঃহাটশেরপুর");
        mThana.add("থানা/উপজেলাঃসারিয়াকান্দী");
        mZella.add("জেলাঃবগুড়া");
        memail.add("ই-মেইলনং-ৎধংযবফংধৎশবৎ৮৯@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃAB+");
        mPHones.add("মোবাইলনং-০১৭৩৭-১৫৩৯৫১/০১৯১৮-১৫১৭০৯");



        mImageUrls.add(R.drawable.chest15s);
        mChest.add("বক্ষ নং-০৪");
        mNames.add("মোঃওয়ালিফ হোসেন");
        mDegs.add("স্টফ অফিসার");
        mFaNames.add("পিতার নামঃ মোঃ তোফাজ্জেল হোসেন");
        mVills.add("গ্রামঃশ্যামপুর");
        mPosts.add("ডাকঘরঃদুর্বাচারা");
        mThana.add("থানা/উপজেলাঃকুষ্টিয়াসদর");
        mZella.add("জেলাঃকুষ্টিয়া");
        memail.add("ই-মেইলনং-ধিষরভযড়ংংধরহ৮৬৬৮@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৭৩৯-৩৮৮৬৬৮");





        mImageUrls.add(R.drawable.chest5s);
        mChest.add("বক্ষ নং-০৫");
        mNames.add("মোঃশিমুলরানা");
        mDegs.add("স্টফ অফিসার");
        mFaNames.add("পিতারনামঃমোঃতহিদুলইসলাম");
        mVills.add("গ্রামঃমোল্লাতেঘরিয়া");
        mPosts.add("ডাকঘরঃকুষ্টিয়া");
        mThana.add("থানা/উপজেলাঃকুষ্টিয়াসদর");
        mZella.add("জেলাঃকুষ্টিয়া");
        memail.add("ই-মেইলনং-ংযরসঁষৎধহধ২৯@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃAB+");
        mPHones.add("মোবাইলনং-০১৭৪৯-০৬৪৫০৩");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-০৬");
        mNames.add("রেজওয়ানআহম্মেদ");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃমোঃমহিউদ্দিন");
        mVills.add("গ্রামঃগাংনী");
        mPosts.add("ডাকঘরঃগাংনী");
        mThana.add("থানা/উপজেলাঃগাংনী");
        mZella.add("জেলাঃমেহেরপুর");
        memail.add("ই-মেইলনং-ধযসবফৎধুঁধহ@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৯১৯-৮২১৯১৭/০১৭৬২-৭০০৮৪২");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-০৭");
        mNames.add("শামীমরেজা");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃমৃতরুস্তমআলীমালিতা");
        mVills.add("গ্রামঃআড়পাড়া");
        mPosts.add("ডাকঘরঃরতনহাট");
        mThana.add("থানা/উপজেলাঃঝিনাইদাহ");
        mZella.add("জেলাঃঝিনাইদাহ");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৯৪১-৭৭০৫৩৫");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-০৮");
        mNames.add("মোঃগোলামকিবরিয়া");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃমৃতশমসেরআলী");
        mVills.add("গ্রামঃকৃষ্ণনগরপাড়া");
        mPosts.add("ডাকঘরঃঝিনাইদাহ");
        mThana.add("থানা/উপজেলাঃঝিনাইদাহসদর");
        mZella.add("জেলাঃঝিনাইদাহ");
        memail.add("ই-মেইলনং-মশরনৎবধ৩৬@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৯১১-৩৫৫৬৩৬");




        mImageUrls.add(R.drawable.chest10s);
        mChest.add("বক্ষ নং-১০");
        mNames.add("মোঃরয়েল আহমেদ");
        mDegs.add("স্টফ অফিসার");
        mFaNames.add("পিতারনামঃমোঃআকমতআলী");
        mVills.add("গ্রামঃদাইতলা");
        mPosts.add("ডাকঘরঃফাতপুর");
        mThana.add("থানা/উপজেলাঃকোতোয়ালী");
        mZella.add("জেলাঃযশোর");
        memail.add("ই-মেইলনং-ৎড়ুবষধযসবফ.৫৮৯@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৯১৬-১০২২১২/০১৯৩২-০৮৮২১৯");



        mImageUrls.add(R.drawable.chest11s);
        mChest.add("বক্ষ নং-১১");
        mNames.add("জান্নাতুল ফেরদাউস");
        mDegs.add("স্টফ অফিসার");
        mFaNames.add("পিতার নামঃ মোঃআবুলকালাম");
        mVills.add("গ্রামঃমনিরামপুর");
        mPosts.add("ডাকঘরঃমনিরামপুর");
        mThana.add("থানা/উপজেলাঃমনিরামপুর");
        mZella.add("জেলাঃযশোর");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭৪৩-৮৩৩৯৮৬");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-১২");
        mNames.add("শেখমামুনুররশিদ");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃশেখমাহবুবউলআলম");
        mVills.add("গ্রামঃপাটাকেলঘাটা");
        mPosts.add("ডাকঘরঃপাটাকেলঘাটা");
        mThana.add("থানা/উপজেলাঃতালা");
        mZella.add("জেলাঃসাতক্ষীরা");
        memail.add("ই-মেইলনং-ংযশ.সধসঁহ০৪@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭২২-৫৫৭১৮৪/০১৯১৫-৯৯৯৫৬৮");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-১৩");
        mNames.add("মোঃহাবিজুররহমান");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃমৃতফজলুলহক");
        mVills.add("গ্রামঃবালিয়ামারী");
        mPosts.add("ডাকঘরঃডিগ্রীরচর");
        mThana.add("থানা/উপজেলাঃইসলামপুর");
        mZella.add("জেলাঃজামালপুর");
        memail.add("ই-মেইলনং-যধনরুঁৎৎধযসধহ৮১৫১@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৯৫১-৯১৮১৫১/০১৭৮২-৪৮৬২৬২");




        mImageUrls.add(R.drawable.chest14s);
        mChest.add("বক্ষ নং-১৪");
        mNames.add("এ. এস.এম.মহসিন (অনিক)");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃমোঃআমিনুলইসলাম");
        mVills.add("গ্রামঃমিয়াপাড়া");
        mPosts.add("ডাকঘরঃবকসীগঞ্জ");
        mThana.add("থানা/উপজেলাঃবকশিগঞ্জ");
        mZella.add("জেলাঃজামালপুর");
        memail.add("ই-মেইলনং-ধহরশ৫৭৪০৪১@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৭১০-৫৮৬৬৩০");



        mImageUrls.add(R.drawable.chest15s);
        mChest.add("বক্ষ নং-১৫");
        mNames.add("সৈয়দ মোহাম্মদ সুজন");
        mDegs.add("স্টফ অফিসার");
        mFaNames.add("পিতারনামঃগোলামমোস্তফা");
        mVills.add("গ্রামঃঝালরচরপশ্চিমপাড়া");
        mPosts.add("ডাকঘরঃজব্বারগঞ্জ");
        mThana.add("থানা/উপজেলাঃবকশিগঞ্জ");
        mZella.add("জেলাঃজামালপুর");
        memail.add("ই-মেইলনং-ংশংঁলধহভংপফ০০@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৯২৪-৩২২১৪৩/০১৭৬০-৪০২৭৪১");



        mImageUrls.add(R.drawable.chest16s);
        mChest.add("বক্ষনং-১৬");
        mNames.add("রোজীনাআক্তার");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃআজাহারউদ্দিন");
        mVills.add("গ্রামঃকরজনা");
        mPosts.add("ডাকঘরঃবড়টিয়া");
        mThana.add("থানা/উপজেলাঃঘিওর");
        mZella.add("জেলাঃমানিকগঞ্জ");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৬২৯-০৭৩৫২৭");




        mImageUrls.add(R.drawable.chest17s);
        mChest.add("বক্ষনং-১৭");
        mNames.add("রাজুআহমেদ");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃমোঃআব্দুলমজিদ");
        mVills.add("গ্রামঃবাউখওধানকোড়া");
        mPosts.add("ডাকঘরঃসাটুরিয়া");
        mThana.add("থানা/উপজেলাঃসাটুরিয়া");
        mZella.add("জেলাঃমানিকগঞ্জ");
        memail.add("ই-মেইলনং-ৎধলঁধযসবফ৫৩৫৩১২@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭১৮-৫৩৫৩১২");




        mImageUrls.add(R.drawable.chest18s);
        mChest.add("বক্ষনং-১৮");
        mNames.add("রহিদুররহমানমৃর্ধা");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃআতিকুররহমানমৃর্ধা");
        mVills.add("গ্রামঃ১০৬/৬, এ, মনিপুড়ীপাড়া");
        mPosts.add("ডাকঘরঃতেজগাঁও");
        mThana.add("থানা/উপজেলাঃতেজগাঁও");
        mZella.add("জেলাঃঢাকা");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৬৭০-২০৩৪৪০");



        mImageUrls.add(R.drawable.chest19s);
        mChest.add("বক্ষনং-১৯");
        mNames.add("জেরিজ্যাকরোজারিও");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃইগ্নেশিউমরোজারিও");
        mVills.add("গ্রামঃ১০৫/১২/এ, মনিপুড়ীপাড়া");
        mPosts.add("ডাকঘরঃতেজগাঁও");
        mThana.add("থানা/উপজেলাঃতেজগাঁও");
        mZella.add("জেলাঃঢাকা");
        memail.add("ই-মেইলনং-লধপশৎড়ুধৎরড়.৫৫৪@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৬১১-২১৮০৫০");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-২০");
        mNames.add("সাইদুলইসলাম");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃআব্দুলমজিদ");
        mVills.add("গ্রামঃগওগাঁও");
        mPosts.add("ডাকঘরঃগওগাঁওবাজার");
        mThana.add("থানা/উপজেলাঃধামরাই");
        mZella.add("জেলাঃঢাকা");
        memail.add("ই-মেইলনং-ংধরফঁষরংষধস৫০০৬৬৯@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃO+");
        mPHones.add("মোবাইলনং-০১৯১১-৭৩৯১২১");




        mImageUrls.add(R.drawable.chest21s);
        mChest.add("বক্ষনং-২১");
        mNames.add("সুজনকুমারহালদার");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃঅজিতকুমারহালদার");
        mVills.add("গ্রামঃপারনারায়নপুর");
        mPosts.add("ডাকঘরঃপাংশা");
        mThana.add("থানা/উপজেলাঃপাংশা");
        mZella.add("জেলাঃরাজবাড়ী");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭২৭-১২৩৭১৬/০১৯১০-৪৩৩২৯৯");




        mImageUrls.add(R.drawable.chest22s);
        mChest.add("বক্ষনং-২২");
        mNames.add("উদ্দিপনভক্ত");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃহাতিন্দ্রনাথভক্ত");
        mVills.add("গ্রামঃচৌরাশী");
        mPosts.add("ডাকঘরঃবাজিতপুর");
        mThana.add("থানা/উপজেলাঃরাজৈর");
        mZella.add("জেলাঃমাদারীপুর");
        memail.add("ই-মেইলনং-ঁফফরঢ়ড়হনযধশঃধ@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭৩৪-৪০৩০৫৭");



        mImageUrls.add(R.drawable.chest23s);
        mChest.add("বক্ষনং-২৩");
        mNames.add("মনোতোষমল্লিক");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃঅসিমমল্লিক");
        mVills.add("গ্রামঃরূপাপুর");
        mPosts.add("ডাকঘরঃসোনাপুর");
        mThana.add("থানা/উপজেলাঃবালাগঞ্জ");
        mZella.add("জেলাঃসিলেট");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৭১৫-৮৫৪৯৮০");



        mImageUrls.add(R.drawable.chest24s);
        mChest.add("বক্ষনং-২৪");
        mNames.add("রাহুলদেবনাথ");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃসুভাষচন্দ্রদেবনাথ");
        mVills.add("গ্রামঃতেঁতৈয়া");
        mPosts.add("ডাকঘরঃমাধবসিংহ");
        mThana.add("থানা/উপজেলাঃবেগমগঞ্জ");
        mZella.add("জেলাঃনোয়াখালী");
        memail.add("ই-মেইলনং-ৎধযঁষফবনহধঃয০০১@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৭৪২-৮২৩১৯০");




        mImageUrls.add(R.drawable.chest25s);
        mChest.add("বক্ষনং-২৫");
        mNames.add("মোঃইসমাইলহোসেন");
        mDegs.add("স্টফঅফিসার");
        mFaNames.add("পিতারনামঃমৃতসিরাজুলইসলাম");
        mVills.add("গ্রামঃকামারপুকুরিয়া");
        mPosts.add("ডাকঘরঃরাজাপুর");
        mThana.add("থানা/উপজেলাঃদাগনভূ্ইঁয়া");
        mZella.add("জেলাঃফেনী");
        memail.add("ই-মেইলনং-রংসধরষ.ভবহর২৪@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃA+");
        mPHones.add("মোবাইলনং-০১৬২৭-৮১১৪৪৬");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-০১");
        mNames.add("মোঃশামীমআহমেদ");
        mDegs.add("জুনিয়রপ্রশিক্ষক");
        mFaNames.add("পিতারনামঃআব্দুররশিদমিয়া");
        mVills.add("গ্রামঃগকুলনগর");
        mPosts.add("ডাকঘরঃগকুলনগর");
        mThana.add("থানা/উপজেলাঃবাঞ্জারামপুর");
        mZella.add("জেলাঃবি-বাড়ীয়া");
        memail.add("ই-মেইলনং- ");
        mblood.add("রক্তেরগ্রুপঃB+");
        mPHones.add("মোবাইলনং-০১৬২৯-০৯৮০১৫");



        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-");
        mNames.add("সেন্টুচন্দ্রসেন");
        mDegs.add("ফিজিক্যালইন্সট্রাক্টর");
        mFaNames.add("পিতারনামঃগৌরাঙ্গচন্দ্রসেন");
        mVills.add("গ্রামঃভাটুনীখোলা");
        mPosts.add("ডাকঘরঃটামটা");
        mThana.add("থানা/উপজেলাঃশাহরাস্তি");
        mZella.add("জেলাঃচাঁদপুর");
        memail.add("ই-মেইলনং-");
        mblood.add("রক্তেরগ্রুপঃ");
        mPHones.add("মোবাইলনং-০১৯১৬-৬৭৭৩৩৯");




        mImageUrls.add(R.drawable.rafi2);
        mChest.add("বক্ষনং-");
        mNames.add("তৌহিদুলইসলাম");
        mDegs.add("ফিজিক্যালইন্সট্রাক্টর");
        mFaNames.add("পিতারনামঃসামছউদ্দিন");
        mVills.add("গ্রামঃচরখামা");
        mPosts.add("ডাকঘরঃমঠখোলা");
        mThana.add("থানা/উপজেলাঃপাকুন্দিয়া");
        mZella.add("জেলাঃকিশোরগঞ্জ");
        memail.add("ই-মেইলনং-ংযবঢ়ড়হসঃ@মসধরষ.পড়স");
        mblood.add("রক্তেরগ্রুপঃ");
        mPHones.add("মোবাইলনং-০১৭৯২-০২৩০৯৬/০১৬৮৫-৮৮২৭৩১");







        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        InfoAdapter adapter = new InfoAdapter(this, mNames, mImageUrls,mDegs,mFaNames,mVills,mPosts,mPHones,mChest,mThana,mZella,memail,mblood);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void organizedBtn(View v){

        Intent dashBord = new Intent(this, Organizer.class);
        startActivity(dashBord);



    }
}
