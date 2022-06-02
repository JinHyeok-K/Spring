    alert("1차 확인");


// ajax 사용하려면 jquery CDN 필요
$.ajax({
    url:"getdata",
    success:function(re){
        alert("통신보안확인 :"+ re);
        $("#divbox").html(re);
    }
})