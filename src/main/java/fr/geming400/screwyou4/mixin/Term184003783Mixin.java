package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.multipart.KeyValueCondition.Term.class)
public class Term184003783Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value__951456688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951456688L))
            info.setReturnValue("=9,lL媑\"n쯋?z/S[>Kq9Zr/ZH.5S4@Xz黣`3q,9[*x'㒿d&");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1569516042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1569516042L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__951456688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951456688L))
            info.setReturnValue("=9,lL媑\"n쯋?z/S[>Kq9Zr/ZH.5S4@Xz黣`3q,9[*x'㒿d&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_222266525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222266525L))
            info.setReturnValue(-560955728);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lnet/minecraft/client/renderer/block/dispatch/multipart/KeyValueCondition$Term;", cancellable = true)
    private static void parse_754917292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754917292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "negated()Z", cancellable = true)
    private void negated_222282366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222282366L))
            info.setReturnValue(false);
    }


}
