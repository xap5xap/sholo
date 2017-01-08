package nl.xservices.plugins;xq

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
    Log.d("xap en execute");
      if (action.equals("coolMethod2")) {
        Log.d("xap dentro de equal");
          String message = args.getString(0);
          this.coolMethod2(message, callbackContext);
          return true;
      }
      return false;
  }

  private void coolMethod2(String message, CallbackContext callbackContext) {

    Log.d("dentro de coolmethod2");
    Log.d("mensaje "+message);
    callbackContext.success(message);
    // PluginResult pr = new PluginResult(PluginResult.Status.OK);
    // pr.setKeepCallback(true);
    // callbackContext.sendPluginResult(pr);
    //
      if (message != null && message.length() > 0) {
        Log.d("va asuccess");
          callbackContext.success(message);
      } else {
        Log.d("va a error");
          callbackContext.error("Expected one non-empty string argument.");
      }
  }
}
