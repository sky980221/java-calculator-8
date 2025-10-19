package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
//    @Test
//    void 커스텀_구분자_사용() {
//        assertSimpleTest(() -> {
//            run("//;\\n1");
//            assertThat(output()).contains("결과 : 1");
//        });
//    }
//
//    @Test
//    void 예외_테스트() {
//        assertSimpleTest(() ->
//            assertThatThrownBy(() -> runException("-1,2,3"))
//                .isInstanceOf(IllegalArgumentException.class)
//        );
//    }
    @Test
    void 빈문자열_또는_null_입력시_0_반환() {
        // given
        String input1 = "";
        String input2 = null;

        // when
        int result1 = Calculate.add(input1);
        int result2 = Calculate.add(input2);

        // then
        assertThat(result1).isEqualTo(0);
        assertThat(result2).isEqualTo(0);
    }
    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
