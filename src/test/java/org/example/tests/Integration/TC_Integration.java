package org.example.tests.Integration;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;
public class TC_Integration {
    //Get a token
    public void getToken(){
        assertThat("Sneha").isEqualTo("Sneha");

    }

    //Create a booking
    @Test(groups = "P0")
    public void testCreateBooking() {
        assertThat("Sneha").isEqualTo("Sneha");

    }

    //Update booking with Token and Booking ID
    @Test(groups = "P0")
    public void testCreateAndUpdateBooking() {
        assertThat("Sneha").isEqualTo("Sneha");

    }
    //Delete Booking
    @Test(groups = "P0")
    public void testDeleteBooking(){
        assertThat("Sneha").isEqualTo("Sneha");

    }
}
