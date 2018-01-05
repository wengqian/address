package com.tgram.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tgram.untils.BaseStatic;

import java.io.Serializable;

/**
 * Created by tgram-888 on 2017/12/27.
 *
 * @author tgram-888
 *         地址实体类
 */
@JsonPropertyOrder(alphabetic = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Address implements Serializable {

    private static final long serialVersionUID = 3126058485405514826L;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    private String id; //主键

    private String addressOld; //未拆分地址

    private String addressLeft; //遗留未拆开的地址

    private String country; //国

    private String province; //省

    private String city; //市

    private String cityCode; //代码

    private String district; //区县

    private String districtCode; //区县代码

    private String township; //乡镇街道

    private String townshipCode; //乡镇街道代码

    private String committee; //村居委会

    private String committeeCode; //村居委会代码

    private String group; //组

    private String groupCode; //组代码

    private String street; //街路巷

    private String streetCode; //街路巷代码

    private String number; //门牌号

    private String numberSuffix; //门牌号关键词

    private String neighborhood; //小区,自然村,园区,建筑物

    private String neighborhoodCode; //小区,自然村,园区,建筑物的代码

    private String neighborhoodSub; //建筑物附属

    private String neighborhoodSubCode; //建筑物附属代码

    private String neighborhoodSubSuffix; //建筑物附属关键词

    private String block; //楼幢号

    private String blockSuffix; //楼幢号关键词

    private String buindSupp; //buind的补充

    private String unit; //单元号

    private String unitSuffix; //单元号关键词

    private String floor; //楼层号

    private String floorSuffix; //楼层号关键词

    private String room; //房间号

    private String roomSuffix; //房间号关键词

    private String roomSupp; //房间的补充


    private String other; //其他,做为补充说明的地址

    /**
     * 获取地址的前缀词(国+省+市+区县+乡镇街道)
     */
    private String getAddressPrefix() {
        return country == null ? BaseStatic.EMPTYSTRING : country +
                province == null ? BaseStatic.EMPTYSTRING : province +
                city == null ? BaseStatic.EMPTYSTRING : city +
                district == null ? BaseStatic.EMPTYSTRING : district +
                township == null ? BaseStatic.EMPTYSTRING : township;

    }

    /**
     * 获取地址的中缀词(存在业务逻辑)
     */
    private String getAddressInfix() {
//        private String committee; //村居委会
//        private String group; //组
//        private String street; //街路巷
//        private String number; //门牌号
//        private String number_code; //门牌号关键词
        //此处可能存在组合问题
        return committee == null ? BaseStatic.EMPTYSTRING : committee +
                group == null ? BaseStatic.EMPTYSTRING : group +
                street == null ? BaseStatic.EMPTYSTRING : street +
                number == null ? BaseStatic.EMPTYSTRING : number + numberSuffix == null ? BaseStatic.EMPTYSTRING : numberSuffix;

    }

    /**
     * 获取地址的后缀词(建筑物+建筑物附属+建筑物附属词+楼幢号+楼幢词+单元+单元词+楼层号+楼层词+房间号+房间号词)
     */
    private String getAddressSuffix() {
        return neighborhood == null ? BaseStatic.EMPTYSTRING : neighborhood +
                neighborhoodSub == null ? BaseStatic.EMPTYSTRING : neighborhoodSub + neighborhoodSubSuffix == null ? BaseStatic.EMPTYSTRING : neighborhoodSubSuffix +
                block == null ? BaseStatic.EMPTYSTRING : block + blockSuffix == null ? BaseStatic.EMPTYSTRING : blockSuffix +
                unit == null ? BaseStatic.EMPTYSTRING : unit + unitSuffix == null ? BaseStatic.EMPTYSTRING : unitSuffix +
                floor == null ? BaseStatic.EMPTYSTRING : floor + floorSuffix == null ? BaseStatic.EMPTYSTRING : floorSuffix +
                room == null ? BaseStatic.EMPTYSTRING : room + roomSuffix == null ? BaseStatic.EMPTYSTRING : roomSuffix;
    }

    /**
     * 获取标准地址(前缀+中缀+后缀)
     */
    public String getStandardAddress() {
        return getAddressPrefix() + getAddressInfix() + getAddressSuffix();
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", addressOld='" + addressOld + '\'' +
                ", addressLeft='" + addressLeft + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", district='" + district + '\'' +
                ", districtCode='" + districtCode + '\'' +
                ", township='" + township + '\'' +
                ", townshipCode='" + townshipCode + '\'' +
                ", committee='" + committee + '\'' +
                ", committeeCode='" + committeeCode + '\'' +
                ", group='" + group + '\'' +
                ", groupCode='" + groupCode + '\'' +
                ", street='" + street + '\'' +
                ", streetCode='" + streetCode + '\'' +
                ", number='" + number + '\'' +
                ", numberSuffix='" + numberSuffix + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", neighborhoodCode='" + neighborhoodCode + '\'' +
                ", neighborhoodSub='" + neighborhoodSub + '\'' +
                ", neighborhoodSubCode='" + neighborhoodSubCode + '\'' +
                ", neighborhoodSubSuffix='" + neighborhoodSubSuffix + '\'' +
                ", block='" + block + '\'' +
                ", blockSuffix='" + blockSuffix + '\'' +
                ", buindSupp='" + buindSupp + '\'' +
                ", unit='" + unit + '\'' +
                ", unitSuffix='" + unitSuffix + '\'' +
                ", floor='" + floor + '\'' +
                ", floorSuffix='" + floorSuffix + '\'' +
                ", room='" + room + '\'' +
                ", roomSuffix='" + roomSuffix + '\'' +
                ", roomSupp='" + roomSupp + '\'' +
                ", other='" + other + '\'' +
                '}';
    }


    public String getAddressOld() {
        return addressOld;
    }

    public void setAddressOld(String addressOld) {
        this.addressOld = addressOld;
    }

    public String getAddressLeft() {
        return addressLeft;
    }

    public void setAddressLeft(String addressLeft) {
        this.addressLeft = addressLeft;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getTownshipCode() {
        return townshipCode;
    }

    public void setTownshipCode(String townshipCode) {
        this.townshipCode = townshipCode;
    }

    public String getCommittee() {
        return committee;
    }

    public void setCommittee(String committee) {
        this.committee = committee;
    }

    public String getCommitteeCode() {
        return committeeCode;
    }

    public void setCommitteeCode(String committeeCode) {
        this.committeeCode = committeeCode;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(String streetCode) {
        this.streetCode = streetCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberSuffix() {
        return numberSuffix;
    }

    public void setNumberSuffix(String numberSuffix) {
        this.numberSuffix = numberSuffix;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getNeighborhoodCode() {
        return neighborhoodCode;
    }

    public void setNeighborhoodCode(String neighborhoodCode) {
        this.neighborhoodCode = neighborhoodCode;
    }

    public String getNeighborhoodSub() {
        return neighborhoodSub;
    }

    public void setNeighborhoodSub(String neighborhoodSub) {
        this.neighborhoodSub = neighborhoodSub;
    }

    public String getNeighborhoodSubCode() {
        return neighborhoodSubCode;
    }

    public void setNeighborhoodSubCode(String neighborhoodSubCode) {
        this.neighborhoodSubCode = neighborhoodSubCode;
    }

    public String getNeighborhoodSubSuffix() {
        return neighborhoodSubSuffix;
    }

    public void setNeighborhoodSubSuffix(String neighborhoodSubSuffix) {
        this.neighborhoodSubSuffix = neighborhoodSubSuffix;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getBlockSuffix() {
        return blockSuffix;
    }

    public void setBlockSuffix(String blockSuffix) {
        this.blockSuffix = blockSuffix;
    }

    public String getBuindSupp() {
        return buindSupp;
    }

    public void setBuindSupp(String buindSupp) {
        this.buindSupp = buindSupp;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitSuffix() {
        return unitSuffix;
    }

    public void setUnitSuffix(String unitSuffix) {
        this.unitSuffix = unitSuffix;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloorSuffix() {
        return floorSuffix;
    }

    public void setFloorSuffix(String floorSuffix) {
        this.floorSuffix = floorSuffix;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomSuffix() {
        return roomSuffix;
    }

    public void setRoomSuffix(String roomSuffix) {
        this.roomSuffix = roomSuffix;
    }

    public String getRoomSupp() {
        return roomSupp;
    }

    public void setRoomSupp(String roomSupp) {
        this.roomSupp = roomSupp;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    /**
     * 测试
     */
    public static void main(String[] args) {
        Address address = new Address();
        System.out.print(address.getAddressPrefix() + address.getAddressSuffix());
    }

}
