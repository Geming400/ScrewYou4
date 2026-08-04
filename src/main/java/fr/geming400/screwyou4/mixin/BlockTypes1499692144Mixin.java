package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BlockTypes.class)
public class BlockTypes1499692144Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void bootstrap_2094281314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2094281314L))
            info.setReturnValue(null);
    }


}
