package com.example.amma.travel_guide;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GalleryImageAdapter extends BaseAdapter
{
    private Context mContext;



    public GalleryImageAdapter(Context context)
    {
        mContext = context;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup)
    {
        // TODO Auto-generated method stub
        ImageView i = new ImageView(mContext);

        i.setImageResource(mImageIds[index]);
        i.setLayoutParams(new Gallery.LayoutParams(200, 200));

        i.setScaleType(ImageView.ScaleType.FIT_XY);




        return i;
    }

    public Integer[] mImageIds = {

            R.drawable.wayanad,
            R.drawable.gavi,
            R.drawable.athirapally,
            R.drawable.varkala,
            R.drawable.thekkady,
            R.drawable.allapy,
            R.drawable.munnar,
            R.drawable.kasa,
            R.drawable.kasa2,
            R.drawable.thekkady,
            R.drawable.theyyam,
            R.drawable.thekkady1,
            R.drawable.kochisky,
            R.drawable.nelli,
            R.drawable.bekal,
            R.drawable.kumarakam,
            R.drawable.malamp2


    };


}
