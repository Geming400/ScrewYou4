package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.FilteredText.class)
public class FilteredText1573395704Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1336059333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336059333L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_437935729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437935729L))
            info.setReturnValue("oAc5iy\uB3FCj\"PL\uFB55\u7C84I_crR,11V\u4282mKw\u2516]uRvps\uD1A53\"M\u380F5wL]XhdRBld<\uFC33SJ{f5$AP!3Sqm\u6DFE\u6F2F_DCW#n<?P^nx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1611658446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611658446L))
            info.setReturnValue(-1912466763);
    }

    @Inject(at = @At("HEAD"), method = "mask()Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private void mask_1243100182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243100182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "raw()Ljava/lang/String;", cancellable = true)
    private void raw_437935233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437935233L))
            info.setReturnValue("$*06\u7CF5uji/7#K1@+#7imgVsUAHD!`]dnQN\u7240&7I@l9\u0D86gv\u8DC1tu2nCy:ewaVE=1_+A$QuuhB?lBIs?a\uBB60' d\u3AEDC");
    }

    @Inject(at = @At("HEAD"), method = "isFiltered()Z", cancellable = true)
    private void isFiltered_1611674287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611674287L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "filtered()Ljava/lang/String;", cancellable = true)
    private void filtered_437935233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437935233L))
            info.setReturnValue("$*06\u7CF5uji/7#K1@+#7imgVsUAHD!`]dnQN\u7240&7I@l9\u0D86gv\u8DC1tu2nCy:ewaVE=1_+A$QuuhB?lBIs?a\uBB60' d\u3AEDC");
    }

    @Inject(at = @At("HEAD"), method = "filteredOrEmpty()Ljava/lang/String;", cancellable = true)
    private void filteredOrEmpty_437935233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437935233L))
            info.setReturnValue("$*06\u7CF5uji/7#K1@+#7imgVsUAHD!`]dnQN\u7240&7I@l9\u0D86gv\u8DC1tu2nCy:ewaVE=1_+A$QuuhB?lBIs?a\uBB60' d\u3AEDC");
    }

    @Inject(at = @At("HEAD"), method = "passThrough(Ljava/lang/String;)Lnet/minecraft/server/network/FilteredText;", cancellable = true)
    private static void passThrough__701930495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701930495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullyFiltered(Ljava/lang/String;)Lnet/minecraft/server/network/FilteredText;", cancellable = true)
    private static void fullyFiltered__701930495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701930495L))
            info.setReturnValue(null);
    }


}
