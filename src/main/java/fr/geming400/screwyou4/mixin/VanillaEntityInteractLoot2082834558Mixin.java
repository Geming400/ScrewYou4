package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaEntityInteractLoot.class)
public class VanillaEntityInteractLoot2082834558Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1174208290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174208290L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1441709213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1441709213L))
            info.setReturnValue("{*|7?igIF'}^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1654780647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654780647L))
            info.setReturnValue(991802852);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_1820373897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1820373897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__482890572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482890572L))
            info.setReturnValue(null);
    }


}
