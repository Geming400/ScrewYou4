package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrySetBuilder.PatchedRegistries.class)
public class PatchedRegistries30708344Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__877917924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877917924L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_801131869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801131869L))
            info.setReturnValue("ZV>\u217A=f\u1B09C1H'mXO:-*-;\u414FVpgK*IrNViX\u293Azjn\uB63F\uAFE0\u3454h`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_588060435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(588060435L))
            info.setReturnValue(1195040987);
    }

    @Inject(at = @At("HEAD"), method = "patches()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void patches__1975130935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975130935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "full()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void full__207001438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207001438L))
            info.setReturnValue(null);
    }


}
