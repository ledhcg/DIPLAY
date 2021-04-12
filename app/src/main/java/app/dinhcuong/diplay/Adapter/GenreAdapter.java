package app.dinhcuong.diplay.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import app.dinhcuong.diplay.Model.Genre;
import app.dinhcuong.diplay.R;

public class GenreAdapter extends RecyclerView.Adapter<GenreAdapter.ViewHolder> {
    Context context;
    ArrayList<Genre> genreArrayList;

    public GenreAdapter(Context context, ArrayList<Genre> genreArrayList) {
        this.context = context;
        this.genreArrayList = genreArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_home_genre, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Genre genre = genreArrayList.get(position);
        holder.nameGenre.setText(genre.getNameGenre());
        Picasso.get().load(genre.getImageGenre()).into(holder.imageGenre);
    }

    @Override
    public int getItemCount() {
        return genreArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageGenre;
        TextView nameGenre;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageGenre = itemView.findViewById(R.id.image_genre);
            nameGenre = itemView.findViewById(R.id.name_genre);

        }
    }
}
