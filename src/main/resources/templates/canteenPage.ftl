<!DOCTYPE html>
<html>
    <head>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            <link href="https://fonts.googleapis.com/css?family=Baloo+Chettan" rel="stylesheet">
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <link href="../static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
         
        <title>Столовая</title>
        <meta name="description" content="This is the description">

    <title>${canteen.name}</title>
    <meta name="description" content="This is the description">
    <link rel="stylesheet" href="../static/css/styles2.css"/>
    <script src="../static/js/store.js" async></script>
</head>
<body>
<header class="main-header">
    <nav class="main-nav nav">
    </nav>
    <h1 class="band-name band-name-large"><a href="/" style="text-decoration: none; color: rgb(255, 255, 255);">Выбор
        столовой</a></h1>
</header>
<section class="container content-section">
    <section class="container content-section">
        <h2 class="section-header-cart">КОРЗИНА</h2>
        <div class="cart-row">
            <span class="cart-item cart-header cart-column">БЛЮДО</span>
            <span class="cart-price cart-header cart-column">ЦЕНА</span>
            <span class="cart-quantity cart-header cart-column">КОЛИЧЕСТВО</span>
        </div>
        <div class="cart-items">
        </div>
        <div class="cart-total">
            <strong class="cart-total-title">СУММА</strong>
            <span class="cart-total-price">0р.</span>
        </div>
        <button class="btn btn-primary btn-purchase" type="button">ОПЛАТИТЬ</button>
    </section>
    
                   <div class="container mt-5">
    <h2 class ="mb-5 text-center">Выбор блюда</h2>
    
<div class = "card-deck">
    <section class="container content-section">
        <h2 class="section-header">Салаты</h2>
        <div class="shop-items">
        <#list canteen.getSalads() as salad>
            <div class="shop-item">
            <div class = "card-body">
                <span class="shop-item-title">${salad.getName()}</span>
                <img class="shop-item-image" src="../static/images/4.jpg">
                <div class="shop-item-details">
                    <span class="shop-item-price">${salad.getPrice()}</span>
                    <button class="btn btn-primary shop-item-button" type="button">Добавить в корзину</button>
                </div>
            </div>
        </#list>
        </div>
    </section>
    </div>
 


    <section class="container content-section">
        <h2 class="section-header">ПЕРВЫЕ БЛЮДА</h2>
        <div class="shop-items">
        <#list canteen.getSoups() as soup>
            <div class="shop-item">
             <div class = "card-body">
                <span class="shop-item-title">${soup.getName()}</span>
                <img class="shop-item-image" src="../static/images/4.jpg">
                <div class="shop-item-details">
                    <span class="shop-item-price">${soup.getPrice()}</span>
                    <button class="btn btn-primary shop-item-button" type="button">Добавить в корзину</button>
                </div>
            </div>
        </#list>
        </div>
    </section>

    <section class="container content-section">
        <h2 class="section-header">ВТОРЫЕ БЛЮДА</h2>
        <div class="shop-items">
         <div class = "card-body">
         <#list canteen.getMainDishes() as main>
             <div class="shop-item">
                 <span class="shop-item-title">${main.getName()}</span>
                 <img class="shop-item-image" src="../static/images/4.jpg">
                 <div class="shop-item-details">
                     <span class="shop-item-price">${main.getPrice()}</span>
                     <button class="btn btn-primary shop-item-button" type="button">Добавить в корзину</button>
                 </div>
             </div>
         </#list>
        </div>
    </section>


    <section class="container content-section">
        <h2 class="section-header">ГАРНИРЫ</h2>
    <#list canteen.getSideDishes() as side>
             <div class="shop-item">
                 <span class="shop-item-title">${side.getName()}</span>
                 <img class="shop-item-image" src="../static/images/4.jpg">
                 <div class="shop-item-details">
                     <span class="shop-item-price">${side.getPrice()}</span>
                     <button class="btn btn-primary shop-item-button" type="button">Добавить в корзину</button>
                 </div>
                    </div>
             </div>
    </#list>
    </section>

    <section class="container content-section">
        <h2 class="section-header">НАПИТКИ</h2>
        <div class="shop-items">
         <div class = "card-body">
         <#list canteen.getDrinks() as drink>
             <div class="shop-item">
                 <span class="shop-item-title">${drink.getName()}</span>
                 <img class="shop-item-image" src="../static/images/4.jpg">
                 <div class="shop-item-details">
                     <span class="shop-item-price">${drink.getPrice()}</span>
                     <button class="btn btn-primary shop-item-button" type="button">Добавить в корзину</button>
                 </div>
             </div>
                </div>
         </#list>
   </div>
</section>
</div>
</body>
</html>