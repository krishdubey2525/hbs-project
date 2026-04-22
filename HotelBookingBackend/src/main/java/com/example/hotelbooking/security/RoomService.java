package com.example.hotelbooking.security;

import com.example.hotelbooking.dtos.Response;
import com.example.hotelbooking.dtos.RoomDTO;
import com.example.hotelbooking.enums.RoomType;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

public interface RoomService {

    com.example.hotelbooking.dtos.Response addRoom(RoomDTO roomDTO, MultipartFile imageFile);
    com.example.hotelbooking.dtos.Response updateRoom(RoomDTO roomDTO, MultipartFile imageFile);
    com.example.hotelbooking.dtos.Response getAllRooms();
    com.example.hotelbooking.dtos.Response getRoomById(Long id);
    com.example.hotelbooking.dtos.Response deleteRoom(Long id);
    com.example.hotelbooking.dtos.Response getAvailableRooms(LocalDate checkInDate, LocalDate checkOutDate, RoomType roomType);
    List<RoomType> getAllRoomTypes();
    Response searchRoom(String input);
}
