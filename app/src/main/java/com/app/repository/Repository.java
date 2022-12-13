package com.app.repository;

import com.app.pokmon.model.PokemonResponse;
import com.app.pokmon.network.PokemonApiService;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

/**
 * Created by Lobna Babker on 12/8/2022.
 */
public class Repository {
    private PokemonApiService pokemonApiService;

    @Inject
    public Repository(PokemonApiService pokemonApiService) {
        this.pokemonApiService = pokemonApiService;

    }

    public Observable<PokemonResponse> getPokemons(){
        return pokemonApiService.getPokemons();
    }
}
