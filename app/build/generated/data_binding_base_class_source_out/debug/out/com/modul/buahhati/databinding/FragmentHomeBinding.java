// Generated by view binder compiler. Do not edit!
package com.modul.buahhati.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.modul.buahhati.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnAddProfile;

  @NonNull
  public final CardView btnBB;

  @NonNull
  public final CardView btnLK;

  @NonNull
  public final CardView btnTB;

  @NonNull
  public final ImageView imageBtnBB;

  @NonNull
  public final ImageView imageBtnTB;

  @NonNull
  public final ImageView imgBtnLK;

  private FragmentHomeBinding(@NonNull FrameLayout rootView, @NonNull Button btnAddProfile,
      @NonNull CardView btnBB, @NonNull CardView btnLK, @NonNull CardView btnTB,
      @NonNull ImageView imageBtnBB, @NonNull ImageView imageBtnTB, @NonNull ImageView imgBtnLK) {
    this.rootView = rootView;
    this.btnAddProfile = btnAddProfile;
    this.btnBB = btnBB;
    this.btnLK = btnLK;
    this.btnTB = btnTB;
    this.imageBtnBB = imageBtnBB;
    this.imageBtnTB = imageBtnTB;
    this.imgBtnLK = imgBtnLK;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_profile;
      Button btnAddProfile = ViewBindings.findChildViewById(rootView, id);
      if (btnAddProfile == null) {
        break missingId;
      }

      id = R.id.btnBB;
      CardView btnBB = ViewBindings.findChildViewById(rootView, id);
      if (btnBB == null) {
        break missingId;
      }

      id = R.id.btnLK;
      CardView btnLK = ViewBindings.findChildViewById(rootView, id);
      if (btnLK == null) {
        break missingId;
      }

      id = R.id.btnTB;
      CardView btnTB = ViewBindings.findChildViewById(rootView, id);
      if (btnTB == null) {
        break missingId;
      }

      id = R.id.imageBtnBB;
      ImageView imageBtnBB = ViewBindings.findChildViewById(rootView, id);
      if (imageBtnBB == null) {
        break missingId;
      }

      id = R.id.imageBtnTB;
      ImageView imageBtnTB = ViewBindings.findChildViewById(rootView, id);
      if (imageBtnTB == null) {
        break missingId;
      }

      id = R.id.imgBtnLK;
      ImageView imgBtnLK = ViewBindings.findChildViewById(rootView, id);
      if (imgBtnLK == null) {
        break missingId;
      }

      return new FragmentHomeBinding((FrameLayout) rootView, btnAddProfile, btnBB, btnLK, btnTB,
          imageBtnBB, imageBtnTB, imgBtnLK);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
