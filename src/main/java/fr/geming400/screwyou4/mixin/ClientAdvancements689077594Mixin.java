package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientAdvancements.class)
public class ClientAdvancements689077594Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void get_806741362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806741362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/network/protocol/game/ClientboundUpdateAdvancementsPacket;)V", cancellable = true)
    private void update_147235601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(147235601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTree()Lnet/minecraft/advancements/AdvancementTree;", cancellable = true)
    private void getTree_1156818502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156818502L))
            info.setReturnValue(new net.minecraft.advancements.AdvancementTree());
    }

    @Inject(at = @At("HEAD"), method = "setSelectedTab(Lnet/minecraft/advancements/AdvancementHolder;Z)V", cancellable = true)
    private void setSelectedTab_194654756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(194654756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setListener(Lnet/minecraft/client/multiplayer/ClientAdvancements$Listener;)V", cancellable = true)
    private void setListener__1240773327(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1240773327L))
            info.cancel();
    }


}
