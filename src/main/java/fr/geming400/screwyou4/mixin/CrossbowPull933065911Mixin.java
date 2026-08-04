package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.CrossbowPull.class)
public class CrossbowPull933065911Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__77977175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77977175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1626047661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626047661L))
            info.setReturnValue(null);
    }


}
