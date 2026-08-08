package com.houseRent;

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
        houseList[0] = new House(1, "张三", "123", "海淀", "500", "未出租");
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

    public House searchHouseById(String id) {
        for (int i = 0; i < houseList.length; i++) {
            if (id.equals(String.valueOf(houseList[i].getId()))) {
                return houseList[i];
            }
        }
        return null;
    }
    
    public House[] getHouseList() {
        return houseList;
    }
}
