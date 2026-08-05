package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ExplodeEffect.class)
public class ExplodeEffect1104060276Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_195434008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(195434008L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1874483801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874483801L))
            info.setReturnValue("rIlt;\uFFDB+r\uB6D9 1e#\uABB1+0Fk?)D&MyVVF8YfrX1F]g\u0372?@3pfFJ42bBxgB]F\u9B4F}Q$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1661412367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661412367L))
            info.setReturnValue(-1361239323);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_778866273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(778866273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void offset_1861754874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861754874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFire()Z", cancellable = true)
    private void createFire__700314855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-700314855L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "damageType()Ljava/util/Optional;", cancellable = true)
    private void damageType_1818117483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818117483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "smallParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void smallParticle_1732006837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732006837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "largeParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void largeParticle__1708748567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708748567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributeToUser()Z", cancellable = true)
    private void attributeToUser__970842167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970842167L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2124461766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124461766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockParticles()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void blockParticles__848205958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848205958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockInteraction()Lnet/minecraft/world/level/Level$ExplosionInteraction;", cancellable = true)
    private void blockInteraction__1162315826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162315826L))
            info.setReturnValue(net.minecraft.world.level.Level.ExplosionInteraction.TRIGGER);
    }

    @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void radius_2118922613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118922613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sound__1550685055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1550685055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knockbackMultiplier()Ljava/util/Optional;", cancellable = true)
    private void knockbackMultiplier__2090310402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090310402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immuneBlocks()Ljava/util/Optional;", cancellable = true)
    private void immuneBlocks_1846959627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846959627L))
            info.setReturnValue(null);
    }


}
