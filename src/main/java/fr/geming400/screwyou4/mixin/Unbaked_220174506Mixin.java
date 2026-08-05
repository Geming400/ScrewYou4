package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.DecoratedPotSpecialRenderer.Unbaked.class)
public class Unbaked_220174506Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1956028229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956028229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1605686764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605686764L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__915285470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-915285470L))
            info.setReturnValue("d\u069E`\uC5F344^D'a\uB934oXf\u7CE89*Z\u4F74$w\u8911");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_258437247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258437247L))
            info.setReturnValue(-1936723661);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1467848355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467848355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/DecoratedPotSpecialRenderer;", cancellable = true)
    private void bake__1737466218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737466218L))
            info.setReturnValue(null);
    }


}
