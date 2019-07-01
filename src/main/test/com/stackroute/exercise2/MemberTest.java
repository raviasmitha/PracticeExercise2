package com.stackroute.exercise2;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    @Test
    public void TestgivenThreeInputsShouldDisplay(){
        Member_Variable member=new Member_Variable();
        String res=member.member_variable("Harry Potter",30, (float) 2500.3);
        assertEquals("Success",res);
    }
}
