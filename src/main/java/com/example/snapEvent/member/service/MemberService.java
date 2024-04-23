package com.example.snapEvent.member.service;

import com.example.snapEvent.member.dto.*;

public interface MemberService {
    public JwtToken login(LoginDto logInDto);

    public MemberDto join(JoinDto joinDto);

    public JwtToken reissue(ReissueDto reissueDto);

    public void logout(String username);

    public void withdraw(String username);

    public ModifyResponseDto modify(String username, ModifyDto modifyDto);
}