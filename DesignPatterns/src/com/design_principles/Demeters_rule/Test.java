package com.design_principles.Demeters_rule;

public class Test {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Star star = new Star("jack");
        agent.setStar(star);
        Fans fans = new Fans("mike");
        agent.setFans(fans);
        Company company = new Company("Company");
        agent.setCompany(company);

        agent.meeting();
        agent.talk();
    }
}
