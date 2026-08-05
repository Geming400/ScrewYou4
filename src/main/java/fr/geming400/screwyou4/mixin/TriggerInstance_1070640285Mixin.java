package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LightningStrikeTrigger.TriggerInstance.class)
public class TriggerInstance_1070640285Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1838814753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838814753L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__64819691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64819691L))
            info.setReturnValue("3\u05D2\u07757I*K\u4FA84(\u2363=BW`\uB9ADrk8m?)@IGG^+pz.u7\u6553\uB016%jV4S/L_:9JW1/p]v\u8C24C^7tmUmhh)^W7W!=\"Y=BOio BD\u1EA5%z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1108903026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108903026L))
            info.setReturnValue(-1311571015);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/List;)Z", cancellable = true)
    private void matches_1456061411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1456061411L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1069300444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069300444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1316101706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316101706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightning()Ljava/util/Optional;", cancellable = true)
    private void lightning_1316101706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316101706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightningStrike(Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void lightningStrike_1786792033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786792033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bystander()Ljava/util/Optional;", cancellable = true)
    private void bystander_1316101706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316101706L))
            info.setReturnValue(null);
    }


}
