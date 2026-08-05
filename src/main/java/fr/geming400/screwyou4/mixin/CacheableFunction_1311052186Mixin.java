package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.CacheableFunction.class)
public class CacheableFunction_1311052186Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/server/ServerFunctionManager;)Ljava/util/Optional;", cancellable = true)
    private void get_605605586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605605586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1598403348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598403348L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1349314431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349314431L))
            info.setReturnValue(-1752368434);
    }

    @Inject(at = @At("HEAD"), method = "getId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getId__1132014368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132014368L))
            info.setReturnValue(null);
    }


}
