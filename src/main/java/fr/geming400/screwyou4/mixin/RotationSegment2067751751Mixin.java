package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.RotationSegment.class)
public class RotationSegment2067751751Mixin {
        @Inject(at = @At("HEAD"), method = "getMaxSegmentIndex()I", cancellable = true)
    private static void getMaxSegmentIndex_2106014245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106014245L))
            info.setReturnValue(-1234828051);
    }

    @Inject(at = @At("HEAD"), method = "convertToSegment(F)I", cancellable = true)
    private static void convertToSegment__1016081381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016081381L))
            info.setReturnValue(-799781198);
    }

    @Inject(at = @At("HEAD"), method = "convertToSegment(Lnet/minecraft/core/Direction;)I", cancellable = true)
    private static void convertToSegment_947813425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947813425L))
            info.setReturnValue(700972450);
    }

    @Inject(at = @At("HEAD"), method = "convertToDirection(I)Ljava/util/Optional;", cancellable = true)
    private static void convertToDirection__1382004524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382004524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertToDegrees(I)F", cancellable = true)
    private static void convertToDegrees__1013313701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013313701L))
            info.setReturnValue(6.259358E8F);
    }


}
