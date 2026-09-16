package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Direction8.class)
public class Direction8_1261866891Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/Direction8;", cancellable = true)
    private static void values__739521606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-739521606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/Direction8;", cancellable = true)
    private static void valueOf_647548755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(647548755L))
            info.setReturnValue(net.minecraft.core.Direction8.NORTH_WEST);
    }

    @Inject(at = @At("HEAD"), method = "getDirections()Ljava/util/Set;", cancellable = true)
    private void getDirections__1063307102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063307102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStepX()I", cancellable = true)
    private void getStepX__562408998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562408998L))
            info.setReturnValue(-1958372934);
    }

    @Inject(at = @At("HEAD"), method = "getStepZ()I", cancellable = true)
    private void getStepZ__505150696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505150696L))
            info.setReturnValue(1025356952);
    }


}
