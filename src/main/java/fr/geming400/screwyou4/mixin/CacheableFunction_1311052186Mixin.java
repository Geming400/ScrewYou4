package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.CacheableFunction.class)
public class CacheableFunction_1311052186Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/ServerFunctionManager;)Ljava/util/Optional;", cancellable = true)
    private void get_1411978024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411978024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_402425421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402425421L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1868403780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868403780L))
            info.setReturnValue(1155461194);
    }

    @Inject(at = @At("HEAD"), method = "getId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getId__963785999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963785999L))
            info.setReturnValue(null);
    }


}
