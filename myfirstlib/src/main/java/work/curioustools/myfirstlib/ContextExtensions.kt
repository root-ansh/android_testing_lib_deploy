package work.curioustools.myfirstlib

import android.content.Context
import android.content.res.Configuration
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat


fun Context.getColorCompat(@ColorRes colorRes: Int) = ContextCompat.getColor(this, colorRes)

fun Context.getDrawableCompat(@DrawableRes res: Int) = ContextCompat.getDrawable(this, res)

fun Context.showToast(str: String, length: Int = Toast.LENGTH_SHORT) =
    Toast.makeText(this, str, length).show()

fun Context.isDarkThemeOn(): Boolean {
    return resources.configuration.uiMode and
            Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
}


