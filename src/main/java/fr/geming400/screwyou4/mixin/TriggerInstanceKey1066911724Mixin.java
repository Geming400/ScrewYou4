package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.PlayerAdvancements.TriggerInstanceKey.class)
public class TriggerInstanceKey1066911724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1842543313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842543313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__68548251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68548251L))
            info.setReturnValue("etu{?;+\u5E07[XUs)\u2DEDl\u2593)ipxP,(#_`_YdJ\u1E10;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1105174466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1105174466L))
            info.setReturnValue(40376730);
    }

    @Inject(at = @At("HEAD"), method = "advancement()Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void advancement__1448414026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1448414026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "criterion()Ljava/lang/String;", cancellable = true)
    private void criterion__68548747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68548747L))
            info.setReturnValue("N\uA79BdkO? _$\uBEF9qSzIU\u2A2FK+}5grJ\u614F>f\u4FB2W;fGjkJjI(Z[bQX*,@J\u85F6Nx+g8s|^ZZ\u4285M25b,c?%sFn7;hjM51\u6D69xz!k|Om'\u93E2PNfjln<");
    }


}
