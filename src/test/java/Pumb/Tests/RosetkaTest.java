package Pumb.Tests;

import Pumb.Helpers.TestBase;
import org.testng.annotations.Test;

public class RosetkaTest extends TestBase {

    @Test
    public void RosetkaTest() throws InterruptedException {
        app.openRozetka();
        //3. В разделе Смартфоны выбрать Мобильные телефоны.
        app.chooseSmartphones();
        app.chooseMobile();
        //4. Задать параметр поиска до 6 000 грн
        app.setAPrice();
        //4. Диагональ экрана от 4 дюймов.
        app.inch41_45();
        Thread.sleep(7000);
        app.inch45_5();
        Thread.sleep(7000);
        app.inch51_55();
        Thread.sleep(10000);
        app.inch555_6();
        Thread.sleep(10000);
        app.inchMoreThan6();
        Thread.sleep(10000);
        //6. Выбрать не менее 5 любых производителей, среди популярных.
        app.chooseAsus();
        app.chooseHTC();
        app.chooseHuawei();
        app.chooseMeizu();
        app.chooseSamsung();
        Thread.sleep(7000);
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
