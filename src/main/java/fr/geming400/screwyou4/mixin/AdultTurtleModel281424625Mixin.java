package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.turtle.AdultTurtleModel.class)
public class AdultTurtleModel281424625Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__432707539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432707539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/TurtleRenderState;)V", cancellable = true)
    private void setupAnim__722598046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-722598046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__643037614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-643037614L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1667061504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1667061504L))
            info.cancel();
    }


}
