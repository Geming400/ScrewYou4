package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.AirRandomPos.class)
public class AirRandomPos_748478721Mixin {
        @Inject(at = @At("HEAD"), method = "getPosTowards(Lnet/minecraft/world/entity/PathfinderMob;IIILnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosTowards_762852251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762852251L))
            info.setReturnValue(null);
    }


}
