package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.skeleton.BoggedModel.class)
public class BoggedModel_1153881745Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_439749580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439749580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim__1847759230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1847759230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1755448673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1755448673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SkeletonRenderState;)V", cancellable = true)
    private void setupAnim_2014618962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2014618962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/BoggedRenderState;)V", cancellable = true)
    private void setupAnim_833589521(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(833589521L))
            info.cancel();
    }


}
