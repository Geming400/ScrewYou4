package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.WidgetSprites.class)
public class WidgetSprites_332222836Mixin {
        @Inject(at = @At("HEAD"), method = "get(ZZ)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void get_499224400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499224400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__576403433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-576403433L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1102646360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102646360L))
            info.setReturnValue("-\u8501 jW\u862Do0\uB023o^2v]1\"]gxF\"GE=\u022BuEuY<sE'+?W\u5B5AwpCE\"GKXp\uCC0F\u973C@Y'SKX{I=30}>'h");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_889574926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889574926L))
            info.setReturnValue(251447870);
    }

    @Inject(at = @At("HEAD"), method = "enabled()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void enabled_1396869883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396869883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disabledFocused()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void disabledFocused__1569471723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569471723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFocused()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void enabledFocused_1391395760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1391395760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disabled()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void disabled_1537745718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1537745718L))
            info.setReturnValue(null);
    }


}
