package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer.class)
public class HumanoidArmorLayer_1740427273Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/HumanoidRenderState;FF)V", cancellable = true)
    private void submit_214418315(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(214418315L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/EntityRenderState;FF)V", cancellable = true)
    private void submit__1179030799(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1179030799L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/EquipmentSlot;)Z", cancellable = true)
    private static void shouldRender__1106916143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1106916143L))
            info.setReturnValue(false);
    }


}
