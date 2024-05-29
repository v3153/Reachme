// Generated by view binder compiler. Do not edit!
package com.example.reachme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.reachme.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UserSampleBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton followBtn;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView profession;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final View view10;

  private UserSampleBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton followBtn,
      @NonNull TextView name, @NonNull TextView profession, @NonNull CircleImageView profileImage,
      @NonNull View view10) {
    this.rootView = rootView;
    this.followBtn = followBtn;
    this.name = name;
    this.profession = profession;
    this.profileImage = profileImage;
    this.view10 = view10;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UserSampleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UserSampleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.user_sample, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UserSampleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.followBtn;
      AppCompatButton followBtn = ViewBindings.findChildViewById(rootView, id);
      if (followBtn == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.profession;
      TextView profession = ViewBindings.findChildViewById(rootView, id);
      if (profession == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.view10;
      View view10 = ViewBindings.findChildViewById(rootView, id);
      if (view10 == null) {
        break missingId;
      }

      return new UserSampleBinding((ConstraintLayout) rootView, followBtn, name, profession,
          profileImage, view10);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}