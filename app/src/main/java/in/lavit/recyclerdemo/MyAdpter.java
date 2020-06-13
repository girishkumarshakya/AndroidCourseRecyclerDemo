package in.lavit.recyclerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdpter extends RecyclerView.Adapter<MyAdpter.MyViewHolder> {
    private Context context;
    private ArrayList<Employee> employeeArrayList;

    public MyAdpter(Context context, ArrayList<Employee> employeeArrayList){
        this.context = context;
        this.employeeArrayList = employeeArrayList;
    }
    @NonNull
    @Override
    public MyAdpter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final MyAdpter.MyViewHolder holder, int position) {
        Employee employee = employeeArrayList.get(position);
        holder.textViewN.setText(employee.getName());
        holder.textViewID.setText(employee.getId());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, holder.textViewN.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return employeeArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewN;
        TextView textViewID;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewN = itemView.findViewById(R.id.textViewName);
            textViewID = itemView.findViewById(R.id.textViewEmpId);
        }
    }
}
