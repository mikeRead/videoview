var play = function(str, callback) {
    cordova.exec(callback, function(err) {
        alert('Nothing to echo.');
    }, "videoplugin", "play", [str]);
}

module.exports = play;