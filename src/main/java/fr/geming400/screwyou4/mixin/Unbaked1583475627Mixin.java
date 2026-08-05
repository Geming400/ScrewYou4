package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.BookSpecialRenderer.Unbaked.class)
public class Unbaked1583475627Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__975637945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975637945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1325979410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325979410L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_448015652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448015652L))
            info.setReturnValue("]JU*v\uCE76\u76BA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1621738369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621738369L))
            info.setReturnValue(1680913859);
    }

    @Inject(at = @At("HEAD"), method = "openAngle()F", cancellable = true)
    private void openAngle_1621734990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621734990L))
            info.setReturnValue(4.791308E8F);
    }

    @Inject(at = @At("HEAD"), method = "page2()F", cancellable = true)
    private void page2_1621734990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621734990L))
            info.setReturnValue(4.791308E8F);
    }

    @Inject(at = @At("HEAD"), method = "page1()F", cancellable = true)
    private void page1_1621734990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621734990L))
            info.setReturnValue(4.791308E8F);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__104547233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104547233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/BookSpecialRenderer;", cancellable = true)
    private void bake_1687455203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687455203L))
            info.setReturnValue(null);
    }


}
