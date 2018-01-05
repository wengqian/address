package com.tgram.entity;


import com.tgram.untils.BaseStatic;

import java.util.HashMap;

/**
 * Created by tgram-888 on 2017/12/27.
 *
 * @author tgram-888
 *         层级关键词词库
 */
public class HierarchyStandardThesaurus {
    public static String COUNTRY = "country"; //国家的层级关键词
    public static String PROVICE = "province"; //省的层级关键词
    public static String CITY = "city"; //市的层级关键词
    public static String DISTRICT = "qx"; //区县的层级关键词
    public static String TOWNSHIP = "XZJD"; //乡镇街道的层级关键词
    public static String COMMITTEE = "CJWH"; //村居委会的层级关键词
    public static String GROUP = "group";//组的层级关键词
    public static String STREET = "JLX";//街路巷的层级关键词
    public static String NUMBER = "number";//路号的层级关键词
    public static String NEIGHBORHOOD = "XQBZW";//建筑物的层级关键词
    public static String NEIGHBORHOODSUB = "XQBZW_SUB";//建筑物附属的层级关键词
    public static String BLOCK = "block";//楼幢的层级关键词
    public static String UNIT = "unit";//单位的层级关键词
    public static String FLOOR = "floor";//楼层的层级关键词
    public static String ROOM = "room";//房间的层级关键词

    private HashMap<String, String> standardThesaurusCountry; //国家的关键词

    private HashMap<String, String> standardThesaurusProvince; //省的关键词

    private HashMap<String, String> standardThesaurusCity; //市

    private HashMap<String, String> standardThesaurusDistrict; //区县

    private HashMap<String, String> standardThesaurusTownship; //乡镇街道

    private HashMap<String, String> standardThesaurusCommittee; //村居委会

    private HashMap<String, String> standardThesaurusGroup; //组

    private HashMap<String, String> standardThesaurusStreet; //街路巷

    private HashMap<String, String> standardThesaurusNumber; //门牌号

    private HashMap<String, String> standardThesaurusNeighborhood; //小区,自然村,园区,建筑物的关键词

    private HashMap<String, String> standardThesaurusNeighborhoodSub; //建筑物附属的关键词

    private HashMap<String, String> standardThesaurusBlock; //楼幢号的关键词

    private HashMap<String, String> standardThesaurusUnit; //单元号的关键词

    private HashMap<String, String> standardThesaurusFloor; //楼层号的关键词

    private HashMap<String, String> standardThesaurusRoom; //房间号的关键词

    /**
     * 在标准词库中是否有该词条
     *
     * @param keyword 关键词
     * @param type    层级类型
     */
    public Boolean isThesaurus(String type, String keyword) {
        if (!BaseStatic.EMPTYSTRING.equals(getThesaurus(type, keyword))) {
            return true;
        }
        return false;
    }

    /**
     * 获取对应的词库
     *
     * @param keyword 关键词
     * @param type    层级类型
     */
    public String getThesaurus(String type, String keyword) {
        if (COUNTRY.equals(type)) {
            return standardThesaurusCountry.get(keyword);
        }
        if (PROVICE.equals(type)) {
            return standardThesaurusProvince.get(keyword);
        }
        if (CITY.equals(type)) {
            return standardThesaurusCity.get(keyword);
        }
        if (DISTRICT.equals(type)) {
            return standardThesaurusDistrict.get(keyword);
        }
        if (TOWNSHIP.equals(type)) {
            return standardThesaurusTownship.get(keyword);
        }
        if (COMMITTEE.equals(type)) {
            return standardThesaurusCommittee.get(keyword);
        }
        if (GROUP.equals(type)) {
            return standardThesaurusGroup.get(keyword);
        }
        if (STREET.equals(type)) {
            return standardThesaurusStreet.get(keyword);
        }
        if (NUMBER.equals(type)) {
            return standardThesaurusNumber.get(keyword);
        }
        if (NEIGHBORHOOD.equals(type)) {
            return standardThesaurusNeighborhood.get(keyword);
        }
        if (NEIGHBORHOODSUB.equals(type)) {
            return standardThesaurusNeighborhoodSub.get(keyword);
        }
        if (BLOCK.equals(type)) {
            return standardThesaurusBlock.get(keyword);
        }
        if (UNIT.equals(type)) {
            return standardThesaurusUnit.get(keyword);
        }
        if (FLOOR.equals(type)) {
            return standardThesaurusFloor.get(keyword);
        }
        if (ROOM.equals(type)) {
            return standardThesaurusRoom.get(keyword);
        }
        return BaseStatic.EMPTYSTRING;
    }

}
