package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.login.ServerboundHelloPacket.class)
public class ServerboundHelloPacket1326736467Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_2136003623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136003623L))
            info.setReturnValue("EK;9D.DE\";t4T\u9CDD\u75A9PG,WA9,");
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1482604057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1482604057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_418110199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418110199L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2097159992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2097159992L))
            info.setReturnValue("pZ+{dXrmD`Kd1O0\u9E83>qJMJwb-K5$1adPo:K2rp&v\uD6FCxXl2\u80C9\"%OlQf[\uC281\u54D97d_z=<HmFmpEx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1884088558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884088558L))
            info.setReturnValue(920146663);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/login/ServerLoginPacketListener;)V", cancellable = true)
    private void handle__1762928557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1762928557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1031024604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1031024604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profileId()Ljava/util/UUID;", cancellable = true)
    private void profileId_1682432266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682432266L))
            info.setReturnValue(null);
    }


}
