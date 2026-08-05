package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPickItemFromEntityPacket.class)
public class ServerboundPickItemFromEntityPacket_562801818Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_718669407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718669407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__345824451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345824451L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1333225342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1333225342L))
            info.setReturnValue("VGht\uD1DC|#mwe'&#\uCEF8Vs[k<*IB\u6DEF%R^l&xWE-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1120153908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120153908L))
            info.setReturnValue(-889718671);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__2132382140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132382140L))
            info.setReturnValue(-1814910428);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_267089954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(267089954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1200161991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1200161991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "includeData()Z", cancellable = true)
    private void includeData__1479305954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479305954L))
            info.setReturnValue(false);
    }


}
