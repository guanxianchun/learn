package com.martin.pattern.struct.adapter;

import com.martin.pattern.struct.adapter.impl.UserServiceAdapter;
import org.junit.Test;

public class UserServiceAdapterTest {
    @Test
    public void test() {
        UserServiceAdapter adapter = new UserServiceAdapter();
        adapter.loginForQQ("150090021");

        adapter.loginForToken("gxc|123|dafdsafdsfds");
    }
}
