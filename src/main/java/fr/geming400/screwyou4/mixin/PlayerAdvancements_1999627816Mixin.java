package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.PlayerAdvancements.class)
public class PlayerAdvancements_1999627816Mixin {
        @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_2130743677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2130743677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/ServerAdvancementManager;)V", cancellable = true)
    private void reload__2146604734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2146604734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "flushDirty(Lnet/minecraft/server/level/ServerPlayer;Z)V", cancellable = true)
    private void flushDirty__4883034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-4883034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "award(Lnet/minecraft/advancements/AdvancementHolder;Ljava/lang/String;)Z", cancellable = true)
    private void award__177244298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177244298L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSelectedTab(Lnet/minecraft/advancements/AdvancementHolder;)V", cancellable = true)
    private void setSelectedTab__373016275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-373016275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void setPlayer_1856925133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1856925133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOrStartProgress(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/advancements/AdvancementProgress;", cancellable = true)
    private void getOrStartProgress__353603717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-353603717L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementProgress());
    }

    @Inject(at = @At("HEAD"), method = "revoke(Lnet/minecraft/advancements/AdvancementHolder;Ljava/lang/String;)Z", cancellable = true)
    private void revoke__1099244307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099244307L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "clearTriggers()V", cancellable = true)
    private void clearTriggers_647382706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(647382706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTriggerMapForType(Lnet/minecraft/advancements/triggers/CriterionTrigger;)Ljava/util/Map;", cancellable = true)
    private void getTriggerMapForType_1977189650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977189650L))
            info.setReturnValue(null);
    }


}
