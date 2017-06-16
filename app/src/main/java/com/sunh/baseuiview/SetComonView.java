package com.sunh.baseuiview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

/**
 *  自定义设置布局
 */

public class SetComonView extends RelativeLayout {

    private Context context;
    public SetComonView(Context context) {
        this(context,null);
    }

    public SetComonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initAttribute();
    }

    private void initAttribute() {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.common_view,null);

    }
}
