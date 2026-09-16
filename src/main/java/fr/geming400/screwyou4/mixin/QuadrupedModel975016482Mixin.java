package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.QuadrupedModel.class)
public class QuadrupedModel975016482Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyMesh(IZZLnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyMesh_793255958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793255958L))
            info.setReturnValue(new net.minecraft.client.model.geom.builders.MeshDefinition());
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_1678608213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1678608213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1658665027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1658665027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLegs(Lnet/minecraft/client/model/geom/builders/PartDefinition;ZZILnet/minecraft/client/model/geom/builders/CubeDeformation;)V", cancellable = true)
    private static void createLegs_988180956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(988180956L))
            info.cancel();
    }


}
