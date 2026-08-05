package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ExplodeEffect.class)
public class ExplodeEffect1104060276Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1805394761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1805394761L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__31399699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-31399699L))
            info.setReturnValue("$A4_11u8癇=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1142323018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142323018L))
            info.setReturnValue(896836260);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1950155249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1950155249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void offset__2093177491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093177491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributeToUser()Z", cancellable = true)
    private void attributeToUser_1142338859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142338859L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "smallParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void smallParticle__964900792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964900792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "largeParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void largeParticle__964900792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964900792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFire()Z", cancellable = true)
    private void createFire_1142338859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142338859L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1455053296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455053296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void sound__1642031248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1642031248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockParticles()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void blockParticles_597576410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597576410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockInteraction()Lnet/minecraft/world/level/Level$ExplosionInteraction;", cancellable = true)
    private void blockInteraction__509820727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-509820727L))
            info.setReturnValue(net.minecraft.world.level.Level.ExplosionInteraction.BLOCK);
    }

    @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void radius_1236139875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236139875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immuneBlocks()Ljava/util/Optional;", cancellable = true)
    private void immuneBlocks_1349521698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349521698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "knockbackMultiplier()Ljava/util/Optional;", cancellable = true)
    private void knockbackMultiplier_1349521698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349521698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageType()Ljava/util/Optional;", cancellable = true)
    private void damageType_1349521698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349521698L))
            info.setReturnValue(null);
    }


}
