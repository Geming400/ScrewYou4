package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.skeleton.BoggedModel.class)
public class BoggedModel_1153881745Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)V", cancellable = true)
    private void setupAnim_306206692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(306206692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_738795796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(738795796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1837530289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1837530289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/BoggedRenderState;)V", cancellable = true)
    private void setupAnim__303382493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-303382493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__749772865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749772865L))
            info.setReturnValue(null);
    }


}
