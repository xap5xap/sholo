function Sholo() {
}

Sholo.prototype.coolMethod3 = function(arg0, success, error) {
  cordova.exec(success, error, "Sholo", "coolMethod2", [arg0]);
};

Sholo.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.sholo = new Sholo();
  return window.plugins.sholo;
};

cordova.addConstructor(Sholo.install);
