package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.axolotl.BabyAxolotlModel.class)
public class BabyAxolotlModel895640780Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1579289325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1579289325L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AxolotlRenderState;)V", cancellable = true)
    private void setupAnim_1617562030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1617562030L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1008013829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008013829L))
            info.setReturnValue(null);
    }


}
