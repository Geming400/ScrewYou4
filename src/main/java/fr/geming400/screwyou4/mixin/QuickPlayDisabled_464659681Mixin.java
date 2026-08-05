package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayDisabled.class)
public class QuickPlayDisabled_464659681Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1850171939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1850171939L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__670800295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670800295L))
            info.setReturnValue("t]&(X<UM6hxI0;&;L\u5719ZXma?>N{\uC82Ch\u1937Lir\u865BZf9\u76691W\uFF0D\u78F7z?5S\uA3097rB'8H'<% =xYgxcru+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_502922422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502922422L))
            info.setReturnValue(186882401);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_502938263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502938263L))
            info.setReturnValue(false);
    }


}
