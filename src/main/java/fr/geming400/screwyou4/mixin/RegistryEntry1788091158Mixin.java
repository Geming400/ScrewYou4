package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistryAccess.RegistryEntry.class)
public class RegistryEntry1788091158Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/core/Registry;", cancellable = true)
    private void value_1274235681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1274235681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1121363879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121363879L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_652631183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652631183L))
            info.setReturnValue("*o⌴X0.?=p,Z钬瞗cR埚");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1826353900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1826353900L))
            info.setReturnValue(-1010747017);
    }

    @Inject(at = @At("HEAD"), method = "key()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void key__1698384825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698384825L))
            info.setReturnValue(null);
    }


}
