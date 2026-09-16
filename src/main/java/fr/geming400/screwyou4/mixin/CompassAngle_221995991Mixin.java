package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.CompassAngle.class)
public class CompassAngle_221995991Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__1266801250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266801250L))
            info.setReturnValue(4.928296E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1173254664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173254664L))
            info.setReturnValue(null);
    }


}
