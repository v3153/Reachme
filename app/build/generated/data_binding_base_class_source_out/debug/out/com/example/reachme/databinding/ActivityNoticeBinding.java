// Generated by view binder compiler. Do not edit!
package com.example.reachme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.reachme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNoticeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button confirmBtn;

  @NonNull
  public final ImageView face;

  @NonNull
  public final TextView notice;

  private ActivityNoticeBinding(@NonNull RelativeLayout rootView, @NonNull Button confirmBtn,
      @NonNull ImageView face, @NonNull TextView notice) {
    this.rootView = rootView;
    this.confirmBtn = confirmBtn;
    this.face = face;
    this.notice = notice;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNoticeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNoticeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_notice, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNoticeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirm_btn;
      Button confirmBtn = ViewBindings.findChildViewById(rootView, id);
      if (confirmBtn == null) {
        break missingId;
      }

      id = R.id.face;
      ImageView face = ViewBindings.findChildViewById(rootView, id);
      if (face == null) {
        break missingId;
      }

      id = R.id.notice;
      TextView notice = ViewBindings.findChildViewById(rootView, id);
      if (notice == null) {
        break missingId;
      }

      return new ActivityNoticeBinding((RelativeLayout) rootView, confirmBtn, face, notice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
