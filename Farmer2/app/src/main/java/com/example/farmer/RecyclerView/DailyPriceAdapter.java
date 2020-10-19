package com.example.farmer.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.farmer.R;
import com.example.farmer.dailyprice.Record;

import java.util.List;

public class DailyPriceAdapter extends RecyclerView.Adapter<DailyPriceAdapter.MyViewHolder> {

    public DailyPriceAdapter(List<Record> recordList, Context context) {
        this.recordList = recordList;
        this.context = context;
    }

    List<Record> recordList;
    Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.dailyprice, parent, false);

        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Record record = recordList.get(position);
        holder.state.setText("state : "+record.getState());
        holder.district.setText("district : "+record.getDistrict());
        holder.market.setText("market : "+record.getMarket());
        holder.commodity.setText("commodity : "+record.getCommodity());
        holder.variety.setText("variety : "+record.getVariety());
        holder.arrival_date.setText("arrival_date : "+record.getArrivalDate());
        holder.min_price.setText("min_price : "+record.getMinPrice());
        holder.max_price.setText("max_price : "+record.getMaxPrice());
        holder.modal_price.setText("modal_price : "+record.getModalPrice());
    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView state, district, market, commodity, variety, arrival_date, min_price, max_price, modal_price;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            state = itemView.findViewById(R.id.state);
            district = itemView.findViewById(R.id.district);
            market = itemView.findViewById(R.id.market);
            commodity = itemView.findViewById(R.id.commodity);
            variety = itemView.findViewById(R.id.variety);
            arrival_date = itemView.findViewById(R.id.arrival_date);
            min_price = itemView.findViewById(R.id.min_price);
            max_price = itemView.findViewById(R.id.max_price);
            modal_price = itemView.findViewById(R.id.modal_price);
        }
    }
}