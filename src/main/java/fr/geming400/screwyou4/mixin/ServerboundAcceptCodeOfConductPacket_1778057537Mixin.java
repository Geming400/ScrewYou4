package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.configuration.ServerboundAcceptCodeOfConductPacket.class)
public class ServerboundAcceptCodeOfConductPacket_1778057537Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1933925126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933925126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_869431268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869431268L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1746486235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746486235L))
            info.setReturnValue("e?2IXaiLZtPSfPIy{_\u6118K5xJeKL*\uC6F9glN?\u4F1Av<n?M'G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1959557669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959557669L))
            info.setReturnValue(-774346970);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1482345673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1482345673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/configuration/ServerConfigurationPacketListener;)V", cancellable = true)
    private void handle__603192474(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-603192474L))
            info.cancel();
    }


}
