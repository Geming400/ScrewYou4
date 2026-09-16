package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.slime.MagmaCubeModel.class)
public class MagmaCubeModel_860717249Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1042937361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042937361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;)V", cancellable = true)
    private void setupAnim_1634815255(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1634815255L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1544365793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1544365793L))
            info.cancel();
    }


}
