package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaGiftLoot.class)
public class VanillaGiftLoot1891083509Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_982457241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982457241L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1633460262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1633460262L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1846531696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846531696L))
            info.setReturnValue(359025925);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_1628622848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1628622848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__674641621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-674641621L))
            info.setReturnValue(null);
    }


}
