package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.ExperimentalRedstoneUtils.class)
public class ExperimentalRedstoneUtils_1633851353Mixin {
        @Inject(at = @At("HEAD"), method = "initialOrientation(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private static void initialOrientation_616386822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616386822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withFront(Lnet/minecraft/world/level/redstone/Orientation;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/redstone/Orientation;", cancellable = true)
    private static void withFront__536388413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536388413L))
            info.setReturnValue(null);
    }


}
