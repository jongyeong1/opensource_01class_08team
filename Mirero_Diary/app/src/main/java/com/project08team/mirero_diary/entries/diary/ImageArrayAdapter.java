package com.project08team.mirero_diary.entries.diary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.project08team.mirero_diary.R;
import com.project08team.mirero_diary.shared.ThemeManager;

/**
 *
 */

public class ImageArrayAdapter extends ArrayAdapter<Integer> {

    private Integer[] images;
    private LayoutInflater inflater;
    private Context mContext;

    public ImageArrayAdapter(Context context, Integer[] images) {
        super(context, R.layout.spinner_imageview, images);
        this.images = images;
        this.inflater = LayoutInflater.from(context);
        this.mContext = context;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.spinner_imageview, parent, false);
        }
        return getImageForPosition(position, convertView);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.spinner_imageview, parent, false);
        }
        return getImageForPosition(position, convertView);
    }

    private View getImageForPosition(int position, View rootView) {
        ImageView imageView = (ImageView) rootView.findViewById(R.id.IV_spinner);
        imageView.setImageResource(images[position]);
        imageView.setColorFilter(ThemeManager.getInstance().getThemeDarkColor(mContext));
        return rootView;
    }
}
