<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="/static/css/style.css">
    <script src="../static/js/jquery.js"></script>
    <script src="../static/js/jquery-migrate-1.1.1.js"></script>
    <script src="../static/js/jquery.equalheights.js"></script>
    <script src="../static/js/jquery.ui.totop.js"></script>
    <script src="../static/js/jquery.easing.1.3.js"></script>
    <script>
        $(document).ready(function () {
            $(".block1").mouseover(function () {
                $(this).addClass("blur");
            });
            $(".block1").mouseout(function () {
                $(this).removeClass("blur");
            });
            $().UItoTop({easingType: 'easeOutQuart'});
        })
    </script>
</head>
<body class="page1">


<header>
    <div id="logo">
        <span>Студенческая столовая</span>
    </div>
</header>


<div class="content">
    <a href="/canteen?numberOfCanteen=0" class="block1">
        <img src="../static/images/blur_img1.jpg" alt="">
        <span class="price"><span>Столовая №1</span></span>
    </a>
    <a href="/canteen?numberOfCanteen=1" class="block1">
        <img src="../static/images/blur_img2.jpg" alt="">
        <span class="price"><span>Столовая №2</span></span>
    </a>
    <a href="/canteen?numberOfCanteen=2" class="block1">
        <img src="../static/images/blur_img3.jpg" alt="">
        <span class="price"><span>Столовая №3</span></span>
    </a>
</div>


</body>
</html>