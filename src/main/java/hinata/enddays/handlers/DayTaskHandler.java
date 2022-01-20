package hinata.enddays.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.*;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

import java.util.Random;

public class DayTaskHandler {

    public static void dayTask10(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                if(rand.nextDouble() < 0.2){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 5);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                entity.addTag("hasModify");
            }
        }
    }
    public static void dayTask20(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 5);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 5) * 2);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                entity.addTag("hasModify");
            }
        }
    }
    public static void dayTask30(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 10);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.03);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 10) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.06);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                entity.addTag("hasModify");
            }
        }
    }
    public static void dayTask40(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 15);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.05);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 2);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 15) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.1);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 4);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                entity.addTag("hasModify");
            }
        }
    }
    public static void dayTask50(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
                IAttributeInstance ATTACK_DAMAGE = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 20);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.07);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 4);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 1);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 20) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.14);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 8);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 2);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                entity.addTag("hasModify");
            }
        }
    }
    public static void dayTask60(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
                IAttributeInstance ATTACK_DAMAGE = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
                IAttributeInstance KNOCKBACK_RESISTANCE = entityMob.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 25);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.09);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 6);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 2);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.1);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 25) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.18);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 12);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 4);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.2);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                entity.addTag("hasModify");
            }
        }
    }
    public static void dayTask70(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
                IAttributeInstance ATTACK_DAMAGE = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
                IAttributeInstance KNOCKBACK_RESISTANCE = entityMob.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
                IAttributeInstance ATTACK_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 30);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.11);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 8);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 3);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.2);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 1);
                    }
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 30) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.22);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 16);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 6);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.4);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 2);
                    }
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                entity.addTag("hasModify");
            }
        }
    }
    public static void dayTask80(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
                IAttributeInstance ATTACK_DAMAGE = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
                IAttributeInstance KNOCKBACK_RESISTANCE = entityMob.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
                IAttributeInstance ATTACK_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED);
                IAttributeInstance ARMOR_TOUGHNESS = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 35);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.13);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 10);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 4);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.3);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 2);
                    }
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 2);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 35) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.26);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 20);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 8);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.6);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 4);
                    }
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 4);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                if(rand.nextDouble() < 0.08){
                    entityMob.setInvisible(true);
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20 * 600, 0));
                }
                entity.addTag("hasModify");
            }
        }
    }
    public static void dayTask90(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
                IAttributeInstance ATTACK_DAMAGE = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
                IAttributeInstance KNOCKBACK_RESISTANCE = entityMob.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
                IAttributeInstance ATTACK_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED);
                IAttributeInstance ARMOR_TOUGHNESS = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 40);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.15);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 12);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 5);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.4);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 3);
                    }
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 4);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 40) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.3);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 24);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 10);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.8);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 6);
                    }
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 8);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                entityMob.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20 * 600, 0));
                entity.addTag("hasModify");
                if(rand.nextDouble() < 0.08){
                    entityMob.setInvisible(true);
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20 * 600, 0));
                }
                if(rand.nextDouble() < 0.1){
                    entity.setNoGravity(true);
                    entity.setGlowing(true);
                    entity.addTag("canFly");
                }
                if(rand.nextDouble() < 0.1){
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 20 * 60, 0));
                }
            }
        }
    }
    public static void dayTask100(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
                IAttributeInstance ATTACK_DAMAGE = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
                IAttributeInstance KNOCKBACK_RESISTANCE = entityMob.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
                IAttributeInstance ATTACK_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED);
                IAttributeInstance ARMOR_TOUGHNESS = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 45);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.17);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 14);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 6);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.5);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 4);
                    }
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 6);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 45) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.34);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 28);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 12);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 1.0);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 8);
                    }
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 12);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                if(rand.nextDouble() < 0.1){
                    entityMob.setInvisible(true);
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20 * 600, 0));
                }
                if(rand.nextDouble() < 0.15){
                    entity.setNoGravity(true);
                    entity.setGlowing(true);
                    entity.addTag("canFly");
                }
                if(rand.nextDouble() < 0.1){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 1024);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.5);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 20);
                    entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                }
                entityMob.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20 * 600, 1));
                entity.addTag("hasModify");
                if(rand.nextDouble() < 0.1){
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 20 * 60, 0));
                }
            }
        }
    }
    public static void dayTaskEnd(Entity entity){
        Random rand = entity.getEntityWorld().rand;
        double chance = rand.nextDouble();
        if(entity instanceof EntityMob){
            EntityMob entityMob = (EntityMob)entity;
            if(!entity.getTags().contains("hasModify")){
                IAttributeInstance MAX_HEALTH = entityMob.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
                IAttributeInstance MOVEMENT_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
                IAttributeInstance ARMOR = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR);
                IAttributeInstance ATTACK_DAMAGE = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
                IAttributeInstance KNOCKBACK_RESISTANCE = entityMob.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
                IAttributeInstance ATTACK_SPEED = entityMob.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED);
                IAttributeInstance ARMOR_TOUGHNESS = entityMob.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS);
                if(rand.nextDouble() < 0.8){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 50);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue()*1.19);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 16);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 7);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 0.6);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 5);
                    }
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 8);
                }else{
                    MAX_HEALTH.setBaseValue((MAX_HEALTH.getBaseValue() + 50) * 2);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.38);
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 32);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 14);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 1.2);
                    if(ATTACK_SPEED != null){
                        ATTACK_SPEED.setBaseValue(ATTACK_SPEED.getBaseValue() + 10);
                    }
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 16);
                }
                entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                if(rand.nextDouble() < 0.05){
                    entity.addTag("bedrockEnvoy");
                    entity.setCustomNameTag("§c基岩使者");
                    entity.setGlowing(true);
                    entity.setAlwaysRenderNameTag(true);
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 1024);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.5);
                    entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20 * 1200, 4));
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 20 * 600, 0));
                    ARMOR.setBaseValue(ARMOR.getBaseValue() + 30);
                    ARMOR_TOUGHNESS.setBaseValue(ARMOR_TOUGHNESS.getBaseValue() + 20);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 100);
                    KNOCKBACK_RESISTANCE.setBaseValue(KNOCKBACK_RESISTANCE.getBaseValue() + 1);
                }
                if(rand.nextDouble() < 0.12){
                    entityMob.setInvisible(true);
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 20 * 600, 0));
                }
                if(rand.nextDouble() < 0.18){
                    entity.setNoGravity(true);
                    entity.setGlowing(true);
                    entity.addTag("canFly");
                }
                if(rand.nextDouble() < 0.1){
                    MAX_HEALTH.setBaseValue(MAX_HEALTH.getBaseValue() + 1024);
                    MOVEMENT_SPEED.setBaseValue(MOVEMENT_SPEED.getBaseValue() * 1.5);
                    ATTACK_DAMAGE.setBaseValue(ATTACK_DAMAGE.getBaseValue() + 30);
                    entityMob.setHealth((float) MAX_HEALTH.getBaseValue());
                }
                entityMob.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20 * 600, 2));
                entity.addTag("hasModify");
                if(rand.nextDouble() < 0.1){
                    entityMob.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 20 * 60, 0));
                }
            }
        }
    }
}
