package jp.mixi.sample.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ryota Niinomi on 2016/10/14.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<String> mDataSet;

    public MyAdapter(List<String> dataSet) {
        mDataSet = dataSet;
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewholder, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(mDataSet.get(position));
        holder.subTitle.setText(mDataSet.get(position) + "_" + position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView subTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.title);
            subTitle = (TextView) itemView.findViewById(R.id.subTitle);
        }
    }
}
