package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.SurfaceRuleData.class)
public class SurfaceRuleData_1261617243Mixin {
        @Inject(at = @At("HEAD"), method = "end()Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void end__1413434063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1413434063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nether(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void nether_1356252154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1356252154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "air()Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void air_1782951328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782951328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworld(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void overworld_1213550036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213550036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworldLike(Lnet/minecraft/core/HolderGetter;ZZZ)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void overworldLike__1811164603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811164603L))
            info.setReturnValue(null);
    }


}
