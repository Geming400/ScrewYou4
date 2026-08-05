package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.PufferfishBigModel.class)
public class PufferfishBigModel1470799737Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_756667573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756667573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1438530680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1438530680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim_1284747409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1284747409L))
            info.cancel();
    }


}
