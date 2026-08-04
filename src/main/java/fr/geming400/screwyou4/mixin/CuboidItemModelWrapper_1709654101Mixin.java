package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.CuboidItemModelWrapper.class)
public class CuboidItemModelWrapper_1709654101Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/item/ItemModelResolver;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void update_2078039352(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2078039352L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeExtents(Ljava/util/List;)[Lorg/joml/Vector3fc;", cancellable = true)
    private static void computeExtents__951188553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951188553L))
            info.setReturnValue(null);
    }


}
