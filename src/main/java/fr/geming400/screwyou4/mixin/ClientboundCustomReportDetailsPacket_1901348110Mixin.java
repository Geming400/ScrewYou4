package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundCustomReportDetailsPacket.class)
public class ClientboundCustomReportDetailsPacket_1901348110Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_222323021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222323021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1008106928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008106928L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_765888134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(765888134L))
            info.setReturnValue("]<}I檮F@|zꭨCR䵬;|b^퇨]t#Y}e㬥D=0f1AZp`;P.Z靇");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1939610851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939610851L))
            info.setReturnValue(-413157034);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1715550274(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1715550274L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_441098555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(441098555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "details()Ljava/util/Map;", cancellable = true)
    private void details__103275531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103275531L))
            info.setReturnValue(null);
    }


}
