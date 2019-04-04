package fiap.com.br.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

class CustomToast{

    fun showToast(context: Context, message: String){

        showToast(R.layout.custom_toast, context, message)
    }

    fun showToastError(context: Context, message: String){

        showToast(R.layout.custom_toast_error, context, message)
    }

    fun showToastWarning(context: Context, message: String){

        showToast(R.layout.custom_toast_warning, context, message)
    }

    fun showToastSuccess(context: Context, message: String){

        showToast(R.layout.custom_toast_success, context, message)
    }

    fun showToastInfo(context: Context, message: String){

        showToast(R.layout.custom_toast_info, context, message)
    }


    private fun showToast(layout: Int, context: Context, message: String){

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val customToastRoot : View = inflater.inflate(layout, null)
        val customToast = Toast(context)

        customToast.setView(customToastRoot)
        val textView = customToastRoot.findViewById<TextView>(R.id.textView1)

        textView.setText(message)

        customToast.setGravity(Gravity.CENTER_HORIZONTAL / Gravity.BOTTOM, 0, 0)
        customToast.setDuration(Toast.LENGTH_LONG)
        customToast.show()
    }
}