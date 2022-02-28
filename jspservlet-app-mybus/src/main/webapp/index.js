function getSerach(par) {
    var Model = document.getElementById("busListSearch");
//    alert(Otp)
    var http = new XMLHttpRequest();
    http.open("POST", "https://8080-fbbfeecbfbaddabfaacbccaaabcbaaaa.examlyiopb.examly.io/mybus/busListSearch.jsp?", true);
    http.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    var params = "par="+par ;
    http.send(params);
    console.log("test");
    http.onload = function () {
        var r = (http.responseText).toString().trim();
        console.log("1");
        Model.innerHTML = r
        
    }
    
}
