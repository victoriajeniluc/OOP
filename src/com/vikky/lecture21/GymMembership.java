package com.vikky.lecture21;
/**
 * Gym membership class. Simply calculates the total cost by
 * multiplying duration by monthlyFee.
 *
 * Check DiscountedGymMembership1 and DiscountedGymMembership2 classes as well.
 *
 * @author Udayan Khattry
 */

// DO NOT MAKE DISCOUNT CHANGES IN THIS BECAUSE IT CAN CAUSE AN ERROR IF WE ADDED IT AS A PROPERTY OF THE GYMMEMBERSHIP
public class GymMembership {
    private String memberName;
    private double duration;
    private double monthlyFee;

    /**
     * Parameterized Constructor.
     *
     * @param name the name of the member
     * @param duration the membership duration
     * @param monthlyFee per month fee
     */
    // initializating all the instance variables
    public GymMembership(String name, double duration, double monthlyFee) {
        this.memberName = name;
        this.duration = duration;
        this.monthlyFee = monthlyFee;
    }

    /**
     * Returns the total cost of gym membership.
     *
     * @return total cost of gym membership
     */
    public double getTotalCost() {
        return duration * monthlyFee;
    }

    @Override
    public String toString() {
        String det = memberName + ", " + duration + ", " + monthlyFee;
        return det;
    }
}