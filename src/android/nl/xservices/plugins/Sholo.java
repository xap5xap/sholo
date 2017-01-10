package nl.xservices.plugins;


import android.util.Log;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Sholo extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    Log.d("xap","xap en execute");
      if (action.equals("coolMethod2")) {
        Log.d("xap","dentro de equal");
          // String message = args.getString(0);
          // this.coolMethod2(message, callbackContext);
          this.hide();
          callbackContext.success();
          return true;
      }
      return false;
  }

  private void hide() {
    Log.d("xap","dentro de hide");
}

  private void coolMethod2(String message, CallbackContext callbackContext) {

    Log.d("xap","dentro de coolmethod2 1");
    Log.d("xap","mensaje "+message);
    // callbackContext.success(message);
    PluginResult pr = new PluginResult(PluginResult.Status.OK);
    pr.setKeepCallback(true);
    callbackContext.sendPluginResult(pr);

      // if (message != null && message.length() > 0) {
      //   Log.d("xap","va asuccess");
      //     callbackContext.success(message);
      // } else {
      //   Log.d("xap","va a error");
      //     callbackContext.error("Expected one non-empty string argument.");
      // }
  }
}
