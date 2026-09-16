package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.npc.VillagerModel.class)
public class VillagerModel624483957Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead_1020876612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020876612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms__1446658845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1446658845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms_1816760864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1816760864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBodyModel__2011903764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2011903764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNoHatModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createNoHatModel__2076803668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076803668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1308132502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1308132502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/VillagerRenderState;)V", cancellable = true)
    private void setupAnim__2067771646(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2067771646L))
            info.cancel();
    }


}
