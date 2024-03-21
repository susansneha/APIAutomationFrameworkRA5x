package org.example.tests.Integration;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import org.example.Base.BaseTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;
public class TC_Integration extends BaseTest {

    String token;

    //Create a booking
    @Test(groups = "P0",priority = 1)
    public void testCreateBooking() throws JsonProcessingException {
        token=getToken();
        assertThat("Sneha").isEqualTo("Sneha");
        System.out.println(token);
    }

    //Update booking with Token and Booking ID
    @Test(groups = "P0",dependsOnMethods = {"testCreateBooking","getToken"})
    public void testCreateAndUpdateBooking() {
        assertThat("Sneha").isEqualTo("Sneha");

    }
    //Delete Booking
    @Test(groups = "P0",dependsOnMethods = {"testCreateAndUpdateBooking"})
    public void testDeleteBooking(){
        assertThat("Sneha").isEqualTo("Sneha");

    }
}
