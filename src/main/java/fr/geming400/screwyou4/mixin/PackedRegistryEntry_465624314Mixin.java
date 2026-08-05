package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrySynchronization.PackedRegistryEntry.class)
public class PackedRegistryEntry_465624314Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1851136572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1851136572L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__669835662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669835662L))
            info.setReturnValue("A깔頚<?hur9;BKy#R$TGx|e**SPgZsy\"%xtvyh2r衢&H䂿SnY硨Q>lNhd:;w(8'j7l0Q$?Sၘo穢B,*;X焧⸑,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_503887055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503887055L))
            info.setReturnValue(-1215810460);
    }

    @Inject(at = @At("HEAD"), method = "data()Ljava/util/Optional;", cancellable = true)
    private void data_711085735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711085735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1977442240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977442240L))
            info.setReturnValue(null);
    }


}
