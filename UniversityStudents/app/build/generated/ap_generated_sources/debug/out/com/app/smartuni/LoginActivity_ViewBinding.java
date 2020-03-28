// Generated code from Butter Knife. Do not modify!
package com.app.smartuni;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view7f08005b;

  private View view7f080139;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.button_login, "field 'mLogin' and method 'submit'");
    target.mLogin = Utils.castView(view, R.id.button_login, "field 'mLogin'", Button.class);
    view7f08005b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.submit(p0);
      }
    });
    target.mUserName = Utils.findRequiredViewAsType(source, R.id.edit_user_name, "field 'mUserName'", EditText.class);
    target.mPassword = Utils.findRequiredViewAsType(source, R.id.edit_password, "field 'mPassword'", EditText.class);
    target.remember_me = Utils.findRequiredViewAsType(source, R.id.switch_remember_me, "field 'remember_me'", Switch.class);
    view = Utils.findRequiredView(source, R.id.text_forgot_password, "method 'submit'");
    view7f080139 = view;
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
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLogin = null;
    target.mUserName = null;
    target.mPassword = null;
    target.remember_me = null;

    view7f08005b.setOnClickListener(null);
    view7f08005b = null;
    view7f080139.setOnClickListener(null);
    view7f080139 = null;
  }
}
