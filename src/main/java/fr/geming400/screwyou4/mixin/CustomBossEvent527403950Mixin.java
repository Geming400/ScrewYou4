package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.bossevents.CustomBossEvent.class)
public class CustomBossEvent527403950Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__1777267005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777267005L))
            info.setReturnValue(407881988);
    }

    @Inject(at = @At("HEAD"), method = "max()I", cancellable = true)
    private void max_882473648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882473648L))
            info.setReturnValue(-1109724622);
    }

    @Inject(at = @At("HEAD"), method = "load(Ljava/util/UUID;Lnet/minecraft/resources/Identifier;Lnet/minecraft/server/bossevents/CustomBossEvent$Packed;Ljava/lang/Runnable;)Lnet/minecraft/server/bossevents/CustomBossEvent;", cancellable = true)
    private static void load__1647292335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647292335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setValue(I)V", cancellable = true)
    private void setValue__287169079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-287169079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName_1707816616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707816616L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/server/bossevents/CustomBossEvent$Packed;", cancellable = true)
    private void pack__1298066300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298066300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePlayer_1892982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1892982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addPlayer_1094286867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1094286867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDirty()V", cancellable = true)
    private void setDirty__2081323055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2081323055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayers(Ljava/util/Collection;)Z", cancellable = true)
    private void setPlayers_1180065830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1180065830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "customId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void customId_626585441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626585441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeAllPlayers()V", cancellable = true)
    private void removeAllPlayers__22570228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-22570228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerDisconnect(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void onPlayerDisconnect__1494526963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1494526963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerConnect(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void onPlayerConnect__448493477(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-448493477L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMax(I)V", cancellable = true)
    private void setMax_216837884(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(216837884L))
            info.cancel();
    }


}
