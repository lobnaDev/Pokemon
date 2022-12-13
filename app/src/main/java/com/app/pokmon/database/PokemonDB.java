package com.app.pokmon.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.app.pokmon.model.Pokemon;

/**
 * Created by Lobna Babker on 12/12/2022.
 */
@Database(entities = Pokemon.class, version = 1, exportSchema = false)
public abstract class PokemonDB extends RoomDatabase {
    public abstract PokemonDao pokemonDao();
}
