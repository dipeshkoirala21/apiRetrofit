package com.example.dipes.retrofit;

/**
 * Created by dipes on 9/1/2018.
 */

public class Json {
    private  String id;
    private  String name;
    private  String student_id;
    private  String route_id;
    private  String station_id;
    private  String token;
    private  String studentCheckinCheckout;

    public Json(String id, String name, String student_id, String route_id, String station_id, String token, String studentCheckinCheckout) {
        this.id = id;
        this.name = name;
        this.student_id = student_id;
        this.route_id = route_id;
        this.station_id = station_id;
        this.token = token;
        this.studentCheckinCheckout = studentCheckinCheckout;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getRoute_id() {
        return route_id;
    }

    public String getStation_id() {
        return station_id;
    }

    public String getToken() {
        return token;
    }

    public String getStudentCheckinCheckout() {
        return studentCheckinCheckout;
    }
}
