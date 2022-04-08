package com.design_principles.Demeters_rule;

//经纪人
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    //和粉丝见面的方法
    public void meeting(){
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }
    //和公司洽谈的方法
    public void talk(){
        System.out.println(star.getName() + "与公司" + company.getName() + "洽谈");
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
