package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.class)
public class Climate_753552969Mixin {
        @Inject(at = @At("HEAD"), method = "target(FFFFFF)Lnet/minecraft/world/level/biome/Climate$TargetPoint;", cancellable = true)
    private static void target_776325839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776325839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/level/biome/Climate$Sampler;", cancellable = true)
    private static void empty_1189138150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189138150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parameters(Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;F)Lnet/minecraft/world/level/biome/Climate$ParameterPoint;", cancellable = true)
    private static void parameters_1960073319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1960073319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parameters(FFFFFFF)Lnet/minecraft/world/level/biome/Climate$ParameterPoint;", cancellable = true)
    private static void parameters__484735577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484735577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quantizeCoord(F)J", cancellable = true)
    private static void quantizeCoord_1964688093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964688093L))
            info.setReturnValue(-3669361659001140839L);
    }

    @Inject(at = @At("HEAD"), method = "unquantizeCoord(J)F", cancellable = true)
    private static void unquantizeCoord_1968378333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968378333L))
            info.setReturnValue(8.624082E8F);
    }

    @Inject(at = @At("HEAD"), method = "findSpawnPosition(Ljava/util/List;Lnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void findSpawnPosition__28152215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28152215L))
            info.setReturnValue(null);
    }


}
