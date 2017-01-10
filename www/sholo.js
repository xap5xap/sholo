function Sholo() {
}

Sholo.prototype.coolMethod3 = function(arg0, successCallback, errorCallback) {
  console.log("en coolMethod3 1220", arg0);
  cordova.exec(successCallback, errorCallback, "Sholo", "coolMethod2", [arg0]);
};

Sholo.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.sholo = new Sholo();
  return window.plugins.sholo;
};

cordova.addConstructor(Sholo.install);
