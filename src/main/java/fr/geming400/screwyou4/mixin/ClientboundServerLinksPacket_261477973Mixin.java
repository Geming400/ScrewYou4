package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundServerLinksPacket.class)
public class ClientboundServerLinksPacket_261477973Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1417547116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417547116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1646990231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646990231L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__873982003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873982003L))
            info.setReturnValue("S᳖w틆.:3r=p⽙R]Q2T<uᧄv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_299740714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(299740714L))
            info.setReturnValue(2081761111);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_939546885(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(939546885L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle__1198771582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1198771582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "links()Ljava/util/List;", cancellable = true)
    private void links_1887814788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1887814788L))
            info.setReturnValue(null);
    }


}
