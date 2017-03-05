/**
 * Created by Administrator on 2017/3/1.
 */
$(function(){
    $("#dForReach2").click(function(){
        $("#dForReach1").css({"background":"white","color":"blue"});
        $("#dForReach2").css({"background":"blue","color":"white"});
        $("#reach2").css("display","block");
        $("#reach1").css("display","none");
    });
    $("#dForReach1").click(function () {
        $("#dForReach1").css({"background": "blue", "color": "white"});
        $("#dForReach2").css({"background": "white", "color": "blue"});
        $("#reach1").css("display","block");
        $("#reach2").css("display","none");
    });


    $("#reach1").focus(function(){
        $("#reach1").val("");
    });
    $("#reach1").blur(function(){
        $("#reach1").val("请输入任意关键字");
    });
    $("#reach2").focus(function () {
        $("#reach2").val("");
    });
    $("#reach2").blur(function () {
        $("#reach2").val("关键字查找游戏、搜区服、寻商品");
    });
    $(".close").click(function(){
        $("[name='game-index']").css("display","none");
    })

    //ajax-----------------------------
    $(".gameTypeDiv ul li div").click(function(){
        $(".showGameInfo ul li").css("display","none");
        $.ajax({
            async: false,
            url:"http://localhost:8080/ssh01/game/showAllGameByFirstWord",
            type:"post",
            data:"value="+$(this).text(),
            dateType:"json",
            success:function(data){
                var d = eval(data);
                for(var i=0;i<d.length;i++){
                    $(".showGameInfo ul").append("<li>"+d[i]+"</li>");
                }
            }
        });
    });
    $(".reMen").click(function () {
        $.ajax({
            url: "http://localhost:8080/ssh01/game/getGameNameByIsHot",
            type: "post",
            data: "value=" + $(".reMen").text(),
            dateType: "json",
            success: function (data) {
                var d = eval(data);
                for (var i = 0; i < d.length; i++) {
                    $(".showGameInfo ul").append("<li>" + d[i].cname + "</li>");
                    $(".showGameInfo ul li").css("color","red");
                }
            }
        });
    });
});

function show(index){
    var cssType = document.getElementsByName("css-index");
    for(var i=0;i<cssType.length;i++){
        if(i==index){
            cssType[i].style.border="1px solid blue";
            cssType[i].style.fontWeight="bold";
        }else{
            cssType[i].style.border="none";
        }
    }
}

function block(index){
    var game = document.getElementsByName("game-index");
    for(var i=0;i<game.length;i++){
        if(i==index){
            game[i].style.display="block";
        }else{
            game[i].style.display="none";
        }
    }
}
