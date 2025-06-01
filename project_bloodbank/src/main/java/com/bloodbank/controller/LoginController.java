package com.bloodbank.controller;

import com.bloodbank.model.Donor;
import com.bloodbank.repository.DonorRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class LoginController {

    @Autowired
    private DonorRepository donorRepo;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {
        Optional<Donor> donorOpt = donorRepo.findByEmail(email);

        if (donorOpt.isPresent()) {
            Donor donor = donorOpt.get();
            if (password.equals(donor.getPassword())) { // Replace with hash check if hashed
                session.setAttribute("user", donor);
                return "redirect:/dashboard";
            } else {
                model.addAttribute("error", "Invalid password.");
            }
        } else {
            model.addAttribute("error", "User not found.");
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
        Donor user = (Donor) session.getAttribute("user");
        if (user == null) return "redirect:/login";

        model.addAttribute("user", user);
        return "dashboard";
    }
}
