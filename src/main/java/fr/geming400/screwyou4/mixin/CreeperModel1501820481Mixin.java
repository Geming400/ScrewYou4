package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.creeper.CreeperModel.class)
public class CreeperModel1501820481Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2109498270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2109498270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/CreeperRenderState;)V", cancellable = true)
    private void setupAnim_1266634814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1266634814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__115856286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115856286L))
            info.setReturnValue(null);
    }


}
