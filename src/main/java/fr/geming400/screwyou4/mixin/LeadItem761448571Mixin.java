package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.LeadItem.class)
public class LeadItem761448571Mixin {
        @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1147394684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1147394684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bindPlayerMobs(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private static void bindPlayerMobs__442763911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-442763911L))
            info.setReturnValue(null);
    }


}
