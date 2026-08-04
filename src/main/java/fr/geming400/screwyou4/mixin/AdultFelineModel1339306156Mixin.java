package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.feline.AdultFelineModel.class)
public class AdultFelineModel1339306156Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyMesh(Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyMesh_672325468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672325468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1570024261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1570024261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/FelineRenderState;)V", cancellable = true)
    private void setupAnim_874709780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(874709780L))
            info.cancel();
    }


}
