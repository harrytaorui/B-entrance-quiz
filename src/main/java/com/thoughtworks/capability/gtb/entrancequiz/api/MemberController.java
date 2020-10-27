package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.Service.MemberService;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Member;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    final
    MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    @ResponseStatus(HttpStatus.OK)
    public List<Member> getMembers() {
        return memberService.getMembers();
    }

    @PostMapping("/members")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMember(@RequestBody Member member) {
        memberService.addMember(member.getName());
    }

    @GetMapping("/groups")
    @ResponseStatus(HttpStatus.OK)
    public List<List<Member>> getGroups() {
        return memberService.getGroups();
    }
}
