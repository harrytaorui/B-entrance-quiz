package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.Service.MemberService;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Member;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    // TODO GTB-工程实践: - Java关键字应和字段置于同一行
    // TODO GTB-工程实践: - 建议使用private，遵循最小访问原则
    final
    MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // TODO GTB-知识点: - 默认的状态码为200，这里可以省略
    @GetMapping("/members")
    @ResponseStatus(HttpStatus.OK)
    public List<Member> getMembers() {
        return memberService.getMembers();
    }

    // TODO GTB-知识点: - Restful API中，新建资源时应返回新建后的资源
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

    @PostMapping("/groups")
    @ResponseStatus(HttpStatus.CREATED)
    public List<List<Member>> createGroups() {
        return memberService.createGroups();
    }

}
