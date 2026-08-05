package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetGameRulePacket.class)
public class ServerboundSetGameRulePacket_2137290897Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_458265808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458265808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__772164141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772164141L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1001830921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001830921L))
            info.setReturnValue(")q\"Gjq&ToO\uA369}$Vq(!oF^GP|#nhJh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2119413658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119413658L))
            info.setReturnValue(-1702207593);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__531339584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-531339584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1479607487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1479607487L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_268668902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(268668902L))
            info.cancel();
    }


}
