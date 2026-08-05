package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.PlayerAdvancements.class)
public class PlayerAdvancements_1999627816Mixin {
        @Inject(at = @At("HEAD"), method = "save()V", cancellable = true)
    private void save_2037902554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037902554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/ServerAdvancementManager;)V", cancellable = true)
    private void reload_1832735273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1832735273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "revoke(Lnet/minecraft/advancements/AdvancementHolder;Ljava/lang/String;)Z", cancellable = true)
    private void revoke__1431398477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431398477L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTriggerMapForType(Lnet/minecraft/advancements/triggers/CriterionTrigger;)Ljava/util/Map;", cancellable = true)
    private void getTriggerMapForType_1148138683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148138683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flushDirty(Lnet/minecraft/server/level/ServerPlayer;Z)V", cancellable = true)
    private void flushDirty__338853228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-338853228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "award(Lnet/minecraft/advancements/AdvancementHolder;Ljava/lang/String;)Z", cancellable = true)
    private void award__1431398477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431398477L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOrStartProgress(Lnet/minecraft/advancements/AdvancementHolder;)Lnet/minecraft/advancements/AdvancementProgress;", cancellable = true)
    private void getOrStartProgress_814133157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814133157L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementProgress());
    }

    @Inject(at = @At("HEAD"), method = "clearTriggers()V", cancellable = true)
    private void clearTriggers_2037902554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037902554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void setPlayer_1230065962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1230065962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelectedTab(Lnet/minecraft/advancements/AdvancementHolder;)V", cancellable = true)
    private void setSelectedTab_975624549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(975624549L))
            info.cancel();
    }


}
