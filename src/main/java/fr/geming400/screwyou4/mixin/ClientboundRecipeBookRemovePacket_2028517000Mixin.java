package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRecipeBookRemovePacket.class)
public class ClientboundRecipeBookRemovePacket_2028517000Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2110582707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110582707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1119890731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119890731L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1496026772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1496026772L))
            info.setReturnValue("S\u6545");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1709098206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709098206L))
            info.setReturnValue(1322608840);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1732805136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1732805136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_437039405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(437039405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipes()Ljava/util/List;", cancellable = true)
    private void recipes__953336612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953336612L))
            info.setReturnValue(null);
    }


}
