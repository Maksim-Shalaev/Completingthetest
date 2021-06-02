import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
        // для незарегистрированных пользователей до лимита:
    void calculateforunregistredunderlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        // для незарегистированных пользователей сверх лимита:
    void calculateforunregistredoverlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount,registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
<<<<<<< HEAD
        // для зарегистированных пользователей с отрицательной стоимостью:
    void calculateforregistrednegative() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = - 1000_60;
        boolean registered = true;
        long expected = - 30;
=======
        // для зарегистированных пользователей до лимита:
    void calculateforregistredunderlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
>>>>>>> 802c77b (added tests)

        // вызываем целевой метод:
        long actual = service.calculate(amount,registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
        // для зарегистированных пользователей с нулевой стоимостью:
    void calculateforregistredzero() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount,registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected,actual);
    }
<<<<<<< HEAD
=======

    @org.junit.jupiter.api.Test
        // для зарегистированных пользователей сверх лимита:
    void calculateforregistredoverlimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount,registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected,actual);
    }
>>>>>>> 802c77b (added tests)
}