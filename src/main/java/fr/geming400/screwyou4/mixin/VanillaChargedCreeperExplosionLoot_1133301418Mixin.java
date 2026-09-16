package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaChargedCreeperExplosionLoot.class)
public class VanillaChargedCreeperExplosionLoot_1133301418Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_224675149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224675149L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1903724942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903724942L))
            info.setReturnValue("hV\u0F81SVV6'P.G&3,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1690653508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690653508L))
            info.setReturnValue(-1642243696);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_870840756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(870840756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__1432423713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432423713L))
            info.setReturnValue(null);
    }


}
