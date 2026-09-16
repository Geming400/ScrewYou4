package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.bossevents.CustomBossEvents.class)
public class CustomBossEvents528407335Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/bossevents/CustomBossEvent;)V", cancellable = true)
    private void remove__801133142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-801133142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/bossevents/CustomBossEvent;", cancellable = true)
    private void get__1344235630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344235630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;Lnet/minecraft/resources/Identifier;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/server/bossevents/CustomBossEvent;", cancellable = true)
    private void create_142670808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142670808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIds()Ljava/util/Collection;", cancellable = true)
    private void getIds__1514352487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514352487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPlayerDisconnect(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void onPlayerDisconnect__1493523578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1493523578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerConnect(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void onPlayerConnect__447490092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-447490092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEvents()Ljava/util/Collection;", cancellable = true)
    private void getEvents_1925629670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1925629670L))
            info.setReturnValue(null);
    }


}
