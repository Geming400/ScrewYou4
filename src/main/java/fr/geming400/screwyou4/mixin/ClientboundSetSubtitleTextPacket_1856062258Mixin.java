package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetSubtitleTextPacket.class)
public class ClientboundSetSubtitleTextPacket_1856062258Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2011929847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011929847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_947435989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947435989L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1668481514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668481514L))
            info.setReturnValue(";r*}\u45675D/QzC1*DF]3]|,l-.\u415BL\u1B0E\u431F|O&)L\u30E9I72\u5F40FKP'9JG$Pg#C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1881552948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881552948L))
            info.setReturnValue(-1408695255);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1560350394(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1560350394L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_264584663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(264584663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text_955302065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955302065L))
            info.setReturnValue(null);
    }


}
