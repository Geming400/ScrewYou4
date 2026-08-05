package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugScreenProfile.class)
public class DebugScreenProfile2084507914Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/debug/DebugScreenProfile;", cancellable = true)
    private static void values_1507296620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507296620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/debug/DebugScreenProfile;", cancellable = true)
    private static void valueOf__417313101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417313101L))
            info.setReturnValue(net.minecraft.client.gui.components.debug.DebugScreenProfile.PERFORMANCE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__2122250760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2122250760L))
            info.setReturnValue("fF");
    }

    @Inject(at = @At("HEAD"), method = "translationKey()Ljava/lang/String;", cancellable = true)
    private void translationKey__1972145151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972145151L))
            info.setReturnValue("\uC9EE+\u1491P^Z\u1DB4u_\u1116\u8291>;k|bb9\u4DB2#,^bC\u2DBEb|msi!\"ad+wD\u94B321sE\uD501:)k8EE#qp\uD7BEJ\u539E");
    }


}
