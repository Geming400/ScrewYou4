package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundDebugSubscriptionRequestPacket.class)
public class ServerboundDebugSubscriptionRequestPacket_632201628Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1046823461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046823461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2017713886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017713886L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__503258348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503258348L))
            info.setReturnValue("L\u7F52kJ=%8o bW'\u7F90Z#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_670464369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670464369L))
            info.setReturnValue(1289165464);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1310270540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1310270540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1236420367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1236420367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "subscriptions()Ljava/util/Set;", cancellable = true)
    private void subscriptions__1196833859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1196833859L))
            info.setReturnValue(null);
    }


}
