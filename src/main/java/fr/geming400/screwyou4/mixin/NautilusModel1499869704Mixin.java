package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.nautilus.NautilusModel.class)
public class NautilusModel1499869704Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyMesh()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyMesh__1178398294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178398294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_785737540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785737540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBabyBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBabyBodyLayer_785737540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785737540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;)V", cancellable = true)
    private void setupAnim__405895600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-405895600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1409460713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1409460713L))
            info.cancel();
    }


}
