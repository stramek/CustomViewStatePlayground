package pl.marcin.androidviewstate

import android.content.Context
import android.content.res.TypedArray
import android.os.Bundle
import android.os.Parcelable
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.FrameLayout

class CustomSwitchViewNoId: FrameLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_custom_switch_no_id, this)
    }

    override fun onSaveInstanceState(): Parcelable? {
//        Log.i("Normal", "onSaveInstanceState")
        return super.onSaveInstanceState()
    }

    override fun onRestoreInstanceState(state: Parcelable?) {
//        Log.i("Normal", "onRestoreInstanceState")
        super.onRestoreInstanceState(state)
    }
}
