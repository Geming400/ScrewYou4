package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.zombie.ZombieVillagerModel.class)
public class ZombieVillagerModel58471567Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1845183042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845183042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms_943602484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(943602484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "translateToArms(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V", cancellable = true)
    private void translateToArms__2012671235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2012671235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNoHatLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createNoHatLayer_437887230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437887230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createArmorLayerSet(Lnet/minecraft/client/model/geom/builders/CubeDeformation;Lnet/minecraft/client/model/geom/builders/CubeDeformation;)Lnet/minecraft/client/renderer/entity/ArmorModelSet;", cancellable = true)
    private static void createArmorLayerSet__1599095291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599095291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_742120112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(742120112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim__356614381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-356614381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/ZombieVillagerRenderState;)V", cancellable = true)
    private void setupAnim__1093203870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1093203870L))
            info.cancel();
    }


}
