package id.ac.smpn8bks.ardiansyah.kabkotaretrofitapp.response

import com.google.gson.annotations.SerializedName
import id.ac.smpn8bks.ardiansyah.kabkotaretrofitapp.model.KabKotaItem

data class KabKotaResponse(

	@field:SerializedName("data")
	val data: List<KabKotaItem>,

	@field:SerializedName("message")
	val message: String
)