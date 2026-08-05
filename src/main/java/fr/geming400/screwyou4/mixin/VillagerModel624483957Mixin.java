package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.npc.VillagerModel.class)
public class VillagerModel624483957Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead__2145260454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145260454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms__1782312125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1782312125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms_1376505984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1376505984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNoHatModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createNoHatModel__2053784041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053784041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyModel__2053784041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053784041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2010120836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2010120836L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;)V", cancellable = true)
    private void setupAnim__359359376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-359359376L))
            info.cancel();
    }


}
