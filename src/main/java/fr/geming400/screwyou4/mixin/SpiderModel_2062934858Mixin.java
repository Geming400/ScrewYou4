package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.spider.SpiderModel.class)
public class SpiderModel_2062934858Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__846395560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-846395560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_1138343658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1138343658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSpiderBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSpiderBodyLayer_1348802693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348802693L))
            info.setReturnValue(null);
    }


}
