package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.bossevents.CustomBossEvent.class)
public class CustomBossEvent527403950Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_565666196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565666196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()I", cancellable = true)
    private void max_565666196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565666196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "load(Ljava/util/UUID;Lnet/minecraft/resources/Identifier;Lnet/minecraft/server/bossevents/CustomBossEvent$Packed;Ljava/lang/Runnable;)Lnet/minecraft/server/bossevents/CustomBossEvent;", cancellable = true)
    private static void load__1503366793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503366793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setValue(I)V", cancellable = true)
    private void setValue_1741320922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741320922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1649504719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649504719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/server/bossevents/CustomBossEvent$Packed;", cancellable = true)
    private void pack__612432405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-612432405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMax(I)V", cancellable = true)
    private void setMax_1741320922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741320922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePlayer__242157903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-242157903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addPlayer__242157903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-242157903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDirty()V", cancellable = true)
    private void setDirty_565678689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(565678689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayers(Ljava/util/Collection;)Z", cancellable = true)
    private void setPlayers_1978728726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1978728726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void customId__1915662603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915662603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeAllPlayers()V", cancellable = true)
    private void removeAllPlayers_565678689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(565678689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerConnect(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void onPlayerConnect__242157903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-242157903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerDisconnect(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void onPlayerDisconnect__242157903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-242157903L))
            info.cancel();
    }


}
