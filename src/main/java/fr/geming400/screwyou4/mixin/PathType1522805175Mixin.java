package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.PathType.class)
public class PathType1522805175Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void values__1678896395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678896395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private static void valueOf_666551438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666551438L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.RAIL);
    }

    @Inject(at = @At("HEAD"), method = "getMalus()F", cancellable = true)
    private void getMalus_1089812506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089812506L))
            info.setReturnValue(2.03299E7F);
    }


}
