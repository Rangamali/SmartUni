// Generated code from Butter Knife. Do not modify!
package com.app.smartuni;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeActivity_ViewBinding implements Unbinder {
  private HomeActivity target;

  private View view7f0800a0;

  private View view7f0800a2;

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeActivity_ViewBinding(final HomeActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.home_events_card, "field 'events' and method 'submit'");
    target.events = Utils.castView(view, R.id.home_events_card, "field 'events'", CardView.class);
    view7f0800a0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit(p0);
      }
    });
    target.timeTable = Utils.findRequiredViewAsType(source, R.id.home_time_table_card, "field 'timeTable'", CardView.class);
    target.genrateCv = Utils.findRequiredViewAsType(source, R.id.home_generate_cv_card, "field 'genrateCv'", CardView.class);
    view = Utils.findRequiredView(source, R.id.home_logout_card, "field 'logout' and method 'submit'");
    target.logout = Utils.castView(view, R.id.home_logout_card, "field 'logout'", CardView.class);
    view7f0800a2 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.events = null;
    target.timeTable = null;
    target.genrateCv = null;
    target.logout = null;

    view7f0800a0.setOnClickListener(null);
    view7f0800a0 = null;
    view7f0800a2.setOnClickListener(null);
    view7f0800a2 = null;
  }
}
