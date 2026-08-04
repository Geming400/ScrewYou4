package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaGiftLoot.class)
public class VanillaGiftLoot1891083509Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1018371528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1018371528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_755623534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755623534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1929346251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929346251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_152932619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(152932619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_1577876176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577876176L))
            info.setReturnValue(null);
    }


}
