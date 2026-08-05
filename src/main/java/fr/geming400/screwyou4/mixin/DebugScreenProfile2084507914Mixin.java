package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugScreenProfile.class)
public class DebugScreenProfile2084507914Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/debug/DebugScreenProfile;", cancellable = true)
    private static void values__327500338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327500338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/debug/DebugScreenProfile;", cancellable = true)
    private static void valueOf__1172787317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172787317L))
            info.setReturnValue(net.minecraft.client.gui.components.debug.DebugScreenProfile.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_949047443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949047443L))
            info.setReturnValue("3F;e|\u3E78sdy&CIWRxvVr");
    }

    @Inject(at = @At("HEAD"), method = "translationKey()Ljava/lang/String;", cancellable = true)
    private void translationKey_949047443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949047443L))
            info.setReturnValue("3F;e|\u3E78sdy&CIWRxvVr");
    }


}
