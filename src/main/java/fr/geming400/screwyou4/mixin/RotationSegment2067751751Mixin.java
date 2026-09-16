package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.RotationSegment.class)
public class RotationSegment2067751751Mixin {
        @Inject(at = @At("HEAD"), method = "getMaxSegmentIndex()I", cancellable = true)
    private static void getMaxSegmentIndex__753703016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753703016L))
            info.setReturnValue(-1128580724);
    }

    @Inject(at = @At("HEAD"), method = "convertToDegrees(I)F", cancellable = true)
    private static void convertToDegrees_17506388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(17506388L))
            info.setReturnValue(3.130289E8F);
    }

    @Inject(at = @At("HEAD"), method = "convertToDirection(I)Ljava/util/Optional;", cancellable = true)
    private static void convertToDirection__1914831261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914831261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertToSegment(F)I", cancellable = true)
    private static void convertToSegment_284155936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284155936L))
            info.setReturnValue(-168200942);
    }

    @Inject(at = @At("HEAD"), method = "convertToSegment(Lnet/minecraft/core/Direction;)I", cancellable = true)
    private static void convertToSegment__160871860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160871860L))
            info.setReturnValue(1941444383);
    }


}
