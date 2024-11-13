package dev.sandip.parkinglot;

import dev.sandip.parkinglot.Controller.TicketController;
import dev.sandip.parkinglot.DTO.IssueTicketRequestDto;
import dev.sandip.parkinglot.DTO.TicketResponseDto;
import dev.sandip.parkinglot.Model.Ticket;
import dev.sandip.parkinglot.Repository.GateRepository;
import dev.sandip.parkinglot.Repository.ParkingLotRepository;
import dev.sandip.parkinglot.Repository.TicketRepository;
import dev.sandip.parkinglot.Repository.VehicleRepository;
import dev.sandip.parkinglot.Service.TicketService;

public class Client {
    public static void main(String[] args) {
        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(09865648392L);
        requestDto.setVehicleType("SEDAN");
        requestDto.setVehicleNumber("WB7639V6");
        requestDto.setVehicleOwnerName("ABC XYZ");

        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService =  new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);
        TicketResponseDto ticketResponseDto = ticketController.issueTicket(requestDto);
        Ticket ticket = ticketResponseDto.getTicket();
    }
}
