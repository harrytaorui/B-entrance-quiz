package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class MemberService {

    private final int GROUP_NUM = 6;
    private List<Member> memberList=createMemberList();
    private List<List<Member>> groups = new ArrayList<>(GROUP_NUM);

    public List<Member> getMembers() {
        return memberList;
    }

    public void addMember(String name) {
        memberList.add(Member.builder().id(memberList.size() + 1).name(name).build());
    }

    private List<Member> createMemberList() {
        String[] names = {"成吉思汗", "鲁班七号", "太乙真人", "钟无艳", "花木兰", "雅典娜", "芈月",
                "白起", "刘禅", "庄周", "马超", "刘备", "哪吒", "大乔", "蔡文姬"};
        ArrayList<Member> newList = new ArrayList<>();
        // TODO GTB-知识点: + 使用了stream操作
        Arrays.stream(names).forEach(name->newList.add(Member.builder().name(name).id(newList.size()+1).build()));
        return newList;
    }

    public List<List<Member>> getGroups() {
        return groups;
    }


    public List<List<Member>> createGroups() {
        groups.clear();
        for (int i = 0;i<GROUP_NUM;i++) {
            groups.add(new ArrayList<>());
        }
        List<Member> members = new ArrayList<>(memberList);
        int groupIndex = 0;
        while (members.size() > 0) {
            groupIndex = groupIndex == GROUP_NUM ? 0 : groupIndex;
            int index = (int)(Math.random()*(members.size()-1));
            groups.get(groupIndex).add(members.get(index));
            members.remove(index);
            groupIndex++;
        }
        return groups;
    }
}
