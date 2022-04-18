package optional_;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    //Optional.of(T t)：创建一个 Optional 实例，t 必须非空
    //Optional.empty()：创建一个空的 Optional 实例
    //Optional.ofNullable(T t)：创建一个 Optional 实例，t 可以为 null
    @Test
    public void test1(){
        Girl girl = new Girl();
        //girl = null;
        Optional<Girl> optionalGirl1 = Optional.of(girl);
        Optional<Girl> optionalGirl2 = Optional.ofNullable(girl);
    }

    @Test
    public void test2(){
        Boy boy = new Boy();
        boy = null;
        String girlName = getGirlName(boy);
        System.out.println(girlName);
    }
    public String getGirlName(Boy boy){
        Optional<Boy> optionalBoy = Optional.ofNullable(boy);
        Boy boy1 = optionalBoy.orElse(new Boy(new Girl("mary")));
        Girl girl = boy1.getGirl();
        return null;
    }

}
