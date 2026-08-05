package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.SectionUpdateRenderState.class)
public class SectionUpdateRenderState1706390225Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_797763957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797763957L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1818153546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818153546L))
            info.setReturnValue("\u2292|f\u1595o*{\u9C02m\u51B68oA66o\u3CD0\u554E\u1AC0kg");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2031224980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031224980L))
            info.setReturnValue(1881075663);
    }

    @Inject(at = @At("HEAD"), method = "region()Lnet/minecraft/client/renderer/chunk/RenderSectionRegion;", cancellable = true)
    private void region__1668392644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668392644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerChanged()Z", cancellable = true)
    private void playerChanged__838640683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838640683L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sectionNode()J", cancellable = true)
    private void sectionNode__661478831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-661478831L))
            info.setReturnValue(8073023803813849674L);
    }


}
