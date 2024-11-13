package dev.sandip.parkinglot.Controller;

import dev.sandip.parkinglot.DTO.IssueTicketRequestDto;
import dev.sandip.parkinglot.DTO.ResponseStatus;
import dev.sandip.parkinglot.DTO.TicketResponseDto;
import dev.sandip.parkinglot.Exception.GateNotFoundException;
import dev.sandip.parkinglot.Model.Ticket;
import dev.sandip.parkinglot.Service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public TicketResponseDto issueTicket(IssueTicketRequestDto requestDto){
        TicketResponseDto responseDto = new TicketResponseDto();
        try {
            Ticket ticket = ticketService.issueTicket(
                    requestDto.getGateId(),
                    requestDto.getVehicleNumber(),
                    requestDto.getVehicleOwnerName(),
                    requestDto.getVehicleType()
            );
            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (GateNotFoundException e) {
            e.getMessage();
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
