package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.Cloner.Factory.class)
public class Factory_730729777Mixin {
        @Inject(at = @At("HEAD"), method = "addCodec(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/Codec;)Lnet/minecraft/core/Cloner$Factory;", cancellable = true)
    private void addCodec_1575707272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575707272L))
            info.setReturnValue(new net.minecraft.core.Cloner$Factory());
    }

    @Inject(at = @At("HEAD"), method = "cloner(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/core/Cloner;", cancellable = true)
    private void cloner__1404259577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404259577L))
            info.setReturnValue(null);
    }


}
