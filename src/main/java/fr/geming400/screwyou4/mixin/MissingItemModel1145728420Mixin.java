package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.MissingItemModel.class)
public class MissingItemModel1145728420Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/item/ItemModelResolver;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void update__2045982191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2045982191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withTransform(Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/MissingItemModel;", cancellable = true)
    private void withTransform_1866438801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866438801L))
            info.setReturnValue(null);
    }


}
