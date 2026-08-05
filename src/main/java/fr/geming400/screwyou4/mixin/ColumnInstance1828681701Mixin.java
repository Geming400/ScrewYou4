package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.WeatherEffectRenderer.ColumnInstance.class)
public class ColumnInstance1828681701Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1080773336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1080773336L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_693221726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693221726L))
            info.setReturnValue("O6-VOs1U\u7C3D!NnR:=\u1BEA,\u638C#y2Q,+({AW\u8BD6m22&\uCBBD!pN<w4$\"\u08EB!5>-VaZtTT\u84A51t+'-Glh\u87D0T;\uFC65R6cb;kxh>k\u7378@0:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1866944443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866944443L))
            info.setReturnValue(1035119129);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_1866943947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866943947L))
            info.setReturnValue(1213642619);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_1866943947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866943947L))
            info.setReturnValue(1213642619);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords_1866943947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866943947L))
            info.setReturnValue(1213642619);
    }

    @Inject(at = @At("HEAD"), method = "topY()I", cancellable = true)
    private void topY_1866943947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866943947L))
            info.setReturnValue(1213642619);
    }

    @Inject(at = @At("HEAD"), method = "bottomY()I", cancellable = true)
    private void bottomY_1866943947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866943947L))
            info.setReturnValue(1213642619);
    }

    @Inject(at = @At("HEAD"), method = "vOffset()F", cancellable = true)
    private void vOffset_1866941064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866941064L))
            info.setReturnValue(6.196849E8F);
    }

    @Inject(at = @At("HEAD"), method = "uOffset()F", cancellable = true)
    private void uOffset_1866941064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866941064L))
            info.setReturnValue(6.196849E8F);
    }


}
