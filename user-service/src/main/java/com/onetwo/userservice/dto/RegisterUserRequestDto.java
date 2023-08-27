package com.onetwo.userservice.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.onetwo.userservice.entity.user.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequestDto {

	private String userId;

	private String password;

	private String nickname;

	private String name;

	private String email;

	private String phoneNumber;

	private Role role;

	private Boolean state;
}
