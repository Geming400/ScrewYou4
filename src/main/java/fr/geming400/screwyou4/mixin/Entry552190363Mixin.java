package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.MapDecorations.Entry.class)
public class Entry552190363Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/Holder;", cancellable = true)
    private void type_2101066135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101066135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1937702622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937702622L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__583269612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-583269612L))
            info.setReturnValue("wꎎ5Qbj4'PY'5F&MT(ZIhm紳y[)mLvoOr݁㧢ZAtA#}䭺s7穛V_H9㢓w\"u&FWFb95J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_590453105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590453105L))
            info.setReturnValue(661407122);
    }

    @Inject(at = @At("HEAD"), method = "x()D", cancellable = true)
    private void x_590447804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590447804L))
            info.setReturnValue(7.184528003378804E8D);
    }

    @Inject(at = @At("HEAD"), method = "z()D", cancellable = true)
    private void z_590447804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590447804L))
            info.setReturnValue(7.184528003378804E8D);
    }

    @Inject(at = @At("HEAD"), method = "rotation()F", cancellable = true)
    private void rotation_590449726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590449726L))
            info.setReturnValue(7.184528E8F);
    }


}
