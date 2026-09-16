package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ClientboundLoginFinishedPacket.class)
public class ClientboundLoginFinishedPacket312330756Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_468198346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468198346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__596295512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-596295512L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1082754281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1082754281L))
            info.setReturnValue("},^\u6DAF\uC53AT| jd\uCEC3DrA<}qUQa'j\u7B03}8\u1EBD\uCCAB\u50149C\u95F2oYy,)4=8y?xFcm[S|Y+t3[\uC8C1O:IgVvhvqJg\u7570\u00B1R{mtvc `\u2B1C-I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_869682847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869682847L))
            info.setReturnValue(1300802827);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void handle_1143138956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1143138956L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_16618893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(16618893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTerminal()Z", cancellable = true)
    private void isTerminal_974246325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(974246325L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId__164356120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164356120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void gameProfile_1509320819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1509320819L))
            info.setReturnValue(null);
    }


}
