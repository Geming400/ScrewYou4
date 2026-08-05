package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ProvidesTrimMaterial.class)
public class ProvidesTrimMaterial1801352793Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1108102244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1108102244L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_665892818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665892818L))
            info.setReturnValue("RmX개wད;p:U<mgAg_4y䧶GA}6O!D韇dh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1839615535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1839615535L))
            info.setReturnValue(-1517459824);
    }

    @Inject(at = @At("HEAD"), method = "material()Lnet/minecraft/core/Holder;", cancellable = true)
    private void material__944738731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944738731L))
            info.setReturnValue(null);
    }


}
