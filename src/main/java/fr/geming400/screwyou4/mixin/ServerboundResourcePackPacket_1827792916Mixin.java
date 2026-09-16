package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundResourcePackPacket.class)
public class ServerboundResourcePackPacket_1827792916Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1983660505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983660505L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_919166647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919166647L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1696750856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696750856L))
            info.setReturnValue("i_v6\u76E7)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1909822290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909822290L))
            info.setReturnValue(1334311856);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id__1643330623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643330623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/protocol/common/ServerboundResourcePackPacket$Action;", cancellable = true)
    private void action__1314654331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1314654331L))
            info.setReturnValue(net.minecraft.network.protocol.common.ServerboundResourcePackPacket.Action.DOWNLOADED);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1532081052(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1532081052L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle_302150817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(302150817L))
            info.cancel();
    }


}
