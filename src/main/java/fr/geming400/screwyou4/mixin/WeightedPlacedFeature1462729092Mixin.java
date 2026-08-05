package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature.class)
public class WeightedPlacedFeature1462729092Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_554102824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554102824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2061814679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061814679L))
            info.setReturnValue("84nSq\uC6ADxXY`\u8089\u39EAD4\u372Ava`/6 NTc|2h/{O[\u087DJp`F96.J)IOG\u51BF][\u4C92EA*NU*f\u4D5ELq9>GQ\uB4A5x");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2020081183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020081183L))
            info.setReturnValue(-1091301841);
    }

    @Inject(at = @At("HEAD"), method = "feature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void feature__1771235382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771235382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chance()F", cancellable = true)
    private void chance_500175219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500175219L))
            info.setReturnValue(1.218826E8F);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void place__1289513138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1289513138L))
            info.setReturnValue(false);
    }


}
