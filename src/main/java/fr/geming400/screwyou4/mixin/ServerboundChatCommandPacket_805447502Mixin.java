package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatCommandPacket.class)
public class ServerboundChatCommandPacket_805447502Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_961315091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961315091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__103178767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-103178767L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1575871026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575871026L))
            info.setReturnValue("hHYZ\u9F07] DOnSw\u55DE<F\"L9iN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1362799592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362799592L))
            info.setReturnValue(547053140);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command__599725087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599725087L))
            info.setReturnValue("9t\u611Bb&qL_[KL-EQ");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_509735638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(509735638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1442807675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1442807675L))
            info.cancel();
    }


}
