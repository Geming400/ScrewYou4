package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.wither.WitherBossModel.class)
public class WitherBossModel320962299Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_1827194601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827194601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1706599178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1706599178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/WitherRenderState;)V", cancellable = true)
    private void setupAnim__1214697437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1214697437L))
            info.cancel();
    }


}
