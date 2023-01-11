// Generated by view binder compiler. Do not edit!
package com.azhar.rentalmobil.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.azhar.rentalmobil.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMutliUserBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnInfoMobil;

  @NonNull
  public final MaterialCardView cvDate;

  @NonNull
  public final FrameLayout flMain;

  @NonNull
  public final ImageView imgDate;

  @NonNull
  public final LinearLayout llCurved;

  @NonNull
  public final RelativeLayout rlAppName;

  @NonNull
  public final Button tambahPenyewa;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvMainSalam;

  @NonNull
  public final LinearLayout tx1;

  private ActivityMutliUserBinding(@NonNull RelativeLayout rootView, @NonNull Button btnInfoMobil,
      @NonNull MaterialCardView cvDate, @NonNull FrameLayout flMain, @NonNull ImageView imgDate,
      @NonNull LinearLayout llCurved, @NonNull RelativeLayout rlAppName,
      @NonNull Button tambahPenyewa, @NonNull TextView tvDate, @NonNull TextView tvMainSalam,
      @NonNull LinearLayout tx1) {
    this.rootView = rootView;
    this.btnInfoMobil = btnInfoMobil;
    this.cvDate = cvDate;
    this.flMain = flMain;
    this.imgDate = imgDate;
    this.llCurved = llCurved;
    this.rlAppName = rlAppName;
    this.tambahPenyewa = tambahPenyewa;
    this.tvDate = tvDate;
    this.tvMainSalam = tvMainSalam;
    this.tx1 = tx1;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMutliUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMutliUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_mutli_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMutliUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_info_mobil;
      Button btnInfoMobil = ViewBindings.findChildViewById(rootView, id);
      if (btnInfoMobil == null) {
        break missingId;
      }

      id = R.id.cvDate;
      MaterialCardView cvDate = ViewBindings.findChildViewById(rootView, id);
      if (cvDate == null) {
        break missingId;
      }

      id = R.id.flMain;
      FrameLayout flMain = ViewBindings.findChildViewById(rootView, id);
      if (flMain == null) {
        break missingId;
      }

      id = R.id.imgDate;
      ImageView imgDate = ViewBindings.findChildViewById(rootView, id);
      if (imgDate == null) {
        break missingId;
      }

      id = R.id.llCurved;
      LinearLayout llCurved = ViewBindings.findChildViewById(rootView, id);
      if (llCurved == null) {
        break missingId;
      }

      id = R.id.rlAppName;
      RelativeLayout rlAppName = ViewBindings.findChildViewById(rootView, id);
      if (rlAppName == null) {
        break missingId;
      }

      id = R.id.tambahPenyewa;
      Button tambahPenyewa = ViewBindings.findChildViewById(rootView, id);
      if (tambahPenyewa == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvMainSalam;
      TextView tvMainSalam = ViewBindings.findChildViewById(rootView, id);
      if (tvMainSalam == null) {
        break missingId;
      }

      id = R.id.tx1;
      LinearLayout tx1 = ViewBindings.findChildViewById(rootView, id);
      if (tx1 == null) {
        break missingId;
      }

      return new ActivityMutliUserBinding((RelativeLayout) rootView, btnInfoMobil, cvDate, flMain,
          imgDate, llCurved, rlAppName, tambahPenyewa, tvDate, tvMainSalam, tx1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
