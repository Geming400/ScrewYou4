package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.bossevents.CustomBossEvents.class)
public class CustomBossEvents528407335Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/server/bossevents/CustomBossEvent;)V", cancellable = true)
    private void remove_1633861670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1633861670L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/server/bossevents/CustomBossEvent;", cancellable = true)
    private void get_2138155560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2138155560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/RandomSource;Lnet/minecraft/resources/Identifier;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/server/bossevents/CustomBossEvent;", cancellable = true)
    private void create_575277788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575277788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIds()Ljava/util/Collection;", cancellable = true)
    private void getIds__1285240937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285240937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPlayerConnect(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void onPlayerConnect__241154518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-241154518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerDisconnect(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void onPlayerDisconnect__241154518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-241154518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEvents()Ljava/util/Collection;", cancellable = true)
    private void getEvents__1285240937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285240937L))
            info.setReturnValue(null);
    }


}
