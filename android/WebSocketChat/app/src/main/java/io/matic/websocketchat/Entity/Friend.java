package io.matic.websocketchat.Entity;

/**
 * Created by Matic on 21/09/2017.
 */

public class Friend {
    private String friendshipID;
    private User friend;

    public Friend() {
    }

    public Friend(String friendshipID, User friend) {
        this.friendshipID = friendshipID;
        this.friend = friend;
    }

    public String getFriendshipID() {
        return friendshipID;
    }

    public void setFriendshipID(String friendshipID) {
        this.friendshipID = friendshipID;
    }

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }
}
