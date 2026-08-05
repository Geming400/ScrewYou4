package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.SurfaceRuleData.class)
public class SurfaceRuleData_1261617243Mixin {
        @Inject(at = @At("HEAD"), method = "end()Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void end__114064298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114064298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "air()Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void air__114064298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114064298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworld(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void overworld_685392210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685392210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overworldLike(Lnet/minecraft/core/HolderGetter;ZZZ)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void overworldLike__454428464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454428464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nether(Lnet/minecraft/core/HolderGetter;)Lnet/minecraft/world/level/levelgen/SurfaceRules$RuleSource;", cancellable = true)
    private static void nether_685392210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685392210L))
            info.setReturnValue(null);
    }


}
