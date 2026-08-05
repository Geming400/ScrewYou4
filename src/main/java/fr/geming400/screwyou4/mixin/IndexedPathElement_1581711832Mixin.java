package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.IndexedPathElement.class)
public class IndexedPathElement_1581711832Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1619974077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619974077L))
            info.setReturnValue(-103150512);
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_446251360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446251360L))
            info.setReturnValue("$bvk!\u84BCwK_LX7/d\"Jy^)\uB344R2(|)$|SMc4\u84CF\u78F5.<M\uC350.m|\u3B30\uB8C5lx9\u79AEAAI\u8EF3 (9lw\u0F8C9>%k\u4E40.\u44C8utK\u5F919FXw|x>sO\u2A2CB\u1C9C\u74CCZr[Wk682\u84A5J");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1327743206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1327743206L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_446251856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446251856L))
            info.setReturnValue(" tD\uFB2BA(XwlpDFT)\u98D6M\"\uCE6FpI\uFE60_%z\u5B4A\u544DzxID\u0C8A=2{k?V\u3F24hg\u93AC4BN\u2F88");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619974573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619974573L))
            info.setReturnValue(1269633563);
    }


}
