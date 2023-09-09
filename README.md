# Krasnoslobodtsev Ivan Java

[![Java CI with Gradle](https://github.com/ivan3035789/KrasnoslobodtsevIvanJava/actions/workflows/gradle-publish.yml/badge.svg)](https://github.com/ivan3035789/KrasnoslobodtsevIvanJava/actions/workflows/gradle-publish.yml)

Задания требуется выполнить с использованием любого из нижеперечисленных языков программирования (если иное не было оговорено в чате с ASTON Trainee):
Java (11 версия)
C#
Python (3.0 версии и выше)


Задания, необходимо написать код:
Составить алгоритм: если введенное число больше 7, то вывести “Привет”
Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

Бонусные баллы:
* +возможность запуска полученной программы
* ++ интерактивный ввод значений для обработки и вывод обработанных данных
(например, через консоль)

Ответы представить в виде одной ссылки GitHub.
В соответствии с политикой безопасности просьба не присылать исполняемые файлы.
Название проекта должно содержать Вашу фамилию и язык программирования.
Срок выполнения - 3 суток.
Выполненное ТЗ направляйте, пожалуйста, в Skype, чат вашего рассмотрения

# Задания выполнены на языке программирования java, программы построены на автоматической сборке gradle, каждое задание расположено в пакете task1, task2, task3.
Программы имеют возможность запуска, интерактивный ввод значений для обработки и вывод обработанных данных
(например, через консоль), проведено модульное, интеграционное тестирование, имеются автоматизированные тесты, настроенно jococo для определения покрытия кода (ветвления, код), после прогона тестов отчет создается в папке build/jacocoHtml/index.html

## Запуск программы и тестов:
* Каждая программа запускается из своего пакета и класса из метода main();
* Ввод данных осуществляется из консоли, так же вывод обработанных данных;
* Тесты запускаются из своего пакета и класса так же можно запустить все тесты вместе наведя курсор мыши и щелкнув на правую пнопку мыши на папке Test, нажать на Run tests in testTask... или из консоли набрав команду ./gradlew clean test

* Задание, ответ в текстовой форме:
Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной? - *_Ответ: Нет_*
- Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной? - *_ _Ответ: [((())()(())] необходимо убрать одну уголую скобку или добавить [[((())()(())]]_*

  ## Перечень используемых инструментов:

**_java_** | язык програмирования для написания кода
 ----------|------------------------------------------------------------------------
**_IntelliJ IDEA_**  | программа, для работы с кодом
**_Gradle_**   | система автоматической сборки внутри IntelliJ IDEA
**_JUnit 5_**   | библиотека для тестирования
**_jacoco_** | для отображения покрытия кода
**_Git_** | система контроля версий
**_GitHub_** | для хранения тестов
**_GitHub Action_** | CI для непрерывной интеграции
