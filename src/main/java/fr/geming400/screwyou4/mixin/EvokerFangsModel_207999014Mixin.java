package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.effects.EvokerFangsModel.class)
public class EvokerFangsModel_207999014Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1593635892(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1593635892L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EvokerFangsRenderState;)V", cancellable = true)
    private void setupAnim_1094365227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1094365227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__506133151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506133151L))
            info.setReturnValue(null);
    }


}
