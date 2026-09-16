package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.Climate.class)
public class Climate_753552969Mixin {
        @Inject(at = @At("HEAD"), method = "target(FFFFFF)Lnet/minecraft/world/level/biome/Climate$TargetPoint;", cancellable = true)
    private static void target_1387293470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1387293470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/level/biome/Climate$Sampler;", cancellable = true)
    private static void empty_2037153721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037153721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parameters(Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;Lnet/minecraft/world/level/biome/Climate$Parameter;F)Lnet/minecraft/world/level/biome/Climate$ParameterPoint;", cancellable = true)
    private static void parameters__1140458179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140458179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parameters(FFFFFFF)Lnet/minecraft/world/level/biome/Climate$ParameterPoint;", cancellable = true)
    private static void parameters__1808739459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808739459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unquantizeCoord(J)F", cancellable = true)
    private static void unquantizeCoord_53517288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53517288L))
            info.setReturnValue(4.724596E8F);
    }

    @Inject(at = @At("HEAD"), method = "findSpawnPosition(Ljava/util/List;Lnet/minecraft/world/level/biome/Climate$Sampler;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void findSpawnPosition__939915212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-939915212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "quantizeCoord(F)J", cancellable = true)
    private static void quantizeCoord__1182401503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182401503L))
            info.setReturnValue(-885912319776813280L);
    }


}
