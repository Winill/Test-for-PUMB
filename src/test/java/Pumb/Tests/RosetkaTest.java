package Pumb.Tests;

import Pumb.Helpers.TestBase;
import org.testng.annotations.Test;

public class RosetkaTest extends TestBase {

  @Test
  public void RosetkaTest() throws InterruptedException {
    // 2. Зайти на rozetka.com.ua
    app.openRozetka();
    //3. В разделе Смартфоны выбрать Мобильные телефоны.
    app.chooseSmartphones();
    app.chooseMobile();
    //4. Задать параметр поиска до 6 000 грн
    app.setAPrice();
    //4. Диагональ экрана от 4 дюймов.
    app.chooseDisplay();
    //6. Выбрать не менее 5 любых производителей, среди популярных.
    app.chooseBrands();
    //8. Проверить, что на странице >1 элемента
    app.checkCountOfElements();
    //9. Запомнить первый элемент в списке.
    String elementID = app.firstElementInList();
    //10. Изменить Сортировку на другую (популярность или новизна).
    app.sortByNew();
    //11. Найти и нажать по имени запомненного объекта.
    app.openRememberedPhone(elementID);
    //Вывести цифровое значение его оценки.
    app.printValuation();
  }


}
