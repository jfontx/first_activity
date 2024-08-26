import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import utils.Main;

public class MainTest {
    @Test
    @Tag("task:1")
    @DisplayName("Implemented the addTwoNumbers method")
    public void implemented_expected_addTwoNumbers() {
        assertThat(new Main().hasMethod("addTwoNumbers", int.class, int.class))
                .withFailMessage("Method addTwoNumbers must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("addTwoNumbers", int.class, int.class))
                .withFailMessage("Method addTwoNumbers must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "addTwoNumbers", int.class, int.class))
                .withFailMessage("Method addTwoNumbers must return an int")
                .isTrue();
        assertThat(new Main().addTwoNumbers(2, 2)).isEqualTo(4);
        assertThat(new Main().addTwoNumbers(-2, 2)).isEqualTo(0);
        assertThat(new Main().addTwoNumbers(-2, -2)).isEqualTo(-4);
    }

    @Test
    @Tag("task:2")
    @DisplayName("Implemented the multiplyTwoNumbers method")
    public void implemented_expected_multiplyTwoNumbers() {
        assertThat(new Main().hasMethod("multiplyTwoNumbers", int.class, int.class))
                .withFailMessage("Method multiplyTwoNumbers must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("multiplyTwoNumbers", int.class, int.class))
                .withFailMessage("Method multiplyTwoNumbers must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "multiplyTwoNumbers", int.class, int.class))
                .withFailMessage("Method multiplyTwoNumbers must return an int")
                .isTrue();
        assertThat(new Main().multiplyTwoNumbers(2, 2)).isEqualTo(4);
        assertThat(new Main().multiplyTwoNumbers(-2, 2)).isEqualTo(-4);
        assertThat(new Main().multiplyTwoNumbers(-2, -2)).isEqualTo(4);
    }

    @Test
    @Tag("task:3")
    @DisplayName("Implemented the divideTwoNumbers method")
    public void implemented_expected_divideTwoNumbers() {
        assertThat(new Main().hasMethod("divideTwoNumbers", int.class, int.class))
                .withFailMessage("Method divideTwoNumbers must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("divideTwoNumbers", int.class, int.class))
                .withFailMessage("Method divideTwoNumbers must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(float.class, "divideTwoNumbers", int.class, int.class))
                .withFailMessage("Method divideTwoNumbers must return an float")
                .isTrue();
        assertThat(new Main().divideTwoNumbers(2, 2)).isEqualTo(1.0f);
        assertThat(new Main().divideTwoNumbers(-2, 2)).isEqualTo(-1.0f);
        assertThat(new Main().divideTwoNumbers(-2, -2)).isEqualTo(1.0f);
    }

    @Test
    @Tag("task:4")
    @DisplayName("Implemented the substractTwoNumbers method")
    public void implemented_expected_substractTwoNumbers() {
        assertThat(new Main().hasMethod("substractTwoNumbers", int.class, int.class))
                .withFailMessage("Method substractTwoNumbers must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("substractTwoNumbers", int.class, int.class))
                .withFailMessage("Method substractTwoNumbers must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "substractTwoNumbers", int.class, int.class))
                .withFailMessage("Method substractTwoNumbers must return an int")
                .isTrue();
        assertThat(new Main().substractTwoNumbers(2, 2)).isEqualTo(0);
        assertThat(new Main().substractTwoNumbers(-2, 2)).isEqualTo(-4);
        assertThat(new Main().substractTwoNumbers(-2, -2)).isEqualTo(0);
    }

    @Test
    @Tag("task:5")
    @DisplayName("Implemented the isNumberEven method")
    public void implemented_expected_isNumberEven() {
        assertThat(new Main().hasMethod("isNumberEven", int.class))
                .withFailMessage("Method isNumberEven must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("isNumberEven", int.class))
                .withFailMessage("Method isNumberEven must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(boolean.class, "isNumberEven", int.class))
                .withFailMessage("Method isNumberEven must return a boolean")
                .isTrue();
        assertThat(new Main().isNumberEven(2)).isEqualTo(true);
        assertThat(new Main().isNumberEven(3)).isEqualTo(false);
        assertThat(new Main().isNumberEven(0)).isEqualTo(true);
        assertThat(new Main().isNumberEven(-2)).isEqualTo(true);
        assertThat(new Main().isNumberEven(-3)).isEqualTo(false);
    }

    @Test
    @Tag("task:6")
    @DisplayName("Implemented the calculateFirstRightDigit method")
    public void implemented_expected_calculateFirstRightDigit() {
        assertThat(new Main().hasMethod("calculateFirstRightDigit", int.class))
                .withFailMessage("Method calculateFirstRightDigit must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("calculateFirstRightDigit", int.class))
                .withFailMessage("Method calculateFirstRightDigit must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "calculateFirstRightDigit", int.class))
                .withFailMessage("Method calculateFirstRightDigit must return a boolean")
                .isTrue();
        assertThat(new Main().calculateFirstRightDigit(2)).isEqualTo(2);
        assertThat(new Main().calculateFirstRightDigit(100)).isEqualTo(0);
        assertThat(new Main().calculateFirstRightDigit(12)).isEqualTo(2);
        assertThat(new Main().calculateFirstRightDigit(721)).isEqualTo(1);
        assertThat(new Main().calculateFirstRightDigit(-3123)).isEqualTo(3);
    }

    @Test
    @Tag("task:7")
    @DisplayName("Implemented the celciusToFahrenheit method")
    public void implemented_expected_celciusToFahrenheit() {
        assertThat(new Main().hasMethod("celciusToFahrenheit", float.class))
                .withFailMessage("Method celciusToFahrenheit must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("celciusToFahrenheit", float.class))
                .withFailMessage("Method celciusToFahrenheit must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(float.class, "celciusToFahrenheit",float.class))
                .withFailMessage("Method celciusToFahrenheit must return a float")
                .isTrue();
        assertThat(new Main().celciusToFahrenheit(30.0f)).isEqualTo(86.0f);
        assertThat(new Main().celciusToFahrenheit(40.0f)).isEqualTo(104.0f);
    }

    @Test
    @Tag("task:8")
    @DisplayName("Implemented the areaOfATriangle method")
    public void implemented_expected_areaOfATriangle() {
        assertThat(new Main().hasMethod("areaOfATriangle", float.class, float.class))
                .withFailMessage("Method areaOfATriangle must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("areaOfATriangle", float.class, float.class))
                .withFailMessage("Method areaOfATriangle must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(float.class, "areaOfATriangle",float.class, float.class))
                .withFailMessage("Method areaOfATriangle must return a float")
                .isTrue();
        assertThat(new Main().areaOfATriangle(4.0f, 4.0f)).isEqualTo(8.0f);
    }

    @Test
    @Tag("task:9")
    @DisplayName("Implemented the isLeapYear method")
    public void implemented_expected_isLeapYear() {
        assertThat(new Main().hasMethod("isLeapYear", int.class))
                .withFailMessage("Method isLeapYear must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("isLeapYear", int.class))
                .withFailMessage("Method isLeapYear must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(boolean.class, "isLeapYear",int.class))
                .withFailMessage("Method isLeapYear must return a boolean")
                .isTrue();
        assertThat(new Main().isLeapYear(2000)).isEqualTo(true);
        assertThat(new Main().isLeapYear(2024)).isEqualTo(true);
        assertThat(new Main().isLeapYear(2023)).isEqualTo(false);
        assertThat(new Main().isLeapYear(2020)).isEqualTo(true);
        assertThat(new Main().isLeapYear(2010)).isEqualTo(false);
    }

    @Test
    @Tag("task:10")
    @DisplayName("Implemented the isPrime method")
    public void implemented_expected_isPrime() {
        assertThat(new Main().hasMethod("isPrime", int.class))
                .withFailMessage("Method isPrime must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("isPrime", int.class))
                .withFailMessage("Method isPrime must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(boolean.class, "isPrime",int.class))
                .withFailMessage("Method isPrime must return a boolean")
                .isTrue();
        assertThat(new Main().isPrime(13)).isEqualTo(true);
        assertThat(new Main().isPrime(23)).isEqualTo(true);
        assertThat(new Main().isPrime(12)).isEqualTo(false);
        assertThat(new Main().isPrime(11)).isEqualTo(true);
        assertThat(new Main().isPrime(20)).isEqualTo(false);
    }

    @Test
    @Tag("task:11")
    @DisplayName("Implemented the calculateFactorial method")
    public void implemented_expected_calculateFactorial() {
        assertThat(new Main().hasMethod("calculateFactorial", int.class))
                .withFailMessage("Method calculateFactorial must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("calculateFactorial", int.class))
                .withFailMessage("Method calculateFactorial must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "calculateFactorial",int.class))
                .withFailMessage("Method calculateFactorial must return a int")
                .isTrue();
        assertThat(new Main().calculateFactorial(5)).isEqualTo(120);
        assertThat(new Main().calculateFactorial(0)).isEqualTo(1);
        assertThat(new Main().calculateFactorial(1)).isEqualTo(1);
        assertThat(new Main().calculateFactorial(4)).isEqualTo(24);
    }

    @Test
    @Tag("task:12")
    @DisplayName("Implemented the calculateLastNFibonnacci method")
    public void implemented_expected_calculateLastNFibonnacci() {
        assertThat(new Main().hasMethod("calculateLastNFibonnacci", int.class))
                .withFailMessage("Method calculateLastNFibonnacci must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("calculateLastNFibonnacci", int.class))
                .withFailMessage("Method calculateLastNFibonnacci must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "calculateLastNFibonnacci",int.class))
                .withFailMessage("Method calculateLastNFibonnacci must return a int")
                .isTrue();
        assertThat(new Main().calculateLastNFibonnacci(7)).isEqualTo(13);
        assertThat(new Main().calculateLastNFibonnacci(6)).isEqualTo(8);
        assertThat(new Main().calculateLastNFibonnacci(5)).isEqualTo(5);
        assertThat(new Main().calculateLastNFibonnacci(1)).isEqualTo(1);
        assertThat(new Main().calculateLastNFibonnacci(2)).isEqualTo(1);
        assertThat(new Main().calculateLastNFibonnacci(3)).isEqualTo(2);
    }

    @Test
    @Tag("task:13")
    @DisplayName("Implemented the getNumberOfDigits method")
    public void implemented_expected_getNumberOfDigits() {
        assertThat(new Main().hasMethod("getNumberOfDigits", int.class))
                .withFailMessage("Method getNumberOfDigits must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("getNumberOfDigits", int.class))
                .withFailMessage("Method getNumberOfDigits must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "getNumberOfDigits",int.class))
                .withFailMessage("Method getNumberOfDigits must return a int")
                .isTrue();
        assertThat(new Main().getNumberOfDigits(7)).isEqualTo(1);
        assertThat(new Main().getNumberOfDigits(12)).isEqualTo(2);
        assertThat(new Main().getNumberOfDigits(120)).isEqualTo(3);
        assertThat(new Main().getNumberOfDigits(1201)).isEqualTo(4);
    }

    @Test
    @Tag("task:14")
    @DisplayName("Implemented the rotateNumber method")
    public void implemented_expected_rotateNumber() {
        assertThat(new Main().hasMethod("rotateNumber", int.class))
                .withFailMessage("Method rotateNumber must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("rotateNumber", int.class))
                .withFailMessage("Method rotateNumber must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "rotateNumber",int.class))
                .withFailMessage("Method rotateNumber must return a int")
                .isTrue();
        assertThat(new Main().rotateNumber(7)).isEqualTo(7);
        assertThat(new Main().rotateNumber(13)).isEqualTo(31);
        assertThat(new Main().rotateNumber(123)).isEqualTo(321);
    }

    @Test
    @Tag("task:15")
    @DisplayName("Implemented the sumOffirstNNumbersMultiplesOfFiveOrThree method")
    public void implemented_expected_sumOffirstNNumbersMultiplesOfFiveOrThree() {
        assertThat(new Main().hasMethod("sumOffirstNNumbersMultiplesOfFiveOrThree", int.class))
                .withFailMessage("Method sumOffirstNNumbersMultiplesOfFiveOrThree must be created")
                .isTrue();
        assertThat(new Main().isMethodPublic("sumOffirstNNumbersMultiplesOfFiveOrThree", int.class))
                .withFailMessage("Method sumOffirstNNumbersMultiplesOfFiveOrThree must be public")
                .isTrue();
        assertThat(new Main().isMethodReturnType(int.class, "sumOffirstNNumbersMultiplesOfFiveOrThree",int.class))
                .withFailMessage("Method sumOffirstNNumbersMultiplesOfFiveOrThree must return a int")
                .isTrue();
        assertThat(new Main().sumOffirstNNumbersMultiplesOfFiveOrThree(7)).isEqualTo(14);
        assertThat(new Main().sumOffirstNNumbersMultiplesOfFiveOrThree(10)).isEqualTo(33);
        assertThat(new Main().sumOffirstNNumbersMultiplesOfFiveOrThree(1000)).isEqualTo(234168);
    }
}
