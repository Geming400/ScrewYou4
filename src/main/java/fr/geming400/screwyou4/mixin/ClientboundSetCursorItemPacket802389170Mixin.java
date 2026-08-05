package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetCursorItemPacket.class)
public class ClientboundSetCursorItemPacket802389170Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__876635918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876635918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2107065867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107065867L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__333070805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333070805L))
            info.setReturnValue("UvLe\uBB41\u90CD]>$n6*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_840651912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840651912L))
            info.setReturnValue(718599064);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1480458083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1480458083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_999896704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(999896704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void contents_1325807830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1325807830L))
            info.setReturnValue(null);
    }


}
