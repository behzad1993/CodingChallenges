package amazon2;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class ResultTest {

    @Test
    void test1() {
        String s = "0001LAJ5KBX9H8|0003UKURNK403F|0002MO6K1Z9WFA|0004OWRXZFMS2C";
        Result.ordered_configuration(s);
    }

    @Test
    void test2() {
        String s = "000618L1QPXTWZ|0003SR7H3AHF8D|00047XZOXTBJDB|000153CHLNV06Q|0007YKA8V3AQFL|0008CU15NFAFIW|0009IDT15ULJEE|00020PY5Z0NETT";
        System.out.println(Result.ordered_configuration(s));
    }
}
