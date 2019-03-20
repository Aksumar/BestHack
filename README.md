# BestHack

## Используемые технологии
+ Back-end
  + язык : Java8
  + фреймворк : Spring MVC
  + Lombok
+ Front-end
  + Java Script, CSS
  + Bootstrap
  + шаблонизатор : Freemarker
  
## Как запустить проект? 
Необходимо открыть проект в любой среде разработке, к примеру в Intellij IDEA, и запустить его.
Проект автоматически соберется и настроится на http://localhost:8080 при условии, что данный порт не занят.

## Архитектура приложения и генерация страниц
Существует два основных класса - Canteen, класс самой столовой, и Produt,класс блюда. При переходе на страницу определенной столовой
ее объект передается на фронт-энд, где парсится с помощью Freemarker.
```
public class Canteen {
    private String name;
    private String address;
    private List<Product> salads;
    private List<Product> soups;
    private List<Product> porridge;
    private List<Product> sideDishes;
    private List<Product> mainDishes;
    private List<Product> desserts;
    private List<Product> drinks;
}
```

```
public class Product {
    private String name;
    private int weight;
    private int calorificValue;
    private HashMap<String, Integer> traceElements;
    private String pathToImage;
    private Integer price;

```
## Доп. задания
  + Анимация
  + Навигация по меню
  
## Дополнительные комментарии
Команда понимает, что данный проект подразумевает использование БД, тем не менее мы намеренно решили не использовать их на
данном этапе в свзи с тем, что, как мы изначально поняли, будет происходить запуск проекта на машине проверяющего.


