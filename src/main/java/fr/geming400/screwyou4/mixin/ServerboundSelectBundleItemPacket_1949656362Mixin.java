package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSelectBundleItemPacket.class)
public class ServerboundSelectBundleItemPacket_1949656362Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2105523951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105523951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1041030093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1041030093L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1574887410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1574887410L))
            info.setReturnValue("V+m\u6B23Fv #\u5CA613VG\u8FAE=8aHfZ!3\uA3F18=N\u6640m2MH@Au%q+e>\u79B1h \u866D/Kf\u099F+?M\u5E6A\u9AD7OE`1=^KSTgA>{Fsw\u994D\u01FAM=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1787958844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787958844L))
            info.setReturnValue(-579907703);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1707950761(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1707950761L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1653944498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1653944498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectedItemIndex()I", cancellable = true)
    private void selectedItemIndex__351652757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351652757L))
            info.setReturnValue(-366322376);
    }

    @Inject(at = @At("HEAD"), method = "slotId()I", cancellable = true)
    private void slotId__2076886282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076886282L))
            info.setReturnValue(328231826);
    }


}
