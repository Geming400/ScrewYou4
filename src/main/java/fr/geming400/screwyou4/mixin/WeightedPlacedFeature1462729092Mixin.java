package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature.class)
public class WeightedPlacedFeature1462729092Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1446725945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446725945L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_327269117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327269117L))
            info.setReturnValue("9oPআLjoUjVp625즢W|fFFK'QjIS峇zQh4{q渶i3ky篂|3j1&9EzT.E*PX'TsbF1⡂?9376G-?Xwv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1500991834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500991834L))
            info.setReturnValue(-745317408);
    }

    @Inject(at = @At("HEAD"), method = "feature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void feature__1283362432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1283362432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void place__55152953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-55152953L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "chance()F", cancellable = true)
    private void chance_1500988455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500988455L))
            info.setReturnValue(9.542777E8F);
    }


}
