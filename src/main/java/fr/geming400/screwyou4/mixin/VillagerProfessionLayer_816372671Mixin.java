package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.VillagerProfessionLayer.class)
public class VillagerProfessionLayer_816372671Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit__2103085401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2103085401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;FF)V", cancellable = true)
    private void submit__1331996048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1331996048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHatData(Lit/unimi/dsi/fastutil/objects/Object2ObjectMap;Ljava/lang/String;Lnet/minecraft/core/Holder;)Lnet/minecraft/client/resources/metadata/animation/VillagerMetadataSection$Hat;", cancellable = true)
    private void getHatData_1481307051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1481307051L))
            info.setReturnValue(net.minecraft.client.resources.metadata.animation.VillagerMetadataSection.Hat.NONE);
    }


}
