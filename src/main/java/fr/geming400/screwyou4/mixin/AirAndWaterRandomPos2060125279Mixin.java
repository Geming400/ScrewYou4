package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.AirAndWaterRandomPos.class)
public class AirAndWaterRandomPos2060125279Mixin {
        @Inject(at = @At("HEAD"), method = "getPos(Lnet/minecraft/world/entity/PathfinderMob;IIIDDD)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPos_2041747970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041747970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomPos(Lnet/minecraft/world/entity/PathfinderMob;IIIDDDZ)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomPos__1154822930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1154822930L))
            info.setReturnValue(null);
    }


}
