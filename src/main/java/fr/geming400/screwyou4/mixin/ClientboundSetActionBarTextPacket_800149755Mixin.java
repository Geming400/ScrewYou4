package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetActionBarTextPacket.class)
public class ClientboundSetActionBarTextPacket_800149755Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__878875334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-878875334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2109305283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109305283L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__335310221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-335310221L))
            info.setReturnValue("]x\u5EDFD;;\u47337c\u7C0DC0\u6AB9e\u8B4CL_$ccKKc[.VXI\u89D1Ryj80sbj2miyL.QW`r_AzG_lM48<n]\u66C8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_838412496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838412496L))
            info.setReturnValue(-598285230);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1478218667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1478218667L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_997657288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(997657288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "text()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void text__1376759411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376759411L))
            info.setReturnValue(null);
    }


}
