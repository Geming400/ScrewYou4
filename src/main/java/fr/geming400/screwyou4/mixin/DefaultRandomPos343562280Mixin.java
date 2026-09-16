package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.DefaultRandomPos.class)
public class DefaultRandomPos343562280Mixin {
        @Inject(at = @At("HEAD"), method = "getPos(Lnet/minecraft/world/entity/PathfinderMob;II)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPos_55010608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(55010608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosAway(Lnet/minecraft/world/entity/PathfinderMob;IILnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosAway__2075941188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075941188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosTowards(Lnet/minecraft/world/entity/PathfinderMob;IILnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosTowards__2088603176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088603176L))
            info.setReturnValue(null);
    }


}
