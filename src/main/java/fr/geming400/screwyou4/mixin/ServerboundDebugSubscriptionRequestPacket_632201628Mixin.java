package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundDebugSubscriptionRequestPacket.class)
public class ServerboundDebugSubscriptionRequestPacket_632201628Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_788069217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788069217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__276424641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276424641L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1402625152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402625152L))
            info.setReturnValue("KgCJpd&A>t/-;-K:a+.FxJU\u0A0F[S|W\u6F1Cb9mOSFaPqr2!ITZ6\u87BDy\u711094V,\u221Cj\u6771x$2%nb{+S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1189553718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189553718L))
            info.setReturnValue(1108724370);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_336489764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(336489764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1269561801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269561801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "subscriptions()Ljava/util/Set;", cancellable = true)
    private void subscriptions__295651065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295651065L))
            info.setReturnValue(null);
    }


}
