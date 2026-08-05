package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.nautilus.NautilusModel.class)
public class NautilusModel1499869704Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyMesh()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyMesh__1221129793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1221129793L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__403784905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403784905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBabyBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBabyBodyLayer__1432834175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432834175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/NautilusRenderState;)V", cancellable = true)
    private void setupAnim__2114307870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2114307870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2111449047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2111449047L))
            info.cancel();
    }


}
