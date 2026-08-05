package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.Cod.class)
public class Cod_864469974Mixin {
        @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_1068818734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068818734L))
            info.setReturnValue(null);
    }


}
