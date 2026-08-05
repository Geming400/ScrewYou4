package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTestInstanceBlockStatus.class)
public class ClientboundTestInstanceBlockStatus231917591Mixin {
        @Inject(at = @At("HEAD"), method = "size()Ljava/util/Optional;", cancellable = true)
    private void size_477379013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477379013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1447107497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447107497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1617429850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617429850L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__903542384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903542384L))
            info.setReturnValue("xbR^T.Ck\u435EWduY\uC664*\u03E0\u6D96<\u4DE6\u39AA3\"\uBD91=SJb\u3D5EEs");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_270180333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270180333L))
            info.setReturnValue(1220350218);
    }

    @Inject(at = @At("HEAD"), method = "status()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void status__1944991574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944991574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_909986504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(909986504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_429425125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429425125L))
            info.cancel();
    }


}
