package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.AirRandomPos.class)
public class AirRandomPos_748478721Mixin {
        @Inject(at = @At("HEAD"), method = "getPosTowards(Lnet/minecraft/world/entity/PathfinderMob;IIILnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosTowards__1178534723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178534723L))
            info.setReturnValue(null);
    }


}
