package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.TriState.class)
public class TriState_1483667140Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/TriState;", cancellable = true)
    private static void values_1571094697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571094697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/TriState;", cancellable = true)
    private static void valueOf__1967122814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967122814L))
            info.setReturnValue(net.minecraft.util.TriState.FALSE);
    }

    @Inject(at = @At("HEAD"), method = "from(Z)Lnet/minecraft/util/TriState;", cancellable = true)
    private static void from_668294100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(668294100L))
            info.setReturnValue(net.minecraft.util.TriState.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "toBoolean(Z)Z", cancellable = true)
    private void toBoolean_1350757361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350757361L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1571875761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571875761L))
            info.setReturnValue("<8");
    }


}
