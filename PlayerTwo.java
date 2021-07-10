package com.GameWFS;

public class PlayerTwo extends PlayerOne{
    private int health;
    private boolean armour;

    public PlayerTwo(String name,String weapon,int health,boolean armour) {
        super(name, weapon, health);
        if(health<0 || health>100) {
            this.health=100;
        }else {
            this.health=health;
        }
        this.armour=armour;
    }

    @Override
    public void damageByGun1() {
        if(armour) {
            this.health-=20;
            if(this.health<=0) {
                this.health=0;
            }
            System.out.println(getName()+" is wearing armour. Got shots by gun 1. Health is reduced by 20."+" New health is "+this.health);
        }
        if(!armour) {
            this.health-=30;
            if(this.health<=0) {
                this.health=0;
            }
            System.out.println(getName()+" is not wearing armour. Got shots by gun 1. Health is reduced by 30."+" New health is "+this.health);

        }
        if(this.health==0) {
            System.out.println(getName()+" is dead.");
        }
    }

    @Override
    public void damageByGun2() {
        if(armour) {
            this.health-=40;
            if(this.health<=0) {
                this.health=0;
            }
            System.out.println(getName()+" is wearing armour. Got shots by gun 2. Health is reduced by 40."+" New health is "+this.health);
        }
        if(!armour) {
            this.health-=50;
            if(this.health<=0) {
                this.health=0;
            }
            System.out.println(getName()+" is not wearing armour. Got shots by gun 2. Health is reduced by 50."+" New health is "+this.health);

        }
        if(this.health==0) {
            System.out.println(getName()+" is dead.");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
