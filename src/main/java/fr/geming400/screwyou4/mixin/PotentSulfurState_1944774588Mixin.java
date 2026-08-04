package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.PotentSulfurState.class)
public class PotentSulfurState_1944774588Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_809314116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809314116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/PotentSulfurState;", cancellable = true)
    private static void values_762363448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762363448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/PotentSulfurState;", cancellable = true)
    private static void valueOf_1561308725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1561308725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_809314116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809314116L))
            info.setReturnValue(null);
    }


}
