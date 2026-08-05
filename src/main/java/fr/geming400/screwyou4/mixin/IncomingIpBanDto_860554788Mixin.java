package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.IpBanlistService.IncomingIpBanDto.class)
public class IncomingIpBanDto_860554788Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2048900250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048900250L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__274905188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274905188L))
            info.setReturnValue(" 'q2|o8G5h\u726Ft\u4F60L<-c3WLKCH,I2%7VyMm`F>\u7B00)3N9j\u6E5DwlbINva\u7E56tQ_A\uD146");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_898817529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898817529L))
            info.setReturnValue(1009616738);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/util/Optional;", cancellable = true)
    private void source_1106016209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106016209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reason()Ljava/util/Optional;", cancellable = true)
    private void reason_1106016209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106016209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expires()Ljava/util/Optional;", cancellable = true)
    private void expires_1106016209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106016209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ip()Ljava/util/Optional;", cancellable = true)
    private void ip_1106016209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106016209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1106016209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106016209L))
            info.setReturnValue(null);
    }


}
