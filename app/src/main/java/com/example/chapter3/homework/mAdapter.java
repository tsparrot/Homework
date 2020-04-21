package com.example.chapter3.homework;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class mAdapter extends BaseAdapter {

    private static final int NUM_LIST_ITEMS = 6;

    @Override
    public int getCount() {
        return NUM_LIST_ITEMS;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = View.inflate(parent.getContext(), R.layout.im_list_item,null);
            holder.avatarView = convertView.findViewById(R.id.iv_avatar);
            holder.tv_name = convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        } else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_name.setText(String.format("好友%s" ,position));
        switch (position % 2){
            case 0:
                holder.avatarView.setImageResource(R.drawable.icon_girl);
                break;
            default:
                holder.avatarView.setImageResource(R.mipmap.ic_launcher);
                break;
        }
        return convertView;
    }

    private static class ViewHolder {
        private ImageView avatarView;
        private TextView tv_name;
    }
}
