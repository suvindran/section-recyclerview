package in.example.sec;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in.example.sec.R;

/**
 * Created by suvindran on 11-Oct-17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private Context context;
    private ArrayList<String> arrayList;

    public Adapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);;
        ViewHolder holder = new ViewHolder(v) ;
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.Text.setText(arrayList.get(position).toString());
        holder.Gift.setText(arrayList.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Text;
        TextView Gift;
        public ViewHolder(View itemView) {
            super(itemView);

            Text = (TextView) itemView.findViewById(R.id.text);
            Gift = (TextView) itemView.findViewById(R.id.gift);
        }
    }
}
