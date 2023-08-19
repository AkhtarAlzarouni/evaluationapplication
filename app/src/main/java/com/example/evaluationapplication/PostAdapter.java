package com.example.evaluationapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    private Context context;
    private List<Post> posts;


    public PostAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;

    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_post, parent, false);
        }
        TextView contentTextView = convertView.findViewById(R.id.contentTextView);
        Post post = (Post) getItem(position);
        contentTextView.setText(post.getContent());


        return convertView;
    }

    }
