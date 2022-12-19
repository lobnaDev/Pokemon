package com.app.repository;

import androidx.lifecycle.LiveData;

import com.app.pokmon.database.PokemonDao;
import com.app.pokmon.model.Pokemon;
import com.app.pokmon.model.PokemonResponse;
import com.app.pokmon.network.PokemonApiService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

/**
 * Created by Lobna Babker on 12/8/2022.
 */
public class Repository {
    private PokemonApiService pokemonApiService;
    private PokemonDao pokemonDao;

    @Inject
    public Repository(PokemonApiService pokemonApiService,PokemonDao pokemonDao) {
        this.pokemonApiService = pokemonApiService;
        this.pokemonDao = pokemonDao;

    }

    public Observable<PokemonResponse> getPokemons(){

        return pokemonApiService.getPokemons();
    }

    public void insertPokemon(Pokemon pokemon){
        pokemonDao.insertPokemon(pokemon);
    }

    public void deletePokemon(String pokemonName){
        pokemonDao.deletePokemon(pokemonName);
    }
    public LiveData<List<Pokemon>>  getFavPokemon(){
        return pokemonDao.getPokemons();
    }



}
