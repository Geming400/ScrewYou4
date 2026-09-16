package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.MouseButtonEvent.class)
public class MouseButtonEvent446433199Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()I", cancellable = true)
    private void modifiers_977498777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(977498777L))
            info.setReturnValue(-2030509279);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__462193069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462193069L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1216856724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1216856724L))
            info.setReturnValue("4tr\"S*$4\uB5A3\u1D96\u66BC{9.0U`\u65A5}1lv}6\u17C9\uA525`%AsF7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1003785290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003785290L))
            info.setReturnValue(-663105036);
    }

    @Inject(at = @At("HEAD"), method = "x()D", cancellable = true)
    private void x__374778536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-374778536L))
            info.setReturnValue(9.932543006909839E8D);
    }

    @Inject(at = @At("HEAD"), method = "input()I", cancellable = true)
    private void input_1780077579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780077579L))
            info.setReturnValue(-839705262);
    }

    @Inject(at = @At("HEAD"), method = "y()D", cancellable = true)
    private void y__346149385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346149385L))
            info.setReturnValue(9.93254300317089E8D);
    }

    @Inject(at = @At("HEAD"), method = "buttonInfo()Lnet/minecraft/client/input/MouseButtonInfo;", cancellable = true)
    private void buttonInfo__2146941587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146941587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "button()I", cancellable = true)
    private void button__1366006365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1366006365L))
            info.setReturnValue(-28431553);
    }


}
