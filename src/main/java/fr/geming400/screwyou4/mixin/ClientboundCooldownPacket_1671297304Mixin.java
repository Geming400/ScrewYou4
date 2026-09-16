package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundCooldownPacket.class)
public class ClientboundCooldownPacket_1671297304Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1827164893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827164893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_762671035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762671035L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1853246468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853246468L))
            info.setReturnValue("*B]!`<X/s2s2^/\u77FCP5o[[,,W4L_x<r0l( pWN;F\uFF7DQHU;<\u5741U\u8BC7ZY#x\u831B\u1CC6ZS3N_RUTMO\u5063 \uC04B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2066317902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066317902L))
            info.setReturnValue(-12326790);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_1758911977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758911977L))
            info.setReturnValue(-753729573);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1375585440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1375585440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_79819709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(79819709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cooldownGroup()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void cooldownGroup__1177271758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1177271758L))
            info.setReturnValue(null);
    }


}
