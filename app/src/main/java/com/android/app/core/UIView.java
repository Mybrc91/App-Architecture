package com.android.app.core;

import com.android.app.framework.controller.IView;

import android.content.Context;

/**
 * Created by frodo on 2015/4/2.
 */
public interface UIView extends IView {
    Context getActivity();
}
