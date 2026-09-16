package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ClientboundServerLinksPacket.class)
public class ClientboundServerLinksPacket_261477973Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_417345562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417345562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__647148296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-647148296L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1031901497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031901497L))
            info.setReturnValue("<vABhkjyM7 b$B\"\u3168n\u79E54\u2ED245/BCFJ3;L|Jz%A]K(CKAdT=\uC082$V\u43FDj\u1CEFTXZPp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_818830063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(818830063L))
            info.setReturnValue(-928194685);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__34233891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-34233891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ClientCommonPacketListener;)V", cancellable = true)
    private void handle_11421530(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(11421530L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "links()Ljava/util/List;", cancellable = true)
    private void links_1433730493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1433730493L))
            info.setReturnValue(null);
    }


}
