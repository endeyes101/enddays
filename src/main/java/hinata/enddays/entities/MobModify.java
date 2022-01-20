package hinata.enddays.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;

import java.util.Random;

public class MobModify {
    public static void doModify(double maxHealth, double follow_range, double knockback_resistance, double movement_speed, double flying_speed, double attack_damage,
            double attack_speed, double armor, double armor_toughness, double chance, EntityMob entityMob){
        Random rand = entityMob.getEntityWorld().rand;
        IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
        IAttributeInstance FOLLOW_RANGE = entityMob.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE);
        IAttributeInstance KNOCKBACK_RESISTANCE = entityMob.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
        IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
        IAttributeInstance FLYING_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.FLYING_SPEED);
        IAttributeInstance ATTACK_DAMAGE = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        IAttributeInstance ATTACK_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED);
        IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
        IAttributeInstance ARMOR_TOUGHNESS = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS);
//
//        MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue()*2);
//        MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*2);
//        entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
//        ((EntityZombie) entityMob).setArmsRaised(true);
    }
}
