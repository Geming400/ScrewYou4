package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetPlayerInventoryPacket.class)
public class ClientboundSetPlayerInventoryPacket_1789083018Mixin {
        @Inject(at = @At("HEAD"), method = "slot()I", cancellable = true)
    private void slot_1827345263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827345263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_110057929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110057929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1120372020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120372020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_653623042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653623042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1827345759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827345759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1827815366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1827815366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1986590551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1986590551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void contents__1982465619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982465619L))
            info.setReturnValue(null);
    }


}
