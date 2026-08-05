package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket.class)
public class ClientboundSetEntityDataPacket_579547306Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1099477783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1099477783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1965059564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965059564L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__555912670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555912670L))
            info.setReturnValue("EyvP\uD131sQ\u8A35k\"2l#c/Sy5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_617810047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617810047L))
            info.setReturnValue(1054504000);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_617809551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617809551L))
            info.setReturnValue(-244408287);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_777054839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(777054839L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1257616218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1257616218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "packedItems()Ljava/util/List;", cancellable = true)
    private void packedItems__2089083175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2089083175L))
            info.setReturnValue(null);
    }


}
