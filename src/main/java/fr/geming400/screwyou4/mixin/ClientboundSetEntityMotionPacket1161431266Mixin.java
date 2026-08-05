package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket.class)
public class ClientboundSetEntityMotionPacket1161431266Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1317298856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317298856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_252804998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(252804998L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1931854791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931854791L))
            info.setReturnValue("nT5ip.i|c`j&sGhRA.<@(W<X\u3209J9;\u791CBtJ,^4 &73M`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1718783357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718783357L))
            info.setReturnValue(-639835981);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1533752691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1533752691L))
            info.setReturnValue(253631052);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_865719403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(865719403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__430046328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-430046328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "movement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void movement__1563584564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1563584564L))
            info.setReturnValue(null);
    }


}
