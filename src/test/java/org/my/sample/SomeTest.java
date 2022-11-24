package org.my.sample;

import io.qameta.allure.Allure;
import io.qameta.allure.Param;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

class SomeTest {

    @Test
    void someTest() {

        someParameterizedMethod("ABCD", 1);
    }

    @Step("Here I to something")
    void someParameterizedMethod(@Param("With string parameter") String param1,
                                 @Param("With int parameter") int param2) {
        // for parameter to appear on Test's level you need to use Allure.parameter(), otherwise your parameter will be only the parameters of a step
        Allure.parameter("param1", param1);
        Allure.parameter("param2", param2);


    }
}
