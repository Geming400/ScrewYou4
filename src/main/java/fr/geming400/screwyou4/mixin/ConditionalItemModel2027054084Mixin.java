package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ConditionalItemModel.class)
public class ConditionalItemModel2027054084Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/client/renderer/item/ItemStackRenderState;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/renderer/item/ItemModelResolver;Lnet/minecraft/world/item/ItemDisplayContext;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)V", cancellable = true)
    private void update__1899527960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1899527960L))
            info.cancel();
    }


}
