package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.CompassAngle.class)
public class CompassAngle_221995991Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__789047096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789047096L))
            info.setReturnValue(6.5628E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1957849714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1957849714L))
            info.setReturnValue(null);
    }


}
