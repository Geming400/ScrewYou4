package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.SpawnConditions.class)
public class SpawnConditions_2073327451Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap__1204837190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1204837190L))
            info.setReturnValue(null);
    }


}
