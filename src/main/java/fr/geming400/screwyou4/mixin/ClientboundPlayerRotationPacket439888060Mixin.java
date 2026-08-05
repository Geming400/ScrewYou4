package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerRotationPacket.class)
public class ClientboundPlayerRotationPacket439888060Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1239137028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239137028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1825400319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825400319L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__695571915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695571915L))
            info.setReturnValue("i}y.Mr-Tf{y;WbP)'uᖉ-es<FAk9:Yu၎n圮+m{sl靅截?sXv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_478150802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478150802L))
            info.setReturnValue(-1735813601);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1117956973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1117956973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_637395594(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(637395594L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_478147423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478147423L))
            info.setReturnValue(9.692982E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_478147423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478147423L))
            info.setReturnValue(9.692982E8F);
    }

    @Inject(at = @At("HEAD"), method = "relativeX()Z", cancellable = true)
    private void relativeX_478166643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478166643L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "relativeY()Z", cancellable = true)
    private void relativeY_478166643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478166643L))
            info.setReturnValue(false);
    }


}
