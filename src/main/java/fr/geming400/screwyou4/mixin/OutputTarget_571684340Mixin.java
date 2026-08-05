package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.OutputTarget.class)
public class OutputTarget_571684340Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1342107368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1342107368L))
            info.setReturnValue("3b\u8969:\u183EF\u652Ci\u017D=e5\u2643cF!x$B1H\uFCD2We0}z3\u5999\uBEF9hY`r{#/<krQEb]w_ZutYa\uA4B93Z[d#q|H;-M8\u8A86]v*d;\u8EF50CS.");
    }

    @Inject(at = @At("HEAD"), method = "getRenderTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void getRenderTarget_48456757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(48456757L))
            info.setReturnValue(null);
    }


}
