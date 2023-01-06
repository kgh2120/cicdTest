package com.kk.cicd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Test1 {

    @Test
    void plus(){
        int a = 10;
        int b = 20;

        Assertions.assertThat(30).isSameAs(a+b);
    }

}
