package com.atguigu.bean;

/**
 * @author k
 * @create 2021-09-27 0:09
 */
public class Color {
    private Car car;

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
