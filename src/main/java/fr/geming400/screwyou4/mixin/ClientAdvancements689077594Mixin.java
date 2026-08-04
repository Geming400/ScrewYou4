package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientAdvancements.class)
public class ClientAdvancements689077594Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void get__1965962596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965962596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/network/protocol/game/ClientboundUpdateAdvancementsPacket;)V", cancellable = true)
    private void update_707708424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(707708424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTree()Lnet/minecraft/advancements/AdvancementTree;", cancellable = true)
    private void getTree_274055730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274055730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setListener(Lnet/minecraft/client/multiplayer/ClientAdvancements$Listener;)V", cancellable = true)
    private void setListener__1553050585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1553050585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelectedTab(Lnet/minecraft/advancements/AdvancementHolder;Z)V", cancellable = true)
    private void setSelectedTab__947152660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947152660L))
            info.cancel();
    }


}
