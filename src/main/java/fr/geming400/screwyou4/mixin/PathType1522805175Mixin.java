package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.PathType.class)
public class PathType1522805175Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void values_1155621587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155621587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void valueOf__795357514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-795357514L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.LEAVES);
    }

    @Inject(at = @At("HEAD"), method = "getMalus()F", cancellable = true)
    private void getMalus_1561064538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1561064538L))
            info.setReturnValue(7.620763E8F);
    }


}
