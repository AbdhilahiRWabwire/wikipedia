package org.wikipedia.dataclient.page

import android.graphics.Bitmap
import android.location.Location
import org.maplibre.android.plugins.annotation.Symbol
import org.wikipedia.page.PageTitle

class NearbyPage(
    val pageId: Int,
    val pageTitle: PageTitle,
    val latitude: Double,
    val longitude: Double,
    var annotation: Symbol? = null,
    var bitmap: Bitmap? = null
) {
    val location get() = Location("").apply {
        latitude = this@NearbyPage.latitude
        longitude = this@NearbyPage.longitude
    }
}
