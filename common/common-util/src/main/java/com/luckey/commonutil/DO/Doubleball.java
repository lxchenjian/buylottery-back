package com.luckey.commonutil.DO;/**
 * @auther chen
 * @date 2022-10-03 14:51
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @program: buylottery-back
 * @description:
 * @author: chen
 * @create: 2022-10-03 14:51
 **/
@TableName(value = "gds_day_sale")
public class Doubleball {

    /**
     * 时间序号
     */
    @TableField("time")
    private String accDate;

    /**
     * 红1
     */
    @TableField("red_ball_one")
    private String redBallOne;

    /**
     * 红二
     */
    @TableField("red_ball_two")
    private String redBallTwo;

    /**
     * 红三
     */
    @TableField("red_ball_three")
    private String redBallThree;

    /**
     * 红四
     */
    @TableField("red_ball_four")
    private String redBallFour;

    /**
     * 红五
     */
    @TableField("red_ball_five")
    private String redBallFive;

    /**
     * 蓝1
     */
    @TableField("blue_ball_one")
    private String blueBallOne;

    public String getAccDate() {
        return accDate;
    }

    public void setAccDate(String accDate) {
        this.accDate = accDate;
    }

    public String getRedBallOne() {
        return redBallOne;
    }

    public void setRedBallOne(String redBallOne) {
        this.redBallOne = redBallOne;
    }

    public String getRedBallTwo() {
        return redBallTwo;
    }

    public void setRedBallTwo(String redBallTwo) {
        this.redBallTwo = redBallTwo;
    }

    public String getRedBallThree() {
        return redBallThree;
    }

    public void setRedBallThree(String redBallThree) {
        this.redBallThree = redBallThree;
    }

    public String getRedBallFour() {
        return redBallFour;
    }

    public void setRedBallFour(String redBallFour) {
        this.redBallFour = redBallFour;
    }

    public String getRedBallFive() {
        return redBallFive;
    }

    public void setRedBallFive(String redBallFive) {
        this.redBallFive = redBallFive;
    }

    public String getBlueBallOne() {
        return blueBallOne;
    }

    public void setBlueBallOne(String blueBallOne) {
        this.blueBallOne = blueBallOne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doubleball that = (Doubleball) o;

        if (accDate != null ? !accDate.equals(that.accDate) : that.accDate != null) return false;
        if (redBallOne != null ? !redBallOne.equals(that.redBallOne) : that.redBallOne != null) return false;
        if (redBallTwo != null ? !redBallTwo.equals(that.redBallTwo) : that.redBallTwo != null) return false;
        if (redBallThree != null ? !redBallThree.equals(that.redBallThree) : that.redBallThree != null) return false;
        if (redBallFour != null ? !redBallFour.equals(that.redBallFour) : that.redBallFour != null) return false;
        if (redBallFive != null ? !redBallFive.equals(that.redBallFive) : that.redBallFive != null) return false;
        return blueBallOne != null ? blueBallOne.equals(that.blueBallOne) : that.blueBallOne == null;
    }

    @Override
    public int hashCode() {
        int result = accDate != null ? accDate.hashCode() : 0;
        result = 31 * result + (redBallOne != null ? redBallOne.hashCode() : 0);
        result = 31 * result + (redBallTwo != null ? redBallTwo.hashCode() : 0);
        result = 31 * result + (redBallThree != null ? redBallThree.hashCode() : 0);
        result = 31 * result + (redBallFour != null ? redBallFour.hashCode() : 0);
        result = 31 * result + (redBallFive != null ? redBallFive.hashCode() : 0);
        result = 31 * result + (blueBallOne != null ? blueBallOne.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Doubleball{" +
                "accDate='" + accDate + '\'' +
                ", redBallOne='" + redBallOne + '\'' +
                ", redBallTwo='" + redBallTwo + '\'' +
                ", redBallThree='" + redBallThree + '\'' +
                ", redBallFour='" + redBallFour + '\'' +
                ", redBallFive='" + redBallFive + '\'' +
                ", blueBallOne='" + blueBallOne + '\'' +
                '}';
    }
}
