package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.ComparatorMode.class)
public class ComparatorMode362898501Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__772561970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772561970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/ComparatorMode;", cancellable = true)
    private static void values__10760145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10760145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/ComparatorMode;", cancellable = true)
    private static void valueOf__561895086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-561895086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__772561970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772561970L))
            info.setReturnValue(null);
    }


}
