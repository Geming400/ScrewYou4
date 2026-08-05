package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ReloadableServerRegistries.LoadResult.class)
public class LoadResult845901312Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2063553725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063553725L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__289558663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289558663L))
            info.setReturnValue("}gTN೮qPdM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_884164054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884164054L))
            info.setReturnValue(-1999913946);
    }

    @Inject(at = @At("HEAD"), method = "layers()Lnet/minecraft/core/LayeredRegistryAccess;", cancellable = true)
    private void layers__1016118919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016118919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookupWithUpdatedTags()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void lookupWithUpdatedTags_532693979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532693979L))
            info.setReturnValue(null);
    }


}
