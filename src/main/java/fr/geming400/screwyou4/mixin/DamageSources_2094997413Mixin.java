package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageSources.class)
public class DamageSources_2094997413Mixin {
        @Inject(at = @At("HEAD"), method = "source(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void source__1560829826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560829826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void source__613013329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613013329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void source__1733004770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733004770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thrown(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void thrown__305880054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305880054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generic()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void generic__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "freeze()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void freeze__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "magic()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void magic__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "noAggroMobAttack(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void noAggroMobAttack__887547558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887547558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "witherSkull(Lnet/minecraft/world/entity/projectile/hurtingprojectile/WitherSkull;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void witherSkull_1792618296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792618296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dryOut()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void dryOut__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireball(Lnet/minecraft/world/entity/projectile/hurtingprojectile/Fireball;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fireball_741475783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741475783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "badRespawnPointExplosion(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void badRespawnPointExplosion_2112920502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112920502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lava()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void lava__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFire()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void onFire__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drown()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void drown__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inWall()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void inWall__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cramming()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void cramming__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobAttack(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void mobAttack__887547558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887547558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightningBolt()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void lightningBolt__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerAttack(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void playerAttack_943943141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943943141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "genericKill()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void genericKill__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outOfBorder()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void outOfBorder__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fellOutOfWorld()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fellOutOfWorld__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flyIntoWall()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void flyIntoWall__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wither()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void wither__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "anvil(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void anvil_2091418307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091418307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cactus()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void cactus__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "campfire()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void campfire__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indirectMagic(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void indirectMagic__305880054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305880054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sting(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void sting__887547558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887547558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fall()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fall__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireworks(Lnet/minecraft/world/entity/projectile/FireworkRocketEntity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fireworks_1903042045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903042045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inFire()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void inFire__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosion(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void explosion__305880054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305880054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosion(Lnet/minecraft/world/level/Explosion;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void explosion_749643560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(749643560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sweetBerryBush()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void sweetBerryBush__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spit(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void spit_1353902433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353902433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dragonBreath()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void dragonBreath__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hotFloor()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void hotFloor__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thorns(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void thorns_2091418307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091418307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trident(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void trident__305880054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305880054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mace(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void mace_2091418307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091418307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallingBlock(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fallingBlock_2091418307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091418307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enderPearl()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void enderPearl__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "starve()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void starve__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "windCharge(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void windCharge_1353902433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353902433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrow(Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void arrow_738621762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738621762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stalagmite()Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void stalagmite__621534550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621534550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallingStalactite(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void fallingStalactite_2091418307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091418307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobProjectile(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void mobProjectile_1353902433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353902433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sonicBoom(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/damagesource/DamageSource;", cancellable = true)
    private void sonicBoom_2091418307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091418307L))
            info.setReturnValue(null);
    }


}
