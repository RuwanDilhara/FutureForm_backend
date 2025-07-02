package org.icet.future_form.service.impl;

import lombok.RequiredArgsConstructor;
import org.icet.future_form.dto.UserDTO;
import org.icet.future_form.entity.User;
import org.icet.future_form.repository.UserRepository;
import org.icet.future_form.service.UserService;
import org.icet.future_form.utill.enums.UserRole;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public List<UserDTO> getAll() {
        return repository.findAll().stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public UserDTO getUserById(Integer userId) {
        return mapper.map(repository.findById(userId),UserDTO.class);
    }

    @Override
    public UserDTO getUserByUserName(String userName) {
        return mapper.map(repository.findByUsername(userName),UserDTO.class);
    }

    @Override
    public List<UserDTO> getUsersByName(String fullName) {
        return repository.findByFullName(fullName).stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public List<UserDTO> getUsersByBirthDay(LocalDate birthday) {
        return repository.findByBirthday(birthday).stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public List<UserDTO> getUsersByCreateAt(LocalDate createDate) {
        return repository.findByCreateAt(createDate).stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public List<UserDTO> getUsersByUpdateAt(LocalDate updateAt) {
        return repository.findByUpdateAt(updateAt).stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public List<UserDTO> getUsersByRole(UserRole role) {
        return repository.findByRole(role).stream()
                  .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public List<UserDTO> getUsersByActiveStatus(boolean isActive) {
        return repository.findByIsActive(isActive).stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return mapper.map(repository.findByEmail(email),UserDTO.class);
    }

    @Override
    public UserDTO getUserByContactNumber(String contactNumber) {
        return mapper.map(repository.findByContactNumber(contactNumber),UserDTO.class);
    }

    @Override
    public UserDTO createUser(UserDTO user) {
        return mapper.map(repository.save(mapper
                .map(user, User.class)),UserDTO.class);
    }

    @Override
    public UserDTO updateUser(UserDTO user) {
        return mapper.map(repository.save(mapper
                .map(user, User.class)),UserDTO.class);
    }

    @Override
    public boolean deleteUserById(Integer userId) {
        repository.deleteById(userId);
        return true;
    }

    @Override
    public List<UserDTO> getUsersByCountry(String country) {
        return repository.findByCountry(country).stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public List<UserDTO> getUsersByCity(String city) {
        return repository.findByCity(city).stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }

    @Override
    public List<UserDTO> getUsersByAddress(String address) {
        return repository.findByAddress(address).stream()
                .map(entity -> mapper.map(entity,UserDTO.class)).toList();
    }
}
