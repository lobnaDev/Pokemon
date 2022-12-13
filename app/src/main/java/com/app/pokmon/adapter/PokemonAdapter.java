package com.app.pokmon.adapter;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.pokmon.R;
import com.app.pokmon.model.Pokemon;
import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {
    private ArrayList<Pokemon> model = new ArrayList<>();
    private Context mContext;

    public PokemonAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PokemonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item, parent, false));

    }

    @Override
    public void onBindViewHolder(PokemonViewHolder holder, int position) {
        // TODO: Bind the data with View
        holder.pokemonName.setText(model.get(position).getName());

        Glide.with(mContext).load(model.get(position).getUrl())
                .into(holder.pokemonImage);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public void setList(ArrayList<Pokemon> List) {
        this.model = List;
        notifyDataSetChanged();

    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder {
        private ImageView pokemonImage;
        private TextView pokemonName;

        public PokemonViewHolder(View itemView) {
            super(itemView);
            pokemonImage = itemView.findViewById(R.id.pokemon_imageView);
            pokemonName = itemView.findViewById(R.id.pokemon_name_textView);

        }
    }
}
