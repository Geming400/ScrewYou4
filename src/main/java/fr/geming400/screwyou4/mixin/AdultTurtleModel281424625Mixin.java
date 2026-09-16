package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.turtle.AdultTurtleModel.class)
public class AdultTurtleModel281424625Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_985145316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(985145316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_965073170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(965073170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/TurtleRenderState;)V", cancellable = true)
    private void setupAnim__1859570060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1859570060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1622229984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622229984L))
            info.setReturnValue(null);
    }


}
