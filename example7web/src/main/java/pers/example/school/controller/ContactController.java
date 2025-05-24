package pers.example.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pers.example.school.model.Contact;
import pers.example.school.service.ContactService;

@Controller
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

//    @PostMapping(value = "/saveMsg")
//    public ModelAndView saveMsg(@RequestParam String name,
//                                @RequestParam String email,
//                                @RequestParam String subject,
//                                @RequestParam String message) {
//        log.info("Name : " + name);
//        log.info("Email : " + email);
//        log.info("Subject : " + subject);
//        log.info("Message : " + message);
//
//        return new ModelAndView("redirect:/contact");
//
//    }

        @PostMapping(value = "/saveMsg")
        public ModelAndView saveMsg(Contact contact) {
            contactService.saveMessageDetails(contact);
            return new ModelAndView("redirect:/contact");
        }
}
