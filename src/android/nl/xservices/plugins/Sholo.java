package nl.xservices.plugins;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.PluginResult;

public class Sholo extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    Log.d("xap","xap en execute");
      if (action.equals("coolMethod2")) {
        Log.d("xap","dentro de equal");
          String message = args.getString(0);
          this.coolMethod2(message, callbackContext);
          Log.d("xap","retorna true");
          return true;
      }
      return false;
  }

  private void coolMethod2(String message, CallbackContext callbackContext) {

    Log.d("xap","dentro de coolmethod2 1");
    Log.d("xap","mensaje "+message);
    callbackContext.success(message);
    // PluginResult pr = new PluginResult(PluginResult.Status.OK);
    // pr.setKeepCallback(true);
    // callbackContext.sendPluginResult(pr);
    //
      // if (message != null && message.length() > 0) {
      //   Log.d("xap","va asuccess");
      //     callbackContext.success(message);
      // } else {
      //   Log.d("xap","va a error");
      //     callbackContext.error("Expected one non-empty string argument.");
      // }
  }
}
