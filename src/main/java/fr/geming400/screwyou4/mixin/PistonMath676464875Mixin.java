package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.PistonMath.class)
public class PistonMath676464875Mixin {
        @Inject(at = @At("HEAD"), method = "getMovementArea(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/core/Direction;D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void getMovementArea_1205645254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205645254L))
            info.setReturnValue(null);
    }


}
