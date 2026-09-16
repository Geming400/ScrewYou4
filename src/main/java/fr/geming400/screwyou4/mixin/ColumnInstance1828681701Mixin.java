package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.WeatherEffectRenderer.ColumnInstance.class)
public class ColumnInstance1828681701Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_920055433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920055433L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1695862070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1695862070L))
            info.setReturnValue("he[,v>DF\uC0B8ilp>H*l7E\"z#/IF67<C\u7677lTr3Y\u92FEOYz/Kqrv5&8v<f&n 5CJe\uC9D7t\uD516-I =(Yx}^dxhY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1908933504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1908933504L))
            info.setReturnValue(90643987);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_1007474771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007474771L))
            info.setReturnValue(829863082);
    }

    @Inject(at = @At("HEAD"), method = "z()I", cancellable = true)
    private void z_1064733073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064733073L))
            info.setReturnValue(1943015882);
    }

    @Inject(at = @At("HEAD"), method = "topY()I", cancellable = true)
    private void topY_1703234215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703234215L))
            info.setReturnValue(54309264);
    }

    @Inject(at = @At("HEAD"), method = "bottomY()I", cancellable = true)
    private void bottomY__112940291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-112940291L))
            info.setReturnValue(-826930611);
    }

    @Inject(at = @At("HEAD"), method = "uOffset()F", cancellable = true)
    private void uOffset__1652490720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652490720L))
            info.setReturnValue(2.887839E8F);
    }

    @Inject(at = @At("HEAD"), method = "vOffset()F", cancellable = true)
    private void vOffset__1523408001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523408001L))
            info.setReturnValue(2.887839E8F);
    }

    @Inject(at = @At("HEAD"), method = "lightCoords()I", cancellable = true)
    private void lightCoords__1818847881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818847881L))
            info.setReturnValue(-862312800);
    }


}
