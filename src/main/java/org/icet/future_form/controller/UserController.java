package org.icet.future_form.controller;

import lombok.RequiredArgsConstructor;
import org.icet.future_form.dto.UserDTO;
import org.icet.future_form.service.UserService;
import org.icet.future_form.utill.enums.UserRole;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {

    final UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user){
        return ResponseEntity.ok(userService.createUser(user));
    }

    @PutMapping("/updateUser")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO user){
        return ResponseEntity.ok(userService.createUser(user));
    }

    @DeleteMapping("/deleteUserById/{id}")
    public ResponseEntity<Boolean> deleteUserById(@PathVariable Integer id) {
        UserDTO user = userService.getUserById(id);
        return user != null ? ResponseEntity.ok(userService.deleteUserById(id))
                : ResponseEntity.notFound().build();
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<UserDTO>> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/ById/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id) {
        UserDTO user = userService.getUserById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @GetMapping("/ByUsername/{username}")
    public ResponseEntity<UserDTO> getByUsername(@PathVariable String username) {
        UserDTO user = userService.getUserByUserName(username);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @GetMapping("/ByEmail/{email}")
    public ResponseEntity<UserDTO> getByEmail(@PathVariable String email) {
        UserDTO user = userService.getUserByEmail(email);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @GetMapping("/ByContact/{number}")
    public ResponseEntity<UserDTO> getByContact(@PathVariable String number) {
        UserDTO user = userService.getUserByContactNumber(number);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @GetMapping("/ByName/{fullName}")
    public ResponseEntity<List<UserDTO>> getByFullName(@PathVariable String fullName) {
        return ResponseEntity.ok(userService.getUsersByName(fullName));
    }

    @GetMapping("/ByBirthday")
    public ResponseEntity<List<UserDTO>> getByBirthday(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return ResponseEntity.ok(userService.getUsersByBirthDay(date));
    }

    @GetMapping("/ByCreateAt")
    public ResponseEntity<List<UserDTO>> getByCreatedDate(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return ResponseEntity.ok(userService.getUsersByCreateAt(date));
    }

    @GetMapping("/ByUpdateAt")
    public ResponseEntity<List<UserDTO>> getByUpdatedDate(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return ResponseEntity.ok(userService.getUsersByUpdateAt(date));
    }

    @GetMapping("/ByRole/{role}")
    public ResponseEntity<List<UserDTO>> getByRole(@PathVariable UserRole role) {
        return ResponseEntity.ok(userService.getUsersByRole(role));
    }

    @GetMapping("/ByActive/{status}")
    public ResponseEntity<List<UserDTO>> getByActive(@PathVariable boolean status) {
        return ResponseEntity.ok(userService.getUsersByActiveStatus(status));
    }
}