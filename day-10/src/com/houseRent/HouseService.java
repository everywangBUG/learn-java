package com.houseRent;

import java.util.Arrays;

/**
 * 返回所有的房屋信息
 */
public class HouseService {
    private House[] houseList;
    private int idCounter;
    private int houseNum; //记录当前多少个房屋信息

    public HouseService(int num) {
        setHouseList(num);
    }

    public void setHouseList(int num) {
        houseList = new House[num];
//        houseList[0] = new House(1, "张三", "123", "海淀", "500", "未出租");
//        houseList[1] = new House(2, "李四", "123456", "静安", "800", "未出租");
    }

    public boolean addHouseList(House house) {
        if (houseNum == houseList.length) {
            System.out.println("数组已满");
            return false;
        }
        System.out.println(house + "8888");
        // 在houseList中添加house元素
        houseList[houseNum++] = house;
        // id自增
        house.setId(++idCounter);
        return true;
    }

    public House searchHouseById(int id) {
        for (int i = 0; i < houseList.length; i++) {
            if (id == houseList[i].getId()) {
                return houseList[i];
            }
        }
        return null;
    }

    public boolean deleteHouseById(int deleteId) {
        int findIndex = -1;
        for (int i = 0; i < houseList.length; i++) {
            if (deleteId == houseList[i].getId()) {
                findIndex = i;
            }
        }
        if (findIndex == -1) {
            return false;
        }
        int l = houseList.length - 1;
        House[] newHouseList = new House[l];
        for (int i = 0, j = 0; i < newHouseList.length; i++, j++) {
            if (findIndex == i) {
                newHouseList[findIndex] = houseList[++i];
            } else {
                newHouseList[j] = houseList[j];
            }
        }
        houseList = newHouseList;
        return true;
    }

    public House[] getHouseList() {
        return houseList;
    }
}
