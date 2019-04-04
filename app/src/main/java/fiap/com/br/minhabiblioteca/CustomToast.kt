package fiap.com.br.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

class CustomToast{

    public fun showToast(context: Context, message: String){

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val customToastRoot : View = inflater.inflate(R.layout.custom_toast, null)
        val customToast = Toast(context)

        customToast.setView(customToastRoot)
        val textView = customToastRoot.findViewById<TextView>(R.id.textView1)

        textView.setText(message)

        customToast.setGravity(Gravity.CENTER_HORIZONTAL / Gravity.BOTTOM, 0, 0)
        customToast.setDuration(Toast.LENGTH_LONG)
        customToast.show()
    }
}