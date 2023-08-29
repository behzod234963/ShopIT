package uz.datatalim.shopit.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import uz.datatalim.shopit.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({

            initView()

        },3000)

    }

    private fun initView() {

        val ivImage:ImageView=findViewById(R.id.ivImage_splash)
        val animation:Animation=AnimationUtils.loadAnimation(this,R.anim.anim_splash)
        ivImage.startAnimation(animation)

    }
}