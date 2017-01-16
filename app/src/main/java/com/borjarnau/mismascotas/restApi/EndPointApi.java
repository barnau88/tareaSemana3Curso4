package com.borjarnau.mismascotas.restApi;

import com.borjarnau.mismascotas.restApi.model.MascotaFotoPerfilResponse;
import com.borjarnau.mismascotas.restApi.model.MascotaResponse;
import com.borjarnau.mismascotas.restApi.model.UsuarioResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by ArnAu on 15/10/2016.
 */
public interface EndPointApi  {


    //public static String nombreUsuario  = "atuaniv";
    //public static String idUsuario  = "4039200993";



    public static String idMiUsuario  = "4013497851";


    public static String nombreUsuarioGatoulises = "gatoulises";
    public static String idUsuarioGatoulises = "4192443066";

    public static String nombreUsuarioNiko_pty = "niko_pty";
    public static String idUsuarioNiko_pty = "4230859422";

    //////////////////////////////////////////////////////////////////////////////////7

    public static String nombreUsuarioMypetappcour = "mypetappcour";
    public static String idUsuarioAtuanivMypetappcour = "4036128990";


    public static String nombreUsuarioMascotasapp2016= "mascotasapp2016";
    public static String idUsuarioMascotasapp2016 = "4036470568";



    //https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_KEY_GET_RECENT_MEDIA_USER)
    Call<MascotaResponse> getRecentMedia();


    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idMiUsuario + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilMiUsuario();


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuario + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaUSer();


    //https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN
    //@GET(ConstantesRestApi.URL_KEY_GET_RECENT_MEDIA_USER)
    //Call<MascotaResponse> getRecentMedia();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuario + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilUser();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuario + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoUser();


*/
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioGatoulises + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaGatoulises();

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioGatoulises + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilGatoulises();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuarioGatoulises + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoGatoulises();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioNiko_pty + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaNiko_pty();

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioNiko_pty + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilNiko_pty();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuarioNiko_pty + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoNiko_pty();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioAtuanivMypetappcour + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaMypetappcour();

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioAtuanivMypetappcour + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilMypetappcour();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuarioMypetappcour + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoMypetappcour();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioMascotasapp2016 + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaResponse> getRecentMediaMascotasapp2016();

    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_PRIMERA_PARTE + idUsuarioMascotasapp2016 + ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_ID_SEGUNDA_PARTE)
    Call<MascotaFotoPerfilResponse> getFotoPerfilMascotasapp2016();

    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    @GET (ConstantesRestApi.URL_GET_INFO_USER_SEARCH_PRIMERA_PARTE + nombreUsuarioMascotasapp2016 + ConstantesRestApi.URL_GET_INFO_USER_SEARCH_SEGUNDA_PARTE)
    Call<MascotaResponse> getInfoMascotasapp2016();

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @FormUrlEncoded
    @POST(ConstantesRestApi.KEY_POST_ID_DISPOSITIVO)
    Call<UsuarioResponse> registrarIdDispositivo(@Field("id_dispositivo") String id_dispositivo, @Field("nombre_usuario_instagram") String nombre_usuario_instagram ,@Field("id_usuario_instagram") String id_usuario_instagram);


}