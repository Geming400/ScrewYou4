package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.spider.SpiderModel.class)
public class SpiderModel_2062934858Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1548383894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1548383894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__1528440708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1528440708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSpiderBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSpiderBodyLayer__543744301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543744301L))
            info.setReturnValue(null);
    }


}
