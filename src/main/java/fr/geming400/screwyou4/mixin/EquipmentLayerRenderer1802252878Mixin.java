package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.EquipmentLayerRenderer.class)
public class EquipmentLayerRenderer1802252878Mixin {
        @Inject(at = @At("HEAD"), method = "renderLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lnet/minecraft/world/item/ItemStack;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;II)V", cancellable = true)
    private void renderLayers__1662024703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1662024703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderLayers(Lnet/minecraft/client/resources/model/EquipmentClientInfo$LayerType;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lnet/minecraft/world/item/ItemStack;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;II)V", cancellable = true)
    private void renderLayers__180203390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-180203390L))
            info.cancel();
    }


}
