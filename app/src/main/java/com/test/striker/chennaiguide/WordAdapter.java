package com.test.striker.chennaiguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.test.striker.chennaiguide.R;
import com.test.striker.chennaiguide.Word;

import java.util.ArrayList;

/**
 * Created by sarthak on 9/6/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
public WordAdapter(Context context, ArrayList<Word> word)
{
    super(context,0,word);
}

@NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
{
    View listItemView = convertView;
    if (listItemView==null){
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
    }
    Word currentWord = getItem(position);
    TextView nameTextView = (TextView) listItemView.findViewById(R.id.textView);
    nameTextView.setText(currentWord.getName());

    TextView descTextView = (TextView) listItemView.findViewById(R.id.textView2);
    descTextView.setText(currentWord.getDesc());

    TextView ratingTextView = (TextView) listItemView.findViewById(R.id.textView3);
    ratingTextView.setText(currentWord.getRating());

    return listItemView;
}

}
