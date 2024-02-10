# Добавление простой авторизации (без token)

1. Добавляем новый класс Properties.java
``` java
package codologia.autorization;

public class Properties {
    private final String user = "user";
    private final String password="pass";

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
```

2. Создаем Mapping
``` java
 @GetMapping
    public String auth(Map<String,Object> model) {
        return "auth";
    }
```

3. Создаем templates
``` html

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form  method="post">


    <div class="container">
        <label for="uname"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="uname">

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw">

        <button type="submit">Login</button>

    </div>

</form>

<div>
<!-- Эквивалентно if, те если есть message то выведи -->
    {{#message}}
        {{message}}
    {{/message}}
</div>
</body>
</html>

```
4. Создаем обработчик post запроса в файле GreetingController.java

``` java
 @PostMapping
    public String login(@RequestParam String uname, @RequestParam String psw, Map<String,Object> model) {
        Properties auth = new Properties();
        if (uname.equals(auth.getUser()) && psw.equals(auth.getPassword())) {

            return  String.format("redirect:/greeting?name=%s",uname);
        }
        else {
            model.put("message", "Error");
            return "auth";
        }


    }

}
```
5. Так же изменяем файл greeting.mustache(добавяляем кнопку)
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
    <form  method="get" action="/">
        <button type="submit">Logout</button>
    </form>
</div>
</body>
</html>
```
