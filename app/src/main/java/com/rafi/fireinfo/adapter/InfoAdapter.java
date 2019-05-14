package com.rafi.fireinfo.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.rafi.fireinfo.R;
import com.rafi.fireinfo.activity.InfoDetails;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by User on 1/1/2018.
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<Integer> mImages = new ArrayList<>();
    private ArrayList<String> mDegs = new ArrayList<>();
    private ArrayList<String> mFaNames = new ArrayList<>();
    private ArrayList<String> mVills = new ArrayList<>();
    private ArrayList<String> mPosts = new ArrayList<>();
    private ArrayList<String> mPhones = new ArrayList<>();
    //self
    private ArrayList<String> mChest = new ArrayList<>();
    private ArrayList<String> mThana = new ArrayList<>();
    private ArrayList<String> mZella = new ArrayList<>();
    private ArrayList<String> memail = new ArrayList<>();
    private ArrayList<String> mblood = new ArrayList<>();

    private Context mContext;

    public InfoAdapter(Context context, ArrayList<String> imageNames, ArrayList<Integer> images, ArrayList<String> imageDegs, ArrayList<String> imageFanames, ArrayList<String> imageVills, ArrayList<String> imagePosts,ArrayList<String> imagePhons,ArrayList<String> imageChest,ArrayList<String> imageThana,ArrayList<String> imageZella,ArrayList<String> imageEmail,ArrayList<String> imageBlood) {
        mImageNames = imageNames;
        mImages = images;
        mDegs = imageDegs;
        mFaNames = imageFanames;
        mVills = imageVills;
        mPosts = imagePosts;
        mPhones = imagePhons;
        mContext = context;
        // self
        mChest = imageChest;
        mThana = imageThana;
        mZella = imageZella;
        memail = imageEmail;
        mblood = imageBlood;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.info_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

//        Glide.with(mContext)
//                .asBitmap()
//                .load(mImages.get(position))
//                .into(holder.image);

        if (position % 2 == 1) {
            holder.itemView.setBackgroundColor(Color.parseColor("#E3E0E0"));
            //  holder.imageView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            //  holder.imageView.setBackgroundColor(Color.parseColor("#FFFAF8FD"));
        }






        holder.imageName.setText(mImageNames.get(position));
        Picasso.get().load(mImages.get(position)).into(holder.image);
        //self
        //holder.imageChest.setText(mChest.get(position));
        holder.imageDeg.setText(mDegs.get(position));
        holder.imagePhone.setText(mPhones.get(position));




        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));

                Toast.makeText(mContext, mPhones.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, InfoDetails.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));
                intent.putExtra("image_deg", mDegs.get(position));
                intent.putExtra("image_father_name", mFaNames.get(position));
                intent.putExtra("image_phone", mPhones.get(position));
                intent.putExtra("image_vill", mVills.get(position));
                intent.putExtra("image_post", mPosts.get(position));
                // self
                intent.putExtra("image_chest", mChest.get(position));
                intent.putExtra("image_Thana", mThana.get(position));
                intent.putExtra("image_Zella", mZella.get(position));
                intent.putExtra("image_Email", memail.get(position));
                intent.putExtra("image_Blood", mblood.get(position));

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName,imageDeg,imagePhone,imageChest;

        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            //self
            imageChest = itemView.findViewById(R.id.image_chest);

            imageName = itemView.findViewById(R.id.image_name);
            imageDeg = itemView.findViewById(R.id.image_deg);
            imagePhone = itemView.findViewById(R.id.image_phn);

            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}















