package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetObjectivePacket.class)
public class ClientboundSetObjectivePacket_1513432860Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__165592229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-165592229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMethod()I", cancellable = true)
    private void getMethod_1551695105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1551695105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1710940393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710940393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2103465524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2103465524L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__663476306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663476306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberFormat()Ljava/util/Optional;", cancellable = true)
    private void getNumberFormat_1758894281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758894281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderType()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private void getRenderType__106137254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106137254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getObjectiveName()Ljava/lang/String;", cancellable = true)
    private void getObjectiveName_377972388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(377972388L))
            info.setReturnValue(null);
    }


}
