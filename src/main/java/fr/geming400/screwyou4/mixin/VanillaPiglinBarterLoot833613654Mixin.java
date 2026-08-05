package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaPiglinBarterLoot.class)
public class VanillaPiglinBarterLoot833613654Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2075841383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075841383L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__301846321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301846321L))
            info.setReturnValue("d@_p\uC836+su`#oXlyK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_871876396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871876396L))
            info.setReturnValue(595410017);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__904537236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-904537236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_520406321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520406321L))
            info.setReturnValue(null);
    }


}
