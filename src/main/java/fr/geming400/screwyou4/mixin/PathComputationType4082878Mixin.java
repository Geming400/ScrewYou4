package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.PathComputationType.class)
public class PathComputationType4082878Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/pathfinder/PathComputationType;", cancellable = true)
    private static void values_782998953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782998953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/pathfinder/PathComputationType;", cancellable = true)
    private static void valueOf_1742337510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742337510L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathComputationType.AIR);
    }


}
