package cinemas.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/ticket-bookings")
public class TicketBookingsController {
    @GetMapping("/showtimes/{id}") // view seats of a showtime
    public String show(@PathVariable("id") int id, Model model) {
        return "user/showtimes/show";
    }
    @PostMapping("/showtimes/{id}") // view seats of a showtime
    public String showFoods(@PathVariable("id") int id, Model model) {
        return "user/showtimes/show";
    }
}