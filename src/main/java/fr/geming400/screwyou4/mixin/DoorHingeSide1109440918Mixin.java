package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.DoorHingeSide.class)
public class DoorHingeSide1109440918Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__26019553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26019553L))
            info.setReturnValue("8&&a\uD283;6^vh!\u9CE0tj&$*");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/DoorHingeSide;", cancellable = true)
    private static void values_226841985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226841985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/DoorHingeSide;", cancellable = true)
    private static void valueOf__345125890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-345125890L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.DoorHingeSide.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__26019553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26019553L))
            info.setReturnValue("8&&a\uD283;6^vh!\u9CE0tj&$*");
    }


}
