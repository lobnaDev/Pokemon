package com.app.pokmon.network;

import com.app.pokmon.model.PokemonResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

/**
 * Created by Lobna Babker on 12/8/2022.
 */
public interface PokemonApiService {

    @GET("pokemon")
    Observable<PokemonResponse> getPokemons();

}
