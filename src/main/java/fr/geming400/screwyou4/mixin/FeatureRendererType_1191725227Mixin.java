package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.FeatureRendererType.class)
public class FeatureRendererType_1191725227Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_56264755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(56264755L))
            info.setReturnValue(")\u0260o8r=oaFV:7A:2DmKZW|Go5e{-u#i\u66A7#cX\uC201\"|KQ-Q\u0E13a%Z\u1E0BP;(1W!\uAEA2h!8O");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1717729811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1717729811L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_56264755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(56264755L))
            info.setReturnValue(")\u0260o8r=oaFV:7A:2DmKZW|Go5e{-u#i\u66A7#cX\uC201\"|KQ-Q\u0E13a%Z\u1E0BP;(1W!\uAEA2h!8O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1229987968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229987968L))
            info.setReturnValue(-1907348275);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1229987472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1229987472L))
            info.setReturnValue(-1271373667);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private static void create_402914098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402914098L))
            info.setReturnValue(null);
    }


}
