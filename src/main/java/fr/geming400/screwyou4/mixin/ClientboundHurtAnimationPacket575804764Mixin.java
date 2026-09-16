package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundHurtAnimationPacket.class)
public class ClientboundHurtAnimationPacket575804764Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_731672354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731672354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__332821504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332821504L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1346228289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1346228289L))
            info.setReturnValue("3I8\u8CEF\u855FZWXc/Fi<\u9F58%Ia'\u8A7AYxH|\uFC6AxWFSk|wTvw*wl!\u7FBFmY\u8A11[>+T");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1133156855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133156855L))
            info.setReturnValue(-1618926648);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__2119379193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119379193L))
            info.setReturnValue(1993576186);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1015672830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1015672830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_280092901(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(280092901L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yaw()F", cancellable = true)
    private void yaw_341129968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341129968L))
            info.setReturnValue(3.782642E8F);
    }


}
