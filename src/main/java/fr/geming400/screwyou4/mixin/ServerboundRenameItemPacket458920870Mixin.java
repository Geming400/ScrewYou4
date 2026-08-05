package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundRenameItemPacket.class)
public class ServerboundRenameItemPacket458920870Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1429926032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429926032L))
            info.setReturnValue("F4kl\u8989{ATG5q4\u0168jj\u2A00 0 \u17CEWdw'jwn T4nZ-gjV'1Bqi;fRzKm\uA2BDp\u8640U\u18D0oqAYw,z!;");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_614788460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614788460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1096281044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096281044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_163209007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(163209007L))
            info.cancel();
    }


}
