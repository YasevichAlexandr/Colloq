import static org.junit.Assert.*;

public class ColloqTest {
    @org.junit.Test


    public void isInt() {
    }
    @org.junit.Test
    public void isDouble() {
    }

    @org.junit.Test
    public void main()
    {
        String[] str1 =  {"bla", "empty", "Yas"};
        String[] str2 = {"3", "0", "5" };
        String[] str = {"blablabla", "", "YasYasYasYasYas"};
        String res;
        for(int i = 0; i < 3; i++){
            res = Colloq.result(str1[i], str2[i]);
            assertEquals(res, str[i]);
        }
    }
}
