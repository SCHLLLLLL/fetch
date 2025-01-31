package io.github.schneiderlin.fetch.feedDemo.request;

import io.github.schneiderlin.fetch.Request;
import io.github.schneiderlin.fetch.feedDemo.database.UserTable;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserById implements Request<String, UserTable> {
    private String uid;

    @Override
    public String getId() {
        return uid;
    }
}
