package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.VillagerProfessionLayer.class)
public class VillagerProfessionLayer_816372671Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;FF)V", cancellable = true)
    private void submit__1837316520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1837316520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit_358609039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(358609039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHatData(Lit/unimi/dsi/fastutil/objects/Object2ObjectMap;Ljava/lang/String;Lnet/minecraft/core/Holder;)Lnet/minecraft/client/resources/metadata/animation/VillagerMetadataSection$Hat;", cancellable = true)
    private void getHatData__1770114820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770114820L))
            info.setReturnValue(null);
    }


}
