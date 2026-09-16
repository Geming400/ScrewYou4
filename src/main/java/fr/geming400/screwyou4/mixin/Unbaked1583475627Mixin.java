package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.BookSpecialRenderer.Unbaked.class)
public class Unbaked1583475627Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_188224973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188224973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_674849359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674849359L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1941068144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941068144L))
            info.setReturnValue("P\"B\u92B4n\u5957l\uD29DeO\uCF78!TSxb)\"nJ2M@m(!e\uCD19rF<\u3277qO$X%'\uFFC5w_e\u3EFCS\uB97B}&J\u51BEqsokZVG?T|u14\u7E0DOE/;\u89F4Pnf\uCCAB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2140827718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140827718L))
            info.setReturnValue(-710590548);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1538689288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538689288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/BookSpecialRenderer;", cancellable = true)
    private void bake__575564758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575564758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "page1()F", cancellable = true)
    private void page1_1824860172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824860172L))
            info.setReturnValue(6.341416E8F);
    }

    @Inject(at = @At("HEAD"), method = "page2()F", cancellable = true)
    private void page2_1853489323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853489323L))
            info.setReturnValue(6.341416E8F);
    }

    @Inject(at = @At("HEAD"), method = "openAngle()F", cancellable = true)
    private void openAngle_832763717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832763717L))
            info.setReturnValue(6.341416E8F);
    }


}
