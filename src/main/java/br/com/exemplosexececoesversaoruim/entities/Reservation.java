package br.com.exemplosexececoesversaoruim.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private int roomNumber;
    private Date CheckIn;
    private Date CheckOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        CheckIn = checkIn;
        CheckOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return CheckIn;
    }

    public Date getCheckOut() {
        return CheckOut;
    }

    public long duration() {
        long diff = CheckOut.getTime() - CheckIn.getTime();
        TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }


    public String updateDates(Date checkIn, Date checkOut) {
        Date now;
        try {
            now = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            return "Unexpected date parsing error";
        }
        if (checkIn.before(now)) {
            return "Reservation dates for update must be future dates";

        }


        if (!checkOut.after(checkIn)) {
            return "Error in reservation: Check-out date must be after check-in date";
        }


        CheckIn = checkIn;
        CheckOut = checkOut;
        return null;

    }



    @Override
    public String toString() {
        return "Room "
                + roomNumber
                +", check-in: "
                + sdf.format(CheckIn)
                +", check-out: "
                + sdf.format(CheckOut)
                +", "
                +duration()
                +" nights";


    }
}

