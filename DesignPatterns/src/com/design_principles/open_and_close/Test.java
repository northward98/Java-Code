package com.design_principles.open_and_close;

public class Test {
    public static void main(String[] args) {
        SougouInput si = new SougouInput();
        //创建默认皮肤
        //DefaultSkin defaultSkin = new DefaultSkin();
        //改成使用自己皮肤
        MySkin mySkin = new MySkin();
        //将皮肤设置到输入法中
        //si.setSkin(defaultSkin);
        si.setSkin(mySkin);
        //显示皮肤
        si.display();
    }
}
