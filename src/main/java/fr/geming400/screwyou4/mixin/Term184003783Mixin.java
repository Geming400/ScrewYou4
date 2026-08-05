package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.KeyValueCondition.Term.class)
public class Term184003783Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_480797441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480797441L))
            info.setReturnValue("].0 ld\u7027jB`S)J\u7CAC:H\uAD7Fb.GLo+:s&\u62ED#ls9\uBA3B\u7FE5XxQ{-F&%t");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__724622485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724622485L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_954426812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954426812L))
            info.setReturnValue("D\u127EK<<$1XPrf\u76C1%P\u582EWA\u4F66$P:\uC03E\u6D7FS\uB02Cu}\u8D4BI6o<d^(Ts\u53E0/]\u3C6AJ=?,85aXt\uB17EkrBs\uA39A)#^8{\uB7B1 |m=lrD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_741355874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741355874L))
            info.setReturnValue(-50881325);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lnet/minecraft/client/renderer/block/dispatch/multipart/KeyValueCondition$Term;", cancellable = true)
    private static void parse_657645785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(657645785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "negated()Z", cancellable = true)
    private void negated_751582748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751582748L))
            info.setReturnValue(false);
    }


}
