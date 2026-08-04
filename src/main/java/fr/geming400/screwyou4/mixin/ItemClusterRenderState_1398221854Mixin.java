package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.ItemClusterRenderState.class)
public class ItemClusterRenderState_1398221854Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderedAmount(I)I", cancellable = true)
    private static void getRenderedAmount__1682840716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682840716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSeedForItemStack(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getSeedForItemStack__1162226400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162226400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractItemGroupRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/item/ItemModelResolver;)V", cancellable = true)
    private void extractItemGroupRenderState_288726529(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(288726529L))
            info.cancel();
    }


}
