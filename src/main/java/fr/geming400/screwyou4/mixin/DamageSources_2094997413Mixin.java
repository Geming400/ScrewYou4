package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageSources.class)
public class DamageSources_2094997413Mixin {
        @Inject(at = @At("HEAD"), method = "source(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void source__1385793703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385793703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void source__86996044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86996044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void source__283205319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283205319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thrown(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void thrown_1726017218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726017218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generic()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void generic_2104631155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104631155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "freeze()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void freeze_1571600051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571600051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "magic()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void magic_821046237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821046237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "starve()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void starve__1043913591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043913591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mace(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void mace_1051401017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051401017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobProjectile(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void mobProjectile__1849645256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849645256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "witherSkull(Lnet/minecraft/world/entity/projectile/hurtingprojectile/WitherSkull;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void witherSkull__2031992370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031992370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dragonBreath()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void dragonBreath__314517641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314517641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sweetBerryBush()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void sweetBerryBush_1965737692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965737692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerAttack(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void playerAttack__249887236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249887236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outOfBorder()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void outOfBorder_1437787321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1437787321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "genericKill()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void genericKill__1639678283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639678283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fellOutOfWorld()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fellOutOfWorld__1046803842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046803842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flyIntoWall()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void flyIntoWall_684768685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684768685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightningBolt()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void lightningBolt_583379915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583379915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anvil(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void anvil__30346609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30346609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cactus()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void cactus__855911075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855911075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "campfire()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void campfire_1717372179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717372179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireworks(Lnet/minecraft/world/entity/projectile/FireworkRocketEntity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fireworks__544814583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-544814583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wither()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void wither_1242245079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242245079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inFire()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void inFire__957242929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957242929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosion(Lnet/minecraft/world/level/Explosion;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void explosion_1584726845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1584726845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosion(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void explosion__86712683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86712683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fall()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fall_589109071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(589109071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lava()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void lava__1491901494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1491901494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFire()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void onFire__1469458475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469458475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrow(Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void arrow_2059995225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059995225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indirectMagic(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void indirectMagic__1508031509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508031509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drown()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void drown_1728132978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728132978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inWall()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void inWall__1506056773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506056773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cramming()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void cramming_1134357754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134357754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobAttack(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void mobAttack_44003010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(44003010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thorns(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void thorns__1944168161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944168161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trident(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void trident_1160119832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160119832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireball(Lnet/minecraft/world/entity/projectile/hurtingprojectile/Fireball;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fireball_1182963708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182963708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hotFloor()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void hotFloor__2081249141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2081249141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spit(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void spit_1452623897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1452623897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stalagmite()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void stalagmite_1033571531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033571531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enderPearl()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void enderPearl__1398365300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1398365300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "badRespawnPointExplosion(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void badRespawnPointExplosion_189885790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189885790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noAggroMobAttack(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void noAggroMobAttack_814050053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814050053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallingBlock(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fallingBlock_652853385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652853385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallingStalactite(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fallingStalactite_581775998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581775998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sonicBoom(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void sonicBoom__856990022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856990022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sting(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void sting_646760379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646760379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "windCharge(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void windCharge__563182331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563182331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dryOut()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void dryOut__62259161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62259161L))
            info.setReturnValue(null);
    }


}
