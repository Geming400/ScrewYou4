package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundResourcePackPopPacket.class)
public class ClientboundResourcePackPopPacket_953386241Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__725638848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725638848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1956068797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1956068797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__182073735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-182073735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_991648982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991648982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/Optional;", cancellable = true)
    private void id_1198847662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1198847662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1631455153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1631455153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__506863314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-506863314L))
            info.cancel();
    }


}
