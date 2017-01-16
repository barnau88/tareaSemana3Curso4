package com.borjarnau.mismascotas.restApi.adapter;

import com.borjarnau.mismascotas.restApi.ConstantesRestApi;
import com.borjarnau.mismascotas.restApi.EndPointApi;
import com.borjarnau.mismascotas.restApi.deserializador.InfoMascotaDeserializador;
import com.borjarnau.mismascotas.restApi.deserializador.MascotaDeserializador;
import com.borjarnau.mismascotas.restApi.deserializador.MascotaFotoPerfilDeserializador;
import com.borjarnau.mismascotas.restApi.model.MascotaFotoPerfilResponse;
import com.borjarnau.mismascotas.restApi.model.MascotaResponse;
import com.borjarnau.mismascotas.restApi.model.UsuarioResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ArnAu on 17/10/2016.
 */
public class RestApiAdapter {

    public EndPointApi establecerConexionRestApiInstagram(Gson gson){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(EndPointApi.class);
    }


    public EndPointApi establecerConexionRestAPIServidor(){    // antes en el argumento ponia Gson gson, pero me di cuento que no hacia falta porq no hace falta un deserializador
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL_SERVIDOR)
                .addConverterFactory(GsonConverterFactory.create())  // antes en el argumento ponia  gson
                .build();
        return retrofit.create(EndPointApi.class);
    }

    public Gson construyeGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new MascotaDeserializador());

        return gsonBuilder.create();

    }


    ///////////////////////////////////////////////////////////////////
    public Gson construyeGsonDeserializadorFotoPerrfil(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaFotoPerfilResponse.class, new MascotaFotoPerfilDeserializador());

        return gsonBuilder.create();

    }



}
