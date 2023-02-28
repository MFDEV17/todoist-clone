package com.mfdev.api.core.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdatePasswordDto {
    private String oldPassword;

    private String newPassword;
    private String repeatPassword;
}
