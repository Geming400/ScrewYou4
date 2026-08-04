package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.MissingItemModel.class)
public class MissingItemModel1145728420Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/item/ItemModelResolver;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void update_1514113672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1514113672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withTransform(Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/item/MissingItemModel;", cancellable = true)
    private void withTransform__428933097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428933097L))
            info.setReturnValue(null);
    }


}
