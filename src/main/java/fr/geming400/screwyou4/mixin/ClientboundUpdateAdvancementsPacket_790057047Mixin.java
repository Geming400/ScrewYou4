package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateAdvancementsPacket.class)
public class ClientboundUpdateAdvancementsPacket_790057047Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__888968042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-888968042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1468125959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1468125959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_987564580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(987564580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAdded()Ljava/util/List;", cancellable = true)
    private void getAdded__1878573434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878573434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemoved()Ljava/util/Set;", cancellable = true)
    private void getRemoved__1038978440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038978440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProgress()Ljava/util/Map;", cancellable = true)
    private void getProgress__1214566594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214566594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldReset()Z", cancellable = true)
    private void shouldReset_828335629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828335629L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldShowAdvancements()Z", cancellable = true)
    private void shouldShowAdvancements_828335629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828335629L))
            info.setReturnValue(false);
    }


}
