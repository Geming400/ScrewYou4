package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundGameRuleValuesPacket.class)
public class ClientboundGameRuleValuesPacket4587277Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_160454867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160454867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__904038991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904038991L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_775010802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(775010802L))
            info.setReturnValue("?!8");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Map;", cancellable = true)
    private void values__1044670061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1044670061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_561939368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(561939368L))
            info.setReturnValue(251552196);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__291124586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-291124586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1586890317(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1586890317L))
            info.cancel();
    }


}
