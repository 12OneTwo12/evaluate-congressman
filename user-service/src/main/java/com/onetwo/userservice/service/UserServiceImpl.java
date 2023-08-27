package com.onetwo.userservice.service;

import org.springframework.stereotype.Service;

import com.onetwo.userservice.repository.user.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
}
