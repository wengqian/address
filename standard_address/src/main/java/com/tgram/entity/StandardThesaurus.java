package com.tgram.entity;

import java.util.HashMap;

/**
 * Created by tgram-888 on 2017/12/27.
 * 标准词库
 */
public class StandardThesaurus {

    private HashMap<String, String> thesaurus_map = new HashMap<String, String>();

    public HashMap<String, String> getThesaurus_map() {
        return thesaurus_map;
    }

    public void setThesaurus_map(HashMap<String, String> thesaurus_map) {
        this.thesaurus_map = thesaurus_map;
    }
}
