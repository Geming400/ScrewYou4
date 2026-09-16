package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.MapEntryPathElement.class)
public class MapEntryPathElement_259889209Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1069156364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069156364L))
            info.setReturnValue("@");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_106275479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106275479L))
            info.setReturnValue("CW@\u6A66\uFD1F\u874E##q0au! \u8533\u583B.[:(SD:NKJ)$Lem7lEbgN\uFED4[=BIS%6e\u507ECyY-X\u48C1wW\"\u69EFG>rA\u8203Emr+p|0i\u435EP3]4's\u3A5BN(A\u3E8A");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__648737060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648737060L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1030312733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030312733L))
            info.setReturnValue("@<-S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_817241299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817241299L))
            info.setReturnValue(8330563);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__1978739488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978739488L))
            info.setReturnValue("\uAA670TjO;6x]1XpvCMDdX=4xE6o%}62Z$Qno]}D5+!h%H7>H8sD%nlK@\u9F48p7|9\u4EE2Fi0?L<SZE\uB422f^enho ZTQ1 '?c");
    }


}
