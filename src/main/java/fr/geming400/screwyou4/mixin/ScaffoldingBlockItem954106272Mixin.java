package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ScaffoldingBlockItem.class)
public class ScaffoldingBlockItem954106272Mixin {
        @Inject(at = @At("HEAD"), method = "updatePlacementContext(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/item/context/BlockPlaceContext;", cancellable = true)
    private void updatePlacementContext_39039730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39039730L))
            info.setReturnValue(null);
    }


}
