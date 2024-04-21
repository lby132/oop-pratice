package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuTest {

    @DisplayName("메뉴판에서 메뉴이름에 해당하는 메뉴를 반환한다.")
    @Test
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("돈가스", 5000), new MenuItem("냉면", 7000)));

        final MenuItem menuItem = menu.choose("돈가스");

        assertThat(menuItem).isEqualTo(new MenuItem("돈가스", 5000));
    }
}
