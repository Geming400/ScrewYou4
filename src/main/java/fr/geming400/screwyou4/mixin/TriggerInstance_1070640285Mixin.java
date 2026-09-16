package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.LightningStrikeTrigger.TriggerInstance.class)
public class TriggerInstance_1070640285Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_162014016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162014016L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1841063809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1841063809L))
            info.setReturnValue("#\u7148\uC2E9D.]2n1>E*\uC171\u3324\u7AAABx<m\u4626:b\u0B6Bj+q\u1E7B[,DJ@VBvS,T<s'\u147CSPJ\"#]yLo");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1627992375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1627992375L))
            info.setReturnValue(-1273431741);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/List;)Z", cancellable = true)
    private void matches_1346302992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1346302992L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate_1330813390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1330813390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__160012757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160012757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bystander()Ljava/util/Optional;", cancellable = true)
    private void bystander__1448648426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448648426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightning()Ljava/util/Optional;", cancellable = true)
    private void lightning__1608305900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608305900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lightningStrike(Ljava/util/Optional;Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void lightningStrike_699578309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699578309L))
            info.setReturnValue(null);
    }


}
