// Generated by view binder compiler. Do not edit!
package com.example.reachme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
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

public final class FragmentAddBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView addImage;

  @NonNull
  public final ConstraintLayout frameLayout2;

  @NonNull
  public final TextView name;

  @NonNull
  public final AppCompatButton postBtn;

  @NonNull
  public final EditText postDescription;

  @NonNull
  public final ImageView postImage;

  @NonNull
  public final TextView profession;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final View view10;

  @NonNull
  public final View view11;

  @NonNull
  public final View view9;

  private FragmentAddBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView addImage,
      @NonNull ConstraintLayout frameLayout2, @NonNull TextView name,
      @NonNull AppCompatButton postBtn, @NonNull EditText postDescription,
      @NonNull ImageView postImage, @NonNull TextView profession,
      @NonNull CircleImageView profileImage, @NonNull TextView textView4,
      @NonNull TextView textView5, @NonNull View view10, @NonNull View view11,
      @NonNull View view9) {
    this.rootView = rootView;
    this.addImage = addImage;
    this.frameLayout2 = frameLayout2;
    this.name = name;
    this.postBtn = postBtn;
    this.postDescription = postDescription;
    this.postImage = postImage;
    this.profession = profession;
    this.profileImage = profileImage;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.view10 = view10;
    this.view11 = view11;
    this.view9 = view9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addImage;
      ImageView addImage = ViewBindings.findChildViewById(rootView, id);
      if (addImage == null) {
        break missingId;
      }

      ConstraintLayout frameLayout2 = (ConstraintLayout) rootView;

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.postBtn;
      AppCompatButton postBtn = ViewBindings.findChildViewById(rootView, id);
      if (postBtn == null) {
        break missingId;
      }

      id = R.id.postDescription;
      EditText postDescription = ViewBindings.findChildViewById(rootView, id);
      if (postDescription == null) {
        break missingId;
      }

      id = R.id.postImage;
      ImageView postImage = ViewBindings.findChildViewById(rootView, id);
      if (postImage == null) {
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

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.view10;
      View view10 = ViewBindings.findChildViewById(rootView, id);
      if (view10 == null) {
        break missingId;
      }

      id = R.id.view11;
      View view11 = ViewBindings.findChildViewById(rootView, id);
      if (view11 == null) {
        break missingId;
      }

      id = R.id.view9;
      View view9 = ViewBindings.findChildViewById(rootView, id);
      if (view9 == null) {
        break missingId;
      }

      return new FragmentAddBinding((ConstraintLayout) rootView, addImage, frameLayout2, name,
          postBtn, postDescription, postImage, profession, profileImage, textView4, textView5,
          view10, view11, view9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}