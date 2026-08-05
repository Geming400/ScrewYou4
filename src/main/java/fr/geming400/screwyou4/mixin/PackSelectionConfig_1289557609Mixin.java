package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PackSelectionConfig.class)
public class PackSelectionConfig_1289557609Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1619897429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619897429L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_154097633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154097633L))
            info.setReturnValue("OcD\"UmYV93v.HM㎈;\"`䥲7n⣣Fu(Z碑,oEO崂6tퟌ!]DꍐTCy3f+妐(炏oxax'Q3=\"씇x[㸀_0M-Zﺠ@WjzN ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1327820350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327820350L))
            info.setReturnValue(500425678);
    }

    @Inject(at = @At("HEAD"), method = "defaultPosition()Lnet/minecraft/server/packs/repository/Pack$Position;", cancellable = true)
    private void defaultPosition_1814999760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814999760L))
            info.setReturnValue(net.minecraft.server.packs.repository.Pack.Position.TOP);
    }

    @Inject(at = @At("HEAD"), method = "fixedPosition()Z", cancellable = true)
    private void fixedPosition_1327836191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327836191L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required_1327836191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327836191L))
            info.setReturnValue(false);
    }


}
