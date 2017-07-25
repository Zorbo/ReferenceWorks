window.onload = function() {

var xhr = new XMLHttpRequest();
    xhr.open('POST', '/medival');
    xhr.setRequestHeader("Content-type", "application/json");
    xhr.responseType = 'json';
    xhr.onreadystatechange = function () {
      var DONE = 4;
      var OK = 200;
      if (xhr.readyState === DONE) {
        if (xhr.status === OK) {
          updateLocationsTable();
        } else {
          console.log('Error: ' + xhr.status);
        }
      }
    };
    xhr.send(JSON.stringify(data));
    return false;

}