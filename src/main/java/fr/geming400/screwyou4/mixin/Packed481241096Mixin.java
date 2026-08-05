package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.bossevents.CustomBossEvent.Packed.class)
public class Packed481241096Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void name__1695668069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695668069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_519503342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519503342L))
            info.setReturnValue(2001782525);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1866753355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866753355L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__654218879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654218879L))
            info.setReturnValue("h\uFF9C\u64B3&\u2B921U.TVvLg2=Y+\u2880\u21BF{6`DW(R7T(\uB80E\u6EAA*&Ag{n&; \u7B51;RU79QM\u59F3EdAle%=6`\"l\u5E05|tq:<,RV7s\u4E99\u834A?R=mot*%\uBF31ct");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_519503838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519503838L))
            info.setReturnValue(1823259035);
    }

    @Inject(at = @At("HEAD"), method = "max()I", cancellable = true)
    private void max_519503342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519503342L))
            info.setReturnValue(2001782525);
    }

    @Inject(at = @At("HEAD"), method = "color()Lnet/minecraft/world/BossEvent$BossBarColor;", cancellable = true)
    private void color_487271281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487271281L))
            info.setReturnValue(net.minecraft.world.BossEvent.BossBarColor.PINK);
    }

    @Inject(at = @At("HEAD"), method = "visible()Z", cancellable = true)
    private void visible_519519679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519519679L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/Set;", cancellable = true)
    private void players__1347794390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347794390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "darkenScreen()Z", cancellable = true)
    private void darkenScreen_519519679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519519679L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createWorldFog()Z", cancellable = true)
    private void createWorldFog_519519679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519519679L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "playBossMusic()Z", cancellable = true)
    private void playBossMusic_519519679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519519679L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Lnet/minecraft/world/BossEvent$BossBarOverlay;", cancellable = true)
    private void overlay__1253035356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253035356L))
            info.setReturnValue(net.minecraft.world.BossEvent.BossBarOverlay.NOTCHED_10);
    }


}
