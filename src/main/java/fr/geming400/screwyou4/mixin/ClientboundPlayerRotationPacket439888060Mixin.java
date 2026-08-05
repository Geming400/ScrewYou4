package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerRotationPacket.class)
public class ClientboundPlayerRotationPacket439888060Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_595755650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595755650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__468738208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-468738208L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1210311585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1210311585L))
            info.setReturnValue("65U\"5&Ef(46\"/aF\u1B88?lZ#ek\u2C20z\u2242TQ&P+IY`&>)=*2\u2169?T@[)k*. $<{k8xJ\uAD50ooegfA3*Nxl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_997240151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(997240151L))
            info.setReturnValue(201227866);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_144176197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(144176197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1151589534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1151589534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_750691201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750691201L))
            info.setReturnValue(2.64088E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__1736821632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736821632L))
            info.setReturnValue(2.64088E8F);
    }

    @Inject(at = @At("HEAD"), method = "relativeY()Z", cancellable = true)
    private void relativeY_1315389318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315389318L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "relativeX()Z", cancellable = true)
    private void relativeX_1286760167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1286760167L))
            info.setReturnValue(false);
    }


}
