package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaArchaeologyLoot.class)
public class VanillaArchaeologyLoot860930281Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2048524756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048524756L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__274529694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-274529694L))
            info.setReturnValue("烝펞IP:.1Dk&WyCg%M'Y}귢eFS9䲸W.q|#/3>W蒣ec <=H&A$C=4$fX TLF%H> G]S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_899193023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899193023L))
            info.setReturnValue(384333306);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate__877220609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-877220609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries_547722948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(547722948L))
            info.setReturnValue(null);
    }


}
