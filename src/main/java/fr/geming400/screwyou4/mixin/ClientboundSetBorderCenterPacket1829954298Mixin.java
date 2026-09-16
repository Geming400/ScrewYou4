package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderCenterPacket.class)
public class ClientboundSetBorderCenterPacket1829954298Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1985821888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985821888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_238476704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(238476704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1534242435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1534242435L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNewCenterX()D", cancellable = true)
    private void getNewCenterX__197266206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-197266206L))
            info.setReturnValue(6.13498900889102E8D);
    }

    @Inject(at = @At("HEAD"), method = "getNewCenterZ()D", cancellable = true)
    private void getNewCenterZ__140007904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-140007904L))
            info.setReturnValue(6.13498900325199E8D);
    }


}
