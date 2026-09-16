package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.LandRandomPos.class)
public class LandRandomPos959762712Mixin {
        @Inject(at = @At("HEAD"), method = "getPos(Lnet/minecraft/world/entity/PathfinderMob;IILjava/util/function/ToDoubleFunction;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPos__482868594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482868594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos(Lnet/minecraft/world/entity/PathfinderMob;II)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPos_671211040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671211040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosAway(Lnet/minecraft/world/entity/PathfinderMob;DDILnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosAway__1565716763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565716763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosAway(Lnet/minecraft/world/entity/PathfinderMob;IILnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosAway__1459740756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459740756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomPosTowardDirection(Lnet/minecraft/world/entity/PathfinderMob;DZLnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomPosTowardDirection_394143782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394143782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "movePosUpOutOfSolid(Lnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void movePosUpOutOfSolid__155323276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155323276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosTowards(Lnet/minecraft/world/entity/PathfinderMob;IILnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosTowards__53180450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53180450L))
            info.setReturnValue(null);
    }


}
