# Установка БД postgresql 
1. Открываем терминал   
![image](https://github.com/sitechbr/JavaSpringBootCodologia/assets/63145839/48e76aba-730c-48ad-8f9a-d7e8dc30773a)
2. Обновляем список пакетов
```
sudo apt update
```
3. Устанавливаем postgresql   
```
sudo apt install postgresql postgresql-contrib
```
4. Для запуска службы используйте
```
sudo systemctl start postgresql
```
Проверка статуса 
```
sudo systemctl status postgresql
```
Остановка 
```
sudo systemctl stop postgresql
```

5. Заходим под пользователем postgres
```
sudo -u postgres psql
```
6. Создаем базу данных
```
create database spring;
```
7. Создаем пользователя
```
create role spring login password 'spring';
```
8. Находим файл pg_hba.conf
```
sudo find /etc -name "pg_hba.conf"
```
9. Открываем файл для редактирования
```
sudo nano /etc/postgresql/16/main/pg_hba.conf
```

10. Меняем в файле peer на md5 в строке local all all peer
![изображение](https://github.com/sitechbr/JavaSpringBootCodologia/assets/63145839/b491d745-802c-4eeb-83e8-1f0fc6cb19a7)


11. Reboot postgresql 
```
sudo systemctl restart postgresql
```
13. Подключаемся к БД. Пароль spring
```
psql -d spring -U spring
```
