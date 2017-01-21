package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gongkai on 2017/1/16.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, ArrayList<Place> places){
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place currentPlace = getItem(position);

        LinearLayout itemView = (LinearLayout) convertView.findViewById(R.id.item_view);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.image_view);
        TextView nameView = (TextView) itemView.findViewById(R.id.item_name);
        TextView contentView = (TextView) itemView.findViewById(R.id.item_content);

        if( currentPlace.hasImage()){
            // has image
            imageView.setVisibility(ImageView.VISIBLE);
            imageView.setImageResource(currentPlace.getImageReSourceIDID());
        } else {
            // No Image
            imageView.setVisibility(ImageView.GONE);
        }

        if(currentPlace.hasName())
            nameView.setText( currentPlace.getName() );

        if(currentPlace.hasAddress())
            contentView.setText( currentPlace.getAddress());

        return convertView;
    }
}
