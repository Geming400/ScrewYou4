package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.zombie.ZombieVillagerModel.class)
public class ZombieVillagerModel58471567Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__655660597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655660597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms__584044140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-584044140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms_1946642781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1946642781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createArmorLayerSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createArmorLayerSet__994145295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994145295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNoHatLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createNoHatLayer__655660597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655660597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1444108446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1444108446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_1351797889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351797889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;)V", cancellable = true)
    private void setupAnim_1886063440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1886063440L))
            info.cancel();
    }


}
