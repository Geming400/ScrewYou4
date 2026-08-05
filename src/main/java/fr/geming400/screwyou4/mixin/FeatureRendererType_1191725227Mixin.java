package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FeatureRendererType.class)
public class FeatureRendererType_1191725227Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_2000992382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000992382L))
            info.setReturnValue("\u06ECN4'|Tm5A_{KJ4t=(]PY]h\u9DF7'NdIiS<l\u7A12#\u1F7D@");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_283098958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283098958L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1962148255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962148255L))
            info.setReturnValue("/7I\u4DFB2{}5u\u99E1\"\uD126#N-$C,Xek?0$5.7EJv{d)\u096AK\u4CB7\u44FC(9\uCF28]rl>iUmG]\u7E3CfrEV\u851E>:+8|$\uD12C1GA5SLr,V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1749077317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749077317L))
            info.setReturnValue(-647310952);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1503458731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503458731L))
            info.setReturnValue(-1081747003);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private static void create_3592630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(3592630L))
            info.setReturnValue(null);
    }


}
