// Generated by view binder compiler. Do not edit!
package com.example.reachme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.example.reachme.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextInputLayout searchMenuBar;

  @NonNull
  public final TextInputEditText searchMenuSearchBar;

  @NonNull
  public final ShimmerRecyclerView usersRV;

  private FragmentSearchBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout searchMenuBar,
      @NonNull TextInputEditText searchMenuSearchBar, @NonNull ShimmerRecyclerView usersRV) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.searchMenuBar = searchMenuBar;
    this.searchMenuSearchBar = searchMenuSearchBar;
    this.usersRV = usersRV;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout constraintLayout = (ConstraintLayout) rootView;

      id = R.id.searchMenuBar;
      TextInputLayout searchMenuBar = ViewBindings.findChildViewById(rootView, id);
      if (searchMenuBar == null) {
        break missingId;
      }

      id = R.id.searchMenuSearchBar;
      TextInputEditText searchMenuSearchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchMenuSearchBar == null) {
        break missingId;
      }

      id = R.id.usersRV;
      ShimmerRecyclerView usersRV = ViewBindings.findChildViewById(rootView, id);
      if (usersRV == null) {
        break missingId;
      }

      return new FragmentSearchBinding((ConstraintLayout) rootView, constraintLayout, searchMenuBar,
          searchMenuSearchBar, usersRV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
