package in.example.sec;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in.example.sec.R;
import in.example.sec.SectionModel;

/**
 * Created by suvindran on 11-Oct-17.
 */

public class SectionAdapter extends RecyclerView.Adapter<SectionAdapter.ViewHolder> {

    private Context context;
    private ArrayList<SectionModel> sectionModelArrayList;

    public SectionAdapter(Context context, ArrayList<SectionModel> sectionModelArrayList) {
        this.context = context;
        this.sectionModelArrayList = sectionModelArrayList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View B = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_section, parent, false);
        return new ViewHolder(B);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final SectionModel sectionModel = sectionModelArrayList.get(position);
        holder.Title.setText(sectionModel.getSection());

        //recycler view for items
        holder.recyclerView.setHasFixedSize(true);
        holder.recyclerView.setNestedScrollingEnabled(false);

        /* set layout manager on basis of recyclerview enum type */
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        holder.recyclerView.setLayoutManager(linearLayoutManager);
        Adapter adapter = new Adapter(context, sectionModel.getItemArraylist());
        holder.recyclerView.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return sectionModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView Title;
        private RecyclerView recyclerView;

        public ViewHolder(View itemView) {
            super(itemView);

            Title = (TextView) itemView.findViewById(R.id.title);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerview);
        }
    }
}
