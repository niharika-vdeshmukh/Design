package org.example;

import java.util.Objects;

public class PlanFactory {

    public Plan getPlan(String plan) {
        if(Objects.isNull(plan)) return null;
        if(plan.equals("CommercialPlan"))
            return new CommercialPlan();
        if(plan.equals("DomesticPlan"))
            return new DomesticPlan();
        return null;
    }
}
