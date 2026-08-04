package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.SpeleothemThickness.class)
public class SpeleothemThickness956120780Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__179339691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179339691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/SpeleothemThickness;", cancellable = true)
    private static void values__547260031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547260031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/SpeleothemThickness;", cancellable = true)
    private static void valueOf__1559994818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559994818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__179339691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179339691L))
            info.setReturnValue(null);
    }


}
