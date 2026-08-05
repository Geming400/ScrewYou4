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
            info.setReturnValue("OcD\"UmYV93v.HM\u3388;\"`\u49727n\u28E3Fu(Z\uFA4B,oEO\u5D026t\uD7CC!]D\uA350TCy3f+\u5990(\u708Foxax'Q3=\"\uC507x[\u3E00_0M-Z\uFEA0@WjzN ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1327820350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327820350L))
            info.setReturnValue(190123778);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required_1327836191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1327836191L))
            info.setReturnValue(false);
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


}
