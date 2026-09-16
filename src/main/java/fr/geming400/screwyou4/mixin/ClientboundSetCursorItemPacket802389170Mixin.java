package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetCursorItemPacket.class)
public class ClientboundSetCursorItemPacket802389170Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_958256760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958256760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__106237098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106237098L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1572812695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572812695L))
            info.setReturnValue("8s\u4C95tsFRd\u6BEAe+Y=L,@d\uC5B8uW68`\u7C3EU?,W\u90B3XA{6\uA03Ep=D&Z\uC03C(jhC\"CBnU`\u321Cwqg=TM7,.Xl\u72BE\uB7ADD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1359741261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359741261L))
            info.setReturnValue(1317511557);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_506677307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(506677307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__789088424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-789088424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void contents_1237512688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1237512688L))
            info.setReturnValue(null);
    }


}
