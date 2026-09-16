package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.SourceFilter.class)
public class SourceFilter_1295372319Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run_837895675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(837895675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_386746050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386746050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2065795843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065795843L))
            info.setReturnValue("N(1'Q3j9g\uC1BF4<,[^610e@{5{WMB|Ut#|Z|k=FL'Q6U4%7n;G\u7411Q;Pc^lqA.\u30121:\uC269YTu3|/8h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1852724409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852724409L))
            info.setReturnValue(-761549624);
    }

    @Inject(at = @At("HEAD"), method = "filter()Lnet/minecraft/util/IdentifierPattern;", cancellable = true)
    private void filter__2047324042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2047324042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1933149724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933149724L))
            info.setReturnValue(null);
    }


}
