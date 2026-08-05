package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.ghast.HappyGhastHarnessModel.class)
public class HappyGhastHarnessModel_2046052898Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__863277520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-863277520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;)V", cancellable = true)
    private void setupAnim__2134974121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2134974121L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createHarnessLayer(Z)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createHarnessLayer_1375860371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1375860371L))
            info.setReturnValue(null);
    }


}
