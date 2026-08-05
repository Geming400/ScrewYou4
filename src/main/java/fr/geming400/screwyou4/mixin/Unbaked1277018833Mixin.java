package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.BellSpecialRenderer.Unbaked.class)
public class Unbaked1277018833Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1282094739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282094739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1632436204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632436204L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_141558858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141558858L))
            info.setReturnValue("O?]Zs,[!_*M@05Y<ph]9^R&I@lWuMq16\u0339%$\uD191b@\uB795QV00.\u8434\uB65B4|$I`v\u9BBCDy#e&%1,]jW)\uA405\uA09Cn<\u38AA)cXGd76w\uAEF3wC8o0J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1315281575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315281575L))
            info.setReturnValue(-303871069);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__411004027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411004027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/BellSpecialRenderer;", cancellable = true)
    private void bake__350509917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350509917L))
            info.setReturnValue(null);
    }


}
