package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.QuadrupedModel.class)
public class QuadrupedModel975016482Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyMesh(IZZLnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyMesh_1117384715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117384715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_50425283(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(50425283L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1934313935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1934313935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLegs(Lnet/minecraft/client/model/geom/builders/PartDefinition;ZZILnet/minecraft/client/model/geom/builders/CubeDeformation;)V", cancellable = true)
    private static void createLegs_1542159805(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1542159805L))
            info.cancel();
    }


}
