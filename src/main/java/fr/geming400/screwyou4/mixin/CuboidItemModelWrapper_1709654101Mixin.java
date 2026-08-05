package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.CuboidItemModelWrapper.class)
public class CuboidItemModelWrapper_1709654101Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/item/ItemModelResolver;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void update__1482056511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1482056511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeExtents(Ljava/util/List;)[Lorg/joml/Vector3fc;", cancellable = true)
    private static void computeExtents_478178725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478178725L))
            info.setReturnValue(null);
    }


}
