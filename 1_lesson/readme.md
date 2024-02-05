# Создание первого JavaSpringBoot приложения
> Урок основывается на данном ресурсе
> https://www.youtube.com/watch?v=jH17YkBTpI4&list=PLU2ftbIeotGpAYRP9Iv2KLIwK36-o_qYk

1. Для создания шаблона захоим на ресурс https://start.spring.io/
2. Выбираем
   * Project: Maven
   * Language: Java
   * Spring Boot: 3.2.2
   * Project Metadata: {Название проекта в поле Artifact} (также при желании можно изменить Group)
   * Java: 21
   * Dependencies:
     - Spring Boot DevTools
     - Spring Web
     - Mustache   
  И нажимаем "GENERATE"
![image](https://github.com/sitechbr/JavaSpringBootCodologia/assets/63145839/c2c072aa-1d9a-4b09-9b28-bfd2dfddc41d)

3. Переходим к инструкции "Serving Web Content with Spring MVC" https://spring.io/guides/gs/serving-web-content/
4. Открываем проект в IntelliJ IDEA Community Edition (страница на загрузку https://www.jetbrains.com/idea/download/?section=windows)
5. В соответсвии с инструкцией "Serving Web Content with Spring MVC" создаем файл `GreetingController.java`
``` java
package com.example.Message2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String,Object> model) {
        model.put("name", name);
        return "greeting";
    }
}
   ```
> Обратите внимание, что так как мы используем Mustache, вместо Model используем класс Map(Словарь) для хранения объекта с данными

6. В папке templates создаем файл `greeting.mustache`
``` html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <div>
        Hello, {{name}}
    </div>
</body>
</html>

```
> Подробный учебник по html https://htmlbook.ru/

7. Запускаем приложение перейдя на класс с функцией *main*
8. После запуска переходим в браузер и в адрес вводим:
http://127.0.0.1:8080/greeting?name=Iris
получаем результат
9. Для создания других страниц необхоимо в файле `GreetingController.java` добавить Mapping. Например простой mapping главной страницы выглядит вот так:
``` java
@GetMapping
    public String main(Map<String,Object> model) {

        return "main";
    }
```
