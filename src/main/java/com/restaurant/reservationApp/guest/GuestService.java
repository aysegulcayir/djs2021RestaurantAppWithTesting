package com.restaurant.reservationApp.guest;

import java.util.List;

public interface GuestService {
    public List<Guest> getAllGuests();
    public Guest getGuestById(long id);
    public Guest createGuest(Guest guest);
    public void deleteGuest(long id);
    public Guest updateGuest(Guest guest);
}
