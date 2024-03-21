package org.example.misc.CREATE;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import org.assertj.core.api.Assert;
import org.example.Base.BaseTest;
import org.example.Endpoints.APIConstants;
import org.example.Payloads.BookingResponseclass;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.*;


public class TCCreateBooking extends BaseTest {

    @Test
    @Owner("Promode")
    @Severity(SeverityLevel.NORMAL)
    @Description("TC#1 - Verify that the Booking can be Created")
    public void testCreateBooking() throws JsonProcessingException {
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

        response = RestAssured.given().spec(requestSpecification)
                .when().body(payloadManager.createPayloadGSON()).post();


        validatableResponse = response.then().log().all();
        BookingResponseclass bookingRespons = payloadManager.bookingResponseJava(response.asString());

        // Validatable Default
        validatableResponse.statusCode(200);

        // Assert J

//        assertThat(bookingRespons.getBookingid()).isNotNull();
//        assertThat(bookingRespons.getBooking().getFirstname()).isNotNull().isNotBlank();
//        assertThat(bookingRespons.getBooking().getFirstname()).isEqualTo("Pramod");        // TestNG Assertions
//        assertActions.verifyStatusCode(response);

        // TestNG Assertions
        assertActions.verifyStatusCode(response);
    }

    @Test
    @Owner("Promode")
    @Severity(SeverityLevel.NORMAL)
    @Description("TC#2 - Verify that the Booking not created when Payload is missing")
    public void testCreateBookingNegative()  throws JsonProcessingException{
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);
        response = RestAssured.given().spec(requestSpecification)
                .when().body("{}").post();
        validatableResponse = response.then().log().all();
        // TestNG Assertions
        assertActions.verifyStatusCodeInvalidReq(response);
    }


}
