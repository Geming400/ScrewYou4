package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.OutputTarget.class)
public class OutputTarget_571684340Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__563776132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563776132L))
            info.setReturnValue("C]亢v9p%+7w?:%^풐,CKy?V玲LI$W᭏閉k#Lc>iqSEyBaa{BwHbE%0TH0SF-,ab]\"l亷GFFO'ꑸ&7.YM\"");
    }

    @Inject(at = @At("HEAD"), method = "getRenderTarget()Lcom/mojang/blaze3d/pipeline/RenderTarget;", cancellable = true)
    private void getRenderTarget_538238392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538238392L))
            info.setReturnValue(null);
    }


}
