package org.thibaut.thelibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.thibaut.thelibrary.dto.UserDTO;
import org.thibaut.thelibrary.entity.ApiResponse;
import org.thibaut.thelibrary.service.contract.UserService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ApiResponse< UserDTO > saveUser( @RequestBody UserDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",userService.save(user));
    }

    @GetMapping
    public ApiResponse<List<UserDTO>> listUser(){
        return new ApiResponse<List<UserDTO>>(HttpStatus.OK.value(), "User list fetched successfully.",userService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<UserDTO> getOne(@PathVariable Long id){
        return new ApiResponse<UserDTO>(HttpStatus.OK.value(), "User fetched successfully.",userService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<UserDTO> update(@RequestBody UserDTO userDto) {
        return new ApiResponse<UserDTO>(HttpStatus.OK.value(), "User updated successfully.",userService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }


}
