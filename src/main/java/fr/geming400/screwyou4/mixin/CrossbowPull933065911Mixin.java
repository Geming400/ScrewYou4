package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.CrossbowPull.class)
public class CrossbowPull933065911Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__555731329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555731329L))
            info.setReturnValue(8.317253E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__462184743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462184743L))
            info.setReturnValue(null);
    }


}
