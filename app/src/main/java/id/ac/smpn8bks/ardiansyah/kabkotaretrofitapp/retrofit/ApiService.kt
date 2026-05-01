package id.ac.smpn8bks.ardiansyah.kabkotaretrofitapp.retrofit

import id.ac.smpn8bks.ardiansyah.kabkotaretrofitapp.response.KabKotaResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("api/read_kabkota.php")
    fun getListUsers(): Call<KabKotaResponse>

}