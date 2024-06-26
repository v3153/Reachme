// Generated by view binder compiler. Do not edit!
package com.example.reachme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.reachme.CameraSourcePreview;
import com.example.reachme.GraphicOverlay;
import com.example.reachme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVisionLivePreviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RelativeLayout control;

  @NonNull
  public final ImageView facingSwitch;

  @NonNull
  public final GraphicOverlay graphicOverlay;

  @NonNull
  public final ImageView imgCameraCapture;

  @NonNull
  public final ImageView imgCapture;

  @NonNull
  public final ImageView imgDone;

  @NonNull
  public final CameraSourcePreview previewView;

  private ActivityVisionLivePreviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull RelativeLayout control, @NonNull ImageView facingSwitch,
      @NonNull GraphicOverlay graphicOverlay, @NonNull ImageView imgCameraCapture,
      @NonNull ImageView imgCapture, @NonNull ImageView imgDone,
      @NonNull CameraSourcePreview previewView) {
    this.rootView = rootView;
    this.control = control;
    this.facingSwitch = facingSwitch;
    this.graphicOverlay = graphicOverlay;
    this.imgCameraCapture = imgCameraCapture;
    this.imgCapture = imgCapture;
    this.imgDone = imgDone;
    this.previewView = previewView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVisionLivePreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVisionLivePreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_vision_live_preview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVisionLivePreviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.control;
      RelativeLayout control = ViewBindings.findChildViewById(rootView, id);
      if (control == null) {
        break missingId;
      }

      id = R.id.facing_switch;
      ImageView facingSwitch = ViewBindings.findChildViewById(rootView, id);
      if (facingSwitch == null) {
        break missingId;
      }

      id = R.id.graphic_overlay;
      GraphicOverlay graphicOverlay = ViewBindings.findChildViewById(rootView, id);
      if (graphicOverlay == null) {
        break missingId;
      }

      id = R.id.imgCameraCapture;
      ImageView imgCameraCapture = ViewBindings.findChildViewById(rootView, id);
      if (imgCameraCapture == null) {
        break missingId;
      }

      id = R.id.imgCapture;
      ImageView imgCapture = ViewBindings.findChildViewById(rootView, id);
      if (imgCapture == null) {
        break missingId;
      }

      id = R.id.imgDone;
      ImageView imgDone = ViewBindings.findChildViewById(rootView, id);
      if (imgDone == null) {
        break missingId;
      }

      id = R.id.preview_view;
      CameraSourcePreview previewView = ViewBindings.findChildViewById(rootView, id);
      if (previewView == null) {
        break missingId;
      }

      return new ActivityVisionLivePreviewBinding((ConstraintLayout) rootView, control,
          facingSwitch, graphicOverlay, imgCameraCapture, imgCapture, imgDone, previewView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
