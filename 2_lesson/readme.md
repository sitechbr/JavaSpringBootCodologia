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
