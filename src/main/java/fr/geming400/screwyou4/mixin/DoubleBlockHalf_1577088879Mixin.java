package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.DoubleBlockHalf.class)
public class DoubleBlockHalf_1577088879Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_441628407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441628407L))
            info.setReturnValue("ig|>%xuQd6yVd");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/DoubleBlockHalf;", cancellable = true)
    private static void values__41632386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-41632386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/DoubleBlockHalf;", cancellable = true)
    private static void valueOf_53053627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53053627L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.DoubleBlockHalf.UPPER);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_441628407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441628407L))
            info.setReturnValue("ig|>%xuQd6yVd");
    }

    @Inject(at = @At("HEAD"), method = "getOtherHalf()Lnet/minecraft/world/level/block/state/properties/DoubleBlockHalf;", cancellable = true)
    private void getOtherHalf_602034829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602034829L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.DoubleBlockHalf.LOWER);
    }

    @Inject(at = @At("HEAD"), method = "getDirectionToOther()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirectionToOther_814233593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(814233593L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }


}
