import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * Intellinet Beratung und Technologie GmbH
 */

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 12.11.2019
 */
class ERsteBaumTest {

    private ERsteBaum eRsteBaum;

    // @Test
    // public void test() {
    // new ERsteBaum().dritteForm(11);
    //
    // }

    @Test
    public void test_02() {

 

    }

    @Test
    public void test_03() {

        eRsteBaum = new ERsteBaum();
        String[][] baum = eRsteBaum.holeBaum(12);
        eRsteBaum.zeigeBaum(baum);

        System.out.println("----------------------------------");
        eRsteBaum.schmueckeBaumMitKerze(baum);
        eRsteBaum.zeigeBaum(baum);
    }
}
