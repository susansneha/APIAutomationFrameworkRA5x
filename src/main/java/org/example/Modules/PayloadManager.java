package org.example.Modules;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import org.example.Payloads.*;

public class PayloadManager {
    //Java-> Json

    public String createPayloadGSON() {
        Faker faker = new Faker();

        Booking booking = new Booking();
        String expectFirstName = faker.name().firstName();


        booking.setFirstname(expectFirstName);
        booking.setLastname("Dutta");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);
        // Object -> JSON String (GSON)
        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);
        return jsonStringBooking;
    }


    public void createPayloadJackSon() { // Incomplete

    }

    public String updatePayload() {
        Booking booking = new Booking();
        booking.setFirstname("Amit");
        booking.setLastname("Dutta");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);
        //Serialization--Object->Json
        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);
        return jsonStringBooking;

    }

    public String setAuthPayload() {
        Auth auth = new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");
        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(auth);
        System.out.println(jsonStringBooking);
        return jsonStringBooking;
    }
    public String getTokenFromJSON(String tokenResponse){
        Gson gson = new Gson();
        TokenResponse tokenResponse1 = gson.fromJson(tokenResponse, TokenResponse.class);
        return  tokenResponse1.getToken();
    }


    public BookingResponseclass bookingResponseJava(String responseString){
        Gson gson = new Gson();
        BookingResponseclass bookingRespons = gson.fromJson(responseString,BookingResponseclass.class);
        return bookingRespons;

    }

    public Booking bookingResponsePUTReqJava(String responseString){
        Gson gson = new Gson();
        Booking booking = gson.fromJson(responseString,Booking.class);
        return booking;

    }


}


