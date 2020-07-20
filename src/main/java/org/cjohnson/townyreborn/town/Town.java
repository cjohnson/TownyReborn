package org.cjohnson.townyreborn.town;

import java.util.ArrayList;
import java.util.UUID;

public class Town {
    private ArrayList<UUID> townMemberList;

    public Town(ArrayList<UUID> townMemberList) {
        this.townMemberList = townMemberList;
    }

    public ArrayList<UUID> getTownMemberList() {
        return townMemberList;
    }

    public void setTownMemberList(ArrayList<UUID> townMemberList) {
        this.townMemberList = townMemberList;
    }
}
