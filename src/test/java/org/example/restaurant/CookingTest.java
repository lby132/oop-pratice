package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void test() {
        final Cooking cooking = new Cooking();
        final MenuItem menuItem = new MenuItem("돈가스", 5000);

        final Cook cook = cooking.makeCook(menuItem);

        assertThat(cook).isEqualTo(new Cook("돈가스", 5000));
    }
}
