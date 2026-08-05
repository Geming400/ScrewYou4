package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundResetScorePacket.class)
public class ClientboundResetScorePacket1926027072Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_247001984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247001984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__983427965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-983427965L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_790567097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790567097L))
            info.setReturnValue("=+X7Dj,\"}>A\u43F4nm.[\uB844\u9D88*|\u5578\uBD87XNhWx30\u4D732>\uA67A(]x!6\uC9CD\uC2AA+`%Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1964289814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964289814L))
            info.setReturnValue(-1841259961);
    }

    @Inject(at = @At("HEAD"), method = "owner()Ljava/lang/String;", cancellable = true)
    private void owner_790566601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790566601L))
            info.setReturnValue("V6g4x'cpv?jr\uC4FC^@@r\u6342M[hsAi\u6E5E;=s/2_i\uD30BL3 I]ib<");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1690871311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1690871311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2123534606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2123534606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "objectiveName()Ljava/lang/String;", cancellable = true)
    private void objectiveName_790566601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790566601L))
            info.setReturnValue("V6g4x'cpv?jr\uC4FC^@@r\u6342M[hsAi\u6E5E;=s/2_i\uD30BL3 I]ib<");
    }


}
