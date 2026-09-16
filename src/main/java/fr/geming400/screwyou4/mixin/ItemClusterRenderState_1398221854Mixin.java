package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.ItemClusterRenderState.class)
public class ItemClusterRenderState_1398221854Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderedAmount(I)I", cancellable = true)
    private static void getRenderedAmount_2054192023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2054192023L))
            info.setReturnValue(-1097122667);
    }

    @Inject(at = @At("HEAD"), method = "getSeedForItemStack(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getSeedForItemStack__1438865011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1438865011L))
            info.setReturnValue(-363739019);
    }

    @Inject(at = @At("HEAD"), method = "extractItemGroupRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/item/ItemModelResolver;)V", cancellable = true)
    private void extractItemGroupRenderState__1432846863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1432846863L))
            info.cancel();
    }


}
