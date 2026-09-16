package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.bossevents.CustomBossEvent.Packed.class)
public class Packed481241096Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void name_1420838246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420838246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__1823429859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823429859L))
            info.setReturnValue(1733849271);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__427385172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427385172L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1251664621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251664621L))
            info.setReturnValue("\u0681=ru`#=nR#=@05AY\u180F\u2560hNabrh.?jReh>\u34F1'`\u36F5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1038593187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038593187L))
            info.setReturnValue(-339013213);
    }

    @Inject(at = @At("HEAD"), method = "max()I", cancellable = true)
    private void max_836310794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836310794L))
            info.setReturnValue(1803932806);
    }

    @Inject(at = @At("HEAD"), method = "color()Lnet/minecraft/world/BossEvent$BossBarColor;", cancellable = true)
    private void color__1372657452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372657452L))
            info.setReturnValue(net.minecraft.world.BossEvent.BossBarColor.WHITE);
    }

    @Inject(at = @At("HEAD"), method = "visible()Z", cancellable = true)
    private void visible_191087757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191087757L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "overlay()Lnet/minecraft/world/BossEvent$BossBarOverlay;", cancellable = true)
    private void overlay_1587856116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587856116L))
            info.setReturnValue(net.minecraft.world.BossEvent.BossBarOverlay.NOTCHED_6);
    }

    @Inject(at = @At("HEAD"), method = "darkenScreen()Z", cancellable = true)
    private void darkenScreen_1215137972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1215137972L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createWorldFog()Z", cancellable = true)
    private void createWorldFog_55430615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55430615L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "playBossMusic()Z", cancellable = true)
    private void playBossMusic_1473805915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473805915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "players()Ljava/util/Set;", cancellable = true)
    private void players__1917126856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1917126856L))
            info.setReturnValue(null);
    }


}
