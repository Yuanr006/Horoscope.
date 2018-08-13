package com.entity;

import javax.swing.*;
import java.security.PrivateKey;

/**
 * @Auther: $Yuar
 * @Date: 2018/8/10 22:26
 * @Description:
 */
public class StarSign {

        private String star;//星座

        private String Comprehensive;//综合运势

        private String amor;//爱情运势

        private String work;//工作运势

        private  String wealth;//财运

        private  String health;//健康值

        private  String luckyCrystal;//开运水晶

        private  String luckyColor;//幸运颜色

        private String luckyNumber;//幸运数字

        private  String adapterStar;//贵人星座

        private  String validDate;//有效日期

        private String Remind;//提醒

        private String Todo;//去做

        private String dontTo;//别做

        private String content;//内容

        private  String moonEnergy;//月亮能量


        @Override
        public String toString() {
                return "StarSign{" +
                        "star='" + star + '\'' +
                        ", Comprehensive='" + Comprehensive + '\'' +
                        ", amor='" + amor + '\'' +
                        ", work='" + work + '\'' +
                        ", wealth='" + wealth + '\'' +
                        ", health='" + health + '\'' +
                        ", luckyCrystal='" + luckyCrystal + '\'' +
                        ", luckyColor='" + luckyColor + '\'' +
                        ", luckyNumber='" + luckyNumber + '\'' +
                        ", adapterStar='" + adapterStar + '\'' +
                        ", validDate='" + validDate + '\'' +
                        ", Remind='" + Remind + '\'' +
                        ", Todo='" + Todo + '\'' +
                        ", dontTo='" + dontTo + '\'' +
                        ", content='" + content + '\'' +
                        ", moonEnergy='" + moonEnergy + '\'' +
                        '}';
        }

        public String getStar() {
                return star;
        }

        public void setStar(String star) {
                this.star = star;
        }

        public String getComprehensive() {
                return Comprehensive;
        }

        public void setComprehensive(String comprehensive) {
                Comprehensive = comprehensive;
        }

        public String getAmor() {
                return amor;
        }

        public void setAmor(String amor) {
                this.amor = amor;
        }

        public String getWork() {
                return work;
        }

        public void setWork(String work) {
                this.work = work;
        }

        public String getWealth() {
                return wealth;
        }

        public void setWealth(String wealth) {
                this.wealth = wealth;
        }

        public String getHealth() {
                return health;
        }

        public void setHealth(String health) {
                this.health = health;
        }

        public String getLuckyCrystal() {
                return luckyCrystal;
        }

        public void setLuckyCrystal(String luckyCrystal) {
                this.luckyCrystal = luckyCrystal;
        }

        public String getLuckyColor() {
                return luckyColor;
        }

        public void setLuckyColor(String luckyColor) {
                this.luckyColor = luckyColor;
        }

        public String getLuckyNumber() {
                return luckyNumber;
        }

        public void setLuckyNumber(String luckyNumber) {
                this.luckyNumber = luckyNumber;
        }

        public String getAdapterStar() {
                return adapterStar;
        }

        public void setAdapterStar(String adapterStar) {
                this.adapterStar = adapterStar;
        }

        public String getValidDate() {
                return validDate;
        }

        public void setValidDate(String validDate) {
                this.validDate = validDate;
        }

        public String getRemind() {
                return Remind;
        }

        public void setRemind(String remind) {
                Remind = remind;
        }

        public String getTodo() {
                return Todo;
        }

        public void setTodo(String todo) {
                Todo = todo;
        }

        public String getDontTo() {
                return dontTo;
        }

        public void setDontTo(String dontTo) {
                this.dontTo = dontTo;
        }

        public String getContent() {
                return content;
        }

        public void setContent(String content) {
                this.content = content;
        }

        public String getMoonEnergy() {
                return moonEnergy;
        }

        public void setMoonEnergy(String moonEnergy) {
                this.moonEnergy = moonEnergy;
        }
}


