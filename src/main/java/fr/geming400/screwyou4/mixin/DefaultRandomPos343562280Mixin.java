package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.DefaultRandomPos.class)
public class DefaultRandomPos343562280Mixin {
        @Inject(at = @At("HEAD"), method = "getPosAway(Lnet/minecraft/world/entity/PathfinderMob;IILnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosAway_1692842128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692842128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos(Lnet/minecraft/world/entity/PathfinderMob;II)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPos_384055310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384055310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosTowards(Lnet/minecraft/world/entity/PathfinderMob;IILnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosTowards__1874133898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1874133898L))
            info.setReturnValue(null);
    }


}
