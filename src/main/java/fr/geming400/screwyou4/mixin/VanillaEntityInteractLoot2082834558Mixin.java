package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaEntityInteractLoot.class)
public class VanillaEntityInteractLoot2082834558Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__826620479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826620479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_947374583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947374583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2121097300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121097300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_344683668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(344683668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_1769627225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769627225L))
            info.setReturnValue(null);
    }


}
