package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.IpBanlistService.IncomingIpBanDto.class)
public class IncomingIpBanDto_860554788Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__48071481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-48071481L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1630978312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630978312L))
            info.setReturnValue("ur}7v4I6Sslg\u6EABiCUi`i;^3X\u786F&#4$1\u64E9\"bi+(vF\"T9\u2CCAC^osj#z\u75F8on{\u9819{[b[2{&\uB178|}v_\u7847YUP \uAF90[\u4F87qYN,\u8DFF/Sk#$*w$9C\u4F49>RR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1417906878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1417906878L))
            info.setReturnValue(-1921286458);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/util/Optional;", cancellable = true)
    private void source__321061140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-321061140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reason()Ljava/util/Optional;", cancellable = true)
    private void reason_1945140757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945140757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expires()Ljava/util/Optional;", cancellable = true)
    private void expires_1307427589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307427589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ip()Ljava/util/Optional;", cancellable = true)
    private void ip__651083784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651083784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__370098254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370098254L))
            info.setReturnValue(null);
    }


}
